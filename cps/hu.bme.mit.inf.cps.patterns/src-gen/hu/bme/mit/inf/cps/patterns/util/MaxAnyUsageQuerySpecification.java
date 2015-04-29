package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatcher;
import hu.bme.mit.inf.cps.patterns.util.MaxCpuUsageQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.MaxHddUsageQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.MaxRamUsageQuerySpecification;
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
 * A pattern-specific query specification that can instantiate MaxAnyUsageMatcher in a type-safe way.
 * 
 * @see MaxAnyUsageMatcher
 * @see MaxAnyUsageMatch
 * 
 */
@SuppressWarnings("all")
public final class MaxAnyUsageQuerySpecification extends BaseGeneratedEMFQuerySpecification<MaxAnyUsageMatcher> {
  private MaxAnyUsageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MaxAnyUsageQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MaxAnyUsageMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MaxAnyUsageMatcher.on(engine);
  }
  
  @Override
  public MaxAnyUsageMatch newEmptyMatch() {
    return MaxAnyUsageMatch.newEmptyMatch();
  }
  
  @Override
  public MaxAnyUsageMatch newMatch(final Object... parameters) {
    return MaxAnyUsageMatch.newMatch((java.lang.String) parameters[0], (hu.bme.mit.inf.cps.HostInstance) parameters[1], (hu.bme.mit.inf.cps.ApplicationInstance) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static MaxAnyUsageQuerySpecification INSTANCE = make();
    
    public static MaxAnyUsageQuerySpecification make() {
      return new MaxAnyUsageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MaxAnyUsageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.maxAnyUsage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("id","host","app");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("id", "java.lang.String"),new PParameter("host", "hu.bme.mit.inf.cps.HostInstance"),new PParameter("app", "hu.bme.mit.inf.cps.ApplicationInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_id = body.getOrCreateVariableByName("id");
      	PVariable var_host = body.getOrCreateVariableByName("host");
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_host, "host"),
      				
      		new ExportedParameter(body, var_app, "app")
      	));
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new PositivePatternCall(body, new FlatTuple(var_id, var_host, var_app), MaxCpuUsageQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_id = body.getOrCreateVariableByName("id");
      	PVariable var_host = body.getOrCreateVariableByName("host");
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_host, "host"),
      				
      		new ExportedParameter(body, var_app, "app")
      	));
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new PositivePatternCall(body, new FlatTuple(var_id, var_host, var_app), MaxRamUsageQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_id = body.getOrCreateVariableByName("id");
      	PVariable var_host = body.getOrCreateVariableByName("host");
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_host, "host"),
      				
      		new ExportedParameter(body, var_app, "app")
      	));
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new PositivePatternCall(body, new FlatTuple(var_id, var_host, var_app), MaxHddUsageQuerySpecification.instance().getInternalQueryRepresentation());
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
