/**
 */
package org.eclipse.viatra.cep.core.metamodels.automaton.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.viatra.cep.core.metamodels.automaton.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.cep.core.metamodels.automaton.AutomatonPackage
 * @generated
 */
public class AutomatonSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static AutomatonPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AutomatonSwitch() {
        if (modelPackage == null) {
            modelPackage = AutomatonPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case AutomatonPackage.INTERNAL_MODEL: {
                InternalModel internalModel = (InternalModel)theEObject;
                T result = caseInternalModel(internalModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.AUTOMATON: {
                Automaton automaton = (Automaton)theEObject;
                T result = caseAutomaton(automaton);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.EVENT_TOKEN: {
                EventToken eventToken = (EventToken)theEObject;
                T result = caseEventToken(eventToken);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.STATE: {
                State state = (State)theEObject;
                T result = caseState(state);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.INIT_STATE: {
                InitState initState = (InitState)theEObject;
                T result = caseInitState(initState);
                if (result == null) result = caseState(initState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.FINAL_STATE: {
                FinalState finalState = (FinalState)theEObject;
                T result = caseFinalState(finalState);
                if (result == null) result = caseState(finalState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.TRAP_STATE: {
                TrapState trapState = (TrapState)theEObject;
                T result = caseTrapState(trapState);
                if (result == null) result = caseState(trapState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.TRANSITION: {
                Transition transition = (Transition)theEObject;
                T result = caseTransition(transition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.TYPED_TRANSITION: {
                TypedTransition typedTransition = (TypedTransition)theEObject;
                T result = caseTypedTransition(typedTransition);
                if (result == null) result = caseTransition(typedTransition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.EPSILON_TRANSITION: {
                EpsilonTransition epsilonTransition = (EpsilonTransition)theEObject;
                T result = caseEpsilonTransition(epsilonTransition);
                if (result == null) result = caseTransition(epsilonTransition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.GUARD: {
                Guard guard = (Guard)theEObject;
                T result = caseGuard(guard);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.TIMED_ZONE: {
                TimedZone timedZone = (TimedZone)theEObject;
                T result = caseTimedZone(timedZone);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.WITHIN: {
                Within within = (Within)theEObject;
                T result = caseWithin(within);
                if (result == null) result = caseTimedZone(within);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AutomatonPackage.HOLDS_FOR: {
                HoldsFor holdsFor = (HoldsFor)theEObject;
                T result = caseHoldsFor(holdsFor);
                if (result == null) result = caseTimedZone(holdsFor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Internal Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Internal Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalModel(InternalModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Automaton</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Automaton</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAutomaton(Automaton object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Token</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Token</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventToken(EventToken object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseState(State object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Init State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Init State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitState(InitState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFinalState(FinalState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Trap State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trap State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTrapState(TrapState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransition(Transition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Typed Transition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Typed Transition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypedTransition(TypedTransition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Epsilon Transition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Epsilon Transition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEpsilonTransition(EpsilonTransition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGuard(Guard object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timed Zone</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timed Zone</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimedZone(TimedZone object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Within</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Within</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWithin(Within object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Holds For</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Holds For</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHoldsFor(HoldsFor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //AutomatonSwitch
