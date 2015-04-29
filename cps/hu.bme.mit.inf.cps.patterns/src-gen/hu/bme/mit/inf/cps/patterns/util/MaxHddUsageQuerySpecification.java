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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate MaxHddUsageMatcher in a type-safe way.
 * 
 * @see MaxHddUsageMatcher
 * @see MaxHddUsageMatch
 * 
 */
@SuppressWarnings("all")
final class MaxHddUsageQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private MaxHddUsageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MaxHddUsageQuerySpecification instance() throws IncQueryException {
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
    private final static MaxHddUsageQuerySpecification INSTANCE = make();
    
    public static MaxHddUsageQuerySpecification make() {
      return new MaxHddUsageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MaxHddUsageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.maxHddUsage";
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
      	PVariable var_hdd = body.getOrCreateVariableByName("hdd");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_host, "host"),
      				
      		new ExportedParameter(body, var_app, "app")
      	));
      	new TypeBinary(body, CONTEXT, var_host, var_id, getFeatureLiteral("http://cps/1.0", "Identifiable", "id"), "http://cps/1.0/Identifiable.id");
      	new TypeBinary(body, CONTEXT, var_host, var_hdd, getFeatureLiteral("http://cps/1.0", "HostInstance", "availableCpu"), "http://cps/1.0/HostInstance.availableCpu");
      	new TypeBinary(body, CONTEXT, var_app, var_host, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "allocatedTo"), "http://cps/1.0/ApplicationInstance.allocatedTo");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern maxHddUsage";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("hdd");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer hdd = (java.lang.Integer) provider.getValue("hdd");
      			return evaluateExpression_1_1(hdd);
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
  
  private static boolean evaluateExpression_1_1(final Integer hdd) {
    return ((hdd).intValue() < 1);
  }
}
