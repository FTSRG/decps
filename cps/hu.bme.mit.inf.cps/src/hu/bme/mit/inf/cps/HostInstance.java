/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getApplications <em>Applications</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getAvailableCpu <em>Available Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getAvailableMemory <em>Available Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getCanCommunicateWith <em>Can Communicate With</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getAvailableHdd <em>Available Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getTotalCpu <em>Total Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getTotalHdd <em>Total Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostInstance#getNodeIp <em>Node Ip</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance()
 * @model
 * @generated
 */
public interface HostInstance extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.HostType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(HostType)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_Type()
	 * @see hu.bme.mit.inf.cps.HostType#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	HostType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(HostType value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.ApplicationInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_Applications()
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getAllocatedTo
	 * @model opposite="allocatedTo"
	 * @generated
	 */
	EList<ApplicationInstance> getApplications();

	/**
	 * Returns the value of the '<em><b>Available Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Cpu</em>' attribute.
	 * @see #setAvailableCpu(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_AvailableCpu()
	 * @model
	 * @generated
	 */
	int getAvailableCpu();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getAvailableCpu <em>Available Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Cpu</em>' attribute.
	 * @see #getAvailableCpu()
	 * @generated
	 */
	void setAvailableCpu(int value);

	/**
	 * Returns the value of the '<em><b>Available Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Memory</em>' attribute.
	 * @see #setAvailableMemory(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_AvailableMemory()
	 * @model
	 * @generated
	 */
	int getAvailableMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getAvailableMemory <em>Available Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Memory</em>' attribute.
	 * @see #getAvailableMemory()
	 * @generated
	 */
	void setAvailableMemory(int value);

	/**
	 * Returns the value of the '<em><b>Can Communicate With</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.HostInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Communicate With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Communicate With</em>' reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_CanCommunicateWith()
	 * @model
	 * @generated
	 */
	EList<HostInstance> getCanCommunicateWith();

	/**
	 * Returns the value of the '<em><b>Available Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Hdd</em>' attribute.
	 * @see #setAvailableHdd(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_AvailableHdd()
	 * @model
	 * @generated
	 */
	int getAvailableHdd();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getAvailableHdd <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Hdd</em>' attribute.
	 * @see #getAvailableHdd()
	 * @generated
	 */
	void setAvailableHdd(int value);

	/**
	 * Returns the value of the '<em><b>Total Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cpu</em>' attribute.
	 * @see #setTotalCpu(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_TotalCpu()
	 * @model
	 * @generated
	 */
	int getTotalCpu();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getTotalCpu <em>Total Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cpu</em>' attribute.
	 * @see #getTotalCpu()
	 * @generated
	 */
	void setTotalCpu(int value);

	/**
	 * Returns the value of the '<em><b>Total Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Memory</em>' attribute.
	 * @see #setTotalMemory(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_TotalMemory()
	 * @model
	 * @generated
	 */
	int getTotalMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getTotalMemory <em>Total Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Memory</em>' attribute.
	 * @see #getTotalMemory()
	 * @generated
	 */
	void setTotalMemory(int value);

	/**
	 * Returns the value of the '<em><b>Total Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Hdd</em>' attribute.
	 * @see #setTotalHdd(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_TotalHdd()
	 * @model
	 * @generated
	 */
	int getTotalHdd();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getTotalHdd <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Hdd</em>' attribute.
	 * @see #getTotalHdd()
	 * @generated
	 */
	void setTotalHdd(int value);

	/**
	 * Returns the value of the '<em><b>Node Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Ip</em>' attribute.
	 * @see #setNodeIp(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostInstance_NodeIp()
	 * @model
	 * @generated
	 */
	String getNodeIp();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostInstance#getNodeIp <em>Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Ip</em>' attribute.
	 * @see #getNodeIp()
	 * @generated
	 */
	void setNodeIp(String value);

} // HostInstance
