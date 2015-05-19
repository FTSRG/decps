package hu.bme.mit.inf.cps.trigger;

import hu.bme.mit.inf.cps.cep.vepl.CepFactory;
import hu.bme.mit.inf.cps.cep.vepl.events.queryresult.MaxAnyUsageAppeared_Event;
import hu.bme.mit.inf.cps.patterns.AllApplicationInstanceIsRunningMatcher;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatch;
import hu.bme.mit.inf.cps.patterns.MaxAnyUsageMatcher;
import hu.bme.mit.inf.cps.patterns.NotExistUnsatisfiedRequirementMatcher;
import hu.bme.mit.inf.cps.patterns.util.AllApplicationInstanceIsRunningQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.MaxAnyUsageQuerySpecification;
import hu.bme.mit.inf.cps.patterns.util.NotExistUnsatisfiedRequirementQuerySpecification;
import hu.bme.mit.inf.cps.xml.Component;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.cep.core.api.engine.CEPEngine;
import org.eclipse.viatra.cep.core.streams.EventStream;

public class TriggerModule implements ITriggerModule {

	public static final int sleepTime = 5000;
	private static boolean run = true;
	private static Thread thread;
	public static boolean enableInit = true;
	private Logger logger;

	public TriggerModule() {
		logger = Logger.getLogger(TriggerModule.class);
		logger.setLevel(Level.INFO);
	}

	@Override
	public void start() {

		logger.info("START command has arrived");
		
		run = true;
		Runnable task = new Runnable() {
			CEPEngine newEngine;
			EventStream eventStream;
			{
				newEngine = CEPEngine.newEngine();
				newEngine.addRule(CepFactory.getInstance().createStartDse());
				eventStream = newEngine.getStreamManager().newEventStream();
			}

			@Override
			public void run() {

				while (run) {

					Component component = Component.instance();
					if (enableInit)
						component.initializeProblem();

					try {
						{// Complex Event Process
							MaxAnyUsageMatcher matcher = MaxAnyUsageQuerySpecification.instance().getMatcher(component.getCyberPhysicalSystem());
							for (MaxAnyUsageMatch match : matcher.getAllMatches()) {
								MaxAnyUsageAppeared_Event event = CepFactory.getInstance().createMaxAnyUsageAppeared_Event(null);
								// event.setApp(match.getApp());
								// event.setHost(match.getHost());
								event.setId(match.getId());
								event.setIncQueryPattern(match);
								logger.info("Overload occurred");
								eventStream.push(event);
							}
						}
						{// Check Goal pattern
							AllApplicationInstanceIsRunningMatcher allAppsRunning = 
									AllApplicationInstanceIsRunningQuerySpecification.instance().getMatcher(component.getCyberPhysicalSystem());
							NotExistUnsatisfiedRequirementMatcher noUnsatisfied = 
									NotExistUnsatisfiedRequirementQuerySpecification.instance().getMatcher(component.getCyberPhysicalSystem());
							executeComponent(component, allAppsRunning, noUnsatisfied);
						}

					} catch (IncQueryException e1) {
						e1.printStackTrace();
					}

					try {
						Thread.sleep(sleepTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			private void executeComponent(Component component,
					IncQueryMatcher<?> matcher1, IncQueryMatcher<?> matcher2) {
				if (matcher1.getAllMatches().size() == 0
						|| matcher2.getAllMatches().size() == 0) {
					
					logger.info("Re-allocation is required as a goal pattern is not satisfied");
					boolean success = component.calculateTrajectory();
					if (!success) {
						logger.info("\tBut there is no trajectory to satisfy goals");
					} else {
						while (component.hasNextOperation()) {
							try {
								component.nextOperation();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		};

		thread = new Thread(task);
		thread.start();

		logger.info("Trigger module started");		
	}

	@Override
	public void stop() {
		logger.info("STOP command has arrived");
		run = false;
		while (thread.isAlive()) {
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void restart() {
		logger.info("RESTART command has arrived");
		stop();
		start();
	}
}
