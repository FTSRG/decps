package hu.bme.mit.inf.cps.test;

import static org.junit.Assert.fail;

import java.util.Random;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CpsFactory;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.State;
import hu.bme.mit.inf.cps.rdf.RdfConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openrdf.repository.RepositoryException;

public class RdfTest {

	private RdfConnection con;
	private int id;
	
	
	@Before
	public void setUp() throws RepositoryException {
		con = new RdfConnection();
		id = new Random().nextInt(Integer.MAX_VALUE);
	}
	
	@Test
	public void instertApp() throws Exception {
		
		CyberPhysicalSystem cps = CpsFactory.eINSTANCE.createCyberPhysicalSystem();
		ApplicationType type = CpsFactory.eINSTANCE.createApplicationType();
		ApplicationInstance app = CpsFactory.eINSTANCE.createApplicationInstance();
		
		cps.setDbUrl("http://testdb.hu/asdasd");
		type.setCps(cps);
		type.setExeFileUrl("main.jar");
		type.setExeType("Java");
		type.setId(String.valueOf(id));
		type.setZipFile("http://testzip.hu/smoke.zip");
		app.setType(type);
		app.setDbName("myDb");
		app.setDbPassword("myPassword");
		app.setDbUser("myUser");
		app.setId(id+"app");
		app.setState(State.STOPPED);
		
		con.insertApp(app);
	
	}
	
	@Test
	public void startApp() throws Exception {
		
		String appId = "1466268786app";
		String deviceId = "152.66.252.82:1022";
		
		con.startAppOnDevice(appId, deviceId);
		
	}
	
	@Test
	public void stopApp() throws Exception {
		con.stopAppOnDevice("1466268786app");
	}
	
	@After
	public void tearDown() {
		con = null;
	}

}
