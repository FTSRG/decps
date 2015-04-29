package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.CancelRequestMatch;
import hu.bme.mit.inf.cps.patterns.CancelRequestMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate CancelRequestMatcher in a type-safe way.
 * 
 * @see CancelRequestMatcher
 * @see CancelRequestMatch
 * 
 */
@SuppressWarnings("all")
public final class CancelRequestQuerySpecification extends BaseGeneratedEMFQuerySpecification<CancelRequestMatcher> {
  private CancelRequestQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CancelRequestQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CancelRequestMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CancelRequestMatcher.on(engine);
  }
  
  @Override
  public CancelRequestMatch newEmptyMatch() {
    return CancelRequestMatch.newEmptyMatch();
  }
  
  @Override
  public CancelRequestMatch newMatch(final Object... parameters) {
    return CancelRequestMatch.newMatch((hu.bme.mit.inf.cps.Request) parameters[0], (hu.bme.mit.inf.cps.CyberPhysicalSystem) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CancelRequestQuerySpecification INSTANCE = make();
    
    public static CancelRequestQuerySpecification make() {
      return new CancelRequestQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CancelRequestQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.cancelRequest";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("request","cps");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("request", "hu.bme.mit.inf.cps.Request"),new PParameter("cps", "hu.bme.mit.inf.cps.CyberPhysicalSystem"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_request = body.getOrCreateVariableByName("request");
      	PVariable var_cps = body.getOrCreateVariableByName("cps");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_request, "request"),
      				
      		new ExportedParameter(body, var_cps, "cps")
      	));
      	new TypeUnary(body, var_request, getClassifierLiteral("http://cps/1.0", "Request"), "http://cps/1.0/Request");
      	new TypeUnary(body, var_cps, getClassifierLiteral("http://cps/1.0", "CyberPhysicalSystem"), "http://cps/1.0/CyberPhysicalSystem");
      	new TypeUnary(body, var_cps, getClassifierLiteral("http://cps/1.0", "CyberPhysicalSystem"), "http://cps/1.0/CyberPhysicalSystem");
      	new TypeBinary(body, CONTEXT, var_cps, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "CyberPhysicalSystem", "requests"), "http://cps/1.0/CyberPhysicalSystem.requests");
      	new Equality(body, var__virtual_0_, var_request);
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
