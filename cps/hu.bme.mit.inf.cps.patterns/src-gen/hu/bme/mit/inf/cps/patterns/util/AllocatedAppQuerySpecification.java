package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.AllocatedAppMatch;
import hu.bme.mit.inf.cps.patterns.AllocatedAppMatcher;
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
 * A pattern-specific query specification that can instantiate AllocatedAppMatcher in a type-safe way.
 * 
 * @see AllocatedAppMatcher
 * @see AllocatedAppMatch
 * 
 */
@SuppressWarnings("all")
public final class AllocatedAppQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllocatedAppMatcher> {
  private AllocatedAppQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllocatedAppQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllocatedAppMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllocatedAppMatcher.on(engine);
  }
  
  @Override
  public AllocatedAppMatch newEmptyMatch() {
    return AllocatedAppMatch.newEmptyMatch();
  }
  
  @Override
  public AllocatedAppMatch newMatch(final Object... parameters) {
    return AllocatedAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0], (hu.bme.mit.inf.cps.ResourceRequirement) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static AllocatedAppQuerySpecification INSTANCE = make();
    
    public static AllocatedAppQuerySpecification make() {
      return new AllocatedAppQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllocatedAppQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.allocatedApp";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("app","rr");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("app", "hu.bme.mit.inf.cps.ApplicationInstance"),new PParameter("rr", "hu.bme.mit.inf.cps.ResourceRequirement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	PVariable var_rr = body.getOrCreateVariableByName("rr");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_hostType = body.getOrCreateVariableByName("hostType");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_app, "app"),
      				
      		new ExportedParameter(body, var_rr, "rr")
      	));
      	new TypeBinary(body, CONTEXT, var_app, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "type"), "http://cps/1.0/ApplicationInstance.type");
      	new TypeBinary(body, CONTEXT, var__virtual_0_, var_rr, getFeatureLiteral("http://cps/1.0", "ApplicationType", "requirements"), "http://cps/1.0/ApplicationType.requirements");
      	new TypeBinary(body, CONTEXT, var_rr, var_hostType, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "hostType"), "http://cps/1.0/ResourceRequirement.hostType");
      	new TypeBinary(body, CONTEXT, var_app, var__virtual_3_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "allocatedTo"), "http://cps/1.0/ApplicationInstance.allocatedTo");
      	new TypeBinary(body, CONTEXT, var__virtual_3_, var_hostType, getFeatureLiteral("http://cps/1.0", "HostInstance", "type"), "http://cps/1.0/HostInstance.type");
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
