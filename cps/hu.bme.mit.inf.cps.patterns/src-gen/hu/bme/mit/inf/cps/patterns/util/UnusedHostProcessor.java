package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.patterns.UnusedHostMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.unusedHost pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UnusedHostProcessor implements IMatchProcessor<UnusedHostMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pHost the value of pattern parameter host in the currently processed match
   * 
   */
  public abstract void process(final HostInstance pHost);
  
  @Override
  public void process(final UnusedHostMatch match) {
    process(match.getHost());
  }
}
