package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatch;
import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatcher;
import hu.bme.mit.inf.cps.patterns.util.NotRunningAppQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AllApplicationInstanceIsRunningMatcher in a type-safe way.
 * 
 * @see AllApplicationInstanceIsRunningMatcher
 * @see AllApplicationInstanceIsRunningMatch
 * 
 */
@SuppressWarnings("all")
public final class AllApplicationInstanceIsRunningQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllApplicationInstanceIsRunningMatcher> {
  private AllApplicationInstanceIsRunningQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllApplicationInstanceIsRunningQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllApplicationInstanceIsRunningMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllApplicationInstanceIsRunningMatcher.on(engine);
  }
  
  @Override
  public AllApplicationInstanceIsRunningMatch newEmptyMatch() {
    return AllApplicationInstanceIsRunningMatch.newEmptyMatch();
  }
  
  @Override
  public AllApplicationInstanceIsRunningMatch newMatch(final Object... parameters) {
    return AllApplicationInstanceIsRunningMatch.newMatch((java.lang.Integer) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static AllApplicationInstanceIsRunningQuerySpecification INSTANCE = make();
    
    public static AllApplicationInstanceIsRunningQuerySpecification make() {
      return new AllApplicationInstanceIsRunningQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllApplicationInstanceIsRunningQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.allApplicationInstanceIsRunning";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("x");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("x", "java.lang.Integer"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_x = body.getOrCreateVariableByName("x");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_x, "x")
      	));
      	new ConstantValue(body, var__virtual_0_, 1);
      	new Equality(body, var_x, var__virtual_0_);
      	new NegativePatternCall(body, new FlatTuple(var___0_), NotRunningAppQuerySpecification.instance().getInternalQueryRepresentation());
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
