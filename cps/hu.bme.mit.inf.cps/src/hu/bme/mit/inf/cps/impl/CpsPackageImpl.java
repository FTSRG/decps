/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CpsFactory;
import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.Identifiable;
import hu.bme.mit.inf.cps.Request;
import hu.bme.mit.inf.cps.Requirement;
import hu.bme.mit.inf.cps.ResourceRequirement;
import hu.bme.mit.inf.cps.State;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpsPackageImpl extends EPackageImpl implements CpsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyberPhysicalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.cps.CpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CpsPackageImpl() {
		super(eNS_URI, CpsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CpsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CpsPackage init() {
		if (isInited) return (CpsPackage)EPackage.Registry.INSTANCE.getEPackage(CpsPackage.eNS_URI);

		// Obtain or create and register package
		CpsPackageImpl theCpsPackage = (CpsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CpsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CpsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCpsPackage.createPackageContents();

		// Initialize created meta-data
		theCpsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCpsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, theCpsPackage);
		return theCpsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyberPhysicalSystem() {
		return cyberPhysicalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCyberPhysicalSystem_ApplicationTypes() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCyberPhysicalSystem_HostTypes() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCyberPhysicalSystem_Requests() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCyberPhysicalSystem_DbUrl() {
		return (EAttribute)cyberPhysicalSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationType() {
		return applicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationType_Requirements() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationType_Instances() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationType_ExeFileUrl() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationType_ExeType() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationType_Cps() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationType_ZipFile() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostType() {
		return hostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostType_Instances() {
		return (EReference)hostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostType_DefaultCpu() {
		return (EAttribute)hostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostType_DefaultMemory() {
		return (EAttribute)hostTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostType_DefaultHdd() {
		return (EAttribute)hostTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostType_Cps() {
		return (EReference)hostTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirement() {
		return resourceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRequirement_RequiredCpu() {
		return (EAttribute)resourceRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRequirement_RequiredMemory() {
		return (EAttribute)resourceRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRequirement_HostType() {
		return (EReference)resourceRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRequirement_RequiredHdd() {
		return (EAttribute)resourceRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationInstance() {
		return applicationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationInstance_Type() {
		return (EReference)applicationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationInstance_AllocatedTo() {
		return (EReference)applicationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationInstance_CommunicatesWith() {
		return (EReference)applicationInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInstance_State() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInstance_DbUser() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInstance_DbPassword() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInstance_DbName() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationInstance_Args() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostInstance() {
		return hostInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostInstance_Type() {
		return (EReference)hostInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostInstance_Applications() {
		return (EReference)hostInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_AvailableCpu() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_AvailableMemory() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostInstance_CanCommunicateWith() {
		return (EReference)hostInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_AvailableHdd() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_TotalCpu() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_TotalMemory() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_TotalHdd() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInstance_NodeIp() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Requirements() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_User() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Password() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Dbname() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Type() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Instances() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Request() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Count() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Args() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpsFactory getCpsFactory() {
		return (CpsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cyberPhysicalSystemEClass = createEClass(CYBER_PHYSICAL_SYSTEM);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__HOST_TYPES);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__REQUESTS);
		createEAttribute(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__DB_URL);

		applicationTypeEClass = createEClass(APPLICATION_TYPE);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__REQUIREMENTS);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__INSTANCES);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__EXE_FILE_URL);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__EXE_TYPE);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__CPS);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__ZIP_FILE);

		hostTypeEClass = createEClass(HOST_TYPE);
		createEReference(hostTypeEClass, HOST_TYPE__INSTANCES);
		createEAttribute(hostTypeEClass, HOST_TYPE__DEFAULT_CPU);
		createEAttribute(hostTypeEClass, HOST_TYPE__DEFAULT_MEMORY);
		createEAttribute(hostTypeEClass, HOST_TYPE__DEFAULT_HDD);
		createEReference(hostTypeEClass, HOST_TYPE__CPS);

		resourceRequirementEClass = createEClass(RESOURCE_REQUIREMENT);
		createEAttribute(resourceRequirementEClass, RESOURCE_REQUIREMENT__REQUIRED_CPU);
		createEAttribute(resourceRequirementEClass, RESOURCE_REQUIREMENT__REQUIRED_MEMORY);
		createEReference(resourceRequirementEClass, RESOURCE_REQUIREMENT__HOST_TYPE);
		createEAttribute(resourceRequirementEClass, RESOURCE_REQUIREMENT__REQUIRED_HDD);

		applicationInstanceEClass = createEClass(APPLICATION_INSTANCE);
		createEReference(applicationInstanceEClass, APPLICATION_INSTANCE__TYPE);
		createEReference(applicationInstanceEClass, APPLICATION_INSTANCE__ALLOCATED_TO);
		createEReference(applicationInstanceEClass, APPLICATION_INSTANCE__COMMUNICATES_WITH);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__STATE);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__DB_USER);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__DB_PASSWORD);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__DB_NAME);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__ARGS);

		hostInstanceEClass = createEClass(HOST_INSTANCE);
		createEReference(hostInstanceEClass, HOST_INSTANCE__TYPE);
		createEReference(hostInstanceEClass, HOST_INSTANCE__APPLICATIONS);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__AVAILABLE_CPU);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__AVAILABLE_MEMORY);
		createEReference(hostInstanceEClass, HOST_INSTANCE__CAN_COMMUNICATE_WITH);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__AVAILABLE_HDD);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__TOTAL_CPU);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__TOTAL_MEMORY);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__TOTAL_HDD);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__NODE_IP);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__REQUIREMENTS);
		createEAttribute(requestEClass, REQUEST__USER);
		createEAttribute(requestEClass, REQUEST__PASSWORD);
		createEAttribute(requestEClass, REQUEST__DBNAME);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__TYPE);
		createEReference(requirementEClass, REQUIREMENT__INSTANCES);
		createEReference(requirementEClass, REQUIREMENT__REQUEST);
		createEAttribute(requirementEClass, REQUIREMENT__COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ARGS);

		// Create enums
		stateEEnum = createEEnum(STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationTypeEClass.getESuperTypes().add(this.getIdentifiable());
		hostTypeEClass.getESuperTypes().add(this.getIdentifiable());
		applicationInstanceEClass.getESuperTypes().add(this.getIdentifiable());
		hostInstanceEClass.getESuperTypes().add(this.getIdentifiable());
		requestEClass.getESuperTypes().add(this.getIdentifiable());
		requirementEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(cyberPhysicalSystemEClass, CyberPhysicalSystem.class, "CyberPhysicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCyberPhysicalSystem_ApplicationTypes(), this.getApplicationType(), null, "applicationTypes", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyberPhysicalSystem_HostTypes(), this.getHostType(), null, "hostTypes", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyberPhysicalSystem_Requests(), this.getRequest(), null, "requests", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCyberPhysicalSystem_DbUrl(), ecorePackage.getEString(), "dbUrl", null, 0, 1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationTypeEClass, ApplicationType.class, "ApplicationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationType_Requirements(), this.getResourceRequirement(), null, "requirements", null, 0, -1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Instances(), this.getApplicationInstance(), this.getApplicationInstance_Type(), "instances", null, 0, -1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationType_ExeFileUrl(), ecorePackage.getEString(), "exeFileUrl", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationType_ExeType(), ecorePackage.getEString(), "exeType", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Cps(), this.getCyberPhysicalSystem(), null, "cps", null, 1, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationType_ZipFile(), ecorePackage.getEString(), "zipFile", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostTypeEClass, HostType.class, "HostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostType_Instances(), this.getHostInstance(), this.getHostInstance_Type(), "instances", null, 0, -1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostType_DefaultCpu(), ecorePackage.getEInt(), "defaultCpu", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostType_DefaultMemory(), ecorePackage.getEInt(), "defaultMemory", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostType_DefaultHdd(), ecorePackage.getEInt(), "defaultHdd", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostType_Cps(), this.getCyberPhysicalSystem(), null, "cps", null, 1, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRequirementEClass, ResourceRequirement.class, "ResourceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRequirement_RequiredCpu(), ecorePackage.getEInt(), "requiredCpu", null, 0, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRequirement_RequiredMemory(), ecorePackage.getEInt(), "requiredMemory", null, 0, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRequirement_HostType(), this.getHostType(), null, "hostType", null, 1, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRequirement_RequiredHdd(), ecorePackage.getEInt(), "requiredHdd", null, 0, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationInstanceEClass, ApplicationInstance.class, "ApplicationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationInstance_Type(), this.getApplicationType(), this.getApplicationType_Instances(), "type", null, 1, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInstance_AllocatedTo(), this.getHostInstance(), this.getHostInstance_Applications(), "allocatedTo", null, 0, -1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInstance_CommunicatesWith(), this.getApplicationInstance(), null, "communicatesWith", null, 0, -1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_State(), this.getState(), "state", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_DbUser(), ecorePackage.getEString(), "dbUser", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_DbPassword(), ecorePackage.getEString(), "dbPassword", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_DbName(), ecorePackage.getEString(), "dbName", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_Args(), ecorePackage.getEString(), "args", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostInstanceEClass, HostInstance.class, "HostInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostInstance_Type(), this.getHostType(), this.getHostType_Instances(), "type", null, 1, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostInstance_Applications(), this.getApplicationInstance(), this.getApplicationInstance_AllocatedTo(), "applications", null, 0, -1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_AvailableCpu(), ecorePackage.getEInt(), "availableCpu", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_AvailableMemory(), ecorePackage.getEInt(), "availableMemory", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostInstance_CanCommunicateWith(), this.getHostInstance(), null, "canCommunicateWith", null, 0, -1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_AvailableHdd(), ecorePackage.getEInt(), "availableHdd", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_TotalCpu(), ecorePackage.getEInt(), "totalCpu", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_TotalMemory(), ecorePackage.getEInt(), "totalMemory", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_TotalHdd(), ecorePackage.getEInt(), "totalHdd", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_NodeIp(), ecorePackage.getEString(), "nodeIp", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Requirements(), this.getRequirement(), this.getRequirement_Request(), "requirements", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_User(), ecorePackage.getEString(), "user", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Password(), ecorePackage.getEString(), "password", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Dbname(), ecorePackage.getEString(), "dbname", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_Type(), this.getApplicationType(), null, "type", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Instances(), this.getApplicationInstance(), null, "instances", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Request(), this.getRequest(), this.getRequest_Requirements(), "request", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Count(), ecorePackage.getEInt(), "count", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Args(), ecorePackage.getEString(), "args", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.STOPPED);
		addEEnumLiteral(stateEEnum, State.RUNNING);
		addEEnumLiteral(stateEEnum, State.IN_MAINTENANCE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "org.eclipse.incquery.querybasedfeature"
		   });
	}

} //CpsPackageImpl
