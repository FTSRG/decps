package hu.bme.mit.inf.cps.test;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void test() throws UnknownHostException {
		InetAddress host = Inet4Address.getLocalHost();
		System.out.println(host.getHostAddress() + " " + host.getHostName());
	}

}
