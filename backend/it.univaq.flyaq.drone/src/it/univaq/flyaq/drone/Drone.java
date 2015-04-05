/**
 */
package it.univaq.flyaq.drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getSize <em>Size</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getFlightPerf <em>Flight Perf</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#isOnBoardObstacleAvoidance <em>On Board Obstacle Avoidance</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getMinVoltage <em>Min Voltage</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getMaxVoltage <em>Max Voltage</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getMaxPowerConsumption <em>Max Power Consumption</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#isGiro <em>Giro</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#isGps <em>Gps</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#isAccelerometer <em>Accelerometer</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#isMagnetometer <em>Magnetometer</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#isBarometer <em>Barometer</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getRadioFrequency <em>Radio Frequency</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getProcessors <em>Processors</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getMemory <em>Memory</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getDataEquipment <em>Data Equipment</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Drone#getRosDriver <em>Ros Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.drone.DronePackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Size)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Flight Perf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flight Perf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Perf</em>' containment reference.
	 * @see #setFlightPerf(FlightPerformance)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_FlightPerf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FlightPerformance getFlightPerf();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getFlightPerf <em>Flight Perf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Perf</em>' containment reference.
	 * @see #getFlightPerf()
	 * @generated
	 */
	void setFlightPerf(FlightPerformance value);

	/**
	 * Returns the value of the '<em><b>Batteries</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.drone.Battery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batteries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batteries</em>' containment reference list.
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Batteries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Battery> getBatteries();

	/**
	 * Returns the value of the '<em><b>On Board Obstacle Avoidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Board Obstacle Avoidance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Board Obstacle Avoidance</em>' attribute.
	 * @see #setOnBoardObstacleAvoidance(boolean)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_OnBoardObstacleAvoidance()
	 * @model required="true"
	 * @generated
	 */
	boolean isOnBoardObstacleAvoidance();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#isOnBoardObstacleAvoidance <em>On Board Obstacle Avoidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Board Obstacle Avoidance</em>' attribute.
	 * @see #isOnBoardObstacleAvoidance()
	 * @generated
	 */
	void setOnBoardObstacleAvoidance(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Voltage</em>' attribute.
	 * @see #setMinVoltage(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_MinVoltage()
	 * @model
	 * @generated
	 */
	float getMinVoltage();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getMinVoltage <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Voltage</em>' attribute.
	 * @see #getMinVoltage()
	 * @generated
	 */
	void setMinVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Max Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Voltage</em>' attribute.
	 * @see #setMaxVoltage(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_MaxVoltage()
	 * @model
	 * @generated
	 */
	float getMaxVoltage();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getMaxVoltage <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Voltage</em>' attribute.
	 * @see #getMaxVoltage()
	 * @generated
	 */
	void setMaxVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Max Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Consumption</em>' attribute.
	 * @see #setMaxPowerConsumption(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_MaxPowerConsumption()
	 * @model
	 * @generated
	 */
	float getMaxPowerConsumption();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getMaxPowerConsumption <em>Max Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Consumption</em>' attribute.
	 * @see #getMaxPowerConsumption()
	 * @generated
	 */
	void setMaxPowerConsumption(float value);

	/**
	 * Returns the value of the '<em><b>Giro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Giro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Giro</em>' attribute.
	 * @see #setGiro(boolean)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Giro()
	 * @model
	 * @generated
	 */
	boolean isGiro();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#isGiro <em>Giro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Giro</em>' attribute.
	 * @see #isGiro()
	 * @generated
	 */
	void setGiro(boolean value);

	/**
	 * Returns the value of the '<em><b>Gps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' attribute.
	 * @see #setGps(boolean)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Gps()
	 * @model
	 * @generated
	 */
	boolean isGps();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#isGps <em>Gps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' attribute.
	 * @see #isGps()
	 * @generated
	 */
	void setGps(boolean value);

	/**
	 * Returns the value of the '<em><b>Accelerometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accelerometer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accelerometer</em>' attribute.
	 * @see #setAccelerometer(boolean)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Accelerometer()
	 * @model
	 * @generated
	 */
	boolean isAccelerometer();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#isAccelerometer <em>Accelerometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accelerometer</em>' attribute.
	 * @see #isAccelerometer()
	 * @generated
	 */
	void setAccelerometer(boolean value);

	/**
	 * Returns the value of the '<em><b>Magnetometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magnetometer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnetometer</em>' attribute.
	 * @see #setMagnetometer(boolean)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Magnetometer()
	 * @model
	 * @generated
	 */
	boolean isMagnetometer();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#isMagnetometer <em>Magnetometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnetometer</em>' attribute.
	 * @see #isMagnetometer()
	 * @generated
	 */
	void setMagnetometer(boolean value);

	/**
	 * Returns the value of the '<em><b>Barometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barometer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barometer</em>' attribute.
	 * @see #setBarometer(boolean)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Barometer()
	 * @model
	 * @generated
	 */
	boolean isBarometer();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#isBarometer <em>Barometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barometer</em>' attribute.
	 * @see #isBarometer()
	 * @generated
	 */
	void setBarometer(boolean value);

	/**
	 * Returns the value of the '<em><b>Communication Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Range</em>' attribute.
	 * @see #setCommunicationRange(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_CommunicationRange()
	 * @model required="true"
	 * @generated
	 */
	float getCommunicationRange();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getCommunicationRange <em>Communication Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Range</em>' attribute.
	 * @see #getCommunicationRange()
	 * @generated
	 */
	void setCommunicationRange(float value);

	/**
	 * Returns the value of the '<em><b>Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rate</em>' attribute.
	 * @see #setDataRate(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_DataRate()
	 * @model
	 * @generated
	 */
	int getDataRate();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getDataRate <em>Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Rate</em>' attribute.
	 * @see #getDataRate()
	 * @generated
	 */
	void setDataRate(int value);

	/**
	 * Returns the value of the '<em><b>Radio Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Frequency</em>' attribute.
	 * @see #setRadioFrequency(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_RadioFrequency()
	 * @model
	 * @generated
	 */
	int getRadioFrequency();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getRadioFrequency <em>Radio Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio Frequency</em>' attribute.
	 * @see #getRadioFrequency()
	 * @generated
	 */
	void setRadioFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.drone.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Processors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.drone.Memory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference list.
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_Memory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Memory> getMemory();

	/**
	 * Returns the value of the '<em><b>Data Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.drone.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Equipment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Equipment</em>' containment reference list.
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_DataEquipment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDataEquipment();

	/**
	 * Returns the value of the '<em><b>Ros Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Driver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Driver</em>' containment reference.
	 * @see #setRosDriver(ROSDriver)
	 * @see it.univaq.flyaq.drone.DronePackage#getDrone_RosDriver()
	 * @model containment="true"
	 * @generated
	 */
	ROSDriver getRosDriver();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Drone#getRosDriver <em>Ros Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ros Driver</em>' containment reference.
	 * @see #getRosDriver()
	 * @generated
	 */
	void setRosDriver(ROSDriver value);

} // Drone
