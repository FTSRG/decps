package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.patterns.util.MaxAnyUsageQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.maxAnyUsage pattern,
 * to be used in conjunction with {@link MaxAnyUsageMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MaxAnyUsageMatcher
 * @see MaxAnyUsageProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MaxAnyUsageMatch extends BasePatternMatch {
  private String fId;
  
  private HostInstance fHost;
  
  private ApplicationInstance fApp;
  
  private static List<String> parameterNames = makeImmutableList("id", "host", "app");
  
  private MaxAnyUsageMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    this.fId = pId;
    this.fHost = pHost;
    this.fApp = pApp;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("id".equals(parameterName)) return this.fId;
    if ("host".equals(parameterName)) return this.fHost;
    if ("app".equals(parameterName)) return this.fApp;
    return null;
  }
  
  public String getId() {
    return this.fId;
  }
  
  public HostInstance getHost() {
    return this.fHost;
  }
  
  public ApplicationInstance getApp() {
    return this.fApp;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("id".equals(parameterName) ) {
    	this.fId = (java.lang.String) newValue;
    	return true;
    }
    if ("host".equals(parameterName) ) {
    	this.fHost = (hu.bme.mit.inf.cps.HostInstance) newValue;
    	return true;
    }
    if ("app".equals(parameterName) ) {
    	this.fApp = (hu.bme.mit.inf.cps.ApplicationInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setId(final String pId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fId = pId;
  }
  
  public void setHost(final HostInstance pHost) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fHost = pHost;
  }
  
  public void setApp(final ApplicationInstance pApp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fApp = pApp;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.maxAnyUsage";
  }
  
  @Override
  public List<String> parameterNames() {
    return MaxAnyUsageMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fId, fHost, fApp};
  }
  
  @Override
  public MaxAnyUsageMatch toImmutable() {
    return isMutable() ? newMatch(fId, fHost, fApp) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"id\"=" + prettyPrintValue(fId) + ", ");
    
    result.append("\"host\"=" + prettyPrintValue(fHost) + ", ");
    
    result.append("\"app\"=" + prettyPrintValue(fApp)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fId == null) ? 0 : fId.hashCode());
    result = prime * result + ((fHost == null) ? 0 : fHost.hashCode());
    result = prime * result + ((fApp == null) ? 0 : fApp.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MaxAnyUsageMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    MaxAnyUsageMatch other = (MaxAnyUsageMatch) obj;
    if (fId == null) {if (other.fId != null) return false;}
    else if (!fId.equals(other.fId)) return false;
    if (fHost == null) {if (other.fHost != null) return false;}
    else if (!fHost.equals(other.fHost)) return false;
    if (fApp == null) {if (other.fApp != null) return false;}
    else if (!fApp.equals(other.fApp)) return false;
    return true;
  }
  
  @Override
  public MaxAnyUsageQuerySpecification specification() {
    try {
    	return MaxAnyUsageQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static MaxAnyUsageMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MaxAnyUsageMatch newMutableMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return new Mutable(pId, pHost, pApp);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MaxAnyUsageMatch newMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return new Immutable(pId, pHost, pApp);
  }
  
  private static final class Mutable extends MaxAnyUsageMatch {
    Mutable(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
      super(pId, pHost, pApp);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MaxAnyUsageMatch {
    Immutable(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
      super(pId, pHost, pApp);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
