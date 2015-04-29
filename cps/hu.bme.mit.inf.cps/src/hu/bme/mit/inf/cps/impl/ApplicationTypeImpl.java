/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.ResourceRequirement;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.incquery.querybasedfeatures.runtime.IQueryBasedFeatureHandler;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureKind;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getExeFileUrl <em>Exe File Url</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getExeType <em>Exe Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getCps <em>Cps</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.ApplicationTypeImpl#getZipFile <em>Zip File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationTypeImpl extends MinimalEObjectImpl.Container implements ApplicationType {
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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRequirement> requirements;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> instances;

	/**
	 * The default value of the '{@link #getExeFileUrl() <em>Exe File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeFileUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String EXE_FILE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExeFileUrl() <em>Exe File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeFileUrl()
	 * @generated
	 * @ordered
	 */
	protected String exeFileUrl = EXE_FILE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExeType() <em>Exe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExeType() <em>Exe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeType()
	 * @generated
	 * @ordered
	 */
	protected String exeType = EXE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCps() <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCps()
	 * @generated
	 * @ordered
	 */
	protected CyberPhysicalSystem cps;

	/**
	 * The default value of the '{@link #getZipFile() <em>Zip File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipFile() <em>Zip File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipFile()
	 * @generated
	 * @ordered
	 */
	protected String zipFile = ZIP_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.APPLICATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRequirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<ResourceRequirement>(ResourceRequirement.class, this, CpsPackage.APPLICATION_TYPE__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList<ApplicationInstance>(ApplicationInstance.class, this, CpsPackage.APPLICATION_TYPE__INSTANCES, CpsPackage.APPLICATION_INSTANCE__TYPE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExeFileUrl() {
		return exeFileUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExeFileUrl(String newExeFileUrl) {
		String oldExeFileUrl = exeFileUrl;
		exeFileUrl = newExeFileUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_TYPE__EXE_FILE_URL, oldExeFileUrl, exeFileUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExeType() {
		return exeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExeType(String newExeType) {
		String oldExeType = exeType;
		exeType = newExeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_TYPE__EXE_TYPE, oldExeType, exeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem getCps() {
		if (cps != null && cps.eIsProxy()) {
			InternalEObject oldCps = (InternalEObject)cps;
			cps = (CyberPhysicalSystem)eResolveProxy(oldCps);
			if (cps != oldCps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsPackage.APPLICATION_TYPE__CPS, oldCps, cps));
			}
		}
		return cps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem basicGetCpsGen() {
		return cps;
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
			case CpsPackage.APPLICATION_TYPE__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
			case CpsPackage.APPLICATION_TYPE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case CpsPackage.APPLICATION_TYPE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpsPackage.APPLICATION_TYPE__ID:
				return getId();
			case CpsPackage.APPLICATION_TYPE__REQUIREMENTS:
				return getRequirements();
			case CpsPackage.APPLICATION_TYPE__INSTANCES:
				return getInstances();
			case CpsPackage.APPLICATION_TYPE__EXE_FILE_URL:
				return getExeFileUrl();
			case CpsPackage.APPLICATION_TYPE__EXE_TYPE:
				return getExeType();
			case CpsPackage.APPLICATION_TYPE__CPS:
				if (resolve) return getCps();
				return basicGetCps();
			case CpsPackage.APPLICATION_TYPE__ZIP_FILE:
				return getZipFile();
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
			case CpsPackage.APPLICATION_TYPE__ID:
				setId((String)newValue);
				return;
			case CpsPackage.APPLICATION_TYPE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ResourceRequirement>)newValue);
				return;
			case CpsPackage.APPLICATION_TYPE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CpsPackage.APPLICATION_TYPE__EXE_FILE_URL:
				setExeFileUrl((String)newValue);
				return;
			case CpsPackage.APPLICATION_TYPE__EXE_TYPE:
				setExeType((String)newValue);
				return;
			case CpsPackage.APPLICATION_TYPE__CPS:
				setCps((CyberPhysicalSystem)newValue);
				return;
			case CpsPackage.APPLICATION_TYPE__ZIP_FILE:
				setZipFile((String)newValue);
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
			case CpsPackage.APPLICATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_TYPE__REQUIREMENTS:
				getRequirements().clear();
				return;
			case CpsPackage.APPLICATION_TYPE__INSTANCES:
				getInstances().clear();
				return;
			case CpsPackage.APPLICATION_TYPE__EXE_FILE_URL:
				setExeFileUrl(EXE_FILE_URL_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_TYPE__EXE_TYPE:
				setExeType(EXE_TYPE_EDEFAULT);
				return;
			case CpsPackage.APPLICATION_TYPE__CPS:
				setCps((CyberPhysicalSystem)null);
				return;
			case CpsPackage.APPLICATION_TYPE__ZIP_FILE:
				setZipFile(ZIP_FILE_EDEFAULT);
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
			case CpsPackage.APPLICATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CpsPackage.APPLICATION_TYPE__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case CpsPackage.APPLICATION_TYPE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case CpsPackage.APPLICATION_TYPE__EXE_FILE_URL:
				return EXE_FILE_URL_EDEFAULT == null ? exeFileUrl != null : !EXE_FILE_URL_EDEFAULT.equals(exeFileUrl);
			case CpsPackage.APPLICATION_TYPE__EXE_TYPE:
				return EXE_TYPE_EDEFAULT == null ? exeType != null : !EXE_TYPE_EDEFAULT.equals(exeType);
			case CpsPackage.APPLICATION_TYPE__CPS:
				return cps != null;
			case CpsPackage.APPLICATION_TYPE__ZIP_FILE:
				return ZIP_FILE_EDEFAULT == null ? zipFile != null : !ZIP_FILE_EDEFAULT.equals(zipFile);
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
		result.append(", exeFileUrl: ");
		result.append(exeFileUrl);
		result.append(", exeType: ");
		result.append(exeType);
		result.append(", zipFile: ");
		result.append(zipFile);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipFile() {
		return zipFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipFile(String newZipFile) {
		String oldZipFile = zipFile;
		zipFile = newZipFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_TYPE__ZIP_FILE, oldZipFile, zipFile));
	}

	/**
	 * EMF-IncQuery handler for query-based feature cps
	 */
	private IQueryBasedFeatureHandler cpsHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature cps
	 */
	public CyberPhysicalSystem basicGetCps() {
		if (cpsHandler == null) {
			cpsHandler = QueryBasedFeatureHelper.getQueryBasedFeatureHandler(
					this, CpsPackageImpl.Literals.APPLICATION_TYPE__CPS,
					"hu.bme.mit.inf.cps.patterns.appCps", "app", "model",
					QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (hu.bme.mit.inf.cps.CyberPhysicalSystem) cpsHandler
				.getSingleReferenceValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCps(CyberPhysicalSystem newCps) {
		CyberPhysicalSystem oldCps = cps;
		cps = newCps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_TYPE__CPS, oldCps, cps));
	}

} //ApplicationTypeImpl
