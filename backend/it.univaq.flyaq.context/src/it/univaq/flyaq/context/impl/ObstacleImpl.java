/**
 */
package it.univaq.flyaq.context.impl;

import it.univaq.flyaq.context.ContextPackage;
import it.univaq.flyaq.context.Obstacle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.context.impl.ObstacleImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.impl.ObstacleImpl#getMaxHeight <em>Max Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObstacleImpl extends AreaImpl implements Obstacle {
	/**
	 * The default value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected float minHeight = MIN_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected float maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.OBSTACLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeight(float newMinHeight) {
		float oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.OBSTACLE__MIN_HEIGHT, oldMinHeight, minHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeight(float newMaxHeight) {
		float oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.OBSTACLE__MAX_HEIGHT, oldMaxHeight, maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.OBSTACLE__MIN_HEIGHT:
				return getMinHeight();
			case ContextPackage.OBSTACLE__MAX_HEIGHT:
				return getMaxHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextPackage.OBSTACLE__MIN_HEIGHT:
				setMinHeight((Float)newValue);
				return;
			case ContextPackage.OBSTACLE__MAX_HEIGHT:
				setMaxHeight((Float)newValue);
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
			case ContextPackage.OBSTACLE__MIN_HEIGHT:
				setMinHeight(MIN_HEIGHT_EDEFAULT);
				return;
			case ContextPackage.OBSTACLE__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
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
			case ContextPackage.OBSTACLE__MIN_HEIGHT:
				return minHeight != MIN_HEIGHT_EDEFAULT;
			case ContextPackage.OBSTACLE__MAX_HEIGHT:
				return maxHeight != MAX_HEIGHT_EDEFAULT;
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
		result.append(" (minHeight: ");
		result.append(minHeight);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(')');
		return result.toString();
	}

} //ObstacleImpl
