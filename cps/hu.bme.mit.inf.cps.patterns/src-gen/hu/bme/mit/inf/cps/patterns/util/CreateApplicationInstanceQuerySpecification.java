package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatch;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CreateApplicationInstanceMatcher in a type-safe way.
 * 
 * @see CreateApplicationInstanceMatcher
 * @see CreateApplicationInstanceMatch
 * 
 */
@SuppressWarnings("all")
public final class CreateApplicationInstanceQuerySpecification extends BaseGeneratedEMFQuerySpecification<CreateApplicationInstanceMatcher> {
  private CreateApplicationInstanceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CreateApplicationInstanceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CreateApplicationInstanceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CreateApplicationInstanceMatcher.on(engine);
  }
  
  @Override
  public CreateApplicationInstanceMatch newEmptyMatch() {
    return CreateApplicationInstanceMatch.newEmptyMatch();
  }
  
  @Override
  public CreateApplicationInstanceMatch newMatch(final Object... parameters) {
    return CreateApplicationInstanceMatch.newMatch((hu.bme.mit.inf.cps.Requirement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CreateApplicationInstanceQuerySpecification INSTANCE = make();
    
    public static CreateApplicationInstanceQuerySpecification make() {
      return new CreateApplicationInstanceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CreateApplicationInstanceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.createApplicationInstance";
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
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_req, "req")
      	));
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "Requirement"), "http://cps/1.0/Requirement");
      	new PositivePatternCall(body, new FlatTuple(var_req), UnsatisfiedRequirementQuerySpecification.instance().getInternalQueryRepresentation());
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
