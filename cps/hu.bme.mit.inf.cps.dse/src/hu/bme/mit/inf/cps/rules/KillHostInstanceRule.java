//package hu.bme.mit.inf.cps.rules;
//
//import hu.bme.mit.inf.cps.ApplicationInstance;
//import hu.bme.mit.inf.cps.HostInstance;
//import hu.bme.mit.inf.cps.State;
//import hu.bme.mit.inf.cps.patterns.util.KillHostInstanceProcessor;
//
//public class KillHostInstanceRule extends KillHostInstanceProcessor{
//
//	@Override
//	public void process(HostInstance pHostInstance) {
//
//		for (ApplicationInstance app : pHostInstance.getApplications()) {
//			app.getAllocatedTo().remove(pHostInstance);
//			app.setState(State.STOPPED);
//		}
//		
//		pHostInstance.getType().getInstances().remove(pHostInstance);
//		
//	}
//
//}
