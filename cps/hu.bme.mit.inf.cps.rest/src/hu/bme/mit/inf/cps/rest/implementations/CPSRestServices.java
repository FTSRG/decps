package hu.bme.mit.inf.cps.rest.implementations;


import java.util.List;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.rdf.RdfConnection;
import hu.bme.mit.inf.cps.rest.interfaces.ICPSRestServices;
import hu.bme.mit.inf.cps.xml.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.common.collect.Lists;

@Path("/cps")
public class CPSRestServices implements ICPSRestServices {

	@Override
	@GET
	@Path("/full")
	@Produces("text/plain")
	public String getFullDataModel(@QueryParam("callback")String callback) throws Exception {
		Component component = Component.instance();
		component.initializeProblem();
		CyberPhysicalSystem cyberPhysicalSystem = component.getCyberPhysicalSystem();
		JSONArray json = new JSONArray();
		
		if(cyberPhysicalSystem == null) return "";
		List<HostType> hostTypes = Lists.newArrayList(cyberPhysicalSystem.getHostTypes());
		List<HostInstance> hostInst = Lists.newArrayList();
		for (HostType type : hostTypes) {
			for (HostInstance i : type.getInstances()) {
				hostInst.add(i);
			}
		}
		for (HostInstance host : hostInst) {
			JSONObject hostJson = new JSONObject();
			hostJson.put("id", host.getId() + "\n" + host.getNodeIp());
			hostJson.put("type", host.getType().getId());
			hostJson.put("availableCpu", host.getAvailableCpu());
			hostJson.put("availableHdd", host.getAvailableHdd());
			hostJson.put("availableMemory", host.getAvailableMemory());
			hostJson.put("totalCpu", host.getTotalCpu());
			hostJson.put("totalHdd", host.getTotalHdd());
			hostJson.put("totalMemory", host.getTotalMemory());
			JSONArray appsJson = new JSONArray();
			
			for (ApplicationInstance app : host.getApplications()) {
				JSONObject appJson = new JSONObject();
				appJson.put("id", app.getId());
				appJson.put("type", app.getType().getId());
				appsJson.add(appJson);
			}
			hostJson.put("applications", appsJson);
			
			json.add(hostJson);
		}
		return callback + "(" + json.toJSONString() + ")";
	}
	
	@Override
	@GET
	@Path("/next")
	@Produces("text/plain")
	public String doNextTransformation(@QueryParam("callback")String callback) throws Exception {
		Component component = Component.instance();
		return callback + "(" + component.nextOperation() + ")";
	}

	@Override
	@GET
	@Path("/init")
	@Produces("text/plain")
	public String initTransformation(@QueryParam("callback")String callback) {
		Component component = Component.instance();
		component.initializeProblem();
		String returnValue = component.calculateTrajectory() ? "Ok" : "Error";
		System.out.println(returnValue);
		return callback + "(" + returnValue + ")";
	}

	@Override
	@GET
	@Path("/hosts")
	@Produces("text/plain")
	public String getHostTypes(@QueryParam("callback")String callback) {
		try {
			RdfConnection con = new RdfConnection();
			JSONArray json = new JSONArray();
			for(String host : con.hostTypes().split(";")) {
				JSONObject obj = new JSONObject();
				obj.put("name", host);
				json.add(obj);
			}
			String ret = callback + "(" + json.toJSONString() + ")";
			return ret;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}	
	
	@Override
	@GET
	@Path("/hosts-test")
	@Produces("application/javascript")
	public String getHostTypesTest(@QueryParam("callback") String callback) {
		String ret = callback + "([" + 
				"    {" + 
				"        \"name\": \"Android\"" + 
				"    }," + 
				"    {" + 
				"        \"name\": \"WindowsPhone\"" + 
				"    }," + 
				"    {" + 
				"        \"name\": \"iOS\"" + 
				"    }" + 
				"])";
		return ret;
	}
	
	@GET
	@Path("/test")
	@Produces("text/plain")
	public String test() {
		return "Test";
	}	
}