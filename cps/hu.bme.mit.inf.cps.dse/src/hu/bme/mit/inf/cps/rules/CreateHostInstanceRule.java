//package hu.bme.mit.inf.cps.rules;
//
//import hu.bme.mit.inf.cps.CpsFactory;
//import hu.bme.mit.inf.cps.HostInstance;
//import hu.bme.mit.inf.cps.HostType;
//import hu.bme.mit.inf.cps.patterns.util.CreateHostInstanceProcessor;
//
//public class CreateHostInstanceRule extends CreateHostInstanceProcessor{
//
//	@Override
//	public void process(HostType pHostType) {
//		HostInstance hostInstance = CpsFactory.eINSTANCE.createHostInstance();
//		
//		hostInstance.setTotalCpu(pHostType.getDefaultCpu());
//		hostInstance.setAvailableCpu(pHostType.getDefaultCpu());
//		hostInstance.setTotalHdd(pHostType.getDefaultHdd());
//		hostInstance.setAvailableHdd(pHostType.getDefaultHdd());
//		hostInstance.setTotalMemory(pHostType.getDefaultMemory());
//		hostInstance.setAvailableMemory(pHostType.getDefaultMemory());
//		
//		hostInstance.setType(pHostType);
//		
//		pHostType.getInstances().add(hostInstance);
//		
//		hostInstance.setId(pHostType.getId() + "Id:" + pHostType.getInstances().size());		
//	}
//
//}
