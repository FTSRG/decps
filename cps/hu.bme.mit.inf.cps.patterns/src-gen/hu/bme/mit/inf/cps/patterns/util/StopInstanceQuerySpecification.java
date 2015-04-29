package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate StopInstanceMatcher in a type-safe way.
 * 
 * @see StopInstanceMatcher
 * @see StopInstanceMatch
 * 
 */
@SuppressWarnings("all")
public final class StopInstanceQuerySpecification extends BaseGeneratedEMFQuerySpecification<StopInstanceMatcher> {
  private StopInstanceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StopInstanceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected StopInstanceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return StopInstanceMatcher.on(engine);
  }
  
  @Override
  public StopInstanceMatch newEmptyMatch() {
    return StopInstanceMatch.newEmptyMatch();
  }
  
  @Override
  public StopInstanceMatch newMatch(final Object... parameters) {
    return StopInstanceMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static StopInstanceQuerySpecification INSTANCE = make();
    
    public static StopInstanceQuerySpecification make() {
      return new StopInstanceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static StopInstanceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.stopInstance";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("appInstance");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("appInstance", "hu.bme.mit.inf.cps.ApplicationInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_appInstance = body.getOrCreateVariableByName("appInstance");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_appInstance, "appInstance")
      	));
      	new TypeUnary(body, var_appInstance, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://cps/1.0", "State", "Running").getInstance());
      	new TypeUnary(body, var_appInstance, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeBinary(body, CONTEXT, var_appInstance, var__virtual_1_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "state"), "http://cps/1.0/ApplicationInstance.state");
      	new Equality(body, var__virtual_1_, var__virtual_0_);
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
