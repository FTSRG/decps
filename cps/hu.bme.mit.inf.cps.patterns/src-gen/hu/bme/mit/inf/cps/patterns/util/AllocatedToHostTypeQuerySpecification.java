package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
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
 * A pattern-specific query specification that can instantiate AllocatedToHostTypeMatcher in a type-safe way.
 * 
 * @see AllocatedToHostTypeMatcher
 * @see AllocatedToHostTypeMatch
 * 
 */
@SuppressWarnings("all")
final class AllocatedToHostTypeQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private AllocatedToHostTypeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllocatedToHostTypeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IncQueryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newEmptyMatch() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newMatch(final Object... parameters) {
    throw new UnsupportedOperationException();
  }
  
  private static class LazyHolder {
    private final static AllocatedToHostTypeQuerySpecification INSTANCE = make();
    
    public static AllocatedToHostTypeQuerySpecification make() {
      return new AllocatedToHostTypeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllocatedToHostTypeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.allocatedToHostType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("app","hostType");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("app", "hu.bme.mit.inf.cps.ApplicationInstance"),new PParameter("hostType", "hu.bme.mit.inf.cps.HostType"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	PVariable var_hostType = body.getOrCreateVariableByName("hostType");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_app, "app"),
      				
      		new ExportedParameter(body, var_hostType, "hostType")
      	));
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeUnary(body, var_hostType, getClassifierLiteral("http://cps/1.0", "HostType"), "http://cps/1.0/HostType");
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeBinary(body, CONTEXT, var_app, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "allocatedTo"), "http://cps/1.0/ApplicationInstance.allocatedTo");
      	new TypeBinary(body, CONTEXT, var__virtual_0_, var__virtual_1_, getFeatureLiteral("http://cps/1.0", "HostInstance", "type"), "http://cps/1.0/HostInstance.type");
      	new Equality(body, var__virtual_1_, var_hostType);
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
