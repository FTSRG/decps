package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.patterns.util.AllApplicationInstanceIsRunningQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.allApplicationInstanceIsRunning pattern,
 * to be used in conjunction with {@link AllApplicationInstanceIsRunningMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllApplicationInstanceIsRunningMatcher
 * @see AllApplicationInstanceIsRunningProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllApplicationInstanceIsRunningMatch extends BasePatternMatch {
  private Integer fX;
  
  private static List<String> parameterNames = makeImmutableList("x");
  
  private AllApplicationInstanceIsRunningMatch(final Integer pX) {
    this.fX = pX;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("x".equals(parameterName)) return this.fX;
    return null;
  }
  
  public Integer getX() {
    return this.fX;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("x".equals(parameterName) ) {
    	this.fX = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
  }
  
  public void setX(final Integer pX) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fX = pX;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.allApplicationInstanceIsRunning";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllApplicationInstanceIsRunningMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fX};
  }
  
  @Override
  public AllApplicationInstanceIsRunningMatch toImmutable() {
    return isMutable() ? newMatch(fX) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"x\"=" + prettyPrintValue(fX)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fX == null) ? 0 : fX.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AllApplicationInstanceIsRunningMatch)) { // this should be infrequent
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
    AllApplicationInstanceIsRunningMatch other = (AllApplicationInstanceIsRunningMatch) obj;
    if (fX == null) {if (other.fX != null) return false;}
    else if (!fX.equals(other.fX)) return false;
    return true;
  }
  
  @Override
  public AllApplicationInstanceIsRunningQuerySpecification specification() {
    try {
    	return AllApplicationInstanceIsRunningQuerySpecification.instance();
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
  public static AllApplicationInstanceIsRunningMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pX the fixed value of pattern parameter x, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllApplicationInstanceIsRunningMatch newMutableMatch(final Integer pX) {
    return new Mutable(pX);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pX the fixed value of pattern parameter x, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllApplicationInstanceIsRunningMatch newMatch(final Integer pX) {
    return new Immutable(pX);
  }
  
  private static final class Mutable extends AllApplicationInstanceIsRunningMatch {
    Mutable(final Integer pX) {
      super(pX);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllApplicationInstanceIsRunningMatch {
    Immutable(final Integer pX) {
      super(pX);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
