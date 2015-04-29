/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.HostType#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostType#getDefaultCpu <em>Default Cpu</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostType#getDefaultMemory <em>Default Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostType#getDefaultHdd <em>Default Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.HostType#getCps <em>Cps</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.cps.CpsPackage#getHostType()
 * @model
 * @generated
 */
public interface HostType extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.HostInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.HostInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostType_Instances()
	 * @see hu.bme.mit.inf.cps.HostInstance#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<HostInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Default Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cpu</em>' attribute.
	 * @see #setDefaultCpu(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostType_DefaultCpu()
	 * @model
	 * @generated
	 */
	int getDefaultCpu();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostType#getDefaultCpu <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cpu</em>' attribute.
	 * @see #getDefaultCpu()
	 * @generated
	 */
	void setDefaultCpu(int value);

	/**
	 * Returns the value of the '<em><b>Default Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Memory</em>' attribute.
	 * @see #setDefaultMemory(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostType_DefaultMemory()
	 * @model
	 * @generated
	 */
	int getDefaultMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostType#getDefaultMemory <em>Default Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Memory</em>' attribute.
	 * @see #getDefaultMemory()
	 * @generated
	 */
	void setDefaultMemory(int value);

	/**
	 * Returns the value of the '<em><b>Default Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Hdd</em>' attribute.
	 * @see #setDefaultHdd(int)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostType_DefaultHdd()
	 * @model
	 * @generated
	 */
	int getDefaultHdd();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostType#getDefaultHdd <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Hdd</em>' attribute.
	 * @see #getDefaultHdd()
	 * @generated
	 */
	void setDefaultHdd(int value);

	/**
	 * Returns the value of the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps</em>' reference.
	 * @see #setCps(CyberPhysicalSystem)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getHostType_Cps()
	 * @model required="true"
	 * @generated
	 */
	CyberPhysicalSystem getCps();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.HostType#getCps <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' reference.
	 * @see #getCps()
	 * @generated
	 */
	void setCps(CyberPhysicalSystem value);

} // HostType
