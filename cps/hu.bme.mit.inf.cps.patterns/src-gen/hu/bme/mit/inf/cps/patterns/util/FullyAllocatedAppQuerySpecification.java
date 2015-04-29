package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.FullyAllocatedAppMatch;
import hu.bme.mit.inf.cps.patterns.FullyAllocatedAppMatcher;
import hu.bme.mit.inf.cps.patterns.util.UnallocatedAppQuerySpecification;
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
 * A pattern-specific query specification that can instantiate FullyAllocatedAppMatcher in a type-safe way.
 * 
 * @see FullyAllocatedAppMatcher
 * @see FullyAllocatedAppMatch
 * 
 */
@SuppressWarnings("all")
public final class FullyAllocatedAppQuerySpecification extends BaseGeneratedEMFQuerySpecification<FullyAllocatedAppMatcher> {
  private FullyAllocatedAppQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FullyAllocatedAppQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FullyAllocatedAppMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FullyAllocatedAppMatcher.on(engine);
  }
  
  @Override
  public FullyAllocatedAppMatch newEmptyMatch() {
    return FullyAllocatedAppMatch.newEmptyMatch();
  }
  
  @Override
  public FullyAllocatedAppMatch newMatch(final Object... parameters) {
    return FullyAllocatedAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static FullyAllocatedAppQuerySpecification INSTANCE = make();
    
    public static FullyAllocatedAppQuerySpecification make() {
      return new FullyAllocatedAppQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FullyAllocatedAppQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.fullyAllocatedApp";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("app");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("app", "hu.bme.mit.inf.cps.ApplicationInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_app = body.getOrCreateVariableByName("app");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_app, "app")
      	));
      	new TypeUnary(body, var_app, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new NegativePatternCall(body, new FlatTuple(var_app, var___0_), UnallocatedAppQuerySpecification.instance().getInternalQueryRepresentation());
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
