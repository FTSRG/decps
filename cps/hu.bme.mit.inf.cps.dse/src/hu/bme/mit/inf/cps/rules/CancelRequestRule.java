package hu.bme.mit.inf.cps.rules;

import org.eclipse.emf.common.util.EList;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.util.CancelRequestProcessor;

public class CancelRequestRule extends CancelRequestProcessor{

	@Override
	public void process(Request pRequest, CyberPhysicalSystem pCps) {
		pCps.getRequests().remove(pRequest);
		// for each Requirement of the Request
		for (Requirement req : pRequest.getRequirements()) {
			pRequest.getRequirements().remove(req);
			// for each ApplicationInstance of the Requirement
			for (ApplicationInstance app : req.getInstances()) {
				app.getType().getInstances().remove(app);
				EList<HostInstance> hosts = app.getAllocatedTo();
				if (hosts != null) {
					// for each HostInstance the app is allocated to
					for (HostInstance host : hosts) {
						// delete allocation
						for (ResourceRequirement rr : app.getType().getRequirements()) {
							if (rr.getHostType().equals(host.getType())) {
								app.getAllocatedTo().remove(host);
								host.setAvailableMemory(host.getAvailableMemory() + rr.getRequiredMemory());
								host.setAvailableHdd(host.getAvailableHdd() + rr.getRequiredHdd());
								host.setAvailableCpu(host.getAvailableCpu() + rr.getRequiredCpu());
							}
						}
					}
				}
			}
		}
		
	}

}
