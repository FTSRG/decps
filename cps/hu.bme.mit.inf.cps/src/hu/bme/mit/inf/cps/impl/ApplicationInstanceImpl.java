/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getCommunicatesWith <em>Communicates With</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getDbUser <em>Db User</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getDbName <em>Db Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationInstanceImpl extends MinimalEObjectImpl.Container implements ApplicationInstance {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> allocatedTo;

	/**
	 * The cached value of the '{@link #getCommunicatesWith() <em>Communicates With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicatesWith()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> communicatesWith;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.STOPPED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUser() <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUser() <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUser()
	 * @generated
	 * @ordered
	 */
	protected String dbUser = DB_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected String dbPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbName()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbName()
	 * @generated
	 * @ordered
	 */
	protected String dbName = DB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected String args = ARGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.APPLICATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType getType() {
		if (eContainerFeatureID() != CpsPackage.APPLICATION_INSTANCE__TYPE) return null;
		return (ApplicationType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ApplicationType newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newType, CpsPackage.APPLICATION_INSTANCE__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ApplicationType newType) {
		if (newType != eInternalContainer() || (eContainerFeatureID() != CpsPackage.APPLICATION_INSTANCE__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, CpsPackage.APPLICATION_TYPE__INSTANCES, ApplicationType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostInstance> getAllocatedTo() {
		if (allocatedTo == null) {
			allocatedTo = new EObjectWithInverseResolvingEList.ManyInverse<HostInstance>(HostInstance.class, this, CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO, CpsPackage.HOST_INSTANCE__APPLICATIONS);
		}
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationInstance> getCommunicatesWith() {
		if (communicatesWith == null) {
			communicatesWith = new EObjectResolvingEList<ApplicationInstance>(ApplicationInstance.class, this, CpsPackage.APPLICATION_INSTANCE__COMMUNICATES_WITH);
		}
		return communicatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbUser() {
		return dbUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbUser(String newDbUser) {
		String oldDbUser = dbUser;
		dbUser = newDbUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__DB_USER, oldDbUser, dbUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbPassword(String newDbPassword) {
		String oldDbPassword = dbPassword;
		dbPassword = newDbPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbName(String newDbName) {
		String oldDbName = dbName;
		dbName = newDbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__DB_NAME, oldDbName, dbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(String newArgs) {
		String oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__ARGS, oldArgs, args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetType((ApplicationType)otherEnd, msgs);
			case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedTo()).basicAdd(otherEnd, msgs);
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
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				return basicSetType(null, msgs);
			case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				return ((InternalEList<?>)getAllocatedTo()).basicRemove(otherEnd, msgs);
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
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				return eInternalContainer().eInverseRemove(this, CpsPackage.APPLICATION_TYPE__INSTANCES, ApplicationType.class, msgs);
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
			case CpsPackage.APPLICATION_INSTANCE__ID:
				return getId();
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				return getType();
			case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				return getAllocatedTo();
			case CpsPackage.APPLICATION_INSTANCE__COMMUNICATES_WITH:
				return getCommunicatesWith();
			case CpsPackage.APPLICATION_INSTANCE__STATE:
				return getState();
			case CpsPackage.APPLICATION_INSTANCE__DB_USER:
				return getDbUser();
			case CpsPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				return getDbPassword();
			case CpsPackage.APPLICATION_INSTANCE__DB_NAME:
				return getDbName();
			case CpsPackage.APPLICATION_INSTANCE__ARGS:
				return getArgs();
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
			case CpsPackage.APPLICATION_INSTANCE__ID:
				setId((String)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				setType((ApplicationType)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				getAllocatedTo().clear();
				getAllocatedTo().addAll((Collection<? extends HostInstance>)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				getCommunicatesWith().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__STATE:
				setState((State)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__DB_USER:
				setDbUser((String)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				setDbPassword((String)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__DB_NAME:
				setDbName((String)newValue);
				return;
			case CpsPackage.APPLICATION_INSTANCE__ARGS:
				setArgs((String)newValue);
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
			case CpsPackage.APPLICATION_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				setType((ApplicationType)null);
				return;
			case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				getAllocatedTo().clear();
				return;
			case CpsPackage.APPLICATION_INSTANCE__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				return;
			case CpsPackage.APPLICATION_INSTANCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_INSTANCE__DB_USER:
				setDbUser(DB_USER_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				setDbPassword(DB_PASSWORD_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_INSTANCE__DB_NAME:
				setDbName(DB_NAME_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_INSTANCE__ARGS:
				setArgs(ARGS_EDEFAULT);
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
			case CpsPackage.APPLICATION_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CpsPackage.APPLICATION_INSTANCE__TYPE:
				return getType() != null;
			case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				return allocatedTo != null && !allocatedTo.isEmpty();
			case CpsPackage.APPLICATION_INSTANCE__COMMUNICATES_WITH:
				return communicatesWith != null && !communicatesWith.isEmpty();
			case CpsPackage.APPLICATION_INSTANCE__STATE:
				return state != STATE_EDEFAULT;
			case CpsPackage.APPLICATION_INSTANCE__DB_USER:
				return DB_USER_EDEFAULT == null ? dbUser != null : !DB_USER_EDEFAULT.equals(dbUser);
			case CpsPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
			case CpsPackage.APPLICATION_INSTANCE__DB_NAME:
				return DB_NAME_EDEFAULT == null ? dbName != null : !DB_NAME_EDEFAULT.equals(dbName);
			case CpsPackage.APPLICATION_INSTANCE__ARGS:
				return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(", dbUser: ");
		result.append(dbUser);
		result.append(", dbPassword: ");
		result.append(dbPassword);
		result.append(", dbName: ");
		result.append(dbName);
		result.append(", args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //ApplicationInstanceImpl
