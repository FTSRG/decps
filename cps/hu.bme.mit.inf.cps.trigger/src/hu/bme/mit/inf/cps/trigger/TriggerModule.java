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

import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.cep.core.api.engine.CEPEngine;
import org.eclipse.viatra.cep.core.streams.EventStream;

public class TriggerModule implements ITriggerModule {

	public static final int sleepTime = 1000;
	private static boolean run = true;
	private static Thread thread;
	public static boolean enableInit = true;

	public TriggerModule() {
		start();
	}

	@Override
	public void start() {

		System.out.println("Ready to start");

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
							MaxAnyUsageMatcher matcher = MaxAnyUsageQuerySpecification
									.instance().getMatcher(
											component.getCyberPhysicalSystem());
							for (MaxAnyUsageMatch match : matcher
									.getAllMatches()) {
								MaxAnyUsageAppeared_Event event = CepFactory
										.getInstance()
										.createMaxAnyUsageAppeared_Event(
												null);
								// event.setApp(match.getApp());
								// event.setHost(match.getHost());
								event.setId(match.getId());
								event.setIncQueryPattern(match);

								eventStream.push(event);
							}
						}
						{// Check Goal pattern
							AllApplicationInstanceIsRunningMatcher matcher1 = AllApplicationInstanceIsRunningQuerySpecification
									.instance().getMatcher(
											component.getCyberPhysicalSystem());
							NotExistUnsatisfiedRequirementMatcher matcher2 = NotExistUnsatisfiedRequirementQuerySpecification
									.instance().getMatcher(
											component.getCyberPhysicalSystem());
							executeComponent(component, matcher1, matcher2);
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
					System.out.println("Execute");

					boolean success = component.calculateTrajectory();
					System.out.println(success);

					if (!success) {
						System.out.println("No trajectory exists");
					} else {
						while (component.hasNextOperation()) {
							try {
								System.out.println(component.nextOperation());
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

		System.out.println("started");

		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() {
		run = false;
		while (thread.isAlive()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void restart() {
		stop();
		start();
	}
}
