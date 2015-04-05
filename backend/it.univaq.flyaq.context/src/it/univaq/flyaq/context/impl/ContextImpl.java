/**
 */
package it.univaq.flyaq.context.impl;

import it.univaq.flyaq.context.Area;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.context.ContextPackage;
import it.univaq.flyaq.context.Obstacle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.context.impl.ContextImpl#getCrs <em>Crs</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.impl.ContextImpl#getNoFlyAreas <em>No Fly Areas</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.impl.ContextImpl#getObstacles <em>Obstacles</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.impl.ContextImpl#getEmergencyAreas <em>Emergency Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends NamedElementImpl implements Context {
	/**
	 * The default value of the '{@link #getCrs() <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected static final String CRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrs() <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected String crs = CRS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoFlyAreas() <em>No Fly Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoFlyAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> noFlyAreas;

	/**
	 * The cached value of the '{@link #getObstacles() <em>Obstacles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstacles()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstacle> obstacles;

	/**
	 * The cached value of the '{@link #getEmergencyAreas() <em>Emergency Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> emergencyAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrs() {
		return crs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrs(String newCrs) {
		String oldCrs = crs;
		crs = newCrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT__CRS, oldCrs, crs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getNoFlyAreas() {
		if (noFlyAreas == null) {
			noFlyAreas = new EObjectContainmentEList<Area>(Area.class, this, ContextPackage.CONTEXT__NO_FLY_AREAS);
		}
		return noFlyAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstacle> getObstacles() {
		if (obstacles == null) {
			obstacles = new EObjectContainmentEList<Obstacle>(Obstacle.class, this, ContextPackage.CONTEXT__OBSTACLES);
		}
		return obstacles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getEmergencyAreas() {
		if (emergencyAreas == null) {
			emergencyAreas = new EObjectContainmentEList<Area>(Area.class, this, ContextPackage.CONTEXT__EMERGENCY_AREAS);
		}
		return emergencyAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.CONTEXT__NO_FLY_AREAS:
				return ((InternalEList<?>)getNoFlyAreas()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT__OBSTACLES:
				return ((InternalEList<?>)getObstacles()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT__EMERGENCY_AREAS:
				return ((InternalEList<?>)getEmergencyAreas()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.CONTEXT__CRS:
				return getCrs();
			case ContextPackage.CONTEXT__NO_FLY_AREAS:
				return getNoFlyAreas();
			case ContextPackage.CONTEXT__OBSTACLES:
				return getObstacles();
			case ContextPackage.CONTEXT__EMERGENCY_AREAS:
				return getEmergencyAreas();
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
			case ContextPackage.CONTEXT__CRS:
				setCrs((String)newValue);
				return;
			case ContextPackage.CONTEXT__NO_FLY_AREAS:
				getNoFlyAreas().clear();
				getNoFlyAreas().addAll((Collection<? extends Area>)newValue);
				return;
			case ContextPackage.CONTEXT__OBSTACLES:
				getObstacles().clear();
				getObstacles().addAll((Collection<? extends Obstacle>)newValue);
				return;
			case ContextPackage.CONTEXT__EMERGENCY_AREAS:
				getEmergencyAreas().clear();
				getEmergencyAreas().addAll((Collection<? extends Area>)newValue);
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
			case ContextPackage.CONTEXT__CRS:
				setCrs(CRS_EDEFAULT);
				return;
			case ContextPackage.CONTEXT__NO_FLY_AREAS:
				getNoFlyAreas().clear();
				return;
			case ContextPackage.CONTEXT__OBSTACLES:
				getObstacles().clear();
				return;
			case ContextPackage.CONTEXT__EMERGENCY_AREAS:
				getEmergencyAreas().clear();
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
			case ContextPackage.CONTEXT__CRS:
				return CRS_EDEFAULT == null ? crs != null : !CRS_EDEFAULT.equals(crs);
			case ContextPackage.CONTEXT__NO_FLY_AREAS:
				return noFlyAreas != null && !noFlyAreas.isEmpty();
			case ContextPackage.CONTEXT__OBSTACLES:
				return obstacles != null && !obstacles.isEmpty();
			case ContextPackage.CONTEXT__EMERGENCY_AREAS:
				return emergencyAreas != null && !emergencyAreas.isEmpty();
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
		result.append(" (crs: ");
		result.append(crs);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
