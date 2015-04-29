package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.stopInstance pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class StopInstanceProcessor implements IMatchProcessor<StopInstanceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAppInstance the value of pattern parameter appInstance in the currently processed match
   * 
   */
  public abstract void process(final ApplicationInstance pAppInstance);
  
  @Override
  public void process(final StopInstanceMatch match) {
    process(match.getAppInstance());
  }
}
