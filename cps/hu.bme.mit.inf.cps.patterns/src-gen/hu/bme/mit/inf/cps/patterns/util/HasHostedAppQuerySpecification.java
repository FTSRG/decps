package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.HasHostedAppMatch;
import hu.bme.mit.inf.cps.patterns.HasHostedAppMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate HasHostedAppMatcher in a type-safe way.
 * 
 * @see HasHostedAppMatcher
 * @see HasHostedAppMatch
 * 
 */
@SuppressWarnings("all")
public final class HasHostedAppQuerySpecification extends BaseGeneratedEMFQuerySpecification<HasHostedAppMatcher> {
  private HasHostedAppQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static HasHostedAppQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HasHostedAppMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return HasHostedAppMatcher.on(engine);
  }
  
  @Override
  public HasHostedAppMatch newEmptyMatch() {
    return HasHostedAppMatch.newEmptyMatch();
  }
  
  @Override
  public HasHostedAppMatch newMatch(final Object... parameters) {
    return HasHostedAppMatch.newMatch((hu.bme.mit.inf.cps.HostInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static HasHostedAppQuerySpecification INSTANCE = make();
    
    public static HasHostedAppQuerySpecification make() {
      return new HasHostedAppQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static HasHostedAppQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.hasHostedApp";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("host");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("host", "hu.bme.mit.inf.cps.HostInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_host = body.getOrCreateVariableByName("host");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_host, "host")
      	));
      	new TypeBinary(body, CONTEXT, var_host, var___0_, getFeatureLiteral("http://cps/1.0", "HostInstance", "applications"), "http://cps/1.0/HostInstance.applications");
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
