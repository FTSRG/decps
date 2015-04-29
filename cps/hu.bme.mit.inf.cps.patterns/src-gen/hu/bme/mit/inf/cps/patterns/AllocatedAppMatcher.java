package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.patterns.AllocatedAppMatch;
import hu.bme.mit.inf.cps.patterns.util.AllocatedAppQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.cps.patterns.allocatedApp pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllocatedAppMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allocatedApp(app : ApplicationInstance, rr : ResourceRequirement) {
 * 	ApplicationInstance.type.requirements(app, rr);
 * 	ResourceRequirement.hostType(rr, hostType);
 * 	ApplicationInstance.allocatedTo.type(app, hostType);
 * }
 * </pre></code>
 * 
 * @see AllocatedAppMatch
 * @see AllocatedAppProcessor
 * @see AllocatedAppQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllocatedAppMatcher extends BaseMatcher<AllocatedAppMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllocatedAppMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AllocatedAppMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AllocatedAppMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_APP = 0;
  
  private final static int POSITION_RR = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AllocatedAppMatcher.class);
  
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
  public AllocatedAppMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AllocatedAppMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @return matches represented as a AllocatedAppMatch object.
   * 
   */
  public Collection<AllocatedAppMatch> getAllMatches(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return rawGetAllMatches(new Object[]{pApp, pRr});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @return a match represented as a AllocatedAppMatch object, or null if no match is found.
   * 
   */
  public AllocatedAppMatch getOneArbitraryMatch(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return rawGetOneArbitraryMatch(new Object[]{pApp, pRr});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return rawHasMatch(new Object[]{pApp, pRr});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return rawCountMatches(new Object[]{pApp, pRr});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ApplicationInstance pApp, final ResourceRequirement pRr, final IMatchProcessor<? super AllocatedAppMatch> processor) {
    rawForEachMatch(new Object[]{pApp, pRr}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pApp the fixed value of pattern parameter app, or null if not bound.
   * @param pRr the fixed value of pattern parameter rr, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ApplicationInstance pApp, final ResourceRequirement pRr, final IMatchProcessor<? super AllocatedAppMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pApp, pRr}, processor);
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
  public AllocatedAppMatch newMatch(final ApplicationInstance pApp, final ResourceRequirement pRr) {
    return AllocatedAppMatch.newMatch(pApp, pRr);
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
  public Set<ApplicationInstance> getAllValuesOfapp(final AllocatedAppMatch partialMatch) {
    return rawAccumulateAllValuesOfapp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for app.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfapp(final ResourceRequirement pRr) {
    return rawAccumulateAllValuesOfapp(new Object[]{
    null, 
    pRr
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for rr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ResourceRequirement> rawAccumulateAllValuesOfrr(final Object[] parameters) {
    Set<ResourceRequirement> results = new HashSet<ResourceRequirement>();
    rawAccumulateAllValues(POSITION_RR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfrr() {
    return rawAccumulateAllValuesOfrr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfrr(final AllocatedAppMatch partialMatch) {
    return rawAccumulateAllValuesOfrr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResourceRequirement> getAllValuesOfrr(final ApplicationInstance pApp) {
    return rawAccumulateAllValuesOfrr(new Object[]{
    pApp, 
    null
    });
  }
  
  @Override
  protected AllocatedAppMatch tupleToMatch(final Tuple t) {
    try {
    	return AllocatedAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) t.get(POSITION_APP), (hu.bme.mit.inf.cps.ResourceRequirement) t.get(POSITION_RR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllocatedAppMatch arrayToMatch(final Object[] match) {
    try {
    	return AllocatedAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APP], (hu.bme.mit.inf.cps.ResourceRequirement) match[POSITION_RR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllocatedAppMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AllocatedAppMatch.newMutableMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APP], (hu.bme.mit.inf.cps.ResourceRequirement) match[POSITION_RR]);
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
  public static IQuerySpecification<AllocatedAppMatcher> querySpecification() throws IncQueryException {
    return AllocatedAppQuerySpecification.instance();
  }
}
