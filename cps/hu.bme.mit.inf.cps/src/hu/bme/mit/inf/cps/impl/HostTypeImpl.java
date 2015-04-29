/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.incquery.querybasedfeatures.runtime.IQueryBasedFeatureHandler;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureKind;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostTypeImpl#getDefaultCpu <em>Default Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostTypeImpl#getDefaultMemory <em>Default Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostTypeImpl#getDefaultHdd <em>Default Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostTypeImpl#getCps <em>Cps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostTypeImpl extends MinimalEObjectImpl.Container implements HostType {
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
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> instances;

	/**
	 * The default value of the '{@link #getDefaultCpu() <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultCpu() <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCpu()
	 * @generated
	 * @ordered
	 */
	protected int defaultCpu = DEFAULT_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMemory() <em>Default Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultMemory() <em>Default Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMemory()
	 * @generated
	 * @ordered
	 */
	protected int defaultMemory = DEFAULT_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected int defaultHdd = DEFAULT_HDD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCps() <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCps()
	 * @generated
	 * @ordered
	 */
	protected CyberPhysicalSystem cps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.HOST_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList<HostInstance>(HostInstance.class, this, CpsPackage.HOST_TYPE__INSTANCES, CpsPackage.HOST_INSTANCE__TYPE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultCpu() {
		return defaultCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCpu(int newDefaultCpu) {
		int oldDefaultCpu = defaultCpu;
		defaultCpu = newDefaultCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__DEFAULT_CPU, oldDefaultCpu, defaultCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultMemory() {
		return defaultMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMemory(int newDefaultMemory) {
		int oldDefaultMemory = defaultMemory;
		defaultMemory = newDefaultMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__DEFAULT_MEMORY, oldDefaultMemory, defaultMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultHdd() {
		return defaultHdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHdd(int newDefaultHdd) {
		int oldDefaultHdd = defaultHdd;
		defaultHdd = newDefaultHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__DEFAULT_HDD, oldDefaultHdd, defaultHdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem getCps() {
		if (cps != null && cps.eIsProxy()) {
			InternalEObject oldCps = (InternalEObject)cps;
			cps = (CyberPhysicalSystem)eResolveProxy(oldCps);
			if (cps != oldCps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsPackage.HOST_TYPE__CPS, oldCps, cps));
			}
		}
		return cps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem basicGetCpsGen() {
		return cps;
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
			case CpsPackage.HOST_TYPE__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
			case CpsPackage.HOST_TYPE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case CpsPackage.HOST_TYPE__ID:
				return getId();
			case CpsPackage.HOST_TYPE__INSTANCES:
				return getInstances();
			case CpsPackage.HOST_TYPE__DEFAULT_CPU:
				return getDefaultCpu();
			case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
				return getDefaultMemory();
			case CpsPackage.HOST_TYPE__DEFAULT_HDD:
				return getDefaultHdd();
			case CpsPackage.HOST_TYPE__CPS:
				if (resolve) return getCps();
				return basicGetCps();
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
			case CpsPackage.HOST_TYPE__ID:
				setId((String)newValue);
				return;
			case CpsPackage.HOST_TYPE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends HostInstance>)newValue);
				return;
			case CpsPackage.HOST_TYPE__DEFAULT_CPU:
				setDefaultCpu((Integer)newValue);
				return;
			case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
				setDefaultMemory((Integer)newValue);
				return;
			case CpsPackage.HOST_TYPE__DEFAULT_HDD:
				setDefaultHdd((Integer)newValue);
				return;
			case CpsPackage.HOST_TYPE__CPS:
				setCps((CyberPhysicalSystem)newValue);
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
			case CpsPackage.HOST_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CpsPackage.HOST_TYPE__INSTANCES:
				getInstances().clear();
				return;
			case CpsPackage.HOST_TYPE__DEFAULT_CPU:
				setDefaultCpu(DEFAULT_CPU_EDEFAULT);
				return;
			case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
				setDefaultMemory(DEFAULT_MEMORY_EDEFAULT);
				return;
			case CpsPackage.HOST_TYPE__DEFAULT_HDD:
				setDefaultHdd(DEFAULT_HDD_EDEFAULT);
				return;
			case CpsPackage.HOST_TYPE__CPS:
				setCps((CyberPhysicalSystem)null);
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
			case CpsPackage.HOST_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CpsPackage.HOST_TYPE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case CpsPackage.HOST_TYPE__DEFAULT_CPU:
				return defaultCpu != DEFAULT_CPU_EDEFAULT;
			case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
				return defaultMemory != DEFAULT_MEMORY_EDEFAULT;
			case CpsPackage.HOST_TYPE__DEFAULT_HDD:
				return defaultHdd != DEFAULT_HDD_EDEFAULT;
			case CpsPackage.HOST_TYPE__CPS:
				return cps != null;
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
		result.append(", defaultCpu: ");
		result.append(defaultCpu);
		result.append(", defaultMemory: ");
		result.append(defaultMemory);
		result.append(", defaultHdd: ");
		result.append(defaultHdd);
		result.append(')');
		return result.toString();
	}

	/**
	 * EMF-IncQuery handler for query-based feature cps
	 */
	private IQueryBasedFeatureHandler cpsHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature cps
	 */
	public CyberPhysicalSystem basicGetCps() {
		if (cpsHandler == null) {
			cpsHandler = QueryBasedFeatureHelper.getQueryBasedFeatureHandler(
					this, CpsPackageImpl.Literals.HOST_TYPE__CPS,
					"hu.bme.mit.inf.cps.patterns.hostCps", "host", "model",
					QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (hu.bme.mit.inf.cps.CyberPhysicalSystem) cpsHandler
				.getSingleReferenceValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCps(CyberPhysicalSystem newCps) {
		CyberPhysicalSystem oldCps = cps;
		cps = newCps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__CPS, oldCps, cps));
	}

} //HostTypeImpl
