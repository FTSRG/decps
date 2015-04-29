package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatcher;
import hu.bme.mit.inf.cps.patterns.AllocatedAppMatcher;
import hu.bme.mit.inf.cps.patterns.FullyAllocatedAppMatcher;
import hu.bme.mit.inf.cps.patterns.FullySatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.HasHostedAppMatcher;
import hu.bme.mit.inf.cps.patterns.NoUnallocatedAppsMatcher;
import hu.bme.mit.inf.cps.patterns.NotExistUnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.NotRunningAppMatcher;
import hu.bme.mit.inf.cps.patterns.RequirementHasAllAppMatcher;
import hu.bme.mit.inf.cps.patterns.RunningAppMatcher;
import hu.bme.mit.inf.cps.patterns.UnallocatedAppMatcher;
import hu.bme.mit.inf.cps.patterns.UnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.UnusedHostMatcher;
import hu.bme.mit.inf.cps.patterns.util.AllApplicationInstanceIsRunningQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.AllocatedAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.FullyAllocatedAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.FullySatisfiedRequirementQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.HasHostedAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.NoUnallocatedAppsQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.NotExistUnsatisfiedRequirementQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.NotRunningAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.RequirementHasAllAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.RunningAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.UnallocatedAppQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.UnsatisfiedRequirementQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.UnusedHostQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in goals.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file goals.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.cps.patterns, the group contains the definition of the following patterns: <ul>
 * <li>allApplicationInstanceIsRunning</li>
 * <li>notRunningApp</li>
 * <li>runningApp</li>
 * <li>notExistUnsatisfiedRequirement</li>
 * <li>unsatisfiedRequirement</li>
 * <li>fullySatisfiedRequirement</li>
 * <li>applicationInRequirement</li>
 * <li>requirementHasAllApp</li>
 * <li>noUnallocatedApps</li>
 * <li>allocatedApp</li>
 * <li>unallocatedApp</li>
 * <li>allocatedToHostType</li>
 * <li>fullyAllocatedApp</li>
 * <li>unusedHost</li>
 * <li>hasHostedApp</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Goals extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Goals instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Goals();
    }
    return INSTANCE;
  }
  
  private static Goals INSTANCE;
  
  private Goals() throws IncQueryException {
    querySpecifications.add(AllApplicationInstanceIsRunningQuerySpecification.instance());
    querySpecifications.add(NotRunningAppQuerySpecification.instance());
    querySpecifications.add(RunningAppQuerySpecification.instance());
    querySpecifications.add(NotExistUnsatisfiedRequirementQuerySpecification.instance());
    querySpecifications.add(UnsatisfiedRequirementQuerySpecification.instance());
    querySpecifications.add(FullySatisfiedRequirementQuerySpecification.instance());
    querySpecifications.add(RequirementHasAllAppQuerySpecification.instance());
    querySpecifications.add(NoUnallocatedAppsQuerySpecification.instance());
    querySpecifications.add(AllocatedAppQuerySpecification.instance());
    querySpecifications.add(UnallocatedAppQuerySpecification.instance());
    querySpecifications.add(FullyAllocatedAppQuerySpecification.instance());
    querySpecifications.add(UnusedHostQuerySpecification.instance());
    querySpecifications.add(HasHostedAppQuerySpecification.instance());
  }
  
  public AllApplicationInstanceIsRunningQuerySpecification getAllApplicationInstanceIsRunning() throws IncQueryException {
    return AllApplicationInstanceIsRunningQuerySpecification.instance();
  }
  
  public AllApplicationInstanceIsRunningMatcher getAllApplicationInstanceIsRunning(final IncQueryEngine engine) throws IncQueryException {
    return AllApplicationInstanceIsRunningMatcher.on(engine);
  }
  
  public NotRunningAppQuerySpecification getNotRunningApp() throws IncQueryException {
    return NotRunningAppQuerySpecification.instance();
  }
  
  public NotRunningAppMatcher getNotRunningApp(final IncQueryEngine engine) throws IncQueryException {
    return NotRunningAppMatcher.on(engine);
  }
  
  public RunningAppQuerySpecification getRunningApp() throws IncQueryException {
    return RunningAppQuerySpecification.instance();
  }
  
  public RunningAppMatcher getRunningApp(final IncQueryEngine engine) throws IncQueryException {
    return RunningAppMatcher.on(engine);
  }
  
  public NotExistUnsatisfiedRequirementQuerySpecification getNotExistUnsatisfiedRequirement() throws IncQueryException {
    return NotExistUnsatisfiedRequirementQuerySpecification.instance();
  }
  
  public NotExistUnsatisfiedRequirementMatcher getNotExistUnsatisfiedRequirement(final IncQueryEngine engine) throws IncQueryException {
    return NotExistUnsatisfiedRequirementMatcher.on(engine);
  }
  
  public UnsatisfiedRequirementQuerySpecification getUnsatisfiedRequirement() throws IncQueryException {
    return UnsatisfiedRequirementQuerySpecification.instance();
  }
  
  public UnsatisfiedRequirementMatcher getUnsatisfiedRequirement(final IncQueryEngine engine) throws IncQueryException {
    return UnsatisfiedRequirementMatcher.on(engine);
  }
  
  public FullySatisfiedRequirementQuerySpecification getFullySatisfiedRequirement() throws IncQueryException {
    return FullySatisfiedRequirementQuerySpecification.instance();
  }
  
  public FullySatisfiedRequirementMatcher getFullySatisfiedRequirement(final IncQueryEngine engine) throws IncQueryException {
    return FullySatisfiedRequirementMatcher.on(engine);
  }
  
  public RequirementHasAllAppQuerySpecification getRequirementHasAllApp() throws IncQueryException {
    return RequirementHasAllAppQuerySpecification.instance();
  }
  
  public RequirementHasAllAppMatcher getRequirementHasAllApp(final IncQueryEngine engine) throws IncQueryException {
    return RequirementHasAllAppMatcher.on(engine);
  }
  
  public NoUnallocatedAppsQuerySpecification getNoUnallocatedApps() throws IncQueryException {
    return NoUnallocatedAppsQuerySpecification.instance();
  }
  
  public NoUnallocatedAppsMatcher getNoUnallocatedApps(final IncQueryEngine engine) throws IncQueryException {
    return NoUnallocatedAppsMatcher.on(engine);
  }
  
  public AllocatedAppQuerySpecification getAllocatedApp() throws IncQueryException {
    return AllocatedAppQuerySpecification.instance();
  }
  
  public AllocatedAppMatcher getAllocatedApp(final IncQueryEngine engine) throws IncQueryException {
    return AllocatedAppMatcher.on(engine);
  }
  
  public UnallocatedAppQuerySpecification getUnallocatedApp() throws IncQueryException {
    return UnallocatedAppQuerySpecification.instance();
  }
  
  public UnallocatedAppMatcher getUnallocatedApp(final IncQueryEngine engine) throws IncQueryException {
    return UnallocatedAppMatcher.on(engine);
  }
  
  public FullyAllocatedAppQuerySpecification getFullyAllocatedApp() throws IncQueryException {
    return FullyAllocatedAppQuerySpecification.instance();
  }
  
  public FullyAllocatedAppMatcher getFullyAllocatedApp(final IncQueryEngine engine) throws IncQueryException {
    return FullyAllocatedAppMatcher.on(engine);
  }
  
  public UnusedHostQuerySpecification getUnusedHost() throws IncQueryException {
    return UnusedHostQuerySpecification.instance();
  }
  
  public UnusedHostMatcher getUnusedHost(final IncQueryEngine engine) throws IncQueryException {
    return UnusedHostMatcher.on(engine);
  }
  
  public HasHostedAppQuerySpecification getHasHostedApp() throws IncQueryException {
    return HasHostedAppQuerySpecification.instance();
  }
  
  public HasHostedAppMatcher getHasHostedApp(final IncQueryEngine engine) throws IncQueryException {
    return HasHostedAppMatcher.on(engine);
  }
}
