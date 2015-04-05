/**
 */
package it.univaq.flyaq.drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getLaunchType <em>Launch Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMinAcceleration <em>Min Acceleration</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxAcceleration <em>Max Acceleration</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxTurnRate <em>Max Turn Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMinTurnRate <em>Min Turn Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxClimbRate <em>Max Climb Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxDescendRate <em>Max Descend Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getPositionHold <em>Position Hold</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxPayload <em>Max Payload</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTime <em>Max Flight Time</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTimeWithMaxPayload <em>Max Flight Time With Max Payload</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMinOperatingTemperature <em>Min Operating Temperature</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.FlightPerformance#getMaxOperatingTemperature <em>Max Operating Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance()
 * @model
 * @generated
 */
public interface FlightPerformance extends EObject {
	/**
	 * Returns the value of the '<em><b>Launch Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.flyaq.drone.LaunchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Type</em>' attribute.
	 * @see it.univaq.flyaq.drone.LaunchType
	 * @see #setLaunchType(LaunchType)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_LaunchType()
	 * @model required="true"
	 * @generated
	 */
	LaunchType getLaunchType();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getLaunchType <em>Launch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Type</em>' attribute.
	 * @see it.univaq.flyaq.drone.LaunchType
	 * @see #getLaunchType()
	 * @generated
	 */
	void setLaunchType(LaunchType value);

	/**
	 * Returns the value of the '<em><b>Min Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Speed</em>' attribute.
	 * @see #setMinSpeed(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MinSpeed()
	 * @model required="true"
	 * @generated
	 */
	int getMinSpeed();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMinSpeed <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Speed</em>' attribute.
	 * @see #getMinSpeed()
	 * @generated
	 */
	void setMinSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxSpeed()
	 * @model required="true"
	 * @generated
	 */
	int getMaxSpeed();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Min Acceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Acceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Acceleration</em>' attribute.
	 * @see #setMinAcceleration(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MinAcceleration()
	 * @model
	 * @generated
	 */
	int getMinAcceleration();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMinAcceleration <em>Min Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Acceleration</em>' attribute.
	 * @see #getMinAcceleration()
	 * @generated
	 */
	void setMinAcceleration(int value);

	/**
	 * Returns the value of the '<em><b>Max Acceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Acceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Acceleration</em>' attribute.
	 * @see #setMaxAcceleration(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxAcceleration()
	 * @model
	 * @generated
	 */
	int getMaxAcceleration();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxAcceleration <em>Max Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Acceleration</em>' attribute.
	 * @see #getMaxAcceleration()
	 * @generated
	 */
	void setMaxAcceleration(int value);

	/**
	 * Returns the value of the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Altitude</em>' attribute.
	 * @see #setMaxAltitude(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxAltitude()
	 * @model required="true"
	 * @generated
	 */
	int getMaxAltitude();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Altitude</em>' attribute.
	 * @see #getMaxAltitude()
	 * @generated
	 */
	void setMaxAltitude(int value);

	/**
	 * Returns the value of the '<em><b>Max Turn Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Turn Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Turn Rate</em>' attribute.
	 * @see #setMaxTurnRate(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxTurnRate()
	 * @model required="true"
	 * @generated
	 */
	float getMaxTurnRate();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxTurnRate <em>Max Turn Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Turn Rate</em>' attribute.
	 * @see #getMaxTurnRate()
	 * @generated
	 */
	void setMaxTurnRate(float value);

	/**
	 * Returns the value of the '<em><b>Min Turn Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Turn Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Turn Rate</em>' attribute.
	 * @see #setMinTurnRate(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MinTurnRate()
	 * @model required="true"
	 * @generated
	 */
	float getMinTurnRate();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMinTurnRate <em>Min Turn Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Turn Rate</em>' attribute.
	 * @see #getMinTurnRate()
	 * @generated
	 */
	void setMinTurnRate(float value);

	/**
	 * Returns the value of the '<em><b>Max Climb Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Climb Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Climb Rate</em>' attribute.
	 * @see #setMaxClimbRate(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxClimbRate()
	 * @model required="true"
	 * @generated
	 */
	float getMaxClimbRate();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxClimbRate <em>Max Climb Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Climb Rate</em>' attribute.
	 * @see #getMaxClimbRate()
	 * @generated
	 */
	void setMaxClimbRate(float value);

	/**
	 * Returns the value of the '<em><b>Max Descend Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Descend Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Descend Rate</em>' attribute.
	 * @see #setMaxDescendRate(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxDescendRate()
	 * @model required="true"
	 * @generated
	 */
	float getMaxDescendRate();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxDescendRate <em>Max Descend Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Descend Rate</em>' attribute.
	 * @see #getMaxDescendRate()
	 * @generated
	 */
	void setMaxDescendRate(float value);

	/**
	 * Returns the value of the '<em><b>Position Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Hold</em>' attribute.
	 * @see #setPositionHold(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_PositionHold()
	 * @model
	 * @generated
	 */
	float getPositionHold();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getPositionHold <em>Position Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Hold</em>' attribute.
	 * @see #getPositionHold()
	 * @generated
	 */
	void setPositionHold(float value);

	/**
	 * Returns the value of the '<em><b>Max Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Payload</em>' attribute.
	 * @see #setMaxPayload(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxPayload()
	 * @model required="true"
	 * @generated
	 */
	int getMaxPayload();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxPayload <em>Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Payload</em>' attribute.
	 * @see #getMaxPayload()
	 * @generated
	 */
	void setMaxPayload(int value);

	/**
	 * Returns the value of the '<em><b>Max Flight Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Flight Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Flight Time</em>' attribute.
	 * @see #setMaxFlightTime(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxFlightTime()
	 * @model required="true"
	 * @generated
	 */
	int getMaxFlightTime();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTime <em>Max Flight Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Flight Time</em>' attribute.
	 * @see #getMaxFlightTime()
	 * @generated
	 */
	void setMaxFlightTime(int value);

	/**
	 * Returns the value of the '<em><b>Max Flight Time With Max Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Flight Time With Max Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Flight Time With Max Payload</em>' attribute.
	 * @see #setMaxFlightTimeWithMaxPayload(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxFlightTimeWithMaxPayload()
	 * @model required="true"
	 * @generated
	 */
	int getMaxFlightTimeWithMaxPayload();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTimeWithMaxPayload <em>Max Flight Time With Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Flight Time With Max Payload</em>' attribute.
	 * @see #getMaxFlightTimeWithMaxPayload()
	 * @generated
	 */
	void setMaxFlightTimeWithMaxPayload(int value);

	/**
	 * Returns the value of the '<em><b>Min Operating Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Operating Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Operating Temperature</em>' attribute.
	 * @see #setMinOperatingTemperature(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MinOperatingTemperature()
	 * @model
	 * @generated
	 */
	float getMinOperatingTemperature();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMinOperatingTemperature <em>Min Operating Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Operating Temperature</em>' attribute.
	 * @see #getMinOperatingTemperature()
	 * @generated
	 */
	void setMinOperatingTemperature(float value);

	/**
	 * Returns the value of the '<em><b>Max Operating Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Operating Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Operating Temperature</em>' attribute.
	 * @see #setMaxOperatingTemperature(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getFlightPerformance_MaxOperatingTemperature()
	 * @model
	 * @generated
	 */
	float getMaxOperatingTemperature();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxOperatingTemperature <em>Max Operating Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Operating Temperature</em>' attribute.
	 * @see #getMaxOperatingTemperature()
	 * @generated
	 */
	void setMaxOperatingTemperature(float value);

} // FlightPerformance
