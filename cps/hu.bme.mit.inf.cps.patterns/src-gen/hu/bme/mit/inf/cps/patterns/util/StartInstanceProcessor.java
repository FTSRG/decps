package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.patterns.StartInstanceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.startInstance pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class StartInstanceProcessor implements IMatchProcessor<StartInstanceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAppInstance the value of pattern parameter appInstance in the currently processed match
   * 
   */
  public abstract void process(final ApplicationInstance pAppInstance);
  
  @Override
  public void process(final StartInstanceMatch match) {
    process(match.getAppInstance());
  }
}
