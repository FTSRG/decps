package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.patterns.NoUnallocatedAppsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.noUnallocatedApps pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NoUnallocatedAppsProcessor implements IMatchProcessor<NoUnallocatedAppsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pX the value of pattern parameter x in the currently processed match
   * 
   */
  public abstract void process(final Integer pX);
  
  @Override
  public void process(final NoUnallocatedAppsMatch match) {
    process(match.getX());
  }
}
