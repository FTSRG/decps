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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate MaxCpuUsageMatcher in a type-safe way.
 * 
 * @see MaxCpuUsageMatcher
 * @see MaxCpuUsageMatch
 * 
 */
@SuppressWarnings("all")
final class MaxCpuUsageQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private MaxCpuUsageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MaxCpuUsageQuerySpecification instance() throws IncQueryException {
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
    private final static MaxCpuUsageQuerySpecification INSTANCE = make();
    
    public static MaxCpuUsageQuerySpecification make() {
      return new MaxCpuUsageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MaxCpuUsageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.maxCpuUsage";
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
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_cpu = body.getOrCreateVariableByName("cpu");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_host, "host"),
      				
      		new ExportedParameter(body, var_app, "app")
      	));
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeBinary(body, CONTEXT, var_host, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "Identifiable", "id"), "http://cps/1.0/Identifiable.id");
      	new Equality(body, var__virtual_0_, var_id);
      	new TypeUnary(body, var_host, getClassifierLiteral("http://cps/1.0", "HostInstance"), "http://cps/1.0/HostInstance");
      	new TypeBinary(body, CONTEXT, var_host, var__virtual_1_, getFeatureLiteral("http://cps/1.0", "HostInstance", "availableCpu"), "http://cps/1.0/HostInstance.availableCpu");
      	new Equality(body, var__virtual_1_, var_cpu);
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new TypeBinary(body, CONTEXT, var_app, var__virtual_2_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "allocatedTo"), "http://cps/1.0/ApplicationInstance.allocatedTo");
      	new Equality(body, var__virtual_2_, var_host);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern maxCpuUsage";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("cpu");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer cpu = (java.lang.Integer) provider.getValue("cpu");
      			return evaluateExpression_1_1(cpu);
      		}
      
      },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer cpu) {
    return ((cpu).intValue() < 1);
  }
}
