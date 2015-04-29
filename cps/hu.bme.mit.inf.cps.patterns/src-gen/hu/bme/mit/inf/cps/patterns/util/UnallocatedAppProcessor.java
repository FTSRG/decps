package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.UnallocatedAppMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.unallocatedApp pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UnallocatedAppProcessor implements IMatchProcessor<UnallocatedAppMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pApp the value of pattern parameter app in the currently processed match
   * @param pRr the value of pattern parameter rr in the currently processed match
   * 
   */
  public abstract void process(final ApplicationInstance pApp, final ResourceRequirement pRr);
  
  @Override
  public void process(final UnallocatedAppMatch match) {
    process(match.getApp(), match.getRr());
  }
}
