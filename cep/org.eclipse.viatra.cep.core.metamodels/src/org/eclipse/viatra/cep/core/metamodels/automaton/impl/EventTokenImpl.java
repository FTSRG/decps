/**
 */
package org.eclipse.viatra.cep.core.metamodels.automaton.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.cep.core.metamodels.automaton.AutomatonPackage;
import org.eclipse.viatra.cep.core.metamodels.automaton.EventToken;
import org.eclipse.viatra.cep.core.metamodels.automaton.State;

import org.eclipse.viatra.cep.core.metamodels.automaton.TimedZone;
import org.eclipse.viatra.cep.core.metamodels.events.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.viatra.cep.core.metamodels.automaton.impl.EventTokenImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.eclipse.viatra.cep.core.metamodels.automaton.impl.EventTokenImpl#getRecordedEvents <em>Recorded Events</em>}</li>
 *   <li>{@link org.eclipse.viatra.cep.core.metamodels.automaton.impl.EventTokenImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.viatra.cep.core.metamodels.automaton.impl.EventTokenImpl#getTimedZones <em>Timed Zones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventTokenImpl extends MinimalEObjectImpl.Container implements EventToken {
    /**
     * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentState()
     * @generated
     * @ordered
     */
    protected State currentState;

    /**
     * The cached value of the '{@link #getRecordedEvents() <em>Recorded Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecordedEvents()
     * @generated
     * @ordered
     */
    protected EList<Event> recordedEvents;

    /**
     * The cached value of the '{@link #getLastProcessed() <em>Last Processed</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastProcessed()
     * @generated
     * @ordered
     */
    protected Event lastProcessed;

    /**
     * The cached value of the '{@link #getTimedZones() <em>Timed Zones</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimedZones()
     * @generated
     * @ordered
     */
    protected EList<TimedZone> timedZones;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventTokenImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AutomatonPackage.Literals.EVENT_TOKEN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getCurrentState() {
        if (currentState != null && currentState.eIsProxy()) {
            InternalEObject oldCurrentState = (InternalEObject)currentState;
            currentState = (State)eResolveProxy(oldCurrentState);
            if (currentState != oldCurrentState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomatonPackage.EVENT_TOKEN__CURRENT_STATE, oldCurrentState, currentState));
            }
        }
        return currentState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State basicGetCurrentState() {
        return currentState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCurrentState(State newCurrentState, NotificationChain msgs) {
        State oldCurrentState = currentState;
        currentState = newCurrentState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutomatonPackage.EVENT_TOKEN__CURRENT_STATE, oldCurrentState, newCurrentState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCurrentState(State newCurrentState) {
        if (newCurrentState != currentState) {
            NotificationChain msgs = null;
            if (currentState != null)
                msgs = ((InternalEObject)currentState).eInverseRemove(this, AutomatonPackage.STATE__EVENT_TOKENS, State.class, msgs);
            if (newCurrentState != null)
                msgs = ((InternalEObject)newCurrentState).eInverseAdd(this, AutomatonPackage.STATE__EVENT_TOKENS, State.class, msgs);
            msgs = basicSetCurrentState(newCurrentState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AutomatonPackage.EVENT_TOKEN__CURRENT_STATE, newCurrentState, newCurrentState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Event> getRecordedEvents() {
        if (recordedEvents == null) {
            recordedEvents = new EObjectResolvingEList<Event>(Event.class, this, AutomatonPackage.EVENT_TOKEN__RECORDED_EVENTS);
        }
        return recordedEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Event getLastProcessed() {
        if (lastProcessed != null && lastProcessed.eIsProxy()) {
            InternalEObject oldLastProcessed = (InternalEObject)lastProcessed;
            lastProcessed = (Event)eResolveProxy(oldLastProcessed);
            if (lastProcessed != oldLastProcessed) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomatonPackage.EVENT_TOKEN__LAST_PROCESSED, oldLastProcessed, lastProcessed));
            }
        }
        return lastProcessed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Event basicGetLastProcessed() {
        return lastProcessed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastProcessed(Event newLastProcessed) {
        Event oldLastProcessed = lastProcessed;
        lastProcessed = newLastProcessed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AutomatonPackage.EVENT_TOKEN__LAST_PROCESSED, oldLastProcessed, lastProcessed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TimedZone> getTimedZones() {
        if (timedZones == null) {
            timedZones = new EObjectResolvingEList<TimedZone>(TimedZone.class, this, AutomatonPackage.EVENT_TOKEN__TIMED_ZONES);
        }
        return timedZones;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AutomatonPackage.EVENT_TOKEN__CURRENT_STATE:
                if (currentState != null)
                    msgs = ((InternalEObject)currentState).eInverseRemove(this, AutomatonPackage.STATE__EVENT_TOKENS, State.class, msgs);
                return basicSetCurrentState((State)otherEnd, msgs);
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
            case AutomatonPackage.EVENT_TOKEN__CURRENT_STATE:
                return basicSetCurrentState(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AutomatonPackage.EVENT_TOKEN__CURRENT_STATE:
                if (resolve) return getCurrentState();
                return basicGetCurrentState();
            case AutomatonPackage.EVENT_TOKEN__RECORDED_EVENTS:
                return getRecordedEvents();
            case AutomatonPackage.EVENT_TOKEN__LAST_PROCESSED:
                if (resolve) return getLastProcessed();
                return basicGetLastProcessed();
            case AutomatonPackage.EVENT_TOKEN__TIMED_ZONES:
                return getTimedZones();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AutomatonPackage.EVENT_TOKEN__CURRENT_STATE:
                setCurrentState((State)newValue);
                return;
            case AutomatonPackage.EVENT_TOKEN__RECORDED_EVENTS:
                getRecordedEvents().clear();
                getRecordedEvents().addAll((Collection<? extends Event>)newValue);
                return;
            case AutomatonPackage.EVENT_TOKEN__LAST_PROCESSED:
                setLastProcessed((Event)newValue);
                return;
            case AutomatonPackage.EVENT_TOKEN__TIMED_ZONES:
                getTimedZones().clear();
                getTimedZones().addAll((Collection<? extends TimedZone>)newValue);
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
            case AutomatonPackage.EVENT_TOKEN__CURRENT_STATE:
                setCurrentState((State)null);
                return;
            case AutomatonPackage.EVENT_TOKEN__RECORDED_EVENTS:
                getRecordedEvents().clear();
                return;
            case AutomatonPackage.EVENT_TOKEN__LAST_PROCESSED:
                setLastProcessed((Event)null);
                return;
            case AutomatonPackage.EVENT_TOKEN__TIMED_ZONES:
                getTimedZones().clear();
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
            case AutomatonPackage.EVENT_TOKEN__CURRENT_STATE:
                return currentState != null;
            case AutomatonPackage.EVENT_TOKEN__RECORDED_EVENTS:
                return recordedEvents != null && !recordedEvents.isEmpty();
            case AutomatonPackage.EVENT_TOKEN__LAST_PROCESSED:
                return lastProcessed != null;
            case AutomatonPackage.EVENT_TOKEN__TIMED_ZONES:
                return timedZones != null && !timedZones.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EventTokenImpl
