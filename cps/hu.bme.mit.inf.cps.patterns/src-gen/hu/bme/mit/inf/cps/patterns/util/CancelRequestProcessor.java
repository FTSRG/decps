package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.patterns.CancelRequestMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.cancelRequest pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CancelRequestProcessor implements IMatchProcessor<CancelRequestMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRequest the value of pattern parameter request in the currently processed match
   * @param pCps the value of pattern parameter cps in the currently processed match
   * 
   */
  public abstract void process(final Request pRequest, final CyberPhysicalSystem pCps);
  
  @Override
  public void process(final CancelRequestMatch match) {
    process(match.getRequest(), match.getCps());
  }
}
