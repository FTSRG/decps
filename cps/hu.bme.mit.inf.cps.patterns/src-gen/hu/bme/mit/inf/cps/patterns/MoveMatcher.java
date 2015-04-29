package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.util.MoveQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.cps.patterns.move pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MoveMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern move(appInstance : ApplicationInstance, from : HostInstance, to : HostInstance, req : ResourceRequirement) {
 * 	find allocatedTo(appInstance, from);
 * 	ApplicationInstance.type.requirements(appInstance, req);
 * 	ResourceRequirement.hostType(req, hostType);
 * 	HostInstance.type(to, hostType);
 * 	from != to;
 * 	
 * 	ApplicationInstance.state(appInstance, ::Stopped);
 * 
 * 	find canAllocateTo(appInstance, to, req);
 * }
 * </pre></code>
 * 
 * @see MoveMatch
 * @see MoveProcessor
 * @see MoveQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MoveMatcher extends BaseMatcher<MoveMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MoveMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MoveMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MoveMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_APPINSTANCE = 0;
  
  private final static int POSITION_FROM = 1;
  
  private final static int POSITION_TO = 2;
  
  private final static int POSITION_REQ = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MoveMatcher.class);
  
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
  public MoveMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MoveMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return matches represented as a MoveMatch object.
   * 
   */
  public Collection<MoveMatch> getAllMatches(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return rawGetAllMatches(new Object[]{pAppInstance, pFrom, pTo, pReq});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return a match represented as a MoveMatch object, or null if no match is found.
   * 
   */
  public MoveMatch getOneArbitraryMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return rawGetOneArbitraryMatch(new Object[]{pAppInstance, pFrom, pTo, pReq});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return rawHasMatch(new Object[]{pAppInstance, pFrom, pTo, pReq});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return rawCountMatches(new Object[]{pAppInstance, pFrom, pTo, pReq});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq, final IMatchProcessor<? super MoveMatch> processor) {
    rawForEachMatch(new Object[]{pAppInstance, pFrom, pTo, pReq}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAppInstance the fixed value of pattern parameter appInstance, or null if not bound.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param pReq the fixed value of pattern parameter req, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq, final IMatchProcessor<? super MoveMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAppInstance, pFrom, pTo, pReq}, processor);
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
  public MoveMatch newMatch(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return MoveMatch.newMatch(pAppInstance, pFrom, pTo, pReq);
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
  public Set<ApplicationInstance> getAllValuesOfappInstance(final MoveMatch partialMatch) {
    return rawAccumulateAllValuesOfappInstance(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInstance.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfappInstance(final HostInstance pFrom, final HostInstance pTo, final ResourceRequirement pReq) {
    return rawAccumulateAllValuesOfappInstance(new Object[]{
    null, 
    pFrom, 
    pTo, 
    pReq
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<HostInstance> rawAccumulateAllValuesOffrom(final Object[] parameters) {
    Set<HostInstance> results = new HashSet<HostInstance>();
    rawAccumulateAllValues(POSITION_FROM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOffrom() {
    return rawAccumulateAllValuesOffrom(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOffrom(final MoveMatch partialMatch) {
    return rawAccumulateAllValuesOffrom(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOffrom(final ApplicationInstance pAppInstance, final HostInstance pTo, final ResourceRequirement pReq) {
    return rawAccumulateAllValuesOffrom(new Object[]{
    pAppInstance, 
    null, 
    pTo, 
    pReq
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<HostInstance> rawAccumulateAllValuesOfto(final Object[] parameters) {
    Set<HostInstance> results = new HashSet<HostInstance>();
    rawAccumulateAllValues(POSITION_TO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfto() {
    return rawAccumulateAllValuesOfto(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfto(final MoveMatch partialMatch) {
    return rawAccumulateAllValuesOfto(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfto(final ApplicationInstance pAppInstance, final HostInstance pFrom, final ResourceRequirement pReq) {
    return rawAccumulateAllValuesOfto(new Object[]{
    pAppInstance, 
    pFrom, 
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
  public Set<ResourceRequirement> getAllValuesOfreq(final MoveMatch partialMatch) {
    return rawAccumulateAllValuesOfreq(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for req.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfreq(final ApplicationInstance pAppInstance, final HostInstance pFrom, final HostInstance pTo) {
    return rawAccumulateAllValuesOfreq(new Object[]{
    pAppInstance, 
    pFrom, 
    pTo, 
    null
    });
  }
  
  @Override
  protected MoveMatch tupleToMatch(final Tuple t) {
    try {
    	return MoveMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) t.get(POSITION_APPINSTANCE), (hu.bme.mit.inf.cps.HostInstance) t.get(POSITION_FROM), (hu.bme.mit.inf.cps.HostInstance) t.get(POSITION_TO), (hu.bme.mit.inf.cps.ResourceRequirement) t.get(POSITION_REQ));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MoveMatch arrayToMatch(final Object[] match) {
    try {
    	return MoveMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APPINSTANCE], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_FROM], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_TO], (hu.bme.mit.inf.cps.ResourceRequirement) match[POSITION_REQ]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MoveMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MoveMatch.newMutableMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APPINSTANCE], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_FROM], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_TO], (hu.bme.mit.inf.cps.ResourceRequirement) match[POSITION_REQ]);
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
  public static IQuerySpecification<MoveMatcher> querySpecification() throws IncQueryException {
    return MoveQuerySpecification.instance();
  }
}
