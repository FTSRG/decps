package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.deleteAllocation pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DeleteAllocationProcessor implements IMatchProcessor<DeleteAllocationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAppInstance the value of pattern parameter appInstance in the currently processed match
   * @param pHostInstance the value of pattern parameter hostInstance in the currently processed match
   * @param pReq the value of pattern parameter req in the currently processed match
   * 
   */
  public abstract void process(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq);
  
  @Override
  public void process(final DeleteAllocationMatch match) {
    process(match.getAppInstance(), match.getHostInstance(), match.getReq());
  }
}
