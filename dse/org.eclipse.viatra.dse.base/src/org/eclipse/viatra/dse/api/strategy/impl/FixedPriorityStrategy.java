/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Miklos Foldenyi - initial API and implementation
 *   Andras Szabolcs Nagy - initial API and implementation
 *******************************************************************************/
package org.eclipse.viatra.dse.api.strategy.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra.dse.api.TransformationRule;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.designspace.api.ITransition;
import org.eclipse.viatra.dse.objectives.ObjectiveValuesMap;

import com.google.common.collect.Lists;

/**
 * This strategy component determines the next step of the traversal based on the priority of the rules. <br/>
 * It can be configured to
 * <ul>
 * <li>select the rule with the highest or the lowest priority,</li>
 * <li>traverse all of the transitions in a state or just the best ones.</li>
 * </ul>
 * 
 * @author Andras Szabolcs Nagy
 * 
 */
public class FixedPriorityStrategy implements IStrategy {

    private boolean tryBestTransitionsOnly = true;
    private Map<Object, Integer> bestPriorityInState = new HashMap<Object, Integer>();
    private int depthLimit = 0;
    private Random rnd = new Random();
    private DesignSpaceManager dsm;
    private boolean isInterrupted = false;

    protected Map<TransformationRule<? extends IPatternMatch>, Integer> priorities = new HashMap<TransformationRule<? extends IPatternMatch>, Integer>();

    /**
     * Creates a fixed priority strategy instance, with default configuration: it tries only the rule activations with
     * the highest priority from a state, without a depth limit.
     */
    public FixedPriorityStrategy() {
    }

    /**
     * If called the strategy will traverse all of the transitions in a state instead of just the best ones.
     * 
     * @return The actual instance to enable a builder pattern like usage.
     */
    public FixedPriorityStrategy withFullSearch() {
        this.tryBestTransitionsOnly = false;
        return this;
    }

    /**
     * Adds a depth limit to the strategy.
     * 
     * @param depthLimit
     *            The depth limit.
     * @return The actual instance to enable a builder pattern like usage.
     */
    public FixedPriorityStrategy withDepthLimit(int depthLimit) {
        this.depthLimit = depthLimit;
        return this;
    }

    /**
     * Assigns a priority to a rule. Unassigned rule will have a priority of 0.
     * 
     * @param rule
     *            The transformation rule.
     * @param priority
     *            The priority of the rule.
     * @return The actual instance to enable a builder pattern like usage.
     */
    public FixedPriorityStrategy withRulePriority(TransformationRule<? extends IPatternMatch> rule, int priority) {
        priorities.put(rule, priority);
        return this;
    }

    @Override
    public void init(ThreadContext context) {
        dsm = context.getDesignSpaceManager();
    }

    @Override
    public ITransition getNextTransition(final ThreadContext context, boolean lastWasSuccesful) {

        if (isInterrupted) {
            return null;
        }

        // Backtrack if there is no more unfired transition from here
        List<? extends ITransition> transitions = dsm.getUntraversedTransitionsFromCurrentState();
        while ((depthLimit > 0 && dsm.getTrajectoryFromRoot().size() >= depthLimit)
                || (transitions == null || transitions.isEmpty())) {
            if (!dsm.undoLastTransformation()) {
                return null;
            }
            transitions = dsm.getUntraversedTransitionsFromCurrentState();
        }

        do {

            if (tryBestTransitionsOnly) {
                Integer bestPriority = bestPriorityInState.get(dsm.getCurrentState().getId());
                if (bestPriority == null) {
                    bestPriority = getBestPriority(dsm.getTransitionsFromCurrentState());
                    bestPriorityInState.put(dsm.getCurrentState().getId(), bestPriority);
                }
                List<ITransition> bestTrasitions = Lists.newArrayList();
                for (ITransition iTransition : dsm.getUntraversedTransitionsFromCurrentState()) {
                    if (priorities.get(iTransition.getTransitionMetaData().rule) == bestPriority) {
                        bestTrasitions.add(iTransition);
                    }
                }
                // Random selection between transitions on the same level
                if (!bestTrasitions.isEmpty()) {
                    int index = rnd.nextInt(bestTrasitions.size());
                    ITransition iTransition = bestTrasitions.get(index);
                    return iTransition;
                }
            } else {
                ITransition bestTransition = getBestTransition(dsm.getUntraversedTransitionsFromCurrentState());
                if (bestTransition != null) {
                    return bestTransition;
                }
            }

        } while (dsm.undoLastTransformation());

        return null;
    }

    @Override
    public void newStateIsProcessed(ThreadContext context, boolean isAlreadyTraversed, ObjectiveValuesMap objectives,
            boolean constraintsNotSatisfied) {
        if (isAlreadyTraversed || constraintsNotSatisfied || (objectives.isSatisifiesHardObjectives())) {
            context.getDesignSpaceManager().undoLastTransformation();
        }
    }

    @Override
    public void interrupted(ThreadContext context) {
        isInterrupted = true;
    }

    private ITransition getBestTransition(Collection<? extends ITransition> transitions) {
        ITransition bestTransition = null;
        Integer bestPriority = Integer.MIN_VALUE;
        for (ITransition iTransition : transitions) {
            Integer priority = priorities.get(iTransition.getTransitionMetaData().rule);
            if (priority > bestPriority) {
                bestPriority = priority;
                bestTransition = iTransition;
            }
        }
        return bestTransition;
    }

    private Integer getBestPriority(Collection<? extends ITransition> transitions) {
        Integer bestPriority = Integer.MIN_VALUE;
        for (ITransition iTransition : transitions) {
            Integer priority = priorities.get(iTransition.getTransitionMetaData().rule);
            if (priority > bestPriority) {
                bestPriority = priority;
            }
        }
        return bestPriority;
    }

    public boolean isTryBestTransitionsOnly() {
        return tryBestTransitionsOnly;
    }

    public void setTryBestTransitionsOnly(boolean tryBestTransitionsOnly) {
        this.tryBestTransitionsOnly = tryBestTransitionsOnly;
    }

    public Map<Object, Integer> getBestPriorityInState() {
        return bestPriorityInState;
    }

    public void setBestPriorityInState(Map<Object, Integer> bestPriorityInState) {
        this.bestPriorityInState = bestPriorityInState;
    }

    public int getDepthLimit() {
        return depthLimit;
    }

    public void setDepthLimit(int depthLimit) {
        this.depthLimit = depthLimit;
    }

}
