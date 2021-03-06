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
package org.eclipse.viatra.dse.guidance.criterias;

import org.eclipse.viatra.dse.guidance.CriteriaContext;
import org.eclipse.viatra.dse.guidance.ICriteria;
import org.eclipse.viatra.dse.guidance.RuleInfo;
import org.eclipse.viatra.dse.guidance.dependencygraph.interfaces.INode;

public class SelectRuleWithMostTriggerOutEdges implements ICriteria {

    private double scalar;

    public SelectRuleWithMostTriggerOutEdges() {
        this(1);
    }

    public SelectRuleWithMostTriggerOutEdges(double scalar) {
        this.scalar = scalar;
    }

    @Override
    public EvaluationResult evaluate(CriteriaContext context) {

        // fore each enabled rule
        for (INode ruleNode : context.getDependencyGraph().getRuleNodes()) {
            RuleInfo ruleInfo = context.getRuleInfos().get(ruleNode);
            if (ruleInfo.isEnabled()) {
                // get the backward transitive cardinality on inhibit edges
                int result = context.getOutTriggerNodesTransitiveCardinality(ruleNode);
                // save result
                ruleInfo.addToSelectionPriority(result * scalar);
            }
        }

        return EvaluationResult.NONE;
    }

}
