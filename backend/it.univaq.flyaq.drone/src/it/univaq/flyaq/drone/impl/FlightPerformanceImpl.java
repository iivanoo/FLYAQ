/**
 */
package it.univaq.flyaq.drone.impl;

import it.univaq.flyaq.drone.DronePackage;
import it.univaq.flyaq.drone.FlightPerformance;
import it.univaq.flyaq.drone.LaunchType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getLaunchType <em>Launch Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMinAcceleration <em>Min Acceleration</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxAcceleration <em>Max Acceleration</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxTurnRate <em>Max Turn Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMinTurnRate <em>Min Turn Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxClimbRate <em>Max Climb Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxDescendRate <em>Max Descend Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getPositionHold <em>Position Hold</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxPayload <em>Max Payload</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxFlightTime <em>Max Flight Time</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxFlightTimeWithMaxPayload <em>Max Flight Time With Max Payload</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMinOperatingTemperature <em>Min Operating Temperature</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl#getMaxOperatingTemperature <em>Max Operating Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlightPerformanceImpl extends MinimalEObjectImpl.Container implements FlightPerformance {
	/**
	 * The default value of the '{@link #getLaunchType() <em>Launch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchType()
	 * @generated
	 * @ordered
	 */
	protected static final LaunchType LAUNCH_TYPE_EDEFAULT = LaunchType.VTOL;

	/**
	 * The cached value of the '{@link #getLaunchType() <em>Launch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchType()
	 * @generated
	 * @ordered
	 */
	protected LaunchType launchType = LAUNCH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSpeed() <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSpeed() <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSpeed()
	 * @generated
	 * @ordered
	 */
	protected int minSpeed = MIN_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected int maxSpeed = MAX_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinAcceleration() <em>Min Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAcceleration()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ACCELERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinAcceleration() <em>Min Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAcceleration()
	 * @generated
	 * @ordered
	 */
	protected int minAcceleration = MIN_ACCELERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAcceleration() <em>Max Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAcceleration()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ACCELERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAcceleration() <em>Max Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAcceleration()
	 * @generated
	 * @ordered
	 */
	protected int maxAcceleration = MAX_ACCELERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ALTITUDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected int maxAltitude = MAX_ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTurnRate() <em>Max Turn Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTurnRate()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_TURN_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxTurnRate() <em>Max Turn Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTurnRate()
	 * @generated
	 * @ordered
	 */
	protected float maxTurnRate = MAX_TURN_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTurnRate() <em>Min Turn Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTurnRate()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_TURN_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinTurnRate() <em>Min Turn Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTurnRate()
	 * @generated
	 * @ordered
	 */
	protected float minTurnRate = MIN_TURN_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxClimbRate() <em>Max Climb Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClimbRate()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CLIMB_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxClimbRate() <em>Max Climb Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClimbRate()
	 * @generated
	 * @ordered
	 */
	protected float maxClimbRate = MAX_CLIMB_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDescendRate() <em>Max Descend Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDescendRate()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_DESCEND_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxDescendRate() <em>Max Descend Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDescendRate()
	 * @generated
	 * @ordered
	 */
	protected float maxDescendRate = MAX_DESCEND_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionHold() <em>Position Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHold()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_HOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionHold() <em>Position Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHold()
	 * @generated
	 * @ordered
	 */
	protected float positionHold = POSITION_HOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPayload() <em>Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPayload()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PAYLOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPayload() <em>Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPayload()
	 * @generated
	 * @ordered
	 */
	protected int maxPayload = MAX_PAYLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFlightTime() <em>Max Flight Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFlightTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_FLIGHT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxFlightTime() <em>Max Flight Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFlightTime()
	 * @generated
	 * @ordered
	 */
	protected int maxFlightTime = MAX_FLIGHT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFlightTimeWithMaxPayload() <em>Max Flight Time With Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFlightTimeWithMaxPayload()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxFlightTimeWithMaxPayload() <em>Max Flight Time With Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFlightTimeWithMaxPayload()
	 * @generated
	 * @ordered
	 */
	protected int maxFlightTimeWithMaxPayload = MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOperatingTemperature() <em>Min Operating Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_OPERATING_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinOperatingTemperature() <em>Min Operating Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingTemperature()
	 * @generated
	 * @ordered
	 */
	protected float minOperatingTemperature = MIN_OPERATING_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOperatingTemperature() <em>Max Operating Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_OPERATING_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxOperatingTemperature() <em>Max Operating Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingTemperature()
	 * @generated
	 * @ordered
	 */
	protected float maxOperatingTemperature = MAX_OPERATING_TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronePackage.Literals.FLIGHT_PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchType getLaunchType() {
		return launchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchType(LaunchType newLaunchType) {
		LaunchType oldLaunchType = launchType;
		launchType = newLaunchType == null ? LAUNCH_TYPE_EDEFAULT : newLaunchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__LAUNCH_TYPE, oldLaunchType, launchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinSpeed() {
		return minSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSpeed(int newMinSpeed) {
		int oldMinSpeed = minSpeed;
		minSpeed = newMinSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MIN_SPEED, oldMinSpeed, minSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpeed(int newMaxSpeed) {
		int oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_SPEED, oldMaxSpeed, maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinAcceleration() {
		return minAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAcceleration(int newMinAcceleration) {
		int oldMinAcceleration = minAcceleration;
		minAcceleration = newMinAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MIN_ACCELERATION, oldMinAcceleration, minAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAcceleration() {
		return maxAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAcceleration(int newMaxAcceleration) {
		int oldMaxAcceleration = maxAcceleration;
		maxAcceleration = newMaxAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_ACCELERATION, oldMaxAcceleration, maxAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAltitude() {
		return maxAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAltitude(int newMaxAltitude) {
		int oldMaxAltitude = maxAltitude;
		maxAltitude = newMaxAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_ALTITUDE, oldMaxAltitude, maxAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxTurnRate() {
		return maxTurnRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTurnRate(float newMaxTurnRate) {
		float oldMaxTurnRate = maxTurnRate;
		maxTurnRate = newMaxTurnRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_TURN_RATE, oldMaxTurnRate, maxTurnRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinTurnRate() {
		return minTurnRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTurnRate(float newMinTurnRate) {
		float oldMinTurnRate = minTurnRate;
		minTurnRate = newMinTurnRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MIN_TURN_RATE, oldMinTurnRate, minTurnRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxClimbRate() {
		return maxClimbRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxClimbRate(float newMaxClimbRate) {
		float oldMaxClimbRate = maxClimbRate;
		maxClimbRate = newMaxClimbRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_CLIMB_RATE, oldMaxClimbRate, maxClimbRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxDescendRate() {
		return maxDescendRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDescendRate(float newMaxDescendRate) {
		float oldMaxDescendRate = maxDescendRate;
		maxDescendRate = newMaxDescendRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_DESCEND_RATE, oldMaxDescendRate, maxDescendRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPositionHold() {
		return positionHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionHold(float newPositionHold) {
		float oldPositionHold = positionHold;
		positionHold = newPositionHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__POSITION_HOLD, oldPositionHold, positionHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPayload() {
		return maxPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPayload(int newMaxPayload) {
		int oldMaxPayload = maxPayload;
		maxPayload = newMaxPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_PAYLOAD, oldMaxPayload, maxPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxFlightTime() {
		return maxFlightTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFlightTime(int newMaxFlightTime) {
		int oldMaxFlightTime = maxFlightTime;
		maxFlightTime = newMaxFlightTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME, oldMaxFlightTime, maxFlightTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxFlightTimeWithMaxPayload() {
		return maxFlightTimeWithMaxPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFlightTimeWithMaxPayload(int newMaxFlightTimeWithMaxPayload) {
		int oldMaxFlightTimeWithMaxPayload = maxFlightTimeWithMaxPayload;
		maxFlightTimeWithMaxPayload = newMaxFlightTimeWithMaxPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD, oldMaxFlightTimeWithMaxPayload, maxFlightTimeWithMaxPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinOperatingTemperature() {
		return minOperatingTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOperatingTemperature(float newMinOperatingTemperature) {
		float oldMinOperatingTemperature = minOperatingTemperature;
		minOperatingTemperature = newMinOperatingTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE, oldMinOperatingTemperature, minOperatingTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxOperatingTemperature() {
		return maxOperatingTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOperatingTemperature(float newMaxOperatingTemperature) {
		float oldMaxOperatingTemperature = maxOperatingTemperature;
		maxOperatingTemperature = newMaxOperatingTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE, oldMaxOperatingTemperature, maxOperatingTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronePackage.FLIGHT_PERFORMANCE__LAUNCH_TYPE:
				return getLaunchType();
			case DronePackage.FLIGHT_PERFORMANCE__MIN_SPEED:
				return getMinSpeed();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_SPEED:
				return getMaxSpeed();
			case DronePackage.FLIGHT_PERFORMANCE__MIN_ACCELERATION:
				return getMinAcceleration();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ACCELERATION:
				return getMaxAcceleration();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ALTITUDE:
				return getMaxAltitude();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_TURN_RATE:
				return getMaxTurnRate();
			case DronePackage.FLIGHT_PERFORMANCE__MIN_TURN_RATE:
				return getMinTurnRate();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_CLIMB_RATE:
				return getMaxClimbRate();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_DESCEND_RATE:
				return getMaxDescendRate();
			case DronePackage.FLIGHT_PERFORMANCE__POSITION_HOLD:
				return getPositionHold();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_PAYLOAD:
				return getMaxPayload();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME:
				return getMaxFlightTime();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD:
				return getMaxFlightTimeWithMaxPayload();
			case DronePackage.FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE:
				return getMinOperatingTemperature();
			case DronePackage.FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE:
				return getMaxOperatingTemperature();
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
			case DronePackage.FLIGHT_PERFORMANCE__LAUNCH_TYPE:
				setLaunchType((LaunchType)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_SPEED:
				setMinSpeed((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_SPEED:
				setMaxSpeed((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_ACCELERATION:
				setMinAcceleration((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ACCELERATION:
				setMaxAcceleration((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ALTITUDE:
				setMaxAltitude((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_TURN_RATE:
				setMaxTurnRate((Float)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_TURN_RATE:
				setMinTurnRate((Float)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_CLIMB_RATE:
				setMaxClimbRate((Float)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_DESCEND_RATE:
				setMaxDescendRate((Float)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__POSITION_HOLD:
				setPositionHold((Float)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_PAYLOAD:
				setMaxPayload((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME:
				setMaxFlightTime((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD:
				setMaxFlightTimeWithMaxPayload((Integer)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE:
				setMinOperatingTemperature((Float)newValue);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE:
				setMaxOperatingTemperature((Float)newValue);
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
			case DronePackage.FLIGHT_PERFORMANCE__LAUNCH_TYPE:
				setLaunchType(LAUNCH_TYPE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_SPEED:
				setMinSpeed(MIN_SPEED_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_SPEED:
				setMaxSpeed(MAX_SPEED_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_ACCELERATION:
				setMinAcceleration(MIN_ACCELERATION_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ACCELERATION:
				setMaxAcceleration(MAX_ACCELERATION_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ALTITUDE:
				setMaxAltitude(MAX_ALTITUDE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_TURN_RATE:
				setMaxTurnRate(MAX_TURN_RATE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_TURN_RATE:
				setMinTurnRate(MIN_TURN_RATE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_CLIMB_RATE:
				setMaxClimbRate(MAX_CLIMB_RATE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_DESCEND_RATE:
				setMaxDescendRate(MAX_DESCEND_RATE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__POSITION_HOLD:
				setPositionHold(POSITION_HOLD_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_PAYLOAD:
				setMaxPayload(MAX_PAYLOAD_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME:
				setMaxFlightTime(MAX_FLIGHT_TIME_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD:
				setMaxFlightTimeWithMaxPayload(MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE:
				setMinOperatingTemperature(MIN_OPERATING_TEMPERATURE_EDEFAULT);
				return;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE:
				setMaxOperatingTemperature(MAX_OPERATING_TEMPERATURE_EDEFAULT);
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
			case DronePackage.FLIGHT_PERFORMANCE__LAUNCH_TYPE:
				return launchType != LAUNCH_TYPE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_SPEED:
				return minSpeed != MIN_SPEED_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_SPEED:
				return maxSpeed != MAX_SPEED_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_ACCELERATION:
				return minAcceleration != MIN_ACCELERATION_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ACCELERATION:
				return maxAcceleration != MAX_ACCELERATION_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_ALTITUDE:
				return maxAltitude != MAX_ALTITUDE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_TURN_RATE:
				return maxTurnRate != MAX_TURN_RATE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_TURN_RATE:
				return minTurnRate != MIN_TURN_RATE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_CLIMB_RATE:
				return maxClimbRate != MAX_CLIMB_RATE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_DESCEND_RATE:
				return maxDescendRate != MAX_DESCEND_RATE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__POSITION_HOLD:
				return positionHold != POSITION_HOLD_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_PAYLOAD:
				return maxPayload != MAX_PAYLOAD_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME:
				return maxFlightTime != MAX_FLIGHT_TIME_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD:
				return maxFlightTimeWithMaxPayload != MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE:
				return minOperatingTemperature != MIN_OPERATING_TEMPERATURE_EDEFAULT;
			case DronePackage.FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE:
				return maxOperatingTemperature != MAX_OPERATING_TEMPERATURE_EDEFAULT;
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
		result.append(" (launchType: ");
		result.append(launchType);
		result.append(", minSpeed: ");
		result.append(minSpeed);
		result.append(", maxSpeed: ");
		result.append(maxSpeed);
		result.append(", minAcceleration: ");
		result.append(minAcceleration);
		result.append(", maxAcceleration: ");
		result.append(maxAcceleration);
		result.append(", maxAltitude: ");
		result.append(maxAltitude);
		result.append(", maxTurnRate: ");
		result.append(maxTurnRate);
		result.append(", minTurnRate: ");
		result.append(minTurnRate);
		result.append(", maxClimbRate: ");
		result.append(maxClimbRate);
		result.append(", maxDescendRate: ");
		result.append(maxDescendRate);
		result.append(", positionHold: ");
		result.append(positionHold);
		result.append(", maxPayload: ");
		result.append(maxPayload);
		result.append(", maxFlightTime: ");
		result.append(maxFlightTime);
		result.append(", maxFlightTimeWithMaxPayload: ");
		result.append(maxFlightTimeWithMaxPayload);
		result.append(", minOperatingTemperature: ");
		result.append(minOperatingTemperature);
		result.append(", maxOperatingTemperature: ");
		result.append(maxOperatingTemperature);
		result.append(')');
		return result.toString();
	}

} //FlightPerformanceImpl
