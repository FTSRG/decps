package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.util.MoveQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.move pattern,
 * to be used in conjunction with {@link MoveMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MoveMatcher
 * @see MoveProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MoveMatch extends BasePatternMatch {
  private ApplicationInstance fAppInstance;
  
  private HostInstance fFrom;
  
  private HostInstance fTo;
  
  private ResourceRequirement fReq;
  
  private static List<String> parameterNames = makeImmutableList("appInstance", "from", "to", "req");
  
  private MoveMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    this.fAppInstance = pAppInstance;
    this.fFrom = pFrom;
    this.fTo = pTo;
    this.fReq = pReq;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("appInstance".equals(parameterName)) return this.fAppInstance;
    if ("from".equals(parameterName)) return this.fFrom;
    if ("to".equals(parameterName)) return this.fTo;
    if ("req".equals(parameterName)) return this.fReq;
    return null;
  }
  
  public ApplicationInstance getAppInstance() {
    return this.fAppInstance;
  }
  
  public HostInstance getFrom() {
    return this.fFrom;
  }
  
  public HostInstance getTo() {
    return this.fTo;
  }
  
  public ResourceRequirement getReq() {
    return this.fReq;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("appInstance".equals(parameterName) ) {
    	this.fAppInstance = (hu.bme.mit.inf.cps.ApplicationInstance) newValue;
    	return true;
    }
    if ("from".equals(parameterName) ) {
    	this.fFrom = (hu.bme.mit.inf.cps.HostInstance) newValue;
    	return true;
    }
    if ("to".equals(parameterName) ) {
    	this.fTo = (hu.bme.mit.inf.cps.HostInstance) newValue;
    	return true;
    }
    if ("req".equals(parameterName) ) {
    	this.fReq = (hu.bme.mit.inf.cps.ResourceRequirement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setAppInstance(final ApplicationInstance pAppInstance) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAppInstance = pAppInstance;
  }
  
  public void setFrom(final HostInstance pFrom) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFrom = pFrom;
  }
  
  public void setTo(final HostInstance pTo) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTo = pTo;
  }
  
  public void setReq(final ResourceRequirement pReq) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fReq = pReq;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.move";
  }
  
  @Override
  public List<String> parameterNames() {
    return MoveMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAppInstance, fFrom, fTo, fReq};
  }
  
  @Override
  public MoveMatch toImmutable() {
    return isMutable() ? newMatch(fAppInstance, fFrom, fTo, fReq) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"appInstance\"=" + prettyPrintValue(fAppInstance) + ", ");
    
    result.append("\"from\"=" + prettyPrintValue(fFrom) + ", ");
    
    result.append("\"to\"=" + prettyPrintValue(fTo) + ", ");
    
    result.append("\"req\"=" + prettyPrintValue(fReq)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAppInstance == null) ? 0 : fAppInstance.hashCode());
    result = prime * result + ((fFrom == null) ? 0 : fFrom.hashCode());
    result = prime * result + ((fTo == null) ? 0 : fTo.hashCode());
    result = prime * result + ((fReq == null) ? 0 : fReq.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MoveMatch)) { // this should be infrequent
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
    MoveMatch other = (MoveMatch) obj;
    if (fAppInstance == null) {if (other.fAppInstance != null) return false;}
    else if (!fAppInstance.equals(other.fAppInstance)) return false;
    if (fFrom == null) {if (other.fFrom != null) return false;}
    else if (!fFrom.equals(other.fFrom)) return false;
    if (fTo == null) {if (other.fTo != null) return false;}
    else if (!fTo.equals(other.fTo)) return false;
    if (fReq == null) {if (other.fReq != null) return false;}
    else if (!fReq.equals(other.fReq)) return false;
    return true;
  }
  
  @Override
  public MoveQuerySpecification specification() {
    try {
    	return MoveQuerySpecification.instance();
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
  public static MoveMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MoveMatch newMutableMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return new Mutable(pAppInstance, pFrom, pTo, pReq);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MoveMatch newMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return new Immutable(pAppInstance, pFrom, pTo, pReq);
  }
  
  private static final class Mutable extends MoveMatch {
    Mutable(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
      super(pAppInstance, pFrom, pTo, pReq);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MoveMatch {
    Immutable(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
      super(pAppInstance, pFrom, pTo, pReq);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
