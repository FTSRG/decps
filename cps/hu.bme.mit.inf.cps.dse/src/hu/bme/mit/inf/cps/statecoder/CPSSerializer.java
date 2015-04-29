package hu.bme.mit.inf.cps.statecoder;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.patterns.AllocateMatch;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatch;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatch;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.StartInstanceMatch;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra.dse.statecode.IStateSerializer;

public class CPSSerializer implements IStateSerializer {

	private CyberPhysicalSystem model;

	public CPSSerializer(CyberPhysicalSystem cps) {
		this.model = cps;
	}

	@Override
	public Object serializeContainmentTree() {
		StringBuilder sb = new StringBuilder();

		appendHostInstances(sb);
		appendNotAllocatedAppInstances(sb);

		return sb.toString();
	}

	private void appendNotAllocatedAppInstances(StringBuilder sb) {
		sb.append("NotAllocatedApplicationInstances:");
		for (ApplicationType type : model.getApplicationTypes()) {
			for (ApplicationInstance app : type.getInstances()) {
				if (app.getAllocatedTo() == null) {
					sb.append(app.getId() + "(");
					sb.append(app.getState() + "),");
				}
			}
		}
	}

	private void appendHostInstances(StringBuilder sb) {
		sb.append("HostInstances:");

		for (HostType type : model.getHostTypes()) {
			for (HostInstance inst : type.getInstances()) {
				sb.append(inst.getId() + "{");
				for (ApplicationInstance app : inst.getApplications()) {
					sb.append(app.getId() + "(");
					sb.append(app.getState() + "),");
				}
				sb.append("}");
			}
		}
	}

	@Override
	public Object serializePatternMatch(IPatternMatch match) {
		StringBuilder sb = new StringBuilder();

		if (match instanceof AllocateMatch)
			appendAllocateMatch(sb, match);
		if (match instanceof DeleteAllocationMatch)
			appendDeleteMatch(sb, match);
		if (match instanceof MoveMatch)
			appendMoveMatch(sb, match);
		if (match instanceof StartInstanceMatch)
			appendStartInstanceMatch(sb, match);
		if (match instanceof StopInstanceMatch)
			appendStopInstanceMatch(sb, match);
		if (match instanceof CreateApplicationInstanceMatch)
			appendCreateApplicationInstancesMatch(sb, match);
		if (match instanceof MaxAnyUsageMatch)
			appendMaxAnyUsageMatch(sb, match);

		return sb.toString();
	}

	private void appendMaxAnyUsageMatch(StringBuilder sb, IPatternMatch match) {
		MaxAnyUsageMatch aMatch = (MaxAnyUsageMatch) match;
		sb.append("MaxAnyUsage: {" + aMatch.getId() + " : "
				+ aMatch.getApp().getId() + " : " + aMatch.getHost().getId()
				+ "}");
	}

	private void appendCreateApplicationInstancesMatch(StringBuilder sb,
			IPatternMatch match) {
		CreateApplicationInstanceMatch aMatch = (CreateApplicationInstanceMatch) match;
		sb.append("CreateApplicationInstances: {"
				+ ((Request) aMatch.getReq().eContainer()).getId() + " : "
				+ aMatch.getReq().getType().getId() + "}");
	}

	private void appendStopInstanceMatch(StringBuilder sb, IPatternMatch match) {
		StopInstanceMatch aMatch = (StopInstanceMatch) match;
		sb.append("StopInstance: {" + aMatch.getAppInstance().getId() + "}");
	}

	private void appendStartInstanceMatch(StringBuilder sb, IPatternMatch match) {
		StartInstanceMatch aMatch = (StartInstanceMatch) match;
		sb.append("StartInstance: {" + aMatch.getAppInstance().getId() + "}");
	}

	private void appendMoveMatch(StringBuilder sb, IPatternMatch match) {
		MoveMatch aMatch = (MoveMatch) match;
		sb.append("Move: {" + aMatch.getAppInstance().getId() + ", "
				+ aMatch.getFrom().getId() + ", " + aMatch.getTo().getId()
				+ "}");
	}

	private void appendDeleteMatch(StringBuilder sb, IPatternMatch match) {
		DeleteAllocationMatch aMatch = (DeleteAllocationMatch) match;
		sb.append("Delete: {" + aMatch.getAppInstance().getId() + ", "
				+ aMatch.getHostInstance().getId() + "}");
	}

	private void appendAllocateMatch(StringBuilder sb, IPatternMatch match) {
		AllocateMatch aMatch = (AllocateMatch) match;
		sb.append("Allocate: {" + aMatch.getAppInstance().getId() + ", "
				+ aMatch.getHostInstance().getId() + "}");
	}

	@Override
	public void resetCache() {
		// TODO Auto-generated method stub

	}

}
