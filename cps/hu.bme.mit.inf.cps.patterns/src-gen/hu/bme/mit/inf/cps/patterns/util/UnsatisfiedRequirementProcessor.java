package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.patterns.UnsatisfiedRequirementMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.unsatisfiedRequirement pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UnsatisfiedRequirementProcessor implements IMatchProcessor<UnsatisfiedRequirementMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pReq the value of pattern parameter req in the currently processed match
   * 
   */
  public abstract void process(final Requirement pReq);
  
  @Override
  public void process(final UnsatisfiedRequirementMatch match) {
    process(match.getReq());
  }
}
