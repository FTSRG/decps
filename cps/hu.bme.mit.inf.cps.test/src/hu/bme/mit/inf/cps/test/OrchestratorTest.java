package hu.bme.mit.inf.cps.test;

import static org.junit.Assert.*;
import hu.bme.mit.inf.cps.xml.BadResponseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class OrchestratorTest {

	static private final String USER_AGENT = "Mozilla/5.0";
	static private final String ORCHESTRATOR_URL = "http://152.66.253.152:8080/Dispatcher/Dispatcher";
	
	
	static final String message = ""+ 
			" <InstallCommand>\n" + 
			"    <commandType>true</commandType>\n" + 
			"    <nodeIp>152.66.198.2</nodeIp>\n" + 
			"    <appName>PedestrianRecogniser</appName>\n" + 
			"    <zipUrl>http://backup.mit.bme.hu/cps/apps/PedestrianRecogniser.zip</zipUrl>\n" + 
			"  </InstallCommand>" ;
	
	@Test
	public void test() throws IOException, BadResponseException {
		String response = sendPost(message);
		assertEquals("OK", response);
	}

	private String sendPost(String msg) throws IOException, BadResponseException {
		 
		URL obj = new URL(ORCHESTRATOR_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		//add request header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
				
		con.addRequestProperty("Content-Type", "application/" + "POST");
		con.setRequestProperty("Content-Length", Integer.toString(msg.length()));
		
		// Send post request
		con.setDoOutput(true);
		con.getOutputStream().write(msg.getBytes("UTF8"));
 
		return con.getResponseMessage();
		
	}
	
}
