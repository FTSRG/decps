package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.patterns.CancelRequestMatch;
import hu.bme.mit.inf.cps.patterns.util.CancelRequestQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.inf.cps.patterns.cancelRequest pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CancelRequestMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //pattern createHostInstance(hostType : HostType){
 * //	HostType(hostType);
 * //}
 * //
 * //pattern killHostInstance(hostInstance : HostInstance){
 * //	HostInstance(hostInstance);
 * //}
 * 
 * pattern cancelRequest(request : Request, cps : CyberPhysicalSystem){
 * 	CyberPhysicalSystem.requests(cps,request);
 * }
 * </pre></code>
 * 
 * @see CancelRequestMatch
 * @see CancelRequestProcessor
 * @see CancelRequestQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CancelRequestMatcher extends BaseMatcher<CancelRequestMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CancelRequestMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CancelRequestMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CancelRequestMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REQUEST = 0;
  
  private final static int POSITION_CPS = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CancelRequestMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public CancelRequestMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public CancelRequestMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @return matches represented as a CancelRequestMatch object.
   * 
   */
  public Collection<CancelRequestMatch> getAllMatches(final Request pRequest, final CyberPhysicalSystem pCps) {
    return rawGetAllMatches(new Object[]{pRequest, pCps});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @return a match represented as a CancelRequestMatch object, or null if no match is found.
   * 
   */
  public CancelRequestMatch getOneArbitraryMatch(final Request pRequest, final CyberPhysicalSystem pCps) {
    return rawGetOneArbitraryMatch(new Object[]{pRequest, pCps});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Request pRequest, final CyberPhysicalSystem pCps) {
    return rawHasMatch(new Object[]{pRequest, pCps});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Request pRequest, final CyberPhysicalSystem pCps) {
    return rawCountMatches(new Object[]{pRequest, pCps});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Request pRequest, final CyberPhysicalSystem pCps, final IMatchProcessor<? super CancelRequestMatch> processor) {
    rawForEachMatch(new Object[]{pRequest, pCps}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequest the fixed value of pattern parameter request, or null if not bound.
   * @param pCps the fixed value of pattern parameter cps, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Request pRequest, final CyberPhysicalSystem pCps, final IMatchProcessor<? super CancelRequestMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRequest, pCps}, processor);
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
  public CancelRequestMatch newMatch(final Request pRequest, final CyberPhysicalSystem pCps) {
    return CancelRequestMatch.newMatch(pRequest, pCps);
  }
  
  /**
   * Retrieve the set of values that occur in matches for request.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Request> rawAccumulateAllValuesOfrequest(final Object[] parameters) {
    Set<Request> results = new HashSet<Request>();
    rawAccumulateAllValues(POSITION_REQUEST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for request.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Request> getAllValuesOfrequest() {
    return rawAccumulateAllValuesOfrequest(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for request.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Request> getAllValuesOfrequest(final CancelRequestMatch partialMatch) {
    return rawAccumulateAllValuesOfrequest(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for request.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Request> getAllValuesOfrequest(final CyberPhysicalSystem pCps) {
    return rawAccumulateAllValuesOfrequest(new Object[]{
    null, 
    pCps
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for cps.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<CyberPhysicalSystem> rawAccumulateAllValuesOfcps(final Object[] parameters) {
    Set<CyberPhysicalSystem> results = new HashSet<CyberPhysicalSystem>();
    rawAccumulateAllValues(POSITION_CPS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cps.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CyberPhysicalSystem> getAllValuesOfcps() {
    return rawAccumulateAllValuesOfcps(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cps.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CyberPhysicalSystem> getAllValuesOfcps(final CancelRequestMatch partialMatch) {
    return rawAccumulateAllValuesOfcps(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cps.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CyberPhysicalSystem> getAllValuesOfcps(final Request pRequest) {
    return rawAccumulateAllValuesOfcps(new Object[]{
    pRequest, 
    null
    });
  }
  
  @Override
  protected CancelRequestMatch tupleToMatch(final Tuple t) {
    try {
    	return CancelRequestMatch.newMatch((hu.bme.mit.inf.cps.Request) t.get(POSITION_REQUEST), (hu.bme.mit.inf.cps.CyberPhysicalSystem) t.get(POSITION_CPS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CancelRequestMatch arrayToMatch(final Object[] match) {
    try {
    	return CancelRequestMatch.newMatch((hu.bme.mit.inf.cps.Request) match[POSITION_REQUEST], (hu.bme.mit.inf.cps.CyberPhysicalSystem) match[POSITION_CPS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CancelRequestMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CancelRequestMatch.newMutableMatch((hu.bme.mit.inf.cps.Request) match[POSITION_REQUEST], (hu.bme.mit.inf.cps.CyberPhysicalSystem) match[POSITION_CPS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CancelRequestMatcher> querySpecification() throws IncQueryException {
    return CancelRequestQuerySpecification.instance();
  }
}
