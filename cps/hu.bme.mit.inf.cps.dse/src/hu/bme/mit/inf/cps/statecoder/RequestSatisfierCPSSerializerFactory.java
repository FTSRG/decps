package hu.bme.mit.inf.cps.statecoder;

import hu.bme.mit.inf.cps.CyberPhysicalSystem;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.statecode.IStateSerializer;
import org.eclipse.viatra.dse.statecode.IStateSerializerFactory;

public class RequestSatisfierCPSSerializerFactory implements IStateSerializerFactory {

	@Override
	public IStateSerializer createStateSerializer(Notifier notifier)
			throws UnsupportedMetaModel {
		
		return new RequestSatisfierCPSSerializer((CyberPhysicalSystem) notifier);
	}

}
