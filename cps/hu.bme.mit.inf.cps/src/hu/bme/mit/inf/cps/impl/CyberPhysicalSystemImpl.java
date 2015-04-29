/**
 */
package hu.bme.mit.inf.cps.impl;

import hu.bme.mit.inf.cps.ApplicationInstance;
import hu.bme.mit.inf.cps.ApplicationType;
import hu.bme.mit.inf.cps.CpsPackage;
import hu.bme.mit.inf.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.cps.HostInstance;
import hu.bme.mit.inf.cps.HostType;
import hu.bme.mit.inf.cps.Request;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.incquery.querybasedfeatures.runtime.IQueryBasedFeatureHandler;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureKind;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl#getApplicationTypes <em>Application Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl#getHostTypes <em>Host Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link hu.bme.mit.inf.cps.impl.CyberPhysicalSystemImpl#getDbUrl <em>Db Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CyberPhysicalSystemImpl extends MinimalEObjectImpl.Container implements CyberPhysicalSystem {
	/**
	 * The cached value of the '{@link #getApplicationTypes() <em>Application Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationType> applicationTypes;

	/**
	 * The cached value of the '{@link #getHostTypes() <em>Host Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<HostType> hostTypes;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The default value of the '{@link #getDbUrl() <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUrl() <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUrl()
	 * @generated
	 * @ordered
	 */
	protected String dbUrl = DB_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationType> getApplicationTypes() {
		if (applicationTypes == null) {
			applicationTypes = new EObjectContainmentEList<ApplicationType>(ApplicationType.class, this, CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES);
		}
		return applicationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostType> getHostTypes() {
		if (hostTypes == null) {
			hostTypes = new EObjectContainmentEList<HostType>(HostType.class, this, CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES);
		}
		return hostTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<Request>(Request.class, this, CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbUrl() {
		return dbUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbUrl(String newDbUrl) {
		String oldDbUrl = dbUrl;
		dbUrl = newDbUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.CYBER_PHYSICAL_SYSTEM__DB_URL, oldDbUrl, dbUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
				return ((InternalEList<?>)getApplicationTypes()).basicRemove(otherEnd, msgs);
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return ((InternalEList<?>)getHostTypes()).basicRemove(otherEnd, msgs);
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
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
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
				return getApplicationTypes();
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return getHostTypes();
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				return getRequests();
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				return getDbUrl();
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
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
				getApplicationTypes().clear();
				getApplicationTypes().addAll((Collection<? extends ApplicationType>)newValue);
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				getHostTypes().clear();
				getHostTypes().addAll((Collection<? extends HostType>)newValue);
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				setDbUrl((String)newValue);
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
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
				getApplicationTypes().clear();
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				getHostTypes().clear();
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				getRequests().clear();
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				setDbUrl(DB_URL_EDEFAULT);
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
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
				return applicationTypes != null && !applicationTypes.isEmpty();
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return hostTypes != null && !hostTypes.isEmpty();
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				return requests != null && !requests.isEmpty();
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				return DB_URL_EDEFAULT == null ? dbUrl != null : !DB_URL_EDEFAULT.equals(dbUrl);
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
		result.append(" (dbUrl: ");
		result.append(dbUrl);
		result.append(')');
		return result.toString();
	}

} //CyberPhysicalSystemImpl
