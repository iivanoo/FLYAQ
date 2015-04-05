/**
 */
package it.univaq.flyaq.drone.impl;

import it.univaq.flyaq.drone.DronePackage;
import it.univaq.flyaq.drone.Size;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.impl.SizeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.SizeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.SizeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.SizeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.SizeImpl#getPropellers <em>Propellers</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.SizeImpl#getPropellerSize <em>Propeller Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeImpl extends MinimalEObjectImpl.Container implements Size {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected float weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropellers() <em>Propellers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropellers()
	 * @generated
	 * @ordered
	 */
	protected static final int PROPELLERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPropellers() <em>Propellers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropellers()
	 * @generated
	 * @ordered
	 */
	protected int propellers = PROPELLERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropellerSize() <em>Propeller Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropellerSize()
	 * @generated
	 * @ordered
	 */
	protected static final float PROPELLER_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPropellerSize() <em>Propeller Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropellerSize()
	 * @generated
	 * @ordered
	 */
	protected float propellerSize = PROPELLER_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronePackage.Literals.SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(float newWeight) {
		float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPropellers() {
		return propellers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropellers(int newPropellers) {
		int oldPropellers = propellers;
		propellers = newPropellers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__PROPELLERS, oldPropellers, propellers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPropellerSize() {
		return propellerSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropellerSize(float newPropellerSize) {
		float oldPropellerSize = propellerSize;
		propellerSize = newPropellerSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__PROPELLER_SIZE, oldPropellerSize, propellerSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronePackage.SIZE__WIDTH:
				return getWidth();
			case DronePackage.SIZE__LENGTH:
				return getLength();
			case DronePackage.SIZE__HEIGHT:
				return getHeight();
			case DronePackage.SIZE__WEIGHT:
				return getWeight();
			case DronePackage.SIZE__PROPELLERS:
				return getPropellers();
			case DronePackage.SIZE__PROPELLER_SIZE:
				return getPropellerSize();
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
			case DronePackage.SIZE__WIDTH:
				setWidth((Float)newValue);
				return;
			case DronePackage.SIZE__LENGTH:
				setLength((Float)newValue);
				return;
			case DronePackage.SIZE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case DronePackage.SIZE__WEIGHT:
				setWeight((Float)newValue);
				return;
			case DronePackage.SIZE__PROPELLERS:
				setPropellers((Integer)newValue);
				return;
			case DronePackage.SIZE__PROPELLER_SIZE:
				setPropellerSize((Float)newValue);
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
			case DronePackage.SIZE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DronePackage.SIZE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DronePackage.SIZE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DronePackage.SIZE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case DronePackage.SIZE__PROPELLERS:
				setPropellers(PROPELLERS_EDEFAULT);
				return;
			case DronePackage.SIZE__PROPELLER_SIZE:
				setPropellerSize(PROPELLER_SIZE_EDEFAULT);
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
			case DronePackage.SIZE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case DronePackage.SIZE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DronePackage.SIZE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case DronePackage.SIZE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case DronePackage.SIZE__PROPELLERS:
				return propellers != PROPELLERS_EDEFAULT;
			case DronePackage.SIZE__PROPELLER_SIZE:
				return propellerSize != PROPELLER_SIZE_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", length: ");
		result.append(length);
		result.append(", height: ");
		result.append(height);
		result.append(", weight: ");
		result.append(weight);
		result.append(", propellers: ");
		result.append(propellers);
		result.append(", propellerSize: ");
		result.append(propellerSize);
		result.append(')');
		return result.toString();
	}

} //SizeImpl
