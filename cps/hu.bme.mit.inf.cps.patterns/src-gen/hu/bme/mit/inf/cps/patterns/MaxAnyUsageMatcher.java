package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.util.MaxAnyUsageQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.cps.patterns.maxAnyUsage pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MaxAnyUsageMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern maxAnyUsage(id, host : HostInstance, app : ApplicationInstance) {
 * 	find maxCpuUsage(id,host,app);
 * } or {
 * 	find maxRamUsage(id,host,app);
 * } or {
 * 	find maxHddUsage(id,host,app);
 * }
 * </pre></code>
 * 
 * @see MaxAnyUsageMatch
 * @see MaxAnyUsageProcessor
 * @see MaxAnyUsageQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MaxAnyUsageMatcher extends BaseMatcher<MaxAnyUsageMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MaxAnyUsageMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MaxAnyUsageMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MaxAnyUsageMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ID = 0;
  
  private final static int POSITION_HOST = 1;
  
  private final static int POSITION_APP = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MaxAnyUsageMatcher.class);
  
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
  public MaxAnyUsageMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MaxAnyUsageMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return matches represented as a MaxAnyUsageMatch object.
   * 
   */
  public Collection<MaxAnyUsageMatch> getAllMatches(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return rawGetAllMatches(new Object[]{pId, pHost, pApp});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return a match represented as a MaxAnyUsageMatch object, or null if no match is found.
   * 
   */
  public MaxAnyUsageMatch getOneArbitraryMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return rawGetOneArbitraryMatch(new Object[]{pId, pHost, pApp});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return rawHasMatch(new Object[]{pId, pHost, pApp});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return rawCountMatches(new Object[]{pId, pHost, pApp});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp, final IMatchProcessor<? super MaxAnyUsageMatch> processor) {
    rawForEachMatch(new Object[]{pId, pHost, pApp}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp, final IMatchProcessor<? super MaxAnyUsageMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pId, pHost, pApp}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MaxAnyUsageMatch newMatch(final String pId, final HostInstance pHost, final ApplicationInstance pApp) {
    return MaxAnyUsageMatch.newMatch(pId, pHost, pApp);
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfid(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_ID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid() {
    return rawAccumulateAllValuesOfid(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final MaxAnyUsageMatch partialMatch) {
    return rawAccumulateAllValuesOfid(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final HostInstance pHost, final ApplicationInstance pApp) {
    return rawAccumulateAllValuesOfid(new Object[]{
    null, 
    pHost, 
    pApp
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<HostInstance> rawAccumulateAllValuesOfhost(final Object[] parameters) {
    Set<HostInstance> results = new HashSet<HostInstance>();
    rawAccumulateAllValues(POSITION_HOST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfhost() {
    return rawAccumulateAllValuesOfhost(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfhost(final MaxAnyUsageMatch partialMatch) {
    return rawAccumulateAllValuesOfhost(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<HostInstance> getAllValuesOfhost(final String pId, final ApplicationInstance pApp) {
    return rawAccumulateAllValuesOfhost(new Object[]{
    pId, 
    null, 
    pApp
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for app.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ApplicationInstance> rawAccumulateAllValuesOfapp(final Object[] parameters) {
    Set<ApplicationInstance> results = new HashSet<ApplicationInstance>();
    rawAccumulateAllValues(POSITION_APP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for app.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfapp() {
    return rawAccumulateAllValuesOfapp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for app.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfapp(final MaxAnyUsageMatch partialMatch) {
    return rawAccumulateAllValuesOfapp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for app.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfapp(final String pId, final HostInstance pHost) {
    return rawAccumulateAllValuesOfapp(new Object[]{
    pId, 
    pHost, 
    null
    });
  }
  
  @Override
  protected MaxAnyUsageMatch tupleToMatch(final Tuple t) {
    try {
    	return MaxAnyUsageMatch.newMatch((java.lang.String) t.get(POSITION_ID), (hu.bme.mit.inf.cps.HostInstance) t.get(POSITION_HOST), (hu.bme.mit.inf.cps.ApplicationInstance) t.get(POSITION_APP));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MaxAnyUsageMatch arrayToMatch(final Object[] match) {
    try {
    	return MaxAnyUsageMatch.newMatch((java.lang.String) match[POSITION_ID], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_HOST], (hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APP]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MaxAnyUsageMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MaxAnyUsageMatch.newMutableMatch((java.lang.String) match[POSITION_ID], (hu.bme.mit.inf.cps.HostInstance) match[POSITION_HOST], (hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APP]);
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
  public static IQuerySpecification<MaxAnyUsageMatcher> querySpecification() throws IncQueryException {
    return MaxAnyUsageQuerySpecification.instance();
  }
}
