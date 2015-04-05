/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.BehaviourPackage;
import it.univaq.flyaq.behaviour.Circle;
import it.univaq.flyaq.behaviour.Coordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.CircleImpl#getTargetPosition <em>Target Position</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.CircleImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.CircleImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.CircleImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.CircleImpl#isClockwise <em>Clockwise</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircleImpl extends MoveImpl implements Circle {
	/**
	 * The cached value of the '{@link #getTargetPosition() <em>Target Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPosition()
	 * @generated
	 * @ordered
	 */
	protected Coordinate targetPosition;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final float RADIUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected float radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final float ALTITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected float altitude = ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isClockwise() <em>Clockwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockwise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOCKWISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClockwise() <em>Clockwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockwise()
	 * @generated
	 * @ordered
	 */
	protected boolean clockwise = CLOCKWISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CIRCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getTargetPosition() {
		return targetPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPosition(Coordinate newTargetPosition, NotificationChain msgs) {
		Coordinate oldTargetPosition = targetPosition;
		targetPosition = newTargetPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.CIRCLE__TARGET_POSITION, oldTargetPosition, newTargetPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPosition(Coordinate newTargetPosition) {
		if (newTargetPosition != targetPosition) {
			NotificationChain msgs = null;
			if (targetPosition != null)
				msgs = ((InternalEObject)targetPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CIRCLE__TARGET_POSITION, null, msgs);
			if (newTargetPosition != null)
				msgs = ((InternalEObject)newTargetPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CIRCLE__TARGET_POSITION, null, msgs);
			msgs = basicSetTargetPosition(newTargetPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CIRCLE__TARGET_POSITION, newTargetPosition, newTargetPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CIRCLE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(float newRadius) {
		float oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CIRCLE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(float newAltitude) {
		float oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CIRCLE__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClockwise() {
		return clockwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockwise(boolean newClockwise) {
		boolean oldClockwise = clockwise;
		clockwise = newClockwise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CIRCLE__CLOCKWISE, oldClockwise, clockwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.CIRCLE__TARGET_POSITION:
				return basicSetTargetPosition(null, msgs);
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
			case BehaviourPackage.CIRCLE__TARGET_POSITION:
				return getTargetPosition();
			case BehaviourPackage.CIRCLE__DURATION:
				return getDuration();
			case BehaviourPackage.CIRCLE__RADIUS:
				return getRadius();
			case BehaviourPackage.CIRCLE__ALTITUDE:
				return getAltitude();
			case BehaviourPackage.CIRCLE__CLOCKWISE:
				return isClockwise();
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
			case BehaviourPackage.CIRCLE__TARGET_POSITION:
				setTargetPosition((Coordinate)newValue);
				return;
			case BehaviourPackage.CIRCLE__DURATION:
				setDuration((Float)newValue);
				return;
			case BehaviourPackage.CIRCLE__RADIUS:
				setRadius((Float)newValue);
				return;
			case BehaviourPackage.CIRCLE__ALTITUDE:
				setAltitude((Float)newValue);
				return;
			case BehaviourPackage.CIRCLE__CLOCKWISE:
				setClockwise((Boolean)newValue);
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
			case BehaviourPackage.CIRCLE__TARGET_POSITION:
				setTargetPosition((Coordinate)null);
				return;
			case BehaviourPackage.CIRCLE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case BehaviourPackage.CIRCLE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case BehaviourPackage.CIRCLE__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case BehaviourPackage.CIRCLE__CLOCKWISE:
				setClockwise(CLOCKWISE_EDEFAULT);
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
			case BehaviourPackage.CIRCLE__TARGET_POSITION:
				return targetPosition != null;
			case BehaviourPackage.CIRCLE__DURATION:
				return duration != DURATION_EDEFAULT;
			case BehaviourPackage.CIRCLE__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case BehaviourPackage.CIRCLE__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case BehaviourPackage.CIRCLE__CLOCKWISE:
				return clockwise != CLOCKWISE_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", radius: ");
		result.append(radius);
		result.append(", altitude: ");
		result.append(altitude);
		result.append(", clockwise: ");
		result.append(clockwise);
		result.append(')');
		return result.toString();
	}

} //CircleImpl
