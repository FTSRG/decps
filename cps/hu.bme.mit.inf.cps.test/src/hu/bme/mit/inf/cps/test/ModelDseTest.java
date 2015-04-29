package hu.bme.mit.inf.cps.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
import hu.bme.mit.inf.cps.xml.Component;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModelDseTest {

	CyberPhysicalSystem cps;
	private ApplicationType at1;

	@Before
	public void setUp() {
		cps = CpsFactory.eINSTANCE.createCyberPhysicalSystem();
		cps.setDbUrl("http://localhost:27001/db");

		ResourceRequirement resourceRequirement = CpsFactory.eINSTANCE.createResourceRequirement();

		HostType ht1 = CpsFactory.eINSTANCE.createHostType();
		ht1.setId("ht1");
		ht1.setDefaultCpu(10);
		ht1.setDefaultHdd(10);
		ht1.setDefaultMemory(10);

		HostInstance hi1 = CpsFactory.eINSTANCE.createHostInstance();
		hi1.setAvailableCpu(10);
		hi1.setAvailableHdd(10);
		hi1.setAvailableMemory(10);
		hi1.setId("hi1");
		hi1.setNodeIp("152.117.5.1");
		hi1.setTotalCpu(10);
		hi1.setTotalHdd(10);
		hi1.setTotalMemory(10);

		HostInstance hi2 = CpsFactory.eINSTANCE.createHostInstance();
		hi2.setAvailableCpu(10);
		hi2.setAvailableHdd(10);
		hi2.setAvailableMemory(10);
		hi2.setNodeIp("152.117.5.2");
		hi2.setTotalCpu(10);
		hi2.setTotalHdd(10);
		hi2.setTotalMemory(10);
		hi2.setId("hi2");

		at1 = CpsFactory.eINSTANCE.createApplicationType();

		cps.getHostTypes().add(ht1);
		cps.getApplicationTypes().add(at1);

		ht1.getInstances().add(hi1);
		ht1.getInstances().add(hi2);

		resourceRequirement.setHostType(ht1);
		resourceRequirement.setRequiredCpu(7);
		resourceRequirement.setRequiredHdd(7);
		resourceRequirement.setRequiredMemory(7);

		at1.getRequirements().add(resourceRequirement);
		at1.setExeFileUrl(".\\simcam.jar");
		at1.setExeType("Java");
		at1.setZipFile("http://e.zzzz.io/stash/decps/sim-cam.zip");

//		ApplicationInstance ai1 = CpsFactory.eINSTANCE.createApplicationInstance();
//		ai1.setId("ai1");
//		ai1.setType(at1);
//		ai1.getAllocatedTo().add(hi1);
		
		Request request = CpsFactory.eINSTANCE.createRequest();
		request.setId("r1");
		Requirement requirement = CpsFactory.eINSTANCE.createRequirement();
		requirement.setId("r1");
		requirement.setType(at1);
		requirement.setCount(1);

		request.getRequirements().add(requirement);
//		requirement.getInstances().add(ai1);
		
		cps.getRequests().add(request);
	}

	@Test
	public void allocateOneApplication() {
		Component component = Component.instance();
		Component.enableHttp = false;
		Component.setProblem(cps);
		boolean calculateTrajectory = component.calculateTrajectory();

		assertTrue(calculateTrajectory);

		boolean flag = true;
		int i = 0;
		while (flag) {
			try {
				System.out.println(component.nextOperation());
				i++;
			} catch (IndexOutOfBoundsException e) {
				flag = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		assertEquals(2, i);
	}

	@Test
	public void allocateOneMoreApplication() {

		// Create one allocation with hand
		ApplicationInstance ai1 = CpsFactory.eINSTANCE.createApplicationInstance();
		ai1.setType(at1);
		ai1.setState(State.RUNNING);
		HostInstance hi = cps.getHostTypes().get(0).getInstances().get(0);
		hi.setAvailableCpu(3);
		hi.setAvailableHdd(3);
		hi.setAvailableMemory(3);

		cps.getRequests().get(0).getRequirements().get(0).getInstances().add(ai1);
//		ai1.getAllocatedTo().add(hi);

		// Create a new request
		Request request = CpsFactory.eINSTANCE.createRequest();
		request.setId("1");
		Requirement requirement = CpsFactory.eINSTANCE.createRequirement();
		requirement.setId("1");
		requirement.setType(at1);
		requirement.setCount(1);
		requirement.getInstances().add(ai1);
		
		request.getRequirements().add(requirement);

		cps.getRequests().add(request);

		Component component = Component.instance();
		Component.enableHttp = false;
		Component.setProblem(cps);
		boolean calculateTrajectory = component.calculateTrajectory();

		assertTrue(calculateTrajectory);

		boolean flag = true;
		int i = 0;
		while (flag) {
			try {
				System.out.println(component.nextOperation());
				i++;
			} catch (IndexOutOfBoundsException e) {
				flag = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		assertEquals(2, i);
	}

	public void cepTesting() {

		// Create one allocation with hand
		ApplicationInstance ai1 = CpsFactory.eINSTANCE.createApplicationInstance();
		ai1.setType(at1);
		ai1.setState(State.RUNNING);
		HostInstance hi = cps.getHostTypes().get(0).getInstances().get(0);
		hi.setAvailableCpu(3);
		hi.setAvailableHdd(3);
		hi.setAvailableMemory(3);

		cps.getRequests().get(0).getRequirements().get(0).getInstances().add(ai1);
		ai1.getAllocatedTo().add(hi);

		Request request = CpsFactory.eINSTANCE.createRequest();
		Requirement requirement = CpsFactory.eINSTANCE.createRequirement();
		requirement.setType(at1);
		requirement.setCount(1);

		request.getRequirements().add(requirement);

		cps.getRequests().add(request);
	}

//	@Test
//	public void jsonTesting() {
//		JSONArray json = new JSONArray();
//		for (HostInstance host : cps.getHosts()) {
//			JSONObject hostJson = new JSONObject();
//			hostJson.put("id", host.getId());
//			hostJson.put("type", host.getType().getId());
//			hostJson.put("availableCpu", host.getAvailableCpu());
//			hostJson.put("availableHdd", host.getAvailableHdd());
//			hostJson.put("availableMemory", host.getAvailableMemory());
//			hostJson.put("totalCpu", host.getTotalCpu());
//			hostJson.put("totalHdd", host.getTotalHdd());
//			hostJson.put("totalMemory", host.getTotalMemory());
//			hostJson.put("nodeIp", host.getNodeIp());
//			JSONArray appsJson = new JSONArray();
//			
//			for (ApplicationInstance app : host.getApplications()) {
//				JSONObject appJson = new JSONObject();
//				appJson.put("id", app.getId());
//				appJson.put("type", app.getType().getId());
//				appsJson.add(appJson);
//			}
//			hostJson.put("applications", appsJson);
//			
//			json.add(hostJson);
//		}
//		System.out.println(json.toJSONString());
//	
//		
//	}
	
	@After
	public void tearDown() {
		cps = null;
		at1 = null;
	}

}
