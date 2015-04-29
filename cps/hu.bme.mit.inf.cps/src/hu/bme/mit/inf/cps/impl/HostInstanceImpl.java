/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.CpsPackage;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getAvailableCpu <em>Available Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getAvailableMemory <em>Available Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getCanCommunicateWith <em>Can Communicate With</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getAvailableHdd <em>Available Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getTotalCpu <em>Total Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getTotalHdd <em>Total Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl#getNodeIp <em>Node Ip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostInstanceImpl extends MinimalEObjectImpl.Container implements HostInstance {
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
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> applications;

	/**
	 * The default value of the '{@link #getAvailableCpu() <em>Available Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableCpu() <em>Available Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCpu()
	 * @generated
	 * @ordered
	 */
	protected int availableCpu = AVAILABLE_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableMemory() <em>Available Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableMemory() <em>Available Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableMemory()
	 * @generated
	 * @ordered
	 */
	protected int availableMemory = AVAILABLE_MEMORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCanCommunicateWith() <em>Can Communicate With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanCommunicateWith()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> canCommunicateWith;

	/**
	 * The default value of the '{@link #getAvailableHdd() <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableHdd() <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableHdd()
	 * @generated
	 * @ordered
	 */
	protected int availableHdd = AVAILABLE_HDD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCpu() <em>Total Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCpu() <em>Total Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCpu()
	 * @generated
	 * @ordered
	 */
	protected int totalCpu = TOTAL_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalMemory() <em>Total Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalMemory() <em>Total Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMemory()
	 * @generated
	 * @ordered
	 */
	protected int totalMemory = TOTAL_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalHdd() <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalHdd() <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHdd()
	 * @generated
	 * @ordered
	 */
	protected int totalHdd = TOTAL_HDD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeIp() <em>Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIp()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeIp() <em>Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIp()
	 * @generated
	 * @ordered
	 */
	protected String nodeIp = NODE_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.HOST_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType getType() {
		if (eContainerFeatureID() != CpsPackage.HOST_INSTANCE__TYPE) return null;
		return (HostType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(HostType newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newType, CpsPackage.HOST_INSTANCE__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(HostType newType) {
		if (newType != eInternalContainer() || (eContainerFeatureID() != CpsPackage.HOST_INSTANCE__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, CpsPackage.HOST_TYPE__INSTANCES, HostType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationInstance> getApplications() {
		if (applications == null) {
			applications = new EObjectWithInverseResolvingEList.ManyInverse<ApplicationInstance>(ApplicationInstance.class, this, CpsPackage.HOST_INSTANCE__APPLICATIONS, CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableCpu() {
		return availableCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableCpu(int newAvailableCpu) {
		int oldAvailableCpu = availableCpu;
		availableCpu = newAvailableCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__AVAILABLE_CPU, oldAvailableCpu, availableCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableMemory() {
		return availableMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableMemory(int newAvailableMemory) {
		int oldAvailableMemory = availableMemory;
		availableMemory = newAvailableMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY, oldAvailableMemory, availableMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostInstance> getCanCommunicateWith() {
		if (canCommunicateWith == null) {
			canCommunicateWith = new EObjectResolvingEList<HostInstance>(HostInstance.class, this, CpsPackage.HOST_INSTANCE__CAN_COMMUNICATE_WITH);
		}
		return canCommunicateWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableHdd() {
		return availableHdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableHdd(int newAvailableHdd) {
		int oldAvailableHdd = availableHdd;
		availableHdd = newAvailableHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__AVAILABLE_HDD, oldAvailableHdd, availableHdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCpu() {
		return totalCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCpu(int newTotalCpu) {
		int oldTotalCpu = totalCpu;
		totalCpu = newTotalCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__TOTAL_CPU, oldTotalCpu, totalCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalMemory() {
		return totalMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalMemory(int newTotalMemory) {
		int oldTotalMemory = totalMemory;
		totalMemory = newTotalMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__TOTAL_MEMORY, oldTotalMemory, totalMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalHdd() {
		return totalHdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalHdd(int newTotalHdd) {
		int oldTotalHdd = totalHdd;
		totalHdd = newTotalHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__TOTAL_HDD, oldTotalHdd, totalHdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeIp() {
		return nodeIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeIp(String newNodeIp) {
		String oldNodeIp = nodeIp;
		nodeIp = newNodeIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__NODE_IP, oldNodeIp, nodeIp));
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
			case CpsPackage.HOST_INSTANCE__TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetType((HostType)otherEnd, msgs);
			case CpsPackage.HOST_INSTANCE__APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplications()).basicAdd(otherEnd, msgs);
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
			case CpsPackage.HOST_INSTANCE__TYPE:
				return basicSetType(null, msgs);
			case CpsPackage.HOST_INSTANCE__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
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
			case CpsPackage.HOST_INSTANCE__TYPE:
				return eInternalContainer().eInverseRemove(this, CpsPackage.HOST_TYPE__INSTANCES, HostType.class, msgs);
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
			case CpsPackage.HOST_INSTANCE__ID:
				return getId();
			case CpsPackage.HOST_INSTANCE__TYPE:
				return getType();
			case CpsPackage.HOST_INSTANCE__APPLICATIONS:
				return getApplications();
			case CpsPackage.HOST_INSTANCE__AVAILABLE_CPU:
				return getAvailableCpu();
			case CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY:
				return getAvailableMemory();
			case CpsPackage.HOST_INSTANCE__CAN_COMMUNICATE_WITH:
				return getCanCommunicateWith();
			case CpsPackage.HOST_INSTANCE__AVAILABLE_HDD:
				return getAvailableHdd();
			case CpsPackage.HOST_INSTANCE__TOTAL_CPU:
				return getTotalCpu();
			case CpsPackage.HOST_INSTANCE__TOTAL_MEMORY:
				return getTotalMemory();
			case CpsPackage.HOST_INSTANCE__TOTAL_HDD:
				return getTotalHdd();
			case CpsPackage.HOST_INSTANCE__NODE_IP:
				return getNodeIp();
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
			case CpsPackage.HOST_INSTANCE__ID:
				setId((String)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__TYPE:
				setType((HostType)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_CPU:
				setAvailableCpu((Integer)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY:
				setAvailableMemory((Integer)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__CAN_COMMUNICATE_WITH:
				getCanCommunicateWith().clear();
				getCanCommunicateWith().addAll((Collection<? extends HostInstance>)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_HDD:
				setAvailableHdd((Integer)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__TOTAL_CPU:
				setTotalCpu((Integer)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__TOTAL_MEMORY:
				setTotalMemory((Integer)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__TOTAL_HDD:
				setTotalHdd((Integer)newValue);
				return;
			case CpsPackage.HOST_INSTANCE__NODE_IP:
				setNodeIp((String)newValue);
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
			case CpsPackage.HOST_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__TYPE:
				setType((HostType)null);
				return;
			case CpsPackage.HOST_INSTANCE__APPLICATIONS:
				getApplications().clear();
				return;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_CPU:
				setAvailableCpu(AVAILABLE_CPU_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY:
				setAvailableMemory(AVAILABLE_MEMORY_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__CAN_COMMUNICATE_WITH:
				getCanCommunicateWith().clear();
				return;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_HDD:
				setAvailableHdd(AVAILABLE_HDD_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__TOTAL_CPU:
				setTotalCpu(TOTAL_CPU_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__TOTAL_MEMORY:
				setTotalMemory(TOTAL_MEMORY_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__TOTAL_HDD:
				setTotalHdd(TOTAL_HDD_EDEFAULT);
				return;
			case CpsPackage.HOST_INSTANCE__NODE_IP:
				setNodeIp(NODE_IP_EDEFAULT);
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
			case CpsPackage.HOST_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CpsPackage.HOST_INSTANCE__TYPE:
				return getType() != null;
			case CpsPackage.HOST_INSTANCE__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case CpsPackage.HOST_INSTANCE__AVAILABLE_CPU:
				return availableCpu != AVAILABLE_CPU_EDEFAULT;
			case CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY:
				return availableMemory != AVAILABLE_MEMORY_EDEFAULT;
			case CpsPackage.HOST_INSTANCE__CAN_COMMUNICATE_WITH:
				return canCommunicateWith != null && !canCommunicateWith.isEmpty();
			case CpsPackage.HOST_INSTANCE__AVAILABLE_HDD:
				return availableHdd != AVAILABLE_HDD_EDEFAULT;
			case CpsPackage.HOST_INSTANCE__TOTAL_CPU:
				return totalCpu != TOTAL_CPU_EDEFAULT;
			case CpsPackage.HOST_INSTANCE__TOTAL_MEMORY:
				return totalMemory != TOTAL_MEMORY_EDEFAULT;
			case CpsPackage.HOST_INSTANCE__TOTAL_HDD:
				return totalHdd != TOTAL_HDD_EDEFAULT;
			case CpsPackage.HOST_INSTANCE__NODE_IP:
				return NODE_IP_EDEFAULT == null ? nodeIp != null : !NODE_IP_EDEFAULT.equals(nodeIp);
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
		result.append(", availableCpu: ");
		result.append(availableCpu);
		result.append(", availableMemory: ");
		result.append(availableMemory);
		result.append(", availableHdd: ");
		result.append(availableHdd);
		result.append(", totalCpu: ");
		result.append(totalCpu);
		result.append(", totalMemory: ");
		result.append(totalMemory);
		result.append(", totalHdd: ");
		result.append(totalHdd);
		result.append(", nodeIp: ");
		result.append(nodeIp);
		result.append(')');
		return result.toString();
	}

} //HostInstanceImpl
