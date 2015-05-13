package hu.bme.mit.inf.cps.problem;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CpsFactory;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.State;
import hu.bme.mit.inf.cps.rdf.RdfConnection;
import hu.bme.mit.inf.cps.rdf.model.Application;
import hu.bme.mit.inf.cps.rdf.model.Device;
import hu.bme.mit.inf.cps.sql.SqlConnection;
import hu.bme.mit.inf.cps.sql.model.ApplicationTypeSql;
import hu.bme.mit.inf.cps.sql.model.RequestRequirementSql;
import hu.bme.mit.inf.cps.sql.model.RequestSql;
import hu.bme.mit.inf.cps.sql.model.RequirementSql;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProblemFactory {

	Map<String, String> mapAllocation;
	Map<String, HostType> mapHostType;
	Map<String, Request> mapRequest;
	HashMap<String, ApplicationType> mapAppType;
	
	public CyberPhysicalSystem initialize() {
		CyberPhysicalSystem cps = CpsFactory.eINSTANCE.createCyberPhysicalSystem();
		try {
			cps.setDbUrl("http://" + Inet4Address.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		mapHostType = new HashMap<String, HostType>();
		mapAppType = new HashMap<String, ApplicationType>();
		mapRequest = new HashMap<String, Request>();
		
		// Info from RDF storage
		initializeFromRdfStorage(cps);

		// Info from local database
		initializeFromSqlStorage(cps);
		
		// Info from RDF storage
		initializeFromRdfStorageAgain(cps);

		return cps;
	}

	private void initializeFromRdfStorageAgain(CyberPhysicalSystem cps) {
		try {
			RdfConnection con = new RdfConnection();
			mapAllocation = con.askAllocation();
			parseRdfQuery2(cps, con.askApplications(), con);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void initializeFromRdfStorage(CyberPhysicalSystem cps) {
		try {
			RdfConnection con = new RdfConnection();
			parseRdfQuery(cps, con.askDevices(), con);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private void parseRdfQuery2(CyberPhysicalSystem cps, Collection<Application> devices, RdfConnection con) throws Exception {

		for (Application d : devices) {
			
			// Create AppInstance
			ApplicationInstance appInstance = CpsFactory.eINSTANCE.createApplicationInstance();
			{
				int hashMark = d.id.indexOf("#");
				String fullId = d.id.substring(hashMark+1);
				appInstance.setId(fullId);
				appInstance.setDbName(d.dbName);
				appInstance.setDbPassword(d.password);
				appInstance.setDbUser(d.username);
				appInstance.setState(State.RUNNING);
				appInstance.setType(mapAppType.get(fullId.split("-")[1]));
				
				String hostId = mapAllocation.get(appInstance.getId());
				HostType hostType = mapHostType.get(hostId);
				hostType.getInstances().get(0).getApplications().add(appInstance);
				
				Request request = mapRequest.get(fullId.split("-")[0]);
				for (Requirement req : request.getRequirements()) {
					if(req.getType() == appInstance.getType())
						appInstance.setArgs(req.getArgs());
						req.getInstances().add(appInstance);
				}
			}			
		}
	}

	private void parseRdfQuery(CyberPhysicalSystem cps, Collection<Device> devices, RdfConnection con) throws Exception {

		for (Device d : devices) {
			
			// Create HostType
			HostType hostType = CpsFactory.eINSTANCE.createHostType();
			{
				hostType.setId(d.name);
				hostType.setDefaultCpu((int) (Float.parseFloat(d.cpu)));
				hostType.setDefaultHdd((int) (Float.parseFloat(d.hdd)));
				hostType.setDefaultMemory((int) (Float.parseFloat(d.ram)));
				mapHostType.put(hostType.getId(), hostType);
				hostType.setCps(cps);
				cps.getHostTypes().add(hostType);
			}

			// Create HostInstance
			HostInstance hostInstance = CpsFactory.eINSTANCE.createHostInstance();
			{
				hostInstance.setNodeIp(d.ip);
				hostInstance.setId(d.name);
				hostInstance.setTotalCpu((int) (Float.parseFloat(d.cpu)));
				hostInstance.setTotalHdd((int) (Float.parseFloat(d.hdd)));
				hostInstance.setTotalMemory((int) (Float.parseFloat(d.ram)));

				hostInstance.setAvailableCpu(d.acpu);
				hostInstance.setAvailableHdd(d.ahdd);				
				hostInstance.setAvailableMemory(d.aram);
			}
			hostType.getInstances().add(hostInstance);
		}
	}

	private void initializeFromSqlStorage(CyberPhysicalSystem cps) {

		SqlConnection con = new SqlConnection();

		try {
			Collection<ApplicationTypeSql> applicationTypes = con.askApplicationTypes();
			parseSqlApplciationTypes(applicationTypes, cps, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void parseSqlApplciationTypes(Collection<ApplicationTypeSql> applicationTypes, CyberPhysicalSystem cps, SqlConnection con) throws Exception {

		Collection<RequestSql> askRequests = con.askRequests();
		Map<Integer, Request> reqMap = new HashMap<Integer, Request>();
		for (RequestSql requestSql : askRequests) {
			Request request = CpsFactory.eINSTANCE.createRequest();
			request.setId(String.valueOf(requestSql.id));
			request.setPassword(requestSql.password);
			request.setUser(requestSql.username);
			request.setDbname(requestSql.db_name);
			cps.getRequests().add(request);
			
			reqMap.put(requestSql.id, request);
			mapRequest.put(request.getId(), request);
		}
		
		for (ApplicationTypeSql appTypesSql : applicationTypes) {

			ApplicationType applicationType = CpsFactory.eINSTANCE.createApplicationType();
			applicationType.setId(appTypesSql.name);
			applicationType.setExeFileUrl(appTypesSql.exeFileType);
			applicationType.setExeType(appTypesSql.exeFileType);
			applicationType.setZipFile(appTypesSql.zipFileUrl);
			
			applicationType.setCps(cps);
			cps.getApplicationTypes().add(applicationType);
			mapAppType.put(appTypesSql.name, applicationType);
			
			Collection<RequirementSql> requirements = con.askRequirements(appTypesSql.id);
			for(RequirementSql reqSql : requirements) {
				ResourceRequirement requirement = CpsFactory.eINSTANCE.createResourceRequirement();
				requirement.setHostType(mapHostType.get(reqSql.host));
				requirement.setRequiredCpu(reqSql.cpu);
				requirement.setRequiredHdd(reqSql.hdd);
				requirement.setRequiredMemory(reqSql.ram);
				
				applicationType.getRequirements().add(requirement);
			}			
			
			Collection<RequestRequirementSql> requests = con.askRequestRequirements(appTypesSql.id);
			for(RequestRequirementSql reqSql : requests) {
				Requirement requirement = CpsFactory.eINSTANCE.createRequirement();
				requirement.setCount(reqSql.count);
				requirement.setType(applicationType);
				requirement.setArgs(reqSql.args);
				
				Request request = reqMap.get(reqSql.req);
				requirement.setId(request.getId());
				requirement.setRequest(request);
			}
		}
	}
}
