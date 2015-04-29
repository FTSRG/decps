package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatch;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatcher;
import hu.bme.mit.inf.cps.patterns.util.AllocatedToQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DeleteAllocationMatcher in a type-safe way.
 * 
 * @see DeleteAllocationMatcher
 * @see DeleteAllocationMatch
 * 
 */
@SuppressWarnings("all")
public final class DeleteAllocationQuerySpecification extends BaseGeneratedEMFQuerySpecification<DeleteAllocationMatcher> {
  private DeleteAllocationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DeleteAllocationQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DeleteAllocationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DeleteAllocationMatcher.on(engine);
  }
  
  @Override
  public DeleteAllocationMatch newEmptyMatch() {
    return DeleteAllocationMatch.newEmptyMatch();
  }
  
  @Override
  public DeleteAllocationMatch newMatch(final Object... parameters) {
    return DeleteAllocationMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0], (hu.bme.mit.inf.cps.HostInstance) parameters[1], (hu.bme.mit.inf.cps.ResourceRequirement) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static DeleteAllocationQuerySpecification INSTANCE = make();
    
    public static DeleteAllocationQuerySpecification make() {
      return new DeleteAllocationQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DeleteAllocationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.deleteAllocation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("appInstance","hostInstance","req");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("appInstance", "hu.bme.mit.inf.cps.ApplicationInstance"),new PParameter("hostInstance", "hu.bme.mit.inf.cps.HostInstance"),new PParameter("req", "hu.bme.mit.inf.cps.ResourceRequirement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_appInstance = body.getOrCreateVariableByName("appInstance");
      	PVariable var_hostInstance = body.getOrCreateVariableByName("hostInstance");
      	PVariable var_req = body.getOrCreateVariableByName("req");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_appInstance, "appInstance"),
      				
      		new ExportedParameter(body, var_hostInstance, "hostInstance"),
      				
      		new ExportedParameter(body, var_req, "req")
      	));
      	new PositivePatternCall(body, new FlatTuple(var_appInstance, var_hostInstance), AllocatedToQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeBinary(body, CONTEXT, var_appInstance, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "type"), "http://cps/1.0/ApplicationInstance.type");
      	new TypeBinary(body, CONTEXT, var__virtual_0_, var_req, getFeatureLiteral("http://cps/1.0", "ApplicationType", "requirements"), "http://cps/1.0/ApplicationType.requirements");
      	new TypeBinary(body, CONTEXT, var_req, var__virtual_2_, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "hostType"), "http://cps/1.0/ResourceRequirement.hostType");
      	new TypeBinary(body, CONTEXT, var__virtual_2_, var_hostInstance, getFeatureLiteral("http://cps/1.0", "HostType", "instances"), "http://cps/1.0/HostType.instances");
      	new ConstantValue(body, var__virtual_4_, getEnumLiteral("http://cps/1.0", "State", "Stopped").getInstance());
      	new TypeBinary(body, CONTEXT, var_appInstance, var__virtual_4_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "state"), "http://cps/1.0/ApplicationInstance.state");
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
