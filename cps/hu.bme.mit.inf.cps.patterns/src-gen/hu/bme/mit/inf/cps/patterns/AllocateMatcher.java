package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.AllocateMatch;
import hu.bme.mit.inf.cps.patterns.util.AllocateQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.cps.patterns.allocate pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllocateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allocate(appInstance : ApplicationInstance, hostInstance : HostInstance, req : ResourceRequirement) {
 * 	neg find allocatedTo(appInstance, _);
 * //	neg find allocatedToHostType(appInstance, req);
 * 	find canAllocateTo(appInstance, hostInstance, req);
 * }
 * </pre></code>
 * 
 * @see AllocateMatch
 * @see AllocateProcessor
 * @see AllocateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllocateMatcher extends BaseMatcher<AllocateMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllocateMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AllocateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AllocateMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_APPINSTANCE = 0;
  
  private final static int POSITION_HOSTINSTANCE = 1;
  
  private final static int POSITION_REQ = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AllocateMatcher.class);
  
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
  public AllocateMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AllocateMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return matches represented as a AllocateMatch object.
   * 
   */
  public Collection<AllocateMatch> getAllMatches(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return rawGetAllMatches(new Object[]{pAppInstance, pHostInstance, pReq});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return a match represented as a AllocateMatch object, or null if no match is found.
   * 
   */
  public AllocateMatch getOneArbitraryMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return rawGetOneArbitraryMatch(new Object[]{pAppInstance, pHostInstance, pReq});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return rawHasMatch(new Object[]{pAppInstance, pHostInstance, pReq});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return rawCountMatches(new Object[]{pAppInstance, pHostInstance, pReq});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq, final IMatchProcessor<? super AllocateMatch> processor) {
    rawForEachMatch(new Object[]{pAppInstance, pHostInstance, pReq}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pHostInstance the fixed value of pattern parameter hostInstance, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq, final IMatchProcessor<? super AllocateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAppInstance, pHostInstance, pReq}, processor);
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
  public AllocateMatch newMatch(final ApplicationInstance pAppInstance, final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return AllocateMatch.newMatch(pAppInstance, pHostInstance, pReq);
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ApplicationInstance> rawAccumulateAllValuesOfappInstance(final Object[] parameters) {
    Set<ApplicationInstance> results = new HashSet<ApplicationInstance>();
    rawAccumulateAllValues(POSITION_APPINSTANCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfappInstance() {
    return rawAccumulateAllValuesOfappInstance(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfappInstance(final AllocateMatch partialMatch) {
    return rawAccumulateAllValuesOfappInstance(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfappInstance(final HostInstance pHostInstance, final ResourceRequirement pReq) {
    return rawAccumulateAllValuesOfappInstance(new Object[]{
    null, 
    pHostInstance, 
    pReq
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for hostInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<HostInstance> rawAccumulateAllValuesOfhostInstance(final Object[] parameters) {
    Set<HostInstance> results = new HashSet<HostInstance>();
    rawAccumulateAllValues(POSITION_HOSTINSTANCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for hostInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfhostInstance() {
    return rawAccumulateAllValuesOfhostInstance(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for hostInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfhostInstance(final AllocateMatch partialMatch) {
    return rawAccumulateAllValuesOfhostInstance(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for hostInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfhostInstance(final ApplicationInstance pAppInstance, final ResourceRequirement pReq) {
    return rawAccumulateAllValuesOfhostInstance(new Object[]{
    pAppInstance, 
    null, 
    pReq
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for req.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ResourceRequirement> rawAccumulateAllValuesOfreq(final Object[] parameters) {
    Set<ResourceRequirement> results = new HashSet<ResourceRequirement>();
    rawAccumulateAllValues(POSITION_REQ, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for req.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfreq() {
    return rawAccumulateAllValuesOfreq(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for req.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfreq(final AllocateMatch partialMatch) {
    return rawAccumulateAllValuesOfreq(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for req.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfreq(final ApplicationInstance pAppInstance, final HostInstance pHostInstance) {
    return rawAccumulateAllValuesOfreq(new Object[]{
    pAppInstance, 
    pHostInstance, 
    null
    });
  }
  
  @Override
  protected AllocateMatch tupleToMatch(final Tuple t) {
    try {
    	return AllocateMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) t.get(POSITION_APPINSTANCE), (hu.bme.mit.inf.cps.HostInstance) t.get(POSITION_HOSTINSTANCE), (hu.bme.mit.inf.cps.ResourceRequirement) t.get(POSITION_REQ));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllocateMatch arrayToMatch(final Object[] match) {
    try {
    	return AllocateMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APPINSTANCE], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_HOSTINSTANCE], (hu.bme.mit.inf.cps.ResourceRequirement) match[POSITION_REQ]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllocateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AllocateMatch.newMutableMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APPINSTANCE], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_HOSTINSTANCE], (hu.bme.mit.inf.cps.ResourceRequirement) match[POSITION_REQ]);
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
  public static IQuerySpecification<AllocateMatcher> querySpecification() throws IncQueryException {
    return AllocateQuerySpecification.instance();
  }
}
