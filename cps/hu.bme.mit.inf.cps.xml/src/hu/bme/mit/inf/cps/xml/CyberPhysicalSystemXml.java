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
import hu.bme.mit.inf.cps.rules.MoveAllocationRule;
import hu.bme.mit.inf.cps.rules.StartAppRule;
import hu.bme.mit.inf.cps.rules.StopAppRule;
import hu.bme.mit.inf.cps.statecoder.RequestSatisfierCPSSerializerFactory;

import java.io.StringWriter;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.TransformationRule;
import org.eclipse.viatra.dse.api.strategy.impl.FixedPriorityStrategy;
import org.eclipse.viatra.dse.guidance.Guidance;
import org.eclipse.viatra.dse.objectives.impl.AllMustHaveMatchHardObjective;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Test;
import org.w3c.dom.Document;

public class CyberPhysicalSystemXml {
	
	private CyberPhysicalSystem problem;

	@Test
	public void execute() throws IncQueryException, ParserConfigurationException, TransformerException {
		SolutionTrajectory trajectory = getTrajectory();
		
		trajectory.setModel(problem);
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		
		for (int i = 0; i < trajectory.getTransformationRules().size(); i++) {
			
			Pair<TransformationRule<IPatternMatch>,IPatternMatch> currentTransformation = SolutionTrajectoryUtil.getCurrentTransformation(trajectory);
			if(currentTransformation.getKey().getMatchProcessor() instanceof ICyberPhysicalSystemRule) {
				ICyberPhysicalSystemRule rule = (ICyberPhysicalSystemRule) currentTransformation.getKey().getMatchProcessor();
				Document[] xmlOperations = rule.getXmlOperation(currentTransformation.getValue());
				for(Document xmlOperation : xmlOperations) {
					System.out.println("=============== Operation ===============");	
					StringWriter xml = new StringWriter();
					transformer.transform(new DOMSource(xmlOperation), new StreamResult(xml));				
					System.out.println(xml);
				}
			}
			
			trajectory.doNextTransformation();
		}
		
	}
	
	private SolutionTrajectory getTrajectory() throws IncQueryException {
		ProblemFactory problemFactory = new ProblemFactory();
		problem = problemFactory.initialize();
		
		DesignSpaceExplorer dse = new DesignSpaceExplorer();
		
		dse.addMetaModelPackage(CpsPackage.eINSTANCE);
		dse.setStartingModel(problem, true);
		dse.setSerializerFactory(new RequestSatisfierCPSSerializerFactory());
		
		TransformationRule<AllocateMatch> allocateRule = new TransformationRule<AllocateMatch>(AllocateMatcher.querySpecification(), new AllocateRule());
		TransformationRule<DeleteAllocationMatch> deleteAllocRule = new TransformationRule<DeleteAllocationMatch>(DeleteAllocationMatcher.querySpecification(), new DeleteAllocationRule());
		TransformationRule<MoveMatch> moveRule = new TransformationRule<MoveMatch>(MoveMatcher.querySpecification(), new MoveAllocationRule());
		
		TransformationRule<StartInstanceMatch> startRule = new TransformationRule<StartInstanceMatch>(StartInstanceMatcher.querySpecification(), new StartAppRule());
		TransformationRule<StopInstanceMatch> stopRule = new TransformationRule<StopInstanceMatch>(StopInstanceMatcher.querySpecification(), new StopAppRule());
		
		TransformationRule<CreateApplicationInstanceMatch> createAppRule = new TransformationRule<CreateApplicationInstanceMatch>(CreateApplicationInstanceMatcher.querySpecification(), new CreateApplicationInstanceRule());
//		TransformationRule<CreateHostInstanceMatch> createHostRule = new TransformationRule<>(CreateHostInstanceMatcher.querySpecification(), new CreateHostInstanceRule());

		dse.addTransformationRule(allocateRule);
		dse.addTransformationRule(deleteAllocRule);
		dse.addTransformationRule(moveRule);
		dse.addTransformationRule(startRule);
		dse.addTransformationRule(stopRule);
		dse.addTransformationRule(createAppRule);
//		dse.addTransformationRule(createHostRule);
		
		dse.addObjective(new AllMustHaveMatchHardObjective().addConstraint(NotExistUnsatisfiedRequirementMatcher.querySpecification()));
		dse.addObjective(new AllMustHaveMatchHardObjective().addConstraint(AllApplicationInstanceIsRunningMatcher.querySpecification()));
		
		dse.setMaxNumberOfThreads(1);
		
		FixedPriorityStrategy strategy = new FixedPriorityStrategy();
		strategy.setDepthLimit(0);
		
		Guidance guidance = new Guidance();
		guidance.addPriorityRuleInfo(allocateRule, 15);
		guidance.addPriorityRuleInfo(deleteAllocRule, 0);
		guidance.addPriorityRuleInfo(moveRule, 0);
		guidance.addPriorityRuleInfo(startRule, 20);
		guidance.addPriorityRuleInfo(stopRule, 0);
		guidance.addPriorityRuleInfo(createAppRule, 10);
//		guidance.addPriorityRuleInfo(createHostRule, 5);
		dse.setGuidance(guidance);

		long start = System.nanoTime();
		dse.startExploration(strategy);
		long end = System.nanoTime();
		
		System.out.println(end - start);
		
		Collection<Solution> allSolutions = dse.getAllSolutions();
		if(!allSolutions.isEmpty()) {			
			Solution solution = allSolutions.iterator().next();
			return solution.getShortestTrajectory();
		}
		
		return null;
	}
	
}
