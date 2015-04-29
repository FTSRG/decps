package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.util.CanAllocateToQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.canAllocateTo pattern,
 * to be used in conjunction with {@link CanAllocateToMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CanAllocateToMatcher
 * @see CanAllocateToProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CanAllocateToMatch extends BasePatternMatch {
  private ApplicationInstance fAppInstance;
  
  private HostInstance fHostInstance;
  
  private ResourceRequirement fReq;
  
  private static List<String> parameterNames = makeImmutableList("appInstance", "hostInstance", "req");
  
  private CanAllocateToMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    this.fAppInstance = pAppInstance;
    this.fHostInstance = pHostInstance;
    this.fReq = pReq;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("appInstance".equals(parameterName)) return this.fAppInstance;
    if ("hostInstance".equals(parameterName)) return this.fHostInstance;
    if ("req".equals(parameterName)) return this.fReq;
    return null;
  }
  
  public ApplicationInstance getAppInstance() {
    return this.fAppInstance;
  }
  
  public HostInstance getHostInstance() {
    return this.fHostInstance;
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
    if ("hostInstance".equals(parameterName) ) {
    	this.fHostInstance = (hu.bme.mit.inf.cps.HostInstance) newValue;
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
  
  public void setHostInstance(final HostInstance pHostInstance) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fHostInstance = pHostInstance;
  }
  
  public void setReq(final ResourceRequirement pReq) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fReq = pReq;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.canAllocateTo";
  }
  
  @Override
  public List<String> parameterNames() {
    return CanAllocateToMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAppInstance, fHostInstance, fReq};
  }
  
  @Override
  public CanAllocateToMatch toImmutable() {
    return isMutable() ? newMatch(fAppInstance, fHostInstance, fReq) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"appInstance\"=" + prettyPrintValue(fAppInstance) + ", ");
    
    result.append("\"hostInstance\"=" + prettyPrintValue(fHostInstance) + ", ");
    
    result.append("\"req\"=" + prettyPrintValue(fReq)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAppInstance == null) ? 0 : fAppInstance.hashCode());
    result = prime * result + ((fHostInstance == null) ? 0 : fHostInstance.hashCode());
    result = prime * result + ((fReq == null) ? 0 : fReq.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CanAllocateToMatch)) { // this should be infrequent
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
    CanAllocateToMatch other = (CanAllocateToMatch) obj;
    if (fAppInstance == null) {if (other.fAppInstance != null) return false;}
    else if (!fAppInstance.equals(other.fAppInstance)) return false;
    if (fHostInstance == null) {if (other.fHostInstance != null) return false;}
    else if (!fHostInstance.equals(other.fHostInstance)) return false;
    if (fReq == null) {if (other.fReq != null) return false;}
    else if (!fReq.equals(other.fReq)) return false;
    return true;
  }
  
  @Override
  public CanAllocateToQuerySpecification specification() {
    try {
    	return CanAllocateToQuerySpecification.instance();
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
  public static CanAllocateToMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CanAllocateToMatch newMutableMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return new Mutable(pAppInstance, pHostInstance, pReq);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CanAllocateToMatch newMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return new Immutable(pAppInstance, pHostInstance, pReq);
  }
  
  private static final class Mutable extends CanAllocateToMatch {
    Mutable(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
      super(pAppInstance, pHostInstance, pReq);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CanAllocateToMatch {
    Immutable(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
      super(pAppInstance, pHostInstance, pReq);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
