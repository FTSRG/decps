/**
 */
package org.eclipse.viatra.cep.core.metamodels.automaton.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.viatra.cep.core.metamodels.automaton.AutomatonPackage;
import org.eclipse.viatra.cep.core.metamodels.automaton.State;
import org.eclipse.viatra.cep.core.metamodels.automaton.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.viatra.cep.core.metamodels.automaton.impl.TransitionImpl#getPreState <em>Pre State</em>}</li>
 *   <li>{@link org.eclipse.viatra.cep.core.metamodels.automaton.impl.TransitionImpl#getPostState <em>Post State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
    /**
     * The cached value of the '{@link #getPostState() <em>Post State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostState()
     * @generated
     * @ordered
     */
    protected State postState;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AutomatonPackage.Literals.TRANSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getPreState() {
        if (eContainerFeatureID() != AutomatonPackage.TRANSITION__PRE_STATE) return null;
        return (State)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPreState(State newPreState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPreState, AutomatonPackage.TRANSITION__PRE_STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreState(State newPreState) {
        if (newPreState != eInternalContainer() || (eContainerFeatureID() != AutomatonPackage.TRANSITION__PRE_STATE && newPreState != null)) {
            if (EcoreUtil.isAncestor(this, newPreState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPreState != null)
                msgs = ((InternalEObject)newPreState).eInverseAdd(this, AutomatonPackage.STATE__OUT_TRANSITIONS, State.class, msgs);
            msgs = basicSetPreState(newPreState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AutomatonPackage.TRANSITION__PRE_STATE, newPreState, newPreState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getPostState() {
        if (postState != null && postState.eIsProxy()) {
            InternalEObject oldPostState = (InternalEObject)postState;
            postState = (State)eResolveProxy(oldPostState);
            if (postState != oldPostState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomatonPackage.TRANSITION__POST_STATE, oldPostState, postState));
            }
        }
        return postState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State basicGetPostState() {
        return postState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPostState(State newPostState, NotificationChain msgs) {
        State oldPostState = postState;
        postState = newPostState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutomatonPackage.TRANSITION__POST_STATE, oldPostState, newPostState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostState(State newPostState) {
        if (newPostState != postState) {
            NotificationChain msgs = null;
            if (postState != null)
                msgs = ((InternalEObject)postState).eInverseRemove(this, AutomatonPackage.STATE__IN_TRANSITIONS, State.class, msgs);
            if (newPostState != null)
                msgs = ((InternalEObject)newPostState).eInverseAdd(this, AutomatonPackage.STATE__IN_TRANSITIONS, State.class, msgs);
            msgs = basicSetPostState(newPostState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AutomatonPackage.TRANSITION__POST_STATE, newPostState, newPostState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPreState((State)otherEnd, msgs);
            case AutomatonPackage.TRANSITION__POST_STATE:
                if (postState != null)
                    msgs = ((InternalEObject)postState).eInverseRemove(this, AutomatonPackage.STATE__IN_TRANSITIONS, State.class, msgs);
                return basicSetPostState((State)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                return basicSetPreState(null, msgs);
            case AutomatonPackage.TRANSITION__POST_STATE:
                return basicSetPostState(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                return eInternalContainer().eInverseRemove(this, AutomatonPackage.STATE__OUT_TRANSITIONS, State.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                return getPreState();
            case AutomatonPackage.TRANSITION__POST_STATE:
                if (resolve) return getPostState();
                return basicGetPostState();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                setPreState((State)newValue);
                return;
            case AutomatonPackage.TRANSITION__POST_STATE:
                setPostState((State)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                setPreState((State)null);
                return;
            case AutomatonPackage.TRANSITION__POST_STATE:
                setPostState((State)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case AutomatonPackage.TRANSITION__PRE_STATE:
                return getPreState() != null;
            case AutomatonPackage.TRANSITION__POST_STATE:
                return postState != null;
        }
        return super.eIsSet(featureID);
    }

} //TransitionImpl
