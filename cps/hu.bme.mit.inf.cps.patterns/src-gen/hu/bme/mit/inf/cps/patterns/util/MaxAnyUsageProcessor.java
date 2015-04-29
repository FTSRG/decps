package hu.bme.mit.inf.cps.patterns.util;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.cps.patterns.maxAnyUsage pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MaxAnyUsageProcessor implements IMatchProcessor<MaxAnyUsageMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pId the value of pattern parameter id in the currently processed match
   * @param pHost the value of pattern parameter host in the currently processed match
   * @param pApp the value of pattern parameter app in the currently processed match
   * 
   */
  public abstract void process(final String pId, final HostInstance pHost, final ApplicationInstance pApp);
  
  @Override
  public void process(final MaxAnyUsageMatch match) {
    process(match.getId(), match.getHost(), match.getApp());
  }
}
