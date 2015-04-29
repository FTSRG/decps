package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.FullySatisfiedRequirementMatch;
import hu.bme.mit.inf.cps.patterns.FullySatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.util.ApplicationInRequirementQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.FullyAllocatedAppQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate FullySatisfiedRequirementMatcher in a type-safe way.
 * 
 * @see FullySatisfiedRequirementMatcher
 * @see FullySatisfiedRequirementMatch
 * 
 */
@SuppressWarnings("all")
public final class FullySatisfiedRequirementQuerySpecification extends BaseGeneratedEMFQuerySpecification<FullySatisfiedRequirementMatcher> {
  private FullySatisfiedRequirementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FullySatisfiedRequirementQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FullySatisfiedRequirementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FullySatisfiedRequirementMatcher.on(engine);
  }
  
  @Override
  public FullySatisfiedRequirementMatch newEmptyMatch() {
    return FullySatisfiedRequirementMatch.newEmptyMatch();
  }
  
  @Override
  public FullySatisfiedRequirementMatch newMatch(final Object... parameters) {
    return FullySatisfiedRequirementMatch.newMatch((hu.bme.mit.inf.cps.Requirement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static FullySatisfiedRequirementQuerySpecification INSTANCE = make();
    
    public static FullySatisfiedRequirementQuerySpecification make() {
      return new FullySatisfiedRequirementQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FullySatisfiedRequirementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.fullySatisfiedRequirement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("req");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("req", "hu.bme.mit.inf.cps.Requirement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_req = body.getOrCreateVariableByName("req");
      	PVariable var_M = body.getOrCreateVariableByName("M");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_req, "req")
      	));
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "Requirement"), "http://cps/1.0/Requirement");
      	new PatternMatchCounter(body, new FlatTuple(var_req, var___0_), ApplicationInRequirementQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      	new Equality(body, var_M, var__virtual_0_);
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "Requirement"), "http://cps/1.0/Requirement");
      	new TypeBinary(body, CONTEXT, var_req, var__virtual_1_, getFeatureLiteral("http://cps/1.0", "Requirement", "count"), "http://cps/1.0/Requirement.count");
      	new Equality(body, var__virtual_1_, var_M);
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "Requirement"), "http://cps/1.0/Requirement");
      	new TypeBinary(body, CONTEXT, var_req, var__virtual_2_, getFeatureLiteral("http://cps/1.0", "Requirement", "instances"), "http://cps/1.0/Requirement.instances");
      	new Equality(body, var__virtual_2_, var_app);
      	new PositivePatternCall(body, new FlatTuple(var_app), FullyAllocatedAppQuerySpecification.instance().getInternalQueryRepresentation());
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
