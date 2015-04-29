package hu.bme.mit.inf.cps.xml;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.TransformationRule;
import org.eclipse.xtext.xbase.lib.Pair;

import com.google.common.util.concurrent.UncheckedExecutionException;

public class SolutionTrajectoryUtil {

	@SuppressWarnings("unchecked")
	public static Pair<TransformationRule<IPatternMatch>, IPatternMatch> getCurrentTransformation(SolutionTrajectory trajectory) throws IncQueryException {
		
		int index = trajectory.getCurrentIndex();		
		TransformationRule<IPatternMatch> tr = (TransformationRule<IPatternMatch>) trajectory.getTransformationRules().get(index);

		IncQueryMatcher<? extends IPatternMatch> matcher = tr.getQuerySpecification().getMatcher(trajectory.getEngine());

		for (IPatternMatch match : matcher.getAllMatches()) {
			Object matchHash = trajectory.getStateSerializer().serializePatternMatch(match);
			if (matchHash.equals(trajectory.getTransitionIds().get(index))) {
				return new Pair<TransformationRule<IPatternMatch>, IPatternMatch>(tr, match);				
			}
		}
		
		throw new UncheckedExecutionException("Activation was not found for transformation! Possible cause: wrong model, bad state serializer.", null);		
	}
}
