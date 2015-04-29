/**
 */
package hu.bme.mit.inf.cps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.cps.CpsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface CpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cps/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpsPackage eINSTANCE = hu.bme.mit.inf.cps.impl.CpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl <em>Cyber Physical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getCyberPhysicalSystem()
	 * @generated
	 */
	int CYBER_PHYSICAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Application Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Host Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__HOST_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__REQUESTS = 2;

	/**
	 * The feature id for the '<em><b>Db Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__DB_URL = 3;

	/**
	 * The number of structural features of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.Identifiable
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl <em>Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.ApplicationTypeImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__REQUIREMENTS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__INSTANCES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exe File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__EXE_FILE_URL = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__EXE_TYPE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__CPS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Zip File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__ZIP_FILE = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.HostTypeImpl <em>Host Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.HostTypeImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getHostType()
	 * @generated
	 */
	int HOST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__INSTANCES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__DEFAULT_CPU = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__DEFAULT_MEMORY = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__DEFAULT_HDD = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__CPS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.ResourceRequirementImpl <em>Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.ResourceRequirementImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getResourceRequirement()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Required Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__REQUIRED_CPU = 0;

	/**
	 * The feature id for the '<em><b>Required Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__REQUIRED_MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Host Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__HOST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Required Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__REQUIRED_HDD = 3;

	/**
	 * The number of structural features of the '<em>Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl <em>Application Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getApplicationInstance()
	 * @generated
	 */
	int APPLICATION_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__ALLOCATED_TO = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communicates With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__COMMUNICATES_WITH = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__STATE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Db User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__DB_USER = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__DB_PASSWORD = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Db Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__DB_NAME = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Application Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Application Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl <em>Host Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.HostInstanceImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getHostInstance()
	 * @generated
	 */
	int HOST_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__APPLICATIONS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__AVAILABLE_CPU = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__AVAILABLE_MEMORY = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Can Communicate With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__CAN_COMMUNICATE_WITH = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Available Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__AVAILABLE_HDD = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Total Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__TOTAL_CPU = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Total Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__TOTAL_MEMORY = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Total Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__TOTAL_HDD = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Node Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__NODE_IP = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.RequestImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUIREMENTS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__USER = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PASSWORD = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dbname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DBNAME = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.impl.RequirementImpl
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__INSTANCES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUEST = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.cps.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.cps.State
	 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 9;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.CyberPhysicalSystem <em>Cyber Physical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyber Physical System</em>'.
	 * @see hu.bme.mit.inf.cps.CyberPhysicalSystem
	 * @generated
	 */
	EClass getCyberPhysicalSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getApplicationTypes <em>Application Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Types</em>'.
	 * @see hu.bme.mit.inf.cps.CyberPhysicalSystem#getApplicationTypes()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_ApplicationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Types</em>'.
	 * @see hu.bme.mit.inf.cps.CyberPhysicalSystem#getHostTypes()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_HostTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requests</em>'.
	 * @see hu.bme.mit.inf.cps.CyberPhysicalSystem#getRequests()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_Requests();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.CyberPhysicalSystem#getDbUrl <em>Db Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Url</em>'.
	 * @see hu.bme.mit.inf.cps.CyberPhysicalSystem#getDbUrl()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EAttribute getCyberPhysicalSystem_DbUrl();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Type</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType
	 * @generated
	 */
	EClass getApplicationType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.ApplicationType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType#getRequirements()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.ApplicationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType#getInstances()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Instances();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationType#getExeFileUrl <em>Exe File Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe File Url</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType#getExeFileUrl()
	 * @see #getApplicationType()
	 * @generated
	 */
	EAttribute getApplicationType_ExeFileUrl();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationType#getExeType <em>Exe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe Type</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType#getExeType()
	 * @see #getApplicationType()
	 * @generated
	 */
	EAttribute getApplicationType_ExeType();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.cps.ApplicationType#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType#getCps()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Cps();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationType#getZipFile <em>Zip File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip File</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationType#getZipFile()
	 * @see #getApplicationType()
	 * @generated
	 */
	EAttribute getApplicationType_ZipFile();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.HostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Type</em>'.
	 * @see hu.bme.mit.inf.cps.HostType
	 * @generated
	 */
	EClass getHostType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.HostType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see hu.bme.mit.inf.cps.HostType#getInstances()
	 * @see #getHostType()
	 * @generated
	 */
	EReference getHostType_Instances();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostType#getDefaultCpu <em>Default Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cpu</em>'.
	 * @see hu.bme.mit.inf.cps.HostType#getDefaultCpu()
	 * @see #getHostType()
	 * @generated
	 */
	EAttribute getHostType_DefaultCpu();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostType#getDefaultMemory <em>Default Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Memory</em>'.
	 * @see hu.bme.mit.inf.cps.HostType#getDefaultMemory()
	 * @see #getHostType()
	 * @generated
	 */
	EAttribute getHostType_DefaultMemory();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostType#getDefaultHdd <em>Default Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Hdd</em>'.
	 * @see hu.bme.mit.inf.cps.HostType#getDefaultHdd()
	 * @see #getHostType()
	 * @generated
	 */
	EAttribute getHostType_DefaultHdd();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.cps.HostType#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps</em>'.
	 * @see hu.bme.mit.inf.cps.HostType#getCps()
	 * @see #getHostType()
	 * @generated
	 */
	EReference getHostType_Cps();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.ResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement</em>'.
	 * @see hu.bme.mit.inf.cps.ResourceRequirement
	 * @generated
	 */
	EClass getResourceRequirement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ResourceRequirement#getRequiredCpu <em>Required Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Cpu</em>'.
	 * @see hu.bme.mit.inf.cps.ResourceRequirement#getRequiredCpu()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EAttribute getResourceRequirement_RequiredCpu();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ResourceRequirement#getRequiredMemory <em>Required Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Memory</em>'.
	 * @see hu.bme.mit.inf.cps.ResourceRequirement#getRequiredMemory()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EAttribute getResourceRequirement_RequiredMemory();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.cps.ResourceRequirement#getHostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host Type</em>'.
	 * @see hu.bme.mit.inf.cps.ResourceRequirement#getHostType()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EReference getResourceRequirement_HostType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Hdd</em>'.
	 * @see hu.bme.mit.inf.cps.ResourceRequirement#getRequiredHdd()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EAttribute getResourceRequirement_RequiredHdd();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.ApplicationInstance <em>Application Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Instance</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance
	 * @generated
	 */
	EClass getApplicationInstance();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.cps.ApplicationInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getType()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EReference getApplicationInstance_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated To</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getAllocatedTo()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EReference getApplicationInstance_AllocatedTo();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.cps.ApplicationInstance#getCommunicatesWith <em>Communicates With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicates With</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getCommunicatesWith()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EReference getApplicationInstance_CommunicatesWith();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getState()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EAttribute getApplicationInstance_State();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbUser <em>Db User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db User</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getDbUser()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EAttribute getApplicationInstance_DbUser();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getDbPassword()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EAttribute getApplicationInstance_DbPassword();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.ApplicationInstance#getDbName <em>Db Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Name</em>'.
	 * @see hu.bme.mit.inf.cps.ApplicationInstance#getDbName()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EAttribute getApplicationInstance_DbName();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.HostInstance <em>Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Instance</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance
	 * @generated
	 */
	EClass getHostInstance();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.cps.HostInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getType()
	 * @see #getHostInstance()
	 * @generated
	 */
	EReference getHostInstance_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.cps.HostInstance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getApplications()
	 * @see #getHostInstance()
	 * @generated
	 */
	EReference getHostInstance_Applications();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getAvailableCpu <em>Available Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Cpu</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getAvailableCpu()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_AvailableCpu();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getAvailableMemory <em>Available Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Memory</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getAvailableMemory()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_AvailableMemory();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.cps.HostInstance#getCanCommunicateWith <em>Can Communicate With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Communicate With</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getCanCommunicateWith()
	 * @see #getHostInstance()
	 * @generated
	 */
	EReference getHostInstance_CanCommunicateWith();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getAvailableHdd <em>Available Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Hdd</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getAvailableHdd()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_AvailableHdd();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getTotalCpu <em>Total Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cpu</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getTotalCpu()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_TotalCpu();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getTotalMemory <em>Total Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Memory</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getTotalMemory()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_TotalMemory();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getTotalHdd <em>Total Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Hdd</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getTotalHdd()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_TotalHdd();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.HostInstance#getNodeIp <em>Node Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Ip</em>'.
	 * @see hu.bme.mit.inf.cps.HostInstance#getNodeIp()
	 * @see #getHostInstance()
	 * @generated
	 */
	EAttribute getHostInstance_NodeIp();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see hu.bme.mit.inf.cps.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.inf.cps.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see hu.bme.mit.inf.cps.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.cps.Request#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see hu.bme.mit.inf.cps.Request#getRequirements()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Requirements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.Request#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see hu.bme.mit.inf.cps.Request#getUser()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_User();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.Request#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see hu.bme.mit.inf.cps.Request#getPassword()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Password();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.Request#getDbname <em>Dbname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbname</em>'.
	 * @see hu.bme.mit.inf.cps.Request#getDbname()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Dbname();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.cps.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see hu.bme.mit.inf.cps.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.cps.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.cps.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.cps.Requirement#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see hu.bme.mit.inf.cps.Requirement#getInstances()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Instances();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.cps.Requirement#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Request</em>'.
	 * @see hu.bme.mit.inf.cps.Requirement#getRequest()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Request();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.cps.Requirement#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see hu.bme.mit.inf.cps.Requirement#getCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Count();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.cps.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see hu.bme.mit.inf.cps.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpsFactory getCpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl <em>Cyber Physical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getCyberPhysicalSystem()
		 * @generated
		 */
		EClass CYBER_PHYSICAL_SYSTEM = eINSTANCE.getCyberPhysicalSystem();

		/**
		 * The meta object literal for the '<em><b>Application Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES = eINSTANCE.getCyberPhysicalSystem_ApplicationTypes();

		/**
		 * The meta object literal for the '<em><b>Host Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__HOST_TYPES = eINSTANCE.getCyberPhysicalSystem_HostTypes();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__REQUESTS = eINSTANCE.getCyberPhysicalSystem_Requests();

		/**
		 * The meta object literal for the '<em><b>Db Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYBER_PHYSICAL_SYSTEM__DB_URL = eINSTANCE.getCyberPhysicalSystem_DbUrl();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl <em>Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.ApplicationTypeImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getApplicationType()
		 * @generated
		 */
		EClass APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__REQUIREMENTS = eINSTANCE.getApplicationType_Requirements();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__INSTANCES = eINSTANCE.getApplicationType_Instances();

		/**
		 * The meta object literal for the '<em><b>Exe File Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_TYPE__EXE_FILE_URL = eINSTANCE.getApplicationType_ExeFileUrl();

		/**
		 * The meta object literal for the '<em><b>Exe Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_TYPE__EXE_TYPE = eINSTANCE.getApplicationType_ExeType();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__CPS = eINSTANCE.getApplicationType_Cps();

		/**
		 * The meta object literal for the '<em><b>Zip File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_TYPE__ZIP_FILE = eINSTANCE.getApplicationType_ZipFile();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.HostTypeImpl <em>Host Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.HostTypeImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getHostType()
		 * @generated
		 */
		EClass HOST_TYPE = eINSTANCE.getHostType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_TYPE__INSTANCES = eINSTANCE.getHostType_Instances();

		/**
		 * The meta object literal for the '<em><b>Default Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_TYPE__DEFAULT_CPU = eINSTANCE.getHostType_DefaultCpu();

		/**
		 * The meta object literal for the '<em><b>Default Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_TYPE__DEFAULT_MEMORY = eINSTANCE.getHostType_DefaultMemory();

		/**
		 * The meta object literal for the '<em><b>Default Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_TYPE__DEFAULT_HDD = eINSTANCE.getHostType_DefaultHdd();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_TYPE__CPS = eINSTANCE.getHostType_Cps();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.ResourceRequirementImpl <em>Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.ResourceRequirementImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getResourceRequirement()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT = eINSTANCE.getResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT__REQUIRED_CPU = eINSTANCE.getResourceRequirement_RequiredCpu();

		/**
		 * The meta object literal for the '<em><b>Required Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT__REQUIRED_MEMORY = eINSTANCE.getResourceRequirement_RequiredMemory();

		/**
		 * The meta object literal for the '<em><b>Host Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIREMENT__HOST_TYPE = eINSTANCE.getResourceRequirement_HostType();

		/**
		 * The meta object literal for the '<em><b>Required Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT__REQUIRED_HDD = eINSTANCE.getResourceRequirement_RequiredHdd();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl <em>Application Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.ApplicationInstanceImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getApplicationInstance()
		 * @generated
		 */
		EClass APPLICATION_INSTANCE = eINSTANCE.getApplicationInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INSTANCE__TYPE = eINSTANCE.getApplicationInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INSTANCE__ALLOCATED_TO = eINSTANCE.getApplicationInstance_AllocatedTo();

		/**
		 * The meta object literal for the '<em><b>Communicates With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INSTANCE__COMMUNICATES_WITH = eINSTANCE.getApplicationInstance_CommunicatesWith();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INSTANCE__STATE = eINSTANCE.getApplicationInstance_State();

		/**
		 * The meta object literal for the '<em><b>Db User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INSTANCE__DB_USER = eINSTANCE.getApplicationInstance_DbUser();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INSTANCE__DB_PASSWORD = eINSTANCE.getApplicationInstance_DbPassword();

		/**
		 * The meta object literal for the '<em><b>Db Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_INSTANCE__DB_NAME = eINSTANCE.getApplicationInstance_DbName();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.HostInstanceImpl <em>Host Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.HostInstanceImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getHostInstance()
		 * @generated
		 */
		EClass HOST_INSTANCE = eINSTANCE.getHostInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_INSTANCE__TYPE = eINSTANCE.getHostInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_INSTANCE__APPLICATIONS = eINSTANCE.getHostInstance_Applications();

		/**
		 * The meta object literal for the '<em><b>Available Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__AVAILABLE_CPU = eINSTANCE.getHostInstance_AvailableCpu();

		/**
		 * The meta object literal for the '<em><b>Available Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__AVAILABLE_MEMORY = eINSTANCE.getHostInstance_AvailableMemory();

		/**
		 * The meta object literal for the '<em><b>Can Communicate With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_INSTANCE__CAN_COMMUNICATE_WITH = eINSTANCE.getHostInstance_CanCommunicateWith();

		/**
		 * The meta object literal for the '<em><b>Available Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__AVAILABLE_HDD = eINSTANCE.getHostInstance_AvailableHdd();

		/**
		 * The meta object literal for the '<em><b>Total Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__TOTAL_CPU = eINSTANCE.getHostInstance_TotalCpu();

		/**
		 * The meta object literal for the '<em><b>Total Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__TOTAL_MEMORY = eINSTANCE.getHostInstance_TotalMemory();

		/**
		 * The meta object literal for the '<em><b>Total Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__TOTAL_HDD = eINSTANCE.getHostInstance_TotalHdd();

		/**
		 * The meta object literal for the '<em><b>Node Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INSTANCE__NODE_IP = eINSTANCE.getHostInstance_NodeIp();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.Identifiable
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.RequestImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__REQUIREMENTS = eINSTANCE.getRequest_Requirements();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__USER = eINSTANCE.getRequest_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__PASSWORD = eINSTANCE.getRequest_Password();

		/**
		 * The meta object literal for the '<em><b>Dbname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__DBNAME = eINSTANCE.getRequest_Dbname();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.impl.RequirementImpl
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__INSTANCES = eINSTANCE.getRequirement_Instances();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUEST = eINSTANCE.getRequirement_Request();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__COUNT = eINSTANCE.getRequirement_Count();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.cps.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.cps.State
		 * @see hu.bme.mit.inf.cps.impl.CpsPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

	}

} //CpsPackage
