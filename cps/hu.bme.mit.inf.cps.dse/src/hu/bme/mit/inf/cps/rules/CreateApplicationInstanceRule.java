package hu.bme.mit.inf.cps.rules;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.CpsFactory;
import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.patterns.util.CreateApplicationInstanceProcessor;

public class CreateApplicationInstanceRule extends
		CreateApplicationInstanceProcessor {

	@Override
	public void process(Requirement pReq) {
		ApplicationInstance instance = CpsFactory.eINSTANCE.createApplicationInstance();
		pReq.getType().getInstances().add(instance);
		pReq.getInstances().add(instance);
		instance.setDbName(pReq.getRequest().getDbname());
		instance.setDbPassword(pReq.getRequest().getPassword());
		instance.setDbUser(pReq.getRequest().getUser());
		instance.setId(pReq.getId() + "-" + pReq.getType().getId() + "-" + pReq.getInstances().size());
	}
	
}
