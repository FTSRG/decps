package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.UnsatisfiedRequirementMatch;
import hu.bme.mit.inf.cps.patterns.UnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.util.ApplicationsInRequirementQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate UnsatisfiedRequirementMatcher in a type-safe way.
 * 
 * @see UnsatisfiedRequirementMatcher
 * @see UnsatisfiedRequirementMatch
 * 
 */
@SuppressWarnings("all")
public final class UnsatisfiedRequirementQuerySpecification extends BaseGeneratedEMFQuerySpecification<UnsatisfiedRequirementMatcher> {
  private UnsatisfiedRequirementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UnsatisfiedRequirementQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected UnsatisfiedRequirementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UnsatisfiedRequirementMatcher.on(engine);
  }
  
  @Override
  public UnsatisfiedRequirementMatch newEmptyMatch() {
    return UnsatisfiedRequirementMatch.newEmptyMatch();
  }
  
  @Override
  public UnsatisfiedRequirementMatch newMatch(final Object... parameters) {
    return UnsatisfiedRequirementMatch.newMatch((hu.bme.mit.inf.cps.Requirement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static UnsatisfiedRequirementQuerySpecification INSTANCE = make();
    
    public static UnsatisfiedRequirementQuerySpecification make() {
      return new UnsatisfiedRequirementQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static UnsatisfiedRequirementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.unsatisfiedRequirement";
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
      	PVariable var_N = body.getOrCreateVariableByName("N");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_req, "req")
      	));
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "Requirement"), "http://cps/1.0/Requirement");
      	new PatternMatchCounter(body, new FlatTuple(var_req, var___0_), ApplicationsInRequirementQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      	new Equality(body, var_M, var__virtual_0_);
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "Requirement"), "http://cps/1.0/Requirement");
      	new TypeBinary(body, CONTEXT, var_req, var__virtual_1_, getFeatureLiteral("http://cps/1.0", "Requirement", "count"), "http://cps/1.0/Requirement.count");
      	new Equality(body, var__virtual_1_, var_N);
      	new Inequality(body, var_M, var_N);
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
