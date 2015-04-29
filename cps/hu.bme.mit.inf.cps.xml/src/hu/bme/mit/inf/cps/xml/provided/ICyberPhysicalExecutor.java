package hu.bme.mit.inf.cps.xml.provided;

import hu.bme.mit.inf.cps.xml.BadResponseException;

public interface ICyberPhysicalExecutor {

	public boolean calculateTrajectory();
	
	public String nextOperation() throws Exception;
	
	public boolean hasNextOperation();
	
}
