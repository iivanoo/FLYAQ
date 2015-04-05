/**
 */
package it.univaq.flyaq.drone;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.drone.DroneFactory
 * @model kind="package"
 * @generated
 */
public interface DronePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.flyaq.it/drone";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "drone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronePackage eINSTANCE = it.univaq.flyaq.drone.impl.DronePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.NamedElementImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.DroneImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flight Perf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__FLIGHT_PERF = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Batteries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__BATTERIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Board Obstacle Avoidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__ON_BOARD_OBSTACLE_AVOIDANCE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MIN_VOLTAGE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MAX_VOLTAGE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MAX_POWER_CONSUMPTION = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Giro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__GIRO = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__GPS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Accelerometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__ACCELEROMETER = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Magnetometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MAGNETOMETER = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Barometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__BAROMETER = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Communication Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__COMMUNICATION_RANGE = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DATA_RATE = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Radio Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__RADIO_FREQUENCY = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__PROCESSORS = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MEMORY = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Data Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DATA_EQUIPMENT = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ros Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__ROS_DRIVER = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.ProcessorImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ARCHITECTURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FREQUENCY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.MemoryImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SUB_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.SizeImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Propellers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__PROPELLERS = 4;

	/**
	 * The feature id for the '<em><b>Propeller Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__PROPELLER_SIZE = 5;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl <em>Flight Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.FlightPerformanceImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getFlightPerformance()
	 * @generated
	 */
	int FLIGHT_PERFORMANCE = 5;

	/**
	 * The feature id for the '<em><b>Launch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__LAUNCH_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Min Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MIN_SPEED = 1;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Min Acceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MIN_ACCELERATION = 3;

	/**
	 * The feature id for the '<em><b>Max Acceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_ACCELERATION = 4;

	/**
	 * The feature id for the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_ALTITUDE = 5;

	/**
	 * The feature id for the '<em><b>Max Turn Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_TURN_RATE = 6;

	/**
	 * The feature id for the '<em><b>Min Turn Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MIN_TURN_RATE = 7;

	/**
	 * The feature id for the '<em><b>Max Climb Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_CLIMB_RATE = 8;

	/**
	 * The feature id for the '<em><b>Max Descend Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_DESCEND_RATE = 9;

	/**
	 * The feature id for the '<em><b>Position Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__POSITION_HOLD = 10;

	/**
	 * The feature id for the '<em><b>Max Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_PAYLOAD = 11;

	/**
	 * The feature id for the '<em><b>Max Flight Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME = 12;

	/**
	 * The feature id for the '<em><b>Max Flight Time With Max Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD = 13;

	/**
	 * The feature id for the '<em><b>Min Operating Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE = 14;

	/**
	 * The feature id for the '<em><b>Max Operating Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE = 15;

	/**
	 * The number of structural features of the '<em>Flight Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Flight Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PERFORMANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.BatteryImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cell Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CELL_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CAPACITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__VOLTAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recharge Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__RECHARGE_TIME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.DeviceImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Supported Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUPPORTED_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.ActionImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.ParameterImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.PropertyImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.impl.ROSDriverImpl <em>ROS Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.impl.ROSDriverImpl
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getROSDriver()
	 * @generated
	 */
	int ROS_DRIVER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_DRIVER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_DRIVER__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_DRIVER__URL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_DRIVER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ROS Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_DRIVER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.MemoryType <em>Memory Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.MemoryType
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getMemoryType()
	 * @generated
	 */
	int MEMORY_TYPE = 12;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.drone.LaunchType <em>Launch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.drone.LaunchType
	 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getLaunchType()
	 * @generated
	 */
	int LAUNCH_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.flyaq.drone.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.flyaq.drone.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see it.univaq.flyaq.drone.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.drone.Drone#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getSize()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Size();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.drone.Drone#getFlightPerf <em>Flight Perf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flight Perf</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getFlightPerf()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_FlightPerf();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Drone#getBatteries <em>Batteries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batteries</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getBatteries()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Batteries();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#isOnBoardObstacleAvoidance <em>On Board Obstacle Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Board Obstacle Avoidance</em>'.
	 * @see it.univaq.flyaq.drone.Drone#isOnBoardObstacleAvoidance()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_OnBoardObstacleAvoidance();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#getMinVoltage <em>Min Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Voltage</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getMinVoltage()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_MinVoltage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#getMaxVoltage <em>Max Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Voltage</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getMaxVoltage()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_MaxVoltage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#getMaxPowerConsumption <em>Max Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Power Consumption</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getMaxPowerConsumption()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_MaxPowerConsumption();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#isGiro <em>Giro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Giro</em>'.
	 * @see it.univaq.flyaq.drone.Drone#isGiro()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Giro();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#isGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gps</em>'.
	 * @see it.univaq.flyaq.drone.Drone#isGps()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Gps();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#isAccelerometer <em>Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerometer</em>'.
	 * @see it.univaq.flyaq.drone.Drone#isAccelerometer()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Accelerometer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#isMagnetometer <em>Magnetometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magnetometer</em>'.
	 * @see it.univaq.flyaq.drone.Drone#isMagnetometer()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Magnetometer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#isBarometer <em>Barometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barometer</em>'.
	 * @see it.univaq.flyaq.drone.Drone#isBarometer()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Barometer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#getCommunicationRange <em>Communication Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Range</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getCommunicationRange()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_CommunicationRange();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#getDataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Rate</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getDataRate()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_DataRate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Drone#getRadioFrequency <em>Radio Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Frequency</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getRadioFrequency()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_RadioFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Drone#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getProcessors()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Drone#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getMemory()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Memory();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Drone#getDataEquipment <em>Data Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Equipment</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getDataEquipment()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_DataEquipment();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.drone.Drone#getRosDriver <em>Ros Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ros Driver</em>'.
	 * @see it.univaq.flyaq.drone.Drone#getRosDriver()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_RosDriver();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see it.univaq.flyaq.drone.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Processor#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see it.univaq.flyaq.drone.Processor#getArchitecture()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Processor#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see it.univaq.flyaq.drone.Processor#getFrequency()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Frequency();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see it.univaq.flyaq.drone.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Memory#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.univaq.flyaq.drone.Memory#getType()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Memory#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see it.univaq.flyaq.drone.Memory#getSubType()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_SubType();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Memory#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.univaq.flyaq.drone.Memory#getSize()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Size();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see it.univaq.flyaq.drone.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Size#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see it.univaq.flyaq.drone.Size#getWidth()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Width();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Size#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see it.univaq.flyaq.drone.Size#getLength()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Length();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Size#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see it.univaq.flyaq.drone.Size#getHeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Height();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Size#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see it.univaq.flyaq.drone.Size#getWeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Weight();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Size#getPropellers <em>Propellers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propellers</em>'.
	 * @see it.univaq.flyaq.drone.Size#getPropellers()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Propellers();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Size#getPropellerSize <em>Propeller Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propeller Size</em>'.
	 * @see it.univaq.flyaq.drone.Size#getPropellerSize()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_PropellerSize();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.FlightPerformance <em>Flight Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Performance</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance
	 * @generated
	 */
	EClass getFlightPerformance();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getLaunchType <em>Launch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Type</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getLaunchType()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_LaunchType();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMinSpeed <em>Min Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Speed</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMinSpeed()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MinSpeed();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxSpeed()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxSpeed();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMinAcceleration <em>Min Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Acceleration</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMinAcceleration()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MinAcceleration();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxAcceleration <em>Max Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Acceleration</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxAcceleration()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxAcceleration();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxAltitude <em>Max Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Altitude</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxAltitude()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxAltitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxTurnRate <em>Max Turn Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Turn Rate</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxTurnRate()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxTurnRate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMinTurnRate <em>Min Turn Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Turn Rate</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMinTurnRate()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MinTurnRate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxClimbRate <em>Max Climb Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Climb Rate</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxClimbRate()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxClimbRate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxDescendRate <em>Max Descend Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Descend Rate</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxDescendRate()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxDescendRate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getPositionHold <em>Position Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Hold</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getPositionHold()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_PositionHold();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxPayload <em>Max Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Payload</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxPayload()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxPayload();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTime <em>Max Flight Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Flight Time</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTime()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxFlightTime();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTimeWithMaxPayload <em>Max Flight Time With Max Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Flight Time With Max Payload</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxFlightTimeWithMaxPayload()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxFlightTimeWithMaxPayload();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMinOperatingTemperature <em>Min Operating Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Operating Temperature</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMinOperatingTemperature()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MinOperatingTemperature();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.FlightPerformance#getMaxOperatingTemperature <em>Max Operating Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Operating Temperature</em>'.
	 * @see it.univaq.flyaq.drone.FlightPerformance#getMaxOperatingTemperature()
	 * @see #getFlightPerformance()
	 * @generated
	 */
	EAttribute getFlightPerformance_MaxOperatingTemperature();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see it.univaq.flyaq.drone.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Battery#getCellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Type</em>'.
	 * @see it.univaq.flyaq.drone.Battery#getCellType()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_CellType();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Battery#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see it.univaq.flyaq.drone.Battery#getCapacity()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Battery#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see it.univaq.flyaq.drone.Battery#getVoltage()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Battery#getRechargeTime <em>Recharge Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recharge Time</em>'.
	 * @see it.univaq.flyaq.drone.Battery#getRechargeTime()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_RechargeTime();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see it.univaq.flyaq.drone.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Device#getSupportedActions <em>Supported Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Actions</em>'.
	 * @see it.univaq.flyaq.drone.Device#getSupportedActions()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_SupportedActions();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Device#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see it.univaq.flyaq.drone.Device#getProperties()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Properties();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see it.univaq.flyaq.drone.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.drone.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.univaq.flyaq.drone.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Parameters();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.univaq.flyaq.drone.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.univaq.flyaq.drone.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.flyaq.drone.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see it.univaq.flyaq.drone.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.flyaq.drone.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.drone.ROSDriver <em>ROS Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Driver</em>'.
	 * @see it.univaq.flyaq.drone.ROSDriver
	 * @generated
	 */
	EClass getROSDriver();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.ROSDriver#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.flyaq.drone.ROSDriver#getVersion()
	 * @see #getROSDriver()
	 * @generated
	 */
	EAttribute getROSDriver_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.drone.ROSDriver#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see it.univaq.flyaq.drone.ROSDriver#getUrl()
	 * @see #getROSDriver()
	 * @generated
	 */
	EAttribute getROSDriver_Url();

	/**
	 * Returns the meta object for enum '{@link it.univaq.flyaq.drone.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Type</em>'.
	 * @see it.univaq.flyaq.drone.MemoryType
	 * @generated
	 */
	EEnum getMemoryType();

	/**
	 * Returns the meta object for enum '{@link it.univaq.flyaq.drone.LaunchType <em>Launch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Launch Type</em>'.
	 * @see it.univaq.flyaq.drone.LaunchType
	 * @generated
	 */
	EEnum getLaunchType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DroneFactory getDroneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.NamedElementImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.DroneImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__SIZE = eINSTANCE.getDrone_Size();

		/**
		 * The meta object literal for the '<em><b>Flight Perf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__FLIGHT_PERF = eINSTANCE.getDrone_FlightPerf();

		/**
		 * The meta object literal for the '<em><b>Batteries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__BATTERIES = eINSTANCE.getDrone_Batteries();

		/**
		 * The meta object literal for the '<em><b>On Board Obstacle Avoidance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__ON_BOARD_OBSTACLE_AVOIDANCE = eINSTANCE.getDrone_OnBoardObstacleAvoidance();

		/**
		 * The meta object literal for the '<em><b>Min Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MIN_VOLTAGE = eINSTANCE.getDrone_MinVoltage();

		/**
		 * The meta object literal for the '<em><b>Max Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MAX_VOLTAGE = eINSTANCE.getDrone_MaxVoltage();

		/**
		 * The meta object literal for the '<em><b>Max Power Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MAX_POWER_CONSUMPTION = eINSTANCE.getDrone_MaxPowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Giro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__GIRO = eINSTANCE.getDrone_Giro();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__GPS = eINSTANCE.getDrone_Gps();

		/**
		 * The meta object literal for the '<em><b>Accelerometer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__ACCELEROMETER = eINSTANCE.getDrone_Accelerometer();

		/**
		 * The meta object literal for the '<em><b>Magnetometer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MAGNETOMETER = eINSTANCE.getDrone_Magnetometer();

		/**
		 * The meta object literal for the '<em><b>Barometer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__BAROMETER = eINSTANCE.getDrone_Barometer();

		/**
		 * The meta object literal for the '<em><b>Communication Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__COMMUNICATION_RANGE = eINSTANCE.getDrone_CommunicationRange();

		/**
		 * The meta object literal for the '<em><b>Data Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__DATA_RATE = eINSTANCE.getDrone_DataRate();

		/**
		 * The meta object literal for the '<em><b>Radio Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__RADIO_FREQUENCY = eINSTANCE.getDrone_RadioFrequency();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__PROCESSORS = eINSTANCE.getDrone_Processors();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__MEMORY = eINSTANCE.getDrone_Memory();

		/**
		 * The meta object literal for the '<em><b>Data Equipment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__DATA_EQUIPMENT = eINSTANCE.getDrone_DataEquipment();

		/**
		 * The meta object literal for the '<em><b>Ros Driver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__ROS_DRIVER = eINSTANCE.getDrone_RosDriver();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.ProcessorImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__ARCHITECTURE = eINSTANCE.getProcessor_Architecture();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__FREQUENCY = eINSTANCE.getProcessor_Frequency();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.MemoryImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__TYPE = eINSTANCE.getMemory_Type();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__SUB_TYPE = eINSTANCE.getMemory_SubType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__SIZE = eINSTANCE.getMemory_Size();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.SizeImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__LENGTH = eINSTANCE.getSize_Length();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__WEIGHT = eINSTANCE.getSize_Weight();

		/**
		 * The meta object literal for the '<em><b>Propellers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__PROPELLERS = eINSTANCE.getSize_Propellers();

		/**
		 * The meta object literal for the '<em><b>Propeller Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__PROPELLER_SIZE = eINSTANCE.getSize_PropellerSize();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.FlightPerformanceImpl <em>Flight Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.FlightPerformanceImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getFlightPerformance()
		 * @generated
		 */
		EClass FLIGHT_PERFORMANCE = eINSTANCE.getFlightPerformance();

		/**
		 * The meta object literal for the '<em><b>Launch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__LAUNCH_TYPE = eINSTANCE.getFlightPerformance_LaunchType();

		/**
		 * The meta object literal for the '<em><b>Min Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MIN_SPEED = eINSTANCE.getFlightPerformance_MinSpeed();

		/**
		 * The meta object literal for the '<em><b>Max Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_SPEED = eINSTANCE.getFlightPerformance_MaxSpeed();

		/**
		 * The meta object literal for the '<em><b>Min Acceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MIN_ACCELERATION = eINSTANCE.getFlightPerformance_MinAcceleration();

		/**
		 * The meta object literal for the '<em><b>Max Acceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_ACCELERATION = eINSTANCE.getFlightPerformance_MaxAcceleration();

		/**
		 * The meta object literal for the '<em><b>Max Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_ALTITUDE = eINSTANCE.getFlightPerformance_MaxAltitude();

		/**
		 * The meta object literal for the '<em><b>Max Turn Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_TURN_RATE = eINSTANCE.getFlightPerformance_MaxTurnRate();

		/**
		 * The meta object literal for the '<em><b>Min Turn Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MIN_TURN_RATE = eINSTANCE.getFlightPerformance_MinTurnRate();

		/**
		 * The meta object literal for the '<em><b>Max Climb Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_CLIMB_RATE = eINSTANCE.getFlightPerformance_MaxClimbRate();

		/**
		 * The meta object literal for the '<em><b>Max Descend Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_DESCEND_RATE = eINSTANCE.getFlightPerformance_MaxDescendRate();

		/**
		 * The meta object literal for the '<em><b>Position Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__POSITION_HOLD = eINSTANCE.getFlightPerformance_PositionHold();

		/**
		 * The meta object literal for the '<em><b>Max Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_PAYLOAD = eINSTANCE.getFlightPerformance_MaxPayload();

		/**
		 * The meta object literal for the '<em><b>Max Flight Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME = eINSTANCE.getFlightPerformance_MaxFlightTime();

		/**
		 * The meta object literal for the '<em><b>Max Flight Time With Max Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD = eINSTANCE.getFlightPerformance_MaxFlightTimeWithMaxPayload();

		/**
		 * The meta object literal for the '<em><b>Min Operating Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE = eINSTANCE.getFlightPerformance_MinOperatingTemperature();

		/**
		 * The meta object literal for the '<em><b>Max Operating Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE = eINSTANCE.getFlightPerformance_MaxOperatingTemperature();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.BatteryImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '<em><b>Cell Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__CELL_TYPE = eINSTANCE.getBattery_CellType();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__CAPACITY = eINSTANCE.getBattery_Capacity();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__VOLTAGE = eINSTANCE.getBattery_Voltage();

		/**
		 * The meta object literal for the '<em><b>Recharge Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__RECHARGE_TIME = eINSTANCE.getBattery_RechargeTime();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.DeviceImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Supported Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__SUPPORTED_ACTIONS = eINSTANCE.getDevice_SupportedActions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PROPERTIES = eINSTANCE.getDevice_Properties();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.ActionImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.ParameterImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.PropertyImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.impl.ROSDriverImpl <em>ROS Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.impl.ROSDriverImpl
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getROSDriver()
		 * @generated
		 */
		EClass ROS_DRIVER = eINSTANCE.getROSDriver();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_DRIVER__VERSION = eINSTANCE.getROSDriver_Version();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_DRIVER__URL = eINSTANCE.getROSDriver_Url();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.MemoryType <em>Memory Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.MemoryType
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getMemoryType()
		 * @generated
		 */
		EEnum MEMORY_TYPE = eINSTANCE.getMemoryType();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.drone.LaunchType <em>Launch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.drone.LaunchType
		 * @see it.univaq.flyaq.drone.impl.DronePackageImpl#getLaunchType()
		 * @generated
		 */
		EEnum LAUNCH_TYPE = eINSTANCE.getLaunchType();

	}

} //DronePackage
