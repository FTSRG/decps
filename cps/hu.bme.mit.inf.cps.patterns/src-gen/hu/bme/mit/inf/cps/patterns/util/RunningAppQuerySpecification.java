package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.RunningAppMatch;
import hu.bme.mit.inf.cps.patterns.RunningAppMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate RunningAppMatcher in a type-safe way.
 * 
 * @see RunningAppMatcher
 * @see RunningAppMatch
 * 
 */
@SuppressWarnings("all")
public final class RunningAppQuerySpecification extends BaseGeneratedEMFQuerySpecification<RunningAppMatcher> {
  private RunningAppQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RunningAppQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RunningAppMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RunningAppMatcher.on(engine);
  }
  
  @Override
  public RunningAppMatch newEmptyMatch() {
    return RunningAppMatch.newEmptyMatch();
  }
  
  @Override
  public RunningAppMatch newMatch(final Object... parameters) {
    return RunningAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static RunningAppQuerySpecification INSTANCE = make();
    
    public static RunningAppQuerySpecification make() {
      return new RunningAppQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RunningAppQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.runningApp";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("appInst");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("appInst", "hu.bme.mit.inf.cps.ApplicationInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_appInst = body.getOrCreateVariableByName("appInst");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_appInst, "appInst")
      	));
      	new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://cps/1.0", "State", "Running").getInstance());
      	new TypeBinary(body, CONTEXT, var_appInst, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "state"), "http://cps/1.0/ApplicationInstance.state");
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
