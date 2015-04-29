package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.patterns.util.CancelRequestQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.cancelRequest pattern,
 * to be used in conjunction with {@link CancelRequestMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CancelRequestMatcher
 * @see CancelRequestProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CancelRequestMatch extends BasePatternMatch {
  private Request fRequest;
  
  private CyberPhysicalSystem fCps;
  
  private static List<String> parameterNames = makeImmutableList("request", "cps");
  
  private CancelRequestMatch(final Request pRequest, final CyberPhysicalSystem pCps) {
    this.fRequest = pRequest;
    this.fCps = pCps;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("request".equals(parameterName)) return this.fRequest;
    if ("cps".equals(parameterName)) return this.fCps;
    return null;
  }
  
  public Request getRequest() {
    return this.fRequest;
  }
  
  public CyberPhysicalSystem getCps() {
    return this.fCps;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("request".equals(parameterName) ) {
    	this.fRequest = (hu.bme.mit.inf.cps.Request) newValue;
    	return true;
    }
    if ("cps".equals(parameterName) ) {
    	this.fCps = (hu.bme.mit.inf.cps.CyberPhysicalSystem) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRequest(final Request pRequest) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequest = pRequest;
  }
  
  public void setCps(final CyberPhysicalSystem pCps) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCps = pCps;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.cancelRequest";
  }
  
  @Override
  public List<String> parameterNames() {
    return CancelRequestMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRequest, fCps};
  }
  
  @Override
  public CancelRequestMatch toImmutable() {
    return isMutable() ? newMatch(fRequest, fCps) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"request\"=" + prettyPrintValue(fRequest) + ", ");
    
    result.append("\"cps\"=" + prettyPrintValue(fCps)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRequest == null) ? 0 : fRequest.hashCode());
    result = prime * result + ((fCps == null) ? 0 : fCps.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CancelRequestMatch)) { // this should be infrequent
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
    CancelRequestMatch other = (CancelRequestMatch) obj;
    if (fRequest == null) {if (other.fRequest != null) return false;}
    else if (!fRequest.equals(other.fRequest)) return false;
    if (fCps == null) {if (other.fCps != null) return false;}
    else if (!fCps.equals(other.fCps)) return false;
    return true;
  }
  
  @Override
  public CancelRequestQuerySpecification specification() {
    try {
    	return CancelRequestQuerySpecification.instance();
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
  public static CancelRequestMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CancelRequestMatch newMutableMatch(final Request pRequest, final CyberPhysicalSystem pCps) {
    return new Mutable(pRequest, pCps);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CancelRequestMatch newMatch(final Request pRequest, final CyberPhysicalSystem pCps) {
    return new Immutable(pRequest, pCps);
  }
  
  private static final class Mutable extends CancelRequestMatch {
    Mutable(final Request pRequest, final CyberPhysicalSystem pCps) {
      super(pRequest, pCps);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CancelRequestMatch {
    Immutable(final Request pRequest, final CyberPhysicalSystem pCps) {
      super(pRequest, pCps);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
