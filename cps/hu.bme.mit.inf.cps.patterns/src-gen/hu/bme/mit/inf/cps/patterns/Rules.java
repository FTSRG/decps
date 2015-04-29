package hu.bme.mit.inf.cps.patterns;

import hu.bme.mit.inf.cps.patterns.AllocateMatcher;
import hu.bme.mit.inf.cps.patterns.CanAllocateToMatcher;
import hu.bme.mit.inf.cps.patterns.CancelRequestMatcher;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatcher;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatcher;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatcher;
import hu.bme.mit.inf.cps.patterns.MoveMatcher;
import hu.bme.mit.inf.cps.patterns.StartInstanceMatcher;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatcher;
import hu.bme.mit.inf.cps.patterns.UnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.util.AllocateQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.CanAllocateToQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.CancelRequestQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.CreateApplicationInstanceQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.DeleteAllocationQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.MaxAnyUsageQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.MoveQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.StartInstanceQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.StopInstanceQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.UnsatisfiedRequirementQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in rules.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file rules.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.cps.patterns, the group contains the definition of the following patterns: <ul>
 * <li>createApplicationInstance</li>
 * <li>unsatisfiedRequirement</li>
 * <li>applicationsInRequirement</li>
 * <li>allocate</li>
 * <li>deleteAllocation</li>
 * <li>startInstance</li>
 * <li>stopInstance</li>
 * <li>move</li>
 * <li>allocatedTo</li>
 * <li>allocatedToHostType</li>
 * <li>canAllocateTo</li>
 * <li>cancelRequest</li>
 * <li>maxCpuUsage</li>
 * <li>maxRamUsage</li>
 * <li>maxHddUsage</li>
 * <li>maxAnyUsage</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Rules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Rules instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Rules();
    }
    return INSTANCE;
  }
  
  private static Rules INSTANCE;
  
  private Rules() throws IncQueryException {
    querySpecifications.add(CreateApplicationInstanceQuerySpecification.instance());
    querySpecifications.add(UnsatisfiedRequirementQuerySpecification.instance());
    querySpecifications.add(AllocateQuerySpecification.instance());
    querySpecifications.add(DeleteAllocationQuerySpecification.instance());
    querySpecifications.add(StartInstanceQuerySpecification.instance());
    querySpecifications.add(StopInstanceQuerySpecification.instance());
    querySpecifications.add(MoveQuerySpecification.instance());
    querySpecifications.add(CanAllocateToQuerySpecification.instance());
    querySpecifications.add(CancelRequestQuerySpecification.instance());
    querySpecifications.add(MaxAnyUsageQuerySpecification.instance());
  }
  
  public CreateApplicationInstanceQuerySpecification getCreateApplicationInstance() throws IncQueryException {
    return CreateApplicationInstanceQuerySpecification.instance();
  }
  
  public CreateApplicationInstanceMatcher getCreateApplicationInstance(final IncQueryEngine engine) throws IncQueryException {
    return CreateApplicationInstanceMatcher.on(engine);
  }
  
  public UnsatisfiedRequirementQuerySpecification getUnsatisfiedRequirement() throws IncQueryException {
    return UnsatisfiedRequirementQuerySpecification.instance();
  }
  
  public UnsatisfiedRequirementMatcher getUnsatisfiedRequirement(final IncQueryEngine engine) throws IncQueryException {
    return UnsatisfiedRequirementMatcher.on(engine);
  }
  
  public AllocateQuerySpecification getAllocate() throws IncQueryException {
    return AllocateQuerySpecification.instance();
  }
  
  public AllocateMatcher getAllocate(final IncQueryEngine engine) throws IncQueryException {
    return AllocateMatcher.on(engine);
  }
  
  public DeleteAllocationQuerySpecification getDeleteAllocation() throws IncQueryException {
    return DeleteAllocationQuerySpecification.instance();
  }
  
  public DeleteAllocationMatcher getDeleteAllocation(final IncQueryEngine engine) throws IncQueryException {
    return DeleteAllocationMatcher.on(engine);
  }
  
  public StartInstanceQuerySpecification getStartInstance() throws IncQueryException {
    return StartInstanceQuerySpecification.instance();
  }
  
  public StartInstanceMatcher getStartInstance(final IncQueryEngine engine) throws IncQueryException {
    return StartInstanceMatcher.on(engine);
  }
  
  public StopInstanceQuerySpecification getStopInstance() throws IncQueryException {
    return StopInstanceQuerySpecification.instance();
  }
  
  public StopInstanceMatcher getStopInstance(final IncQueryEngine engine) throws IncQueryException {
    return StopInstanceMatcher.on(engine);
  }
  
  public MoveQuerySpecification getMove() throws IncQueryException {
    return MoveQuerySpecification.instance();
  }
  
  public MoveMatcher getMove(final IncQueryEngine engine) throws IncQueryException {
    return MoveMatcher.on(engine);
  }
  
  public CanAllocateToQuerySpecification getCanAllocateTo() throws IncQueryException {
    return CanAllocateToQuerySpecification.instance();
  }
  
  public CanAllocateToMatcher getCanAllocateTo(final IncQueryEngine engine) throws IncQueryException {
    return CanAllocateToMatcher.on(engine);
  }
  
  public CancelRequestQuerySpecification getCancelRequest() throws IncQueryException {
    return CancelRequestQuerySpecification.instance();
  }
  
  public CancelRequestMatcher getCancelRequest(final IncQueryEngine engine) throws IncQueryException {
    return CancelRequestMatcher.on(engine);
  }
  
  public MaxAnyUsageQuerySpecification getMaxAnyUsage() throws IncQueryException {
    return MaxAnyUsageQuerySpecification.instance();
  }
  
  public MaxAnyUsageMatcher getMaxAnyUsage(final IncQueryEngine engine) throws IncQueryException {
    return MaxAnyUsageMatcher.on(engine);
  }
}
