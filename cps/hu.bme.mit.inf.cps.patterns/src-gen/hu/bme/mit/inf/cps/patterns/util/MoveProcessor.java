package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.move pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MoveProcessor implements IMatchProcessor<MoveMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAppInstance the value of pattern parameter appInstance in the currently processed match
   * @param pFrom the value of pattern parameter from in the currently processed match
   * @param pTo the value of pattern parameter to in the currently processed match
   * @param pReq the value of pattern parameter req in the currently processed match
   * 
   */
  public abstract void process(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq);
  
  @Override
  public void process(final MoveMatch match) {
    process(match.getAppInstance(), match.getFrom(), match.getTo(), match.getReq());
  }
}
