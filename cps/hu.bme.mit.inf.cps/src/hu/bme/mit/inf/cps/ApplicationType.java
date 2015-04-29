/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationType#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationType#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationType#getExeFileUrl <em>Exe File Url</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationType#getExeType <em>Exe Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationType#getCps <em>Cps</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.ApplicationType#getZipFile <em>Zip File</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType()
 * @model
 * @generated
 */
public interface ApplicationType extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.ResourceRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceRequirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.cps.ApplicationInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.cps.ApplicationInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType_Instances()
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<ApplicationInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Exe File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exe File Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exe File Url</em>' attribute.
	 * @see #setExeFileUrl(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType_ExeFileUrl()
	 * @model
	 * @generated
	 */
	String getExeFileUrl();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationType#getExeFileUrl <em>Exe File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe File Url</em>' attribute.
	 * @see #getExeFileUrl()
	 * @generated
	 */
	void setExeFileUrl(String value);

	/**
	 * Returns the value of the '<em><b>Exe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exe Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exe Type</em>' attribute.
	 * @see #setExeType(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType_ExeType()
	 * @model
	 * @generated
	 */
	String getExeType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationType#getExeType <em>Exe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe Type</em>' attribute.
	 * @see #getExeType()
	 * @generated
	 */
	void setExeType(String value);

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
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType_Cps()
	 * @model required="true"
	 * @generated
	 */
	CyberPhysicalSystem getCps();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationType#getCps <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' reference.
	 * @see #getCps()
	 * @generated
	 */
	void setCps(CyberPhysicalSystem value);

	/**
	 * Returns the value of the '<em><b>Zip File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip File</em>' attribute.
	 * @see #setZipFile(String)
	 * @see hu.bme.mit.inf.cps.CpsPackage#getApplicationType_ZipFile()
	 * @model
	 * @generated
	 */
	String getZipFile();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.cps.ApplicationType#getZipFile <em>Zip File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip File</em>' attribute.
	 * @see #getZipFile()
	 * @generated
	 */
	void setZipFile(String value);

} // ApplicationType
