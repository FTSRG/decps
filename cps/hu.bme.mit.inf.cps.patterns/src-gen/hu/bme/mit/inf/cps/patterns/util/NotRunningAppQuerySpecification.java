package hu.bme.mit.inf.cps.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.cps.patterns.NotRunningAppMatch;
import hu.bme.mit.inf.cps.patterns.NotRunningAppMatcher;
import hu.bme.mit.inf.cps.patterns.util.RunningAppQuerySpecification;
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
 * A pattern-specific query specification that can instantiate NotRunningAppMatcher in a type-safe way.
 * 
 * @see NotRunningAppMatcher
 * @see NotRunningAppMatch
 * 
 */
@SuppressWarnings("all")
public final class NotRunningAppQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotRunningAppMatcher> {
  private NotRunningAppQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotRunningAppQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotRunningAppMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotRunningAppMatcher.on(engine);
  }
  
  @Override
  public NotRunningAppMatch newEmptyMatch() {
    return NotRunningAppMatch.newEmptyMatch();
  }
  
  @Override
  public NotRunningAppMatch newMatch(final Object... parameters) {
    return NotRunningAppMatch.newMatch((hu.bme.mit.inf.cps.ApplicationInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NotRunningAppQuerySpecification INSTANCE = make();
    
    public static NotRunningAppQuerySpecification make() {
      return new NotRunningAppQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotRunningAppQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.cps.patterns.notRunningApp";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("appInst");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("appInst", "hu.bme.mit.inf.cps.ApplicationInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_appInst = body.getOrCreateVariableByName("appInst");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_appInst, "appInst")
      	));
      	new TypeUnary(body, var_appInst, getClassifierLiteral("http://cps/1.0", "ApplicationInstance"), "http://cps/1.0/ApplicationInstance");
      	new NegativePatternCall(body, new FlatTuple(var_appInst), RunningAppQuerySpecification.instance().getInternalQueryRepresentation());
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
