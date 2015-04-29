//package hu.bme.mit.inf.cps.rules;
//
//import hu.bme.mit.inf.cps.ApplicationInstance;
//import hu.bme.mit.inf.cps.CpsFactory;
//import hu.bme.mit.inf.cps.Requirement;
//import hu.bme.mit.inf.cps.patterns.util.CreateApplicationInstancesProcessor;
//
//public class CreateApplicationInstancesRule extends
//		CreateApplicationInstancesProcessor {
//
//	@Override
//	public void process(Requirement pReq) {
//		for (int i = 0; i < pReq.getCount(); i++) {
//			ApplicationInstance instance = CpsFactory.eINSTANCE.createApplicationInstance();
//			instance.setId("AppInsReq:" + pReq.getId() + "Id:" + i);
//			pReq.getType().getInstances().add(instance);
//			pReq.getInstances().add(instance);
//		}
//	}
//
//	
//
//}
