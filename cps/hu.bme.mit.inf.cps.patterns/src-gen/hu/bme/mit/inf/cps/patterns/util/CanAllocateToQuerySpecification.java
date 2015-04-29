package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.CanAllocateToMatch;
import hu.bme.mit.inf.cps.patterns.CanAllocateToMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
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
 * A pattern-specific query specification that can instantiate CanAllocateToMatcher in a type-safe way.
 * 
 * @see CanAllocateToMatcher
 * @see CanAllocateToMatch
 * 
 */
@SuppressWarnings("all")
public final class CanAllocateToQuerySpecification extends BaseGeneratedEMFQuerySpecification<CanAllocateToMatcher> {
  private CanAllocateToQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CanAllocateToQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CanAllocateToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CanAllocateToMatcher.on(engine);
  }
  
  @Override
  public CanAllocateToMatch newEmptyMatch() {
    return CanAllocateToMatch.newEmptyMatch();
  }
  
  @Override
  public CanAllocateToMatch newMatch(final Object... parameters) {
    return CanAllocateToMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0], (hu.bme.mit.inf.cps.HostInstance) parameters[1], (hu.bme.mit.inf.cps.ResourceRequirement) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static CanAllocateToQuerySpecification INSTANCE = make();
    
    public static CanAllocateToQuerySpecification make() {
      return new CanAllocateToQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CanAllocateToQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.canAllocateTo";
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
      	PVariable var_hostType = body.getOrCreateVariableByName("hostType");
      	PVariable var_currMemorySize = body.getOrCreateVariableByName("currMemorySize");
      	PVariable var_reqMemorySize = body.getOrCreateVariableByName("reqMemorySize");
      	PVariable var_currHdd = body.getOrCreateVariableByName("currHdd");
      	PVariable var_reqHdd = body.getOrCreateVariableByName("reqHdd");
      	PVariable var_currCpu = body.getOrCreateVariableByName("currCpu");
      	PVariable var_reqCpu = body.getOrCreateVariableByName("reqCpu");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_appInstance, "appInstance"),
      				
      		new ExportedParameter(body, var_hostInstance, "hostInstance"),
      				
      		new ExportedParameter(body, var_req, "req")
      	));
      	new TypeBinary(body, CONTEXT, var_appInstance, var__virtual_0_, getFeatureLiteral("http://cps/1.0", "ApplicationInstance", "type"), "http://cps/1.0/ApplicationInstance.type");
      	new TypeBinary(body, CONTEXT, var__virtual_0_, var_req, getFeatureLiteral("http://cps/1.0", "ApplicationType", "requirements"), "http://cps/1.0/ApplicationType.requirements");
      	new TypeBinary(body, CONTEXT, var_req, var_hostType, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "hostType"), "http://cps/1.0/ResourceRequirement.hostType");
      	new TypeBinary(body, CONTEXT, var_hostInstance, var_hostType, getFeatureLiteral("http://cps/1.0", "HostInstance", "type"), "http://cps/1.0/HostInstance.type");
      	new TypeBinary(body, CONTEXT, var_hostInstance, var_currMemorySize, getFeatureLiteral("http://cps/1.0", "HostInstance", "availableMemory"), "http://cps/1.0/HostInstance.availableMemory");
      	new TypeBinary(body, CONTEXT, var_req, var_reqMemorySize, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "requiredMemory"), "http://cps/1.0/ResourceRequirement.requiredMemory");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern canAllocateTo";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("currMemorySize", "reqMemorySize");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer currMemorySize = (java.lang.Integer) provider.getValue("currMemorySize");
      			java.lang.Integer reqMemorySize = (java.lang.Integer) provider.getValue("reqMemorySize");
      			return evaluateExpression_1_1(currMemorySize, reqMemorySize);
      		}
      
      },  null); 
      	new TypeBinary(body, CONTEXT, var_hostInstance, var_currHdd, getFeatureLiteral("http://cps/1.0", "HostInstance", "availableHdd"), "http://cps/1.0/HostInstance.availableHdd");
      	new TypeBinary(body, CONTEXT, var_req, var_reqHdd, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "requiredHdd"), "http://cps/1.0/ResourceRequirement.requiredHdd");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern canAllocateTo";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("currHdd", "reqHdd");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer currHdd = (java.lang.Integer) provider.getValue("currHdd");
      			java.lang.Integer reqHdd = (java.lang.Integer) provider.getValue("reqHdd");
      			return evaluateExpression_1_2(currHdd, reqHdd);
      		}
      
      },  null); 
      	new TypeBinary(body, CONTEXT, var_hostInstance, var_currCpu, getFeatureLiteral("http://cps/1.0", "HostInstance", "availableCpu"), "http://cps/1.0/HostInstance.availableCpu");
      	new TypeBinary(body, CONTEXT, var_req, var_reqCpu, getFeatureLiteral("http://cps/1.0", "ResourceRequirement", "requiredCpu"), "http://cps/1.0/ResourceRequirement.requiredCpu");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern canAllocateTo";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("currCpu", "reqCpu");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer currCpu = (java.lang.Integer) provider.getValue("currCpu");
      			java.lang.Integer reqCpu = (java.lang.Integer) provider.getValue("reqCpu");
      			return evaluateExpression_1_3(currCpu, reqCpu);
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
  
  private static boolean evaluateExpression_1_1(final Integer currMemorySize, final Integer reqMemorySize) {
    boolean _greaterEqualsThan = (currMemorySize.compareTo(reqMemorySize) >= 0);
    return _greaterEqualsThan;
  }
  
  private static boolean evaluateExpression_1_2(final Integer currHdd, final Integer reqHdd) {
    boolean _greaterEqualsThan = (currHdd.compareTo(reqHdd) >= 0);
    return _greaterEqualsThan;
  }
  
  private static boolean evaluateExpression_1_3(final Integer currCpu, final Integer reqCpu) {
    boolean _greaterEqualsThan = (currCpu.compareTo(reqCpu) >= 0);
    return _greaterEqualsThan;
  }
}
