package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.patterns.util.RunningAppQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.cps.patterns.runningApp pattern,
 * to be used in conjunction with {@link RunningAppMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RunningAppMatcher
 * @see RunningAppProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RunningAppMatch extends BasePatternMatch {
  private ApplicationInstance fAppInst;
  
  private static List<String> parameterNames = makeImmutableList("appInst");
  
  private RunningAppMatch(final ApplicationInstance pAppInst) {
    this.fAppInst = pAppInst;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("appInst".equals(parameterName)) return this.fAppInst;
    return null;
  }
  
  public ApplicationInstance getAppInst() {
    return this.fAppInst;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("appInst".equals(parameterName) ) {
    	this.fAppInst = (hu.bme.mit.inf.cps.ApplicationInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setAppInst(final ApplicationInstance pAppInst) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAppInst = pAppInst;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.cps.patterns.runningApp";
  }
  
  @Override
  public List<String> parameterNames() {
    return RunningAppMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAppInst};
  }
  
  @Override
  public RunningAppMatch toImmutable() {
    return isMutable() ? newMatch(fAppInst) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"appInst\"=" + prettyPrintValue(fAppInst)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAppInst == null) ? 0 : fAppInst.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RunningAppMatch)) { // this should be infrequent
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
    RunningAppMatch other = (RunningAppMatch) obj;
    if (fAppInst == null) {if (other.fAppInst != null) return false;}
    else if (!fAppInst.equals(other.fAppInst)) return false;
    return true;
  }
  
  @Override
  public RunningAppQuerySpecification specification() {
    try {
    	return RunningAppQuerySpecification.instance();
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
  public static RunningAppMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RunningAppMatch newMutableMatch(final ApplicationInstance pAppInst) {
    return new Mutable(pAppInst);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RunningAppMatch newMatch(final ApplicationInstance pAppInst) {
    return new Immutable(pAppInst);
  }
  
  private static final class Mutable extends RunningAppMatch {
    Mutable(final ApplicationInstance pAppInst) {
      super(pAppInst);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RunningAppMatch {
    Immutable(final ApplicationInstance pAppInst) {
      super(pAppInst);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
