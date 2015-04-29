/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getApplicationTypes <em>Application Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getRequests <em>Requests</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getDbUrl <em>Db Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.cps.CpsPackage#getCyberPhysicalSystem()
 * @model
 * @generated
 */
public interface CyberPhysicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Types</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getCyberPhysicalSystem_ApplicationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationType> getApplicationTypes();

	/**
	 * Returns the value of the '<em><b>Host Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.HostType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Types</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getCyberPhysicalSystem_HostTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HostType> getHostTypes();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getCyberPhysicalSystem_Requests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Db Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Url</em>' attribute.
	 * @see #setDbUrl(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getCyberPhysicalSystem_DbUrl()
	 * @model
	 * @generated
	 */
	String getDbUrl();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getDbUrl <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Url</em>' attribute.
	 * @see #getDbUrl()
	 * @generated
	 */
	void setDbUrl(String value);

} // CyberPhysicalSystem
