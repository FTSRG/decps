package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.patterns.NotRunningAppMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.notRunningApp pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NotRunningAppProcessor implements IMatchProcessor<NotRunningAppMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAppInst the value of pattern parameter appInst in the currently processed match
   * 
   */
  public abstract void process(final ApplicationInstance pAppInst);
  
  @Override
  public void process(final NotRunningAppMatch match) {
    process(match.getAppInst());
  }
}
