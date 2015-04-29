package hu.bme.mit.inf.cps.test;

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
import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatcher;
import hu.bme.mit.inf.cps.patterns.NotExistUnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.UnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.trigger.TriggerModule;
import hu.bme.mit.inf.cps.xml.Component;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModelTriggerTest {

	private CyberPhysicalSystem cps;

	@Before
	public void setUp() {
		cps = CpsFactory.eINSTANCE.createCyberPhysicalSystem();
		cps.setDbUrl("http://localhost:27001/db");

		HostType ht1 = CpsFactory.eINSTANCE.createHostType();
		ht1.setId("ht1");
		ht1.setDefaultCpu(10);
		ht1.setDefaultHdd(10);
		ht1.setDefaultMemory(10);
		ht1.setCps(cps);
		
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

		ht1.getInstances().add(hi1);
		ht1.getInstances().add(hi2);

		ApplicationType at1 = CpsFactory.eINSTANCE.createApplicationType();
		at1.setId("at1");
		cps.getHostTypes().add(ht1);
		cps.getApplicationTypes().add(at1);

		ResourceRequirement resourceRequirement = CpsFactory.eINSTANCE.createResourceRequirement();
		resourceRequirement.setHostType(ht1);
		resourceRequirement.setRequiredCpu(5);
		resourceRequirement.setRequiredHdd(5);
		resourceRequirement.setRequiredMemory(5);

		at1.getRequirements().add(resourceRequirement);
		at1.setExeFileUrl(".\\simcam.jar");
		at1.setExeType("Java");
		at1.setZipFile("http://e.zzzz.io/stash/decps/sim-cam.zip");
		at1.setCps(cps);

		Request request = CpsFactory.eINSTANCE.createRequest();
		request.setId("req1");
		Requirement requirement = CpsFactory.eINSTANCE.createRequirement();
		requirement.setType(at1);
		requirement.setCount(2);
		requirement.setId("requirement1");
		request.getRequirements().add(requirement);
		cps.getRequests().add(request);
		
		ApplicationInstance ai1 = CpsFactory.eINSTANCE.createApplicationInstance();
		ai1.setType(at1);
		ai1.setState(State.RUNNING);
		
		hi1.setAvailableCpu(5);
		hi1.setAvailableHdd(5);
		hi1.setAvailableMemory(5);
		ai1.getAllocatedTo().add(hi1);
		requirement.getInstances().add(ai1);
		
		ApplicationInstance ai2 = CpsFactory.eINSTANCE.createApplicationInstance();
		ai2.setType(at1);
		ai2.setState(State.RUNNING);
		
		hi1.setAvailableCpu(0);
		hi1.setAvailableHdd(0);
		hi1.setAvailableMemory(0);
		ai2.getAllocatedTo().add(hi1);
		requirement.getInstances().add(ai2);

	}
	
	@Test
	public void testTrigger() throws InterruptedException, IncQueryException {
		
		IncQueryEngine engine = IncQueryEngine.on(cps);
		AllApplicationInstanceIsRunningMatcher matcher1 = AllApplicationInstanceIsRunningMatcher.on(engine);
		Assert.assertEquals(1, matcher1.countMatches());
		
		NotExistUnsatisfiedRequirementMatcher matcher2 = NotExistUnsatisfiedRequirementMatcher.on(engine);
		Assert.assertEquals(1, matcher2.countMatches());
		
		Component.setProblem(cps);
		Component.enableHttp = false;
		TriggerModule.enableInit = false;
		TriggerModule module = new TriggerModule();
		module.start();
		
		while(true) {
			Thread.sleep(100);
		}
	}
	
	@After
	public void tearDown() {
		cps = null;
	}
	
	
	
}
