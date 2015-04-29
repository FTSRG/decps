package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.NotExistUnsatisfiedRequirementMatch;
import hu.bme.mit.inf.cps.patterns.NotExistUnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.util.UnsatisfiedRequirementQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NotExistUnsatisfiedRequirementMatcher in a type-safe way.
 * 
 * @see NotExistUnsatisfiedRequirementMatcher
 * @see NotExistUnsatisfiedRequirementMatch
 * 
 */
@SuppressWarnings("all")
public final class NotExistUnsatisfiedRequirementQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotExistUnsatisfiedRequirementMatcher> {
  private NotExistUnsatisfiedRequirementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotExistUnsatisfiedRequirementQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotExistUnsatisfiedRequirementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotExistUnsatisfiedRequirementMatcher.on(engine);
  }
  
  @Override
  public NotExistUnsatisfiedRequirementMatch newEmptyMatch() {
    return NotExistUnsatisfiedRequirementMatch.newEmptyMatch();
  }
  
  @Override
  public NotExistUnsatisfiedRequirementMatch newMatch(final Object... parameters) {
    return NotExistUnsatisfiedRequirementMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static NotExistUnsatisfiedRequirementQuerySpecification INSTANCE = make();
    
    public static NotExistUnsatisfiedRequirementQuerySpecification make() {
      return new NotExistUnsatisfiedRequirementQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotExistUnsatisfiedRequirementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.notExistUnsatisfiedRequirement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList();
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList();
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      	));
      	new NegativePatternCall(body, new FlatTuple(var___0_), UnsatisfiedRequirementQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
