/**
 */
package it.univaq.flyaq.context.impl;

import it.univaq.flyaq.context.Area;
import it.univaq.flyaq.context.ContextPackage;
import it.univaq.flyaq.context.Coordinate;

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
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.context.impl.AreaImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.impl.AreaImpl#getSafetyDistance <em>Safety Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AreaImpl extends NamedElementImpl implements Area {
	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordinate> shell;

	/**
	 * The default value of the '{@link #getSafetyDistance() <em>Safety Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float SAFETY_DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSafetyDistance() <em>Safety Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDistance()
	 * @generated
	 * @ordered
	 */
	protected float safetyDistance = SAFETY_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coordinate> getShell() {
		if (shell == null) {
			shell = new EObjectContainmentEList<Coordinate>(Coordinate.class, this, ContextPackage.AREA__SHELL);
		}
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSafetyDistance() {
		return safetyDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetyDistance(float newSafetyDistance) {
		float oldSafetyDistance = safetyDistance;
		safetyDistance = newSafetyDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.AREA__SAFETY_DISTANCE, oldSafetyDistance, safetyDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.AREA__SHELL:
				return ((InternalEList<?>)getShell()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.AREA__SHELL:
				return getShell();
			case ContextPackage.AREA__SAFETY_DISTANCE:
				return getSafetyDistance();
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
			case ContextPackage.AREA__SHELL:
				getShell().clear();
				getShell().addAll((Collection<? extends Coordinate>)newValue);
				return;
			case ContextPackage.AREA__SAFETY_DISTANCE:
				setSafetyDistance((Float)newValue);
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
			case ContextPackage.AREA__SHELL:
				getShell().clear();
				return;
			case ContextPackage.AREA__SAFETY_DISTANCE:
				setSafetyDistance(SAFETY_DISTANCE_EDEFAULT);
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
			case ContextPackage.AREA__SHELL:
				return shell != null && !shell.isEmpty();
			case ContextPackage.AREA__SAFETY_DISTANCE:
				return safetyDistance != SAFETY_DISTANCE_EDEFAULT;
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
		result.append(" (safetyDistance: ");
		result.append(safetyDistance);
		result.append(')');
		return result.toString();
	}

} //AreaImpl
