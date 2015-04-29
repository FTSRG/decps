package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.patterns.util.RequirementHasAllAppQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.requirementHasAllApp pattern,
 * to be used in conjunction with {@link RequirementHasAllAppMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RequirementHasAllAppMatcher
 * @see RequirementHasAllAppProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RequirementHasAllAppMatch extends BasePatternMatch {
  private Requirement fReq;
  
  private static List<String> parameterNames = makeImmutableList("req");
  
  private RequirementHasAllAppMatch(final Requirement pReq) {
    this.fReq = pReq;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("req".equals(parameterName)) return this.fReq;
    return null;
  }
  
  public Requirement getReq() {
    return this.fReq;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("req".equals(parameterName) ) {
    	this.fReq = (hu.bme.mit.inf.cps.Requirement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setReq(final Requirement pReq) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fReq = pReq;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.requirementHasAllApp";
  }
  
  @Override
  public List<String> parameterNames() {
    return RequirementHasAllAppMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fReq};
  }
  
  @Override
  public RequirementHasAllAppMatch toImmutable() {
    return isMutable() ? newMatch(fReq) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"req\"=" + prettyPrintValue(fReq)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fReq == null) ? 0 : fReq.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RequirementHasAllAppMatch)) { // this should be infrequent
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
    RequirementHasAllAppMatch other = (RequirementHasAllAppMatch) obj;
    if (fReq == null) {if (other.fReq != null) return false;}
    else if (!fReq.equals(other.fReq)) return false;
    return true;
  }
  
  @Override
  public RequirementHasAllAppQuerySpecification specification() {
    try {
    	return RequirementHasAllAppQuerySpecification.instance();
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
  public static RequirementHasAllAppMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RequirementHasAllAppMatch newMutableMatch(final Requirement pReq) {
    return new Mutable(pReq);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RequirementHasAllAppMatch newMatch(final Requirement pReq) {
    return new Immutable(pReq);
  }
  
  private static final class Mutable extends RequirementHasAllAppMatch {
    Mutable(final Requirement pReq) {
      super(pReq);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RequirementHasAllAppMatch {
    Immutable(final Requirement pReq) {
      super(pReq);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
