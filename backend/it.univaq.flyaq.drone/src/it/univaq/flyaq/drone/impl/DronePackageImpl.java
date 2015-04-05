/**
 */
package it.univaq.flyaq.drone.impl;

import it.univaq.flyaq.drone.Action;
import it.univaq.flyaq.drone.Battery;
import it.univaq.flyaq.drone.Device;
import it.univaq.flyaq.drone.Drone;
import it.univaq.flyaq.drone.DroneFactory;
import it.univaq.flyaq.drone.DronePackage;
import it.univaq.flyaq.drone.FlightPerformance;
import it.univaq.flyaq.drone.LaunchType;
import it.univaq.flyaq.drone.Memory;
import it.univaq.flyaq.drone.MemoryType;
import it.univaq.flyaq.drone.NamedElement;
import it.univaq.flyaq.drone.Parameter;
import it.univaq.flyaq.drone.Processor;
import it.univaq.flyaq.drone.Property;
import it.univaq.flyaq.drone.ROSDriver;
import it.univaq.flyaq.drone.Size;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronePackageImpl extends EPackageImpl implements DronePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightPerformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum launchTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.univaq.flyaq.drone.DronePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DronePackageImpl() {
		super(eNS_URI, DroneFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DronePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DronePackage init() {
		if (isInited) return (DronePackage)EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI);

		// Obtain or create and register package
		DronePackageImpl theDronePackage = (DronePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DronePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DronePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDronePackage.createPackageContents();

		// Initialize created meta-data
		theDronePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDronePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DronePackage.eNS_URI, theDronePackage);
		return theDronePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrone() {
		return droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Size() {
		return (EReference)droneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_FlightPerf() {
		return (EReference)droneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Batteries() {
		return (EReference)droneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_OnBoardObstacleAvoidance() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_MinVoltage() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_MaxVoltage() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_MaxPowerConsumption() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Giro() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Gps() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Accelerometer() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Magnetometer() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Barometer() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_CommunicationRange() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_DataRate() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_RadioFrequency() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Processors() {
		return (EReference)droneEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Memory() {
		return (EReference)droneEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_DataEquipment() {
		return (EReference)droneEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_RosDriver() {
		return (EReference)droneEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Architecture() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Frequency() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Type() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_SubType() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Size() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Width() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Length() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Height() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Weight() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Propellers() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_PropellerSize() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlightPerformance() {
		return flightPerformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_LaunchType() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MinSpeed() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxSpeed() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MinAcceleration() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxAcceleration() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxAltitude() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxTurnRate() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MinTurnRate() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxClimbRate() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxDescendRate() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_PositionHold() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxPayload() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxFlightTime() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxFlightTimeWithMaxPayload() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MinOperatingTemperature() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightPerformance_MaxOperatingTemperature() {
		return (EAttribute)flightPerformanceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattery() {
		return batteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_CellType() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_Capacity() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_Voltage() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_RechargeTime() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_SupportedActions() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Properties() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Parameters() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Key() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSDriver() {
		return rosDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSDriver_Version() {
		return (EAttribute)rosDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSDriver_Url() {
		return (EAttribute)rosDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryType() {
		return memoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLaunchType() {
		return launchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneFactory getDroneFactory() {
		return (DroneFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		droneEClass = createEClass(DRONE);
		createEReference(droneEClass, DRONE__SIZE);
		createEReference(droneEClass, DRONE__FLIGHT_PERF);
		createEReference(droneEClass, DRONE__BATTERIES);
		createEAttribute(droneEClass, DRONE__ON_BOARD_OBSTACLE_AVOIDANCE);
		createEAttribute(droneEClass, DRONE__MIN_VOLTAGE);
		createEAttribute(droneEClass, DRONE__MAX_VOLTAGE);
		createEAttribute(droneEClass, DRONE__MAX_POWER_CONSUMPTION);
		createEAttribute(droneEClass, DRONE__GIRO);
		createEAttribute(droneEClass, DRONE__GPS);
		createEAttribute(droneEClass, DRONE__ACCELEROMETER);
		createEAttribute(droneEClass, DRONE__MAGNETOMETER);
		createEAttribute(droneEClass, DRONE__BAROMETER);
		createEAttribute(droneEClass, DRONE__COMMUNICATION_RANGE);
		createEAttribute(droneEClass, DRONE__DATA_RATE);
		createEAttribute(droneEClass, DRONE__RADIO_FREQUENCY);
		createEReference(droneEClass, DRONE__PROCESSORS);
		createEReference(droneEClass, DRONE__MEMORY);
		createEReference(droneEClass, DRONE__DATA_EQUIPMENT);
		createEReference(droneEClass, DRONE__ROS_DRIVER);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__ARCHITECTURE);
		createEAttribute(processorEClass, PROCESSOR__FREQUENCY);

		memoryEClass = createEClass(MEMORY);
		createEAttribute(memoryEClass, MEMORY__TYPE);
		createEAttribute(memoryEClass, MEMORY__SUB_TYPE);
		createEAttribute(memoryEClass, MEMORY__SIZE);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__WIDTH);
		createEAttribute(sizeEClass, SIZE__LENGTH);
		createEAttribute(sizeEClass, SIZE__HEIGHT);
		createEAttribute(sizeEClass, SIZE__WEIGHT);
		createEAttribute(sizeEClass, SIZE__PROPELLERS);
		createEAttribute(sizeEClass, SIZE__PROPELLER_SIZE);

		flightPerformanceEClass = createEClass(FLIGHT_PERFORMANCE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__LAUNCH_TYPE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MIN_SPEED);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_SPEED);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MIN_ACCELERATION);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_ACCELERATION);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_ALTITUDE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_TURN_RATE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MIN_TURN_RATE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_CLIMB_RATE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_DESCEND_RATE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__POSITION_HOLD);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_PAYLOAD);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_FLIGHT_TIME_WITH_MAX_PAYLOAD);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MIN_OPERATING_TEMPERATURE);
		createEAttribute(flightPerformanceEClass, FLIGHT_PERFORMANCE__MAX_OPERATING_TEMPERATURE);

		batteryEClass = createEClass(BATTERY);
		createEAttribute(batteryEClass, BATTERY__CELL_TYPE);
		createEAttribute(batteryEClass, BATTERY__CAPACITY);
		createEAttribute(batteryEClass, BATTERY__VOLTAGE);
		createEAttribute(batteryEClass, BATTERY__RECHARGE_TIME);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__SUPPORTED_ACTIONS);
		createEReference(deviceEClass, DEVICE__PROPERTIES);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__KEY);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		rosDriverEClass = createEClass(ROS_DRIVER);
		createEAttribute(rosDriverEClass, ROS_DRIVER__VERSION);
		createEAttribute(rosDriverEClass, ROS_DRIVER__URL);

		// Create enums
		memoryTypeEEnum = createEEnum(MEMORY_TYPE);
		launchTypeEEnum = createEEnum(LAUNCH_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		droneEClass.getESuperTypes().add(this.getNamedElement());
		processorEClass.getESuperTypes().add(this.getNamedElement());
		memoryEClass.getESuperTypes().add(this.getNamedElement());
		batteryEClass.getESuperTypes().add(this.getNamedElement());
		deviceEClass.getESuperTypes().add(this.getNamedElement());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		propertyEClass.getESuperTypes().add(this.getNamedElement());
		rosDriverEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droneEClass, Drone.class, "Drone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrone_Size(), this.getSize(), null, "size", null, 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_FlightPerf(), this.getFlightPerformance(), null, "flightPerf", null, 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Batteries(), this.getBattery(), null, "batteries", null, 0, -1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_OnBoardObstacleAvoidance(), ecorePackage.getEBoolean(), "onBoardObstacleAvoidance", null, 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_MinVoltage(), ecorePackage.getEFloat(), "minVoltage", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_MaxVoltage(), ecorePackage.getEFloat(), "maxVoltage", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_MaxPowerConsumption(), ecorePackage.getEFloat(), "maxPowerConsumption", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Giro(), ecorePackage.getEBoolean(), "giro", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Gps(), ecorePackage.getEBoolean(), "gps", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Accelerometer(), ecorePackage.getEBoolean(), "accelerometer", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Magnetometer(), ecorePackage.getEBoolean(), "magnetometer", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Barometer(), ecorePackage.getEBoolean(), "barometer", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_CommunicationRange(), ecorePackage.getEFloat(), "communicationRange", null, 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_DataRate(), ecorePackage.getEInt(), "dataRate", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_RadioFrequency(), ecorePackage.getEInt(), "radioFrequency", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Processors(), this.getProcessor(), null, "processors", null, 1, -1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Memory(), this.getMemory(), null, "memory", null, 1, -1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_DataEquipment(), this.getDevice(), null, "dataEquipment", null, 0, -1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_RosDriver(), this.getROSDriver(), null, "rosDriver", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Architecture(), ecorePackage.getEString(), "architecture", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Frequency(), ecorePackage.getEInt(), "frequency", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemory_Type(), this.getMemoryType(), "type", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_SubType(), ecorePackage.getEString(), "subType", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_Size(), ecorePackage.getEInt(), "size", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Width(), ecorePackage.getEFloat(), "width", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Length(), ecorePackage.getEFloat(), "length", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Height(), ecorePackage.getEFloat(), "height", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Weight(), ecorePackage.getEFloat(), "weight", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Propellers(), ecorePackage.getEInt(), "propellers", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_PropellerSize(), ecorePackage.getEFloat(), "propellerSize", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flightPerformanceEClass, FlightPerformance.class, "FlightPerformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightPerformance_LaunchType(), this.getLaunchType(), "launchType", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MinSpeed(), ecorePackage.getEInt(), "minSpeed", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxSpeed(), ecorePackage.getEInt(), "maxSpeed", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MinAcceleration(), ecorePackage.getEInt(), "minAcceleration", null, 0, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxAcceleration(), ecorePackage.getEInt(), "maxAcceleration", null, 0, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxAltitude(), ecorePackage.getEInt(), "maxAltitude", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxTurnRate(), ecorePackage.getEFloat(), "maxTurnRate", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MinTurnRate(), ecorePackage.getEFloat(), "minTurnRate", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxClimbRate(), ecorePackage.getEFloat(), "maxClimbRate", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxDescendRate(), ecorePackage.getEFloat(), "maxDescendRate", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_PositionHold(), ecorePackage.getEFloat(), "positionHold", null, 0, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxPayload(), ecorePackage.getEInt(), "maxPayload", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxFlightTime(), ecorePackage.getEInt(), "maxFlightTime", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxFlightTimeWithMaxPayload(), ecorePackage.getEInt(), "maxFlightTimeWithMaxPayload", null, 1, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MinOperatingTemperature(), ecorePackage.getEFloat(), "minOperatingTemperature", null, 0, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightPerformance_MaxOperatingTemperature(), ecorePackage.getEFloat(), "maxOperatingTemperature", null, 0, 1, FlightPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBattery_CellType(), ecorePackage.getEString(), "cellType", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBattery_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBattery_Voltage(), ecorePackage.getEFloat(), "voltage", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBattery_RechargeTime(), ecorePackage.getEInt(), "rechargeTime", null, 0, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_SupportedActions(), this.getAction(), null, "supportedActions", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Properties(), this.getProperty(), null, "properties", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Key(), ecorePackage.getEString(), "key", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosDriverEClass, ROSDriver.class, "ROSDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSDriver_Version(), ecorePackage.getEString(), "version", null, 0, 1, ROSDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSDriver_Url(), ecorePackage.getEString(), "url", null, 0, 1, ROSDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(memoryTypeEEnum, MemoryType.class, "MemoryType");
		addEEnumLiteral(memoryTypeEEnum, MemoryType.VOLATILE);
		addEEnumLiteral(memoryTypeEEnum, MemoryType.STORAGE);

		initEEnum(launchTypeEEnum, LaunchType.class, "LaunchType");
		addEEnumLiteral(launchTypeEEnum, LaunchType.VTOL);
		addEEnumLiteral(launchTypeEEnum, LaunchType.HTOL);
		addEEnumLiteral(launchTypeEEnum, LaunchType.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //DronePackageImpl
