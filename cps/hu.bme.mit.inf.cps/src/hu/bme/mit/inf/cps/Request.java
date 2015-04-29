/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.Request#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.Request#getUser <em>User</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.Request#getPassword <em>Password</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.Request#getDbname <em>Dbname</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.cps.CpsPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.Requirement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.Requirement#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getRequest_Requirements()
	 * @see hu.bme.mit.inf.cps.Requirement#getRequest
	 * @model opposite="request" containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getRequest_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.Request#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getRequest_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.Request#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Dbname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbname</em>' attribute.
	 * @see #setDbname(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getRequest_Dbname()
	 * @model
	 * @generated
	 */
	String getDbname();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.Request#getDbname <em>Dbname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbname</em>' attribute.
	 * @see #getDbname()
	 * @generated
	 */
	void setDbname(String value);

} // Request
