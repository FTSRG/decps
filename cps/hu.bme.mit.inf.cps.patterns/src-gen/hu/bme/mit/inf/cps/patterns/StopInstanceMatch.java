package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.patterns.util.StopInstanceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.stopInstance pattern,
 * to be used in conjunction with {@link StopInstanceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StopInstanceMatcher
 * @see StopInstanceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class StopInstanceMatch extends BasePatternMatch {
  private ApplicationInstance fAppInstance;
  
  private static List<String> parameterNames = makeImmutableList("appInstance");
  
  private StopInstanceMatch(final ApplicationInstance pAppInstance) {
    this.fAppInstance = pAppInstance;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("appInstance".equals(parameterName)) return this.fAppInstance;
    return null;
  }
  
  public ApplicationInstance getAppInstance() {
    return this.fAppInstance;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("appInstance".equals(parameterName) ) {
    	this.fAppInstance = (hu.bme.mit.inf.cps.ApplicationInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setAppInstance(final ApplicationInstance pAppInstance) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAppInstance = pAppInstance;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.stopInstance";
  }
  
  @Override
  public List<String> parameterNames() {
    return StopInstanceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAppInstance};
  }
  
  @Override
  public StopInstanceMatch toImmutable() {
    return isMutable() ? newMatch(fAppInstance) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"appInstance\"=" + prettyPrintValue(fAppInstance)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAppInstance == null) ? 0 : fAppInstance.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StopInstanceMatch)) { // this should be infrequent
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
    StopInstanceMatch other = (StopInstanceMatch) obj;
    if (fAppInstance == null) {if (other.fAppInstance != null) return false;}
    else if (!fAppInstance.equals(other.fAppInstance)) return false;
    return true;
  }
  
  @Override
  public StopInstanceQuerySpecification specification() {
    try {
    	return StopInstanceQuerySpecification.instance();
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
  public static StopInstanceMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static StopInstanceMatch newMutableMatch(final ApplicationInstance pAppInstance) {
    return new Mutable(pAppInstance);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static StopInstanceMatch newMatch(final ApplicationInstance pAppInstance) {
    return new Immutable(pAppInstance);
  }
  
  private static final class Mutable extends StopInstanceMatch {
    Mutable(final ApplicationInstance pAppInstance) {
      super(pAppInstance);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends StopInstanceMatch {
    Immutable(final ApplicationInstance pAppInstance) {
      super(pAppInstance);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
