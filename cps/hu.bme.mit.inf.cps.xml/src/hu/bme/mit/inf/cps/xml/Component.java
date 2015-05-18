package hu.bme.mit.inf.cps.xml;

import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatcher;
import hu.bme.mit.inf.cps.patterns.AllocateMatch;
import hu.bme.mit.inf.cps.patterns.AllocateMatcher;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatch;
import hu.bme.mit.inf.cps.patterns.CreateApplicationInstanceMatcher;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatch;
import hu.bme.mit.inf.cps.patterns.DeleteAllocationMatcher;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatcher;
import hu.bme.mit.inf.cps.patterns.MoveMatch;
import hu.bme.mit.inf.cps.patterns.MoveMatcher;
import hu.bme.mit.inf.cps.patterns.NotExistUnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.StartInstanceMatch;
import hu.bme.mit.inf.cps.patterns.StartInstanceMatcher;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatch;
import hu.bme.mit.inf.cps.patterns.StopInstanceMatcher;
import hu.bme.mit.inf.cps.problem.ProblemFactory;
import hu.bme.mit.inf.cps.rules.AllocateRule;
import hu.bme.mit.inf.cps.rules.CreateApplicationInstanceRule;
import hu.bme.mit.inf.cps.rules.DeleteAllocationRule;
import hu.bme.mit.inf.cps.rules.ICyberPhysicalSystemRule;
import hu.bme.mit.inf.cps.rules.MaxAnyUsageRule;
import hu.bme.mit.inf.cps.rules.MoveAllocationRule;
import hu.bme.mit.inf.cps.rules.StartAppRule;
import hu.bme.mit.inf.cps.rules.StopAppRule;
import hu.bme.mit.inf.cps.statecoder.RequestSatisfierCPSSerializerFactory;
import hu.bme.mit.inf.cps.xml.provided.ICyberPhysicalExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.concurrent.TimeoutException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.TransformationRule;
import org.eclipse.viatra.dse.api.strategy.impl.FixedPriorityStrategy;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.guidance.Guidance;
import org.eclipse.viatra.dse.objectives.impl.AllMustHaveMatchHardObjective;
import org.w3c.dom.Document;

public class Component implements ICyberPhysicalExecutor {

	static private CyberPhysicalSystem problem;
	static private SolutionTrajectory trajectory;
	private final String USER_AGENT = "Mozilla/5.0";
	static private final String DISPATCHER_URL = "http://localhost:8080/Dispatcher/Dispatcher";
	static private Component instance;
	static public boolean enableHttp = true;
	
	public static Component instance() {
		if(instance == null) {
			instance = new Component();
			instance.initializeProblem();
		}
		
			
		return instance;
	}
	
	@Override
	public boolean calculateTrajectory() {
		
		System.out.println("calculateTrajectory");
		
		try {
			trajectory = getTrajectory();
			
			if(trajectory != null) {
				trajectory.setModel(getProblem());
				return true;
			}
		} catch (IncQueryException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	private SolutionTrajectory getTrajectory() throws IncQueryException {
		
		Logger.getLogger(DesignSpaceManager.class).setLevel(Level.DEBUG);
		Logger.getLogger(FixedPriorityStrategy.class).setLevel(Level.DEBUG);
		Logger.getLogger(DesignSpaceExplorer.class).setLevel(Level.DEBUG);
		
		DesignSpaceExplorer dse = new DesignSpaceExplorer();
		
		dse.addMetaModelPackage(CpsPackage.eINSTANCE);
		dse.setInitialModel(getProblem(), true);
		dse.setSerializerFactory(new RequestSatisfierCPSSerializerFactory());
		
		TransformationRule<AllocateMatch> allocateRule = new TransformationRule<AllocateMatch>(AllocateMatcher.querySpecification(), new AllocateRule());
		TransformationRule<DeleteAllocationMatch> deleteAllocRule = new TransformationRule<DeleteAllocationMatch>(DeleteAllocationMatcher.querySpecification(), new DeleteAllocationRule());
		TransformationRule<MoveMatch> moveRule = new TransformationRule<MoveMatch>(MoveMatcher.querySpecification(), new MoveAllocationRule());
		TransformationRule<MaxAnyUsageMatch> maxRule = new TransformationRule<MaxAnyUsageMatch>(MaxAnyUsageMatcher.querySpecification(), new MaxAnyUsageRule());
		
		TransformationRule<StartInstanceMatch> startRule = new TransformationRule<StartInstanceMatch>(StartInstanceMatcher.querySpecification(), new StartAppRule());
		TransformationRule<StopInstanceMatch> stopRule = new TransformationRule<StopInstanceMatch>(StopInstanceMatcher.querySpecification(), new StopAppRule());
		
		TransformationRule<CreateApplicationInstanceMatch> createAppRule = new TransformationRule<CreateApplicationInstanceMatch>(CreateApplicationInstanceMatcher.querySpecification(), new CreateApplicationInstanceRule());
//		TransformationRule<CreateHostInstanceMatch> createHostRule = new TransformationRule<>(CreateHostInstanceMatcher.querySpecification(), new CreateHostInstanceRule());

		dse.addTransformationRule(allocateRule);
		dse.addTransformationRule(deleteAllocRule);
		dse.addTransformationRule(moveRule);
		dse.addTransformationRule(maxRule);
		dse.addTransformationRule(startRule);
		dse.addTransformationRule(stopRule);
		dse.addTransformationRule(createAppRule);
//		dse.addTransformationRule(createHostRule);
		
		dse.addObjective(new AllMustHaveMatchHardObjective().addConstraint(NotExistUnsatisfiedRequirementMatcher.querySpecification()));
		dse.addObjective(new AllMustHaveMatchHardObjective().addConstraint(AllApplicationInstanceIsRunningMatcher.querySpecification()));
		
		dse.setMaxNumberOfThreads(1);
		
		FixedPriorityStrategy strategy = new FixedPriorityStrategy();
		strategy.setDepthLimit(100);
		
		strategy.withRulePriority(allocateRule, 15);
		strategy.withRulePriority(deleteAllocRule, 0);
		strategy.withRulePriority(moveRule, 0);
		strategy.withRulePriority(startRule, 20);
		strategy.withRulePriority(stopRule, 0);
		strategy.withRulePriority(maxRule, 25);
		strategy.withRulePriority(createAppRule, 10);
		
		dse.startExploration(strategy);
		
		Collection<Solution> allSolutions = dse.getSolutions();
		if(!allSolutions.isEmpty()) {			
			Solution solution = allSolutions.iterator().next();
			return solution.getShortestTrajectory();
		}
		
		return null;
	}

	public void initializeProblem() {
		System.out.println("reinit");
		ProblemFactory problemFactory = new ProblemFactory();
		setProblem(problemFactory.initialize());
	}
	
	
	@Override
	public String nextOperation() throws Exception {
		
		try {
			
			System.out.println("next operation called");
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
			while (trajectory.getCurrentIndex() < trajectory.getTrajectoryLength()) {
				
				System.out.println("next op");
				
				IPatternMatch match = trajectory.doNextTransformation();
				
				TransformationRule<?> currentTransformation = trajectory.getTransformationRules().get(trajectory.getCurrentIndex()-1);
				if(currentTransformation.getMatchProcessor() instanceof ICyberPhysicalSystemRule) {
					
					System.out.println("rule");
					ICyberPhysicalSystemRule rule = (ICyberPhysicalSystemRule) currentTransformation.getMatchProcessor();
					Document[] xmlOperations = rule.getXmlOperation(match);
					
					String ret = "";
					for(Document xmlOperation : xmlOperations) {
						StringWriter xml = new StringWriter();
						transformer.transform(new DOMSource(xmlOperation), new StreamResult(xml));
						
						if(enableHttp) {
							System.out.println("sending to dispatcher");
							sendPost(xml.toString());
							System.out.println(xml.toString());
							System.out.println("executing on rdf");
							rule.executeRdf(match);
							System.out.println("execution done");
						}
						ret += xml.toString();
					}
					return ret;
				}				
			}
			
		} catch (IncQueryException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			return e.getMessage();
		} catch (BadResponseException e) {
			throw e;
		}
		
		return null;
	}

	@Override
	public boolean hasNextOperation() {
		return trajectory.getCurrentIndex() < trajectory.getTrajectoryLength();
	}
	
	private void sendPost(String msg) throws IOException, BadResponseException {
		try{
		URL obj = new URL(DISPATCHER_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setDoInput(true);
		con.setDoOutput(true);
		
		con.setReadTimeout(300000);
		con.setConnectTimeout(300000);
		
		//add request header
//		con.setRequestMethod("POST");
//		con.setRequestProperty("User-Agent", USER_AGENT);
//		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
		con.addRequestProperty("Content-Type", "application/xml");
//		con.setRequestProperty("Content-Length", Integer.toString(msg.length()));
 
		// Send post request
		con.getOutputStream().write(msg.getBytes("UTF8"));
		String response = "";
		
		System.out.println("waiting for dispatcher response");
		response = readFromConnection(con);
		System.out.println("dispatcher response");	
			
		
		
		if(!response.trim().equals("<h1>OK!! :)</h1>")) {
			System.out.println(msg);
			System.out.println(response);
			throw new BadResponseException();
		}
		} catch (java.net.SocketTimeoutException e) {
			System.out.println("Timeout :(");
			System.out.println(msg);
			throw new BadResponseException();
		}
	}
	
	public String readFromConnection(HttpURLConnection http) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
		String inbuffer = "";
		String inputLine;
		while ((inputLine = in.readLine()) != null)
		inbuffer += (inputLine + "\n");
//		in.close();
		return inbuffer;
	}
		
	public CyberPhysicalSystem getCyberPhysicalSystem() {
		return getProblem();
	}

	public static CyberPhysicalSystem getProblem() {
		return problem;
	}

	public static void setProblem(CyberPhysicalSystem problem) {
		Component.problem = problem;
	}
		
}
