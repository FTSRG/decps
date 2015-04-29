package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.UnusedHostMatch;
import hu.bme.mit.inf.cps.patterns.UnusedHostMatcher;
import hu.bme.mit.inf.cps.patterns.util.HasHostedAppQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate UnusedHostMatcher in a type-safe way.
 * 
 * @see UnusedHostMatcher
 * @see UnusedHostMatch
 * 
 */
@SuppressWarnings("all")
public final class UnusedHostQuerySpecification extends BaseGeneratedEMFQuerySpecification<UnusedHostMatcher> {
  private UnusedHostQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UnusedHostQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected UnusedHostMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UnusedHostMatcher.on(engine);
  }
  
  @Override
  public UnusedHostMatch newEmptyMatch() {
    return UnusedHostMatch.newEmptyMatch();
  }
  
  @Override
  public UnusedHostMatch newMatch(final Object... parameters) {
    return UnusedHostMatch.newMatch((hu.bme.mit.inf.cps.HostInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static UnusedHostQuerySpecification INSTANCE = make();
    
    public static UnusedHostQuerySpecification make() {
      return new UnusedHostQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static UnusedHostQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.unusedHost";
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
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_host, "host")
      	));
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new NegativePatternCall(body, new FlatTuple(var_host), HasHostedAppQuerySpecification.instance().getInternalQueryRepresentation());
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
