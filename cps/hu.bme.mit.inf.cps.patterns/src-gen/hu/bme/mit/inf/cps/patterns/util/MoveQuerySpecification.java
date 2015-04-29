package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.MoveMatcher;
import hu.bme.mit.inf.cps.patterns.util.AllocatedToQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.CanAllocateToQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MoveMatcher in a type-safe way.
 * 
 * @see MoveMatcher
 * @see MoveMatch
 * 
 */
@SuppressWarnings("all")
public final class MoveQuerySpecification extends BaseGeneratedEMFQuerySpecification<MoveMatcher> {
  private MoveQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoveQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoveMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MoveMatcher.on(engine);
  }
  
  @Override
  public MoveMatch newEmptyMatch() {
    return MoveMatch.newEmptyMatch();
  }
  
  @Override
  public MoveMatch newMatch(final Object... parameters) {
    return MoveMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0], (hu.bme.mit.inf.cps.HostInstance) parameters[1], (hu.bme.mit.inf.cps.HostInstance) parameters[2], (hu.bme.mit.inf.cps.ResourceRequirement) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static MoveQuerySpecification INSTANCE = make();
    
    public static MoveQuerySpecification make() {
      return new MoveQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MoveQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.move";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("appInstance","from","to","req");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("appInstance", "hu.bme.mit.inf.cps.ApplicationInstance"),new PParameter("from", "hu.bme.mit.inf.cps.HostInstance"),new PParameter("to", "hu.bme.mit.inf.cps.HostInstance"),new PParameter("req", "hu.bme.mit.inf.cps.ResourceRequirement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_appInstance = body.getOrCreateVariableByName("appInstance");
      	PVariable var_from = body.getOrCreateVariableByName("from");
      	PVariable var_to = body.getOrCreateVariableByName("to");
      	PVariable var_req = body.getOrCreateVariableByName("req");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_hostType = body.getOrCreateVariableByName("hostType");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_appInstance, "appInstance"),
      				
      		new ExportedParameter(body, var_from, "from"),
      				
      		new ExportedParameter(body, var_to, "to"),
      				
      		new ExportedParameter(body, var_req, "req")
      	));
      	new TypeUnary(body, var_appInstance, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeUnary(body, var_from, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeUnary(body, var_to, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "ResourceRequirement"), "http://cps/1.0/ResourceRequirement");
      	new PositivePatternCall(body, new FlatTuple(var_appInstance, var_from), AllocatedToQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeUnary(body, var_appInstance, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeBinary(body, CONTEXT, var_appInstance, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "type"), "http://cps/1.0/ApplicationInstance.type");
      	new TypeBinary(body, CONTEXT, var__virtual_0_, var__virtual_1_, getFeatureLiteral("http://cps/1.0", "ApplicationType", "requirements"), "http://cps/1.0/ApplicationType.requirements");
      	new Equality(body, var__virtual_1_, var_req);
      	new TypeUnary(body, var_req, getClassifierLiteral("http://cps/1.0", "ResourceRequirement"), "http://cps/1.0/ResourceRequirement");
      	new TypeBinary(body, CONTEXT, var_req, var__virtual_2_, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "hostType"), "http://cps/1.0/ResourceRequirement.hostType");
      	new Equality(body, var__virtual_2_, var_hostType);
      	new TypeUnary(body, var_to, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeBinary(body, CONTEXT, var_to, var__virtual_3_, getFeatureLiteral("http://cps/1.0", "HostInstance", "type"), "http://cps/1.0/HostInstance.type");
      	new Equality(body, var__virtual_3_, var_hostType);
      	new Inequality(body, var_from, var_to);
      	new ConstantValue(body, var__virtual_4_, getEnumLiteral("http://cps/1.0", "State", "Stopped").getInstance());
      	new TypeUnary(body, var_appInstance, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeBinary(body, CONTEXT, var_appInstance, var__virtual_5_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "state"), "http://cps/1.0/ApplicationInstance.state");
      	new Equality(body, var__virtual_5_, var__virtual_4_);
      	new PositivePatternCall(body, new FlatTuple(var_appInstance, var_to, var_req), CanAllocateToQuerySpecification.instance().getInternalQueryRepresentation());
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
