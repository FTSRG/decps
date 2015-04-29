package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.patterns.RunningAppMatch;
import hu.bme.mit.inf.cps.patterns.util.RunningAppQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.cps.patterns.runningApp pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RunningAppMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern runningApp(appInst : ApplicationInstance) {
 * 	ApplicationInstance.state(appInst, ::Running);
 * }
 * </pre></code>
 * 
 * @see RunningAppMatch
 * @see RunningAppProcessor
 * @see RunningAppQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RunningAppMatcher extends BaseMatcher<RunningAppMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RunningAppMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RunningAppMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RunningAppMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_APPINST = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RunningAppMatcher.class);
  
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
  public RunningAppMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RunningAppMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return matches represented as a RunningAppMatch object.
   * 
   */
  public Collection<RunningAppMatch> getAllMatches(final ApplicationInstance pAppInst) {
    return rawGetAllMatches(new Object[]{pAppInst});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return a match represented as a RunningAppMatch object, or null if no match is found.
   * 
   */
  public RunningAppMatch getOneArbitraryMatch(final ApplicationInstance pAppInst) {
    return rawGetOneArbitraryMatch(new Object[]{pAppInst});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ApplicationInstance pAppInst) {
    return rawHasMatch(new Object[]{pAppInst});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ApplicationInstance pAppInst) {
    return rawCountMatches(new Object[]{pAppInst});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ApplicationInstance pAppInst, final IMatchProcessor<? super RunningAppMatch> processor) {
    rawForEachMatch(new Object[]{pAppInst}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ApplicationInstance pAppInst, final IMatchProcessor<? super RunningAppMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAppInst}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAppInst the fixed value of pattern parameter appInst, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RunningAppMatch newMatch(final ApplicationInstance pAppInst) {
    return RunningAppMatch.newMatch(pAppInst);
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInst.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ApplicationInstance> rawAccumulateAllValuesOfappInst(final Object[] parameters) {
    Set<ApplicationInstance> results = new HashSet<ApplicationInstance>();
    rawAccumulateAllValues(POSITION_APPINST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for appInst.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ApplicationInstance> getAllValuesOfappInst() {
    return rawAccumulateAllValuesOfappInst(emptyArray());
  }
  
  @Override
  protected RunningAppMatch tupleToMatch(final Tuple t) {
    try {
    	return RunningAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) t.get(POSITION_APPINST));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RunningAppMatch arrayToMatch(final Object[] match) {
    try {
    	return RunningAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APPINST]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RunningAppMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RunningAppMatch.newMutableMatch((hu.bme.mit.inf.cps.ApplicationInstance) match[POSITION_APPINST]);
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
  public static IQuerySpecification<RunningAppMatcher> querySpecification() throws IncQueryException {
    return RunningAppQuerySpecification.instance();
  }
}
