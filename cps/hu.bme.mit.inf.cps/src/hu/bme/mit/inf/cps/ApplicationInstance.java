/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getCommunicatesWith <em>Communicates With</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getState <em>State</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbUser <em>Db User</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbName <em>Db Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationInstance#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance()
 * @model
 * @generated
 */
public interface ApplicationInstance extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.ApplicationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(ApplicationType)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_Type()
	 * @see hu.bme.mit.inf.cps.ApplicationType#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	ApplicationType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationInstance#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.HostInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.HostInstance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_AllocatedTo()
	 * @see hu.bme.mit.inf.cps.HostInstance#getApplications
	 * @model opposite="applications"
	 * @generated
	 */
	EList<HostInstance> getAllocatedTo();

	/**
	 * Returns the value of the '<em><b>Communicates With</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.ApplicationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicates With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates With</em>' reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_CommunicatesWith()
	 * @model
	 * @generated
	 */
	EList<ApplicationInstance> getCommunicatesWith();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.cps.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see hu.bme.mit.inf.cps.State
	 * @see #setState(State)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see hu.bme.mit.inf.cps.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Db User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db User</em>' attribute.
	 * @see #setDbUser(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_DbUser()
	 * @model
	 * @generated
	 */
	String getDbUser();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbUser <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db User</em>' attribute.
	 * @see #getDbUser()
	 * @generated
	 */
	void setDbUser(String value);

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_DbPassword()
	 * @model
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

	/**
	 * Returns the value of the '<em><b>Db Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Name</em>' attribute.
	 * @see #setDbName(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_DbName()
	 * @model
	 * @generated
	 */
	String getDbName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbName <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Name</em>' attribute.
	 * @see #getDbName()
	 * @generated
	 */
	void setDbName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationInstance_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationInstance#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

} // ApplicationInstance
