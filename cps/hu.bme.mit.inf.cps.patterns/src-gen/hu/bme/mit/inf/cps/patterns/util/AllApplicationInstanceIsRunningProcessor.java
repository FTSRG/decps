package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.allApplicationInstanceIsRunning pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllApplicationInstanceIsRunningProcessor implements IMatchProcessor<AllApplicationInstanceIsRunningMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pX the value of pattern parameter x in the currently processed match
   * 
   */
  public abstract void process(final Integer pX);
  
  @Override
  public void process(final AllApplicationInstanceIsRunningMatch match) {
    process(match.getX());
  }
}
