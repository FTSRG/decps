package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.util.UnallocatedAppQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.unallocatedApp pattern,
 * to be used in conjunction with {@link UnallocatedAppMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see UnallocatedAppMatcher
 * @see UnallocatedAppProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class UnallocatedAppMatch extends BasePatternMatch {
  private ApplicationInstance fApp;
  
  private ResourceRequirement fRr;
  
  private static List<String> parameterNames = makeImmutableList("app", "rr");
  
  private UnallocatedAppMatch(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    this.fApp = pApp;
    this.fRr = pRr;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("app".equals(parameterName)) return this.fApp;
    if ("rr".equals(parameterName)) return this.fRr;
    return null;
  }
  
  public ApplicationInstance getApp() {
    return this.fApp;
  }
  
  public ResourceRequirement getRr() {
    return this.fRr;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("app".equals(parameterName) ) {
    	this.fApp = (hu.bme.mit.inf.cps.ApplicationInstance) newValue;
    	return true;
    }
    if ("rr".equals(parameterName) ) {
    	this.fRr = (hu.bme.mit.inf.cps.ResourceRequirement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setApp(final ApplicationInstance pApp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fApp = pApp;
  }
  
  public void setRr(final ResourceRequirement pRr) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRr = pRr;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.unallocatedApp";
  }
  
  @Override
  public List<String> parameterNames() {
    return UnallocatedAppMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fApp, fRr};
  }
  
  @Override
  public UnallocatedAppMatch toImmutable() {
    return isMutable() ? newMatch(fApp, fRr) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"app\"=" + prettyPrintValue(fApp) + ", ");
    
    result.append("\"rr\"=" + prettyPrintValue(fRr)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fApp == null) ? 0 : fApp.hashCode());
    result = prime * result + ((fRr == null) ? 0 : fRr.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof UnallocatedAppMatch)) { // this should be infrequent
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
    UnallocatedAppMatch other = (UnallocatedAppMatch) obj;
    if (fApp == null) {if (other.fApp != null) return false;}
    else if (!fApp.equals(other.fApp)) return false;
    if (fRr == null) {if (other.fRr != null) return false;}
    else if (!fRr.equals(other.fRr)) return false;
    return true;
  }
  
  @Override
  public UnallocatedAppQuerySpecification specification() {
    try {
    	return UnallocatedAppQuerySpecification.instance();
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
  public static UnallocatedAppMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static UnallocatedAppMatch newMutableMatch(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return new Mutable(pApp, pRr);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static UnallocatedAppMatch newMatch(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return new Immutable(pApp, pRr);
  }
  
  private static final class Mutable extends UnallocatedAppMatch {
    Mutable(final ApplicationInstance pApp, final ResourceRequirement pRr) {
      super(pApp, pRr);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends UnallocatedAppMatch {
    Immutable(final ApplicationInstance pApp, final ResourceRequirement pRr) {
      super(pApp, pRr);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
