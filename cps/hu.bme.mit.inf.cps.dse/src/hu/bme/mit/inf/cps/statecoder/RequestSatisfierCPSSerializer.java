package hu.bme.mit.inf.cps.statecoder;

import java.util.List;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.patterns.AllocateMatch;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatch;
//import hu.bme.mit.inf.cps.patterns.CreateHostInstanceMatch;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatch;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.StartInstanceMatch;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra.dse.statecode.IStateSerializer;

import com.google.common.collect.Lists;

public class RequestSatisfierCPSSerializer implements IStateSerializer {

	private CyberPhysicalSystem model;

	public RequestSatisfierCPSSerializer(CyberPhysicalSystem cps) {
		this.model = cps;
	}

	@Override
	public Object serializeContainmentTree() {
		StringBuilder sb = new StringBuilder();

		// Requirement -> apps -> hosts
		for (Request request : model.getRequests()) {
			for (Requirement requirement : request.getRequirements()) {
				sb.append("{requirement-" + requirement.getId() + ":");
				for (ApplicationInstance app : requirement.getInstances()) {
					sb.append(app.getId() + app.getState().name() + "(");
					for (HostInstance host : app.getAllocatedTo()) {
						sb.append(host.getId() + ",");
					}
					sb.append(")");
				}
				sb.append("}");
			}
		}

		// hosts, which arn't hosting any app yet
		for (HostType appInst : model.getHostTypes()) {

			for (HostInstance host : appInst.getInstances()) {
				if (host.getApplications().isEmpty()) {
					sb.append(host.getId() + ":" + host.getNodeIp() + ",");
				}
			}
		}

		return sb.toString();
	}

	@Override
	public Object serializePatternMatch(IPatternMatch match) {
		String result = null;

		if (match instanceof AllocateMatch) {
			AllocateMatch m = (AllocateMatch) match;
			result = "Alloc:" + m.getAppInstance().getId() + ","
					+ m.getHostInstance().getId() + ":" + m.getHostInstance().getNodeIp();
		} else if (match instanceof DeleteAllocationMatch) {
			DeleteAllocationMatch m = (DeleteAllocationMatch) match;
			result = "Del:" + m.getAppInstance().getId() + ","
					+ m.getHostInstance().getId() + ":" + m.getHostInstance().getNodeIp();
		} else if (match instanceof MoveMatch) {
			MoveMatch m = (MoveMatch) match;
			result = "Move:" + m.getAppInstance().getId() + ","
					+ m.getFrom().getId() + ":" + m.getFrom().getNodeIp() + "," + m.getTo().getId() + ":" + m.getTo().getNodeIp();
		}

		else if (match instanceof StartInstanceMatch) {
			StartInstanceMatch m = (StartInstanceMatch) match;
			result = "Start:" + m.getAppInstance().getId();
		} else if (match instanceof StopInstanceMatch) {
			StopInstanceMatch m = (StopInstanceMatch) match;
			result = "Stop:" + m.getAppInstance().getId();
		}

		else if (match instanceof CreateApplicationInstanceMatch) {
			CreateApplicationInstanceMatch m = (CreateApplicationInstanceMatch) match;
			result = "CreateApp:" + m.getReq().getId();
		}
		else if (match instanceof MaxAnyUsageMatch) {
			MaxAnyUsageMatch m = (MaxAnyUsageMatch) match;
			result = "MaxAnyUsage:" + m.getId() + ", " + m.getApp().getId()
					+ ", " + m.getHost().getId() + ":" + m.getHost().getNodeIp();
		} else {
			throw new UnsupportedOperationException("The rule with "
					+ match.patternName()
					+ "LHS is not supported in RequestSatisfierCPSSerializer");
		}

		return result;
	}

	@Override
	public void resetCache() {
	}
}
