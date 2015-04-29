/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.ResourceRequirement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ResourceRequirementImpl#getRequiredCpu <em>Required Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ResourceRequirementImpl#getRequiredMemory <em>Required Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ResourceRequirementImpl#getHostType <em>Host Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ResourceRequirementImpl#getRequiredHdd <em>Required Hdd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRequirementImpl extends MinimalEObjectImpl.Container implements ResourceRequirement {
	/**
	 * The default value of the '{@link #getRequiredCpu() <em>Required Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredCpu() <em>Required Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCpu()
	 * @generated
	 * @ordered
	 */
	protected int requiredCpu = REQUIRED_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredMemory() <em>Required Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredMemory() <em>Required Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMemory()
	 * @generated
	 * @ordered
	 */
	protected int requiredMemory = REQUIRED_MEMORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostType() <em>Host Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostType()
	 * @generated
	 * @ordered
	 */
	protected HostType hostType;

	/**
	 * The default value of the '{@link #getRequiredHdd() <em>Required Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredHdd() <em>Required Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHdd()
	 * @generated
	 * @ordered
	 */
	protected int requiredHdd = REQUIRED_HDD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.RESOURCE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredCpu() {
		return requiredCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCpu(int newRequiredCpu) {
		int oldRequiredCpu = requiredCpu;
		requiredCpu = newRequiredCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU, oldRequiredCpu, requiredCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredMemory() {
		return requiredMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMemory(int newRequiredMemory) {
		int oldRequiredMemory = requiredMemory;
		requiredMemory = newRequiredMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_MEMORY, oldRequiredMemory, requiredMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType getHostType() {
		if (hostType != null && hostType.eIsProxy()) {
			InternalEObject oldHostType = (InternalEObject)hostType;
			hostType = (HostType)eResolveProxy(oldHostType);
			if (hostType != oldHostType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsPackage.RESOURCE_REQUIREMENT__HOST_TYPE, oldHostType, hostType));
			}
		}
		return hostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType basicGetHostType() {
		return hostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostType(HostType newHostType) {
		HostType oldHostType = hostType;
		hostType = newHostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.RESOURCE_REQUIREMENT__HOST_TYPE, oldHostType, hostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredHdd() {
		return requiredHdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredHdd(int newRequiredHdd) {
		int oldRequiredHdd = requiredHdd;
		requiredHdd = newRequiredHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD, oldRequiredHdd, requiredHdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				return getRequiredCpu();
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_MEMORY:
				return getRequiredMemory();
			case CpsPackage.RESOURCE_REQUIREMENT__HOST_TYPE:
				if (resolve) return getHostType();
				return basicGetHostType();
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				return getRequiredHdd();
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
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				setRequiredCpu((Integer)newValue);
				return;
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_MEMORY:
				setRequiredMemory((Integer)newValue);
				return;
			case CpsPackage.RESOURCE_REQUIREMENT__HOST_TYPE:
				setHostType((HostType)newValue);
				return;
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				setRequiredHdd((Integer)newValue);
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
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				setRequiredCpu(REQUIRED_CPU_EDEFAULT);
				return;
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_MEMORY:
				setRequiredMemory(REQUIRED_MEMORY_EDEFAULT);
				return;
			case CpsPackage.RESOURCE_REQUIREMENT__HOST_TYPE:
				setHostType((HostType)null);
				return;
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				setRequiredHdd(REQUIRED_HDD_EDEFAULT);
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
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				return requiredCpu != REQUIRED_CPU_EDEFAULT;
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_MEMORY:
				return requiredMemory != REQUIRED_MEMORY_EDEFAULT;
			case CpsPackage.RESOURCE_REQUIREMENT__HOST_TYPE:
				return hostType != null;
			case CpsPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				return requiredHdd != REQUIRED_HDD_EDEFAULT;
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
		result.append(" (requiredCpu: ");
		result.append(requiredCpu);
		result.append(", requiredMemory: ");
		result.append(requiredMemory);
		result.append(", requiredHdd: ");
		result.append(requiredHdd);
		result.append(')');
		return result.toString();
	}

} //ResourceRequirementImpl
