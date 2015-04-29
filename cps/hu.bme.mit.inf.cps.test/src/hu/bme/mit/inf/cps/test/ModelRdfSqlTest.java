package hu.bme.mit.inf.cps.test;

import java.util.Collection;

import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.rdf.RdfConnection;
import hu.bme.mit.inf.cps.rdf.model.Device;
import hu.bme.mit.inf.cps.xml.Component;

import org.junit.Test;
import org.junit.experimental.theories.internal.Assignments;

import static org.junit.Assert.*;

public class ModelRdfSqlTest {

	@Test
	public void test() {
		Component.instance().initializeProblem();
		CyberPhysicalSystem problem = Component.getProblem();
		assertEquals(2, problem.getRequests().size());
		assertNotEquals(0, problem.getHostTypes().size());
		
		Component component = Component.instance();
		boolean calculateTrajectory = component.calculateTrajectory();
		
//		assertTrue(calculateTrajectory);
//		
//		boolean flag = true;
//		int i = 0;
//		while(flag) {
//			try {
//				System.out.println(component.nextOperation());
//				i++;
//			} catch (IndexOutOfBoundsException e) {
//				flag = false;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		//assertEquals(4, i);
	}

	@Test
	public void testHostTypes() throws Exception {
		RdfConnection con = new RdfConnection();
		Collection<Device> askDevices = con.askDevices();
		assertNotEquals(0, askDevices.size());		
	}
	
}
