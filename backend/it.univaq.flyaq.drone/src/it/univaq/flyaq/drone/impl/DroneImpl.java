/**
 */
package it.univaq.flyaq.drone.impl;

import it.univaq.flyaq.drone.Battery;
import it.univaq.flyaq.drone.Device;
import it.univaq.flyaq.drone.Drone;
import it.univaq.flyaq.drone.DronePackage;
import it.univaq.flyaq.drone.FlightPerformance;
import it.univaq.flyaq.drone.Memory;
import it.univaq.flyaq.drone.Processor;
import it.univaq.flyaq.drone.ROSDriver;
import it.univaq.flyaq.drone.Size;

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
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getSize <em>Size</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getFlightPerf <em>Flight Perf</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#isOnBoardObstacleAvoidance <em>On Board Obstacle Avoidance</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getMinVoltage <em>Min Voltage</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getMaxVoltage <em>Max Voltage</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getMaxPowerConsumption <em>Max Power Consumption</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#isGiro <em>Giro</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#isGps <em>Gps</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#isAccelerometer <em>Accelerometer</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#isMagnetometer <em>Magnetometer</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#isBarometer <em>Barometer</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getRadioFrequency <em>Radio Frequency</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getDataEquipment <em>Data Equipment</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.DroneImpl#getRosDriver <em>Ros Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DroneImpl extends NamedElementImpl implements Drone {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size;

	/**
	 * The cached value of the '{@link #getFlightPerf() <em>Flight Perf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPerf()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformance flightPerf;

	/**
	 * The cached value of the '{@link #getBatteries() <em>Batteries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteries()
	 * @generated
	 * @ordered
	 */
	protected EList<Battery> batteries;

	/**
	 * The default value of the '{@link #isOnBoardObstacleAvoidance() <em>On Board Obstacle Avoidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnBoardObstacleAvoidance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_BOARD_OBSTACLE_AVOIDANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnBoardObstacleAvoidance() <em>On Board Obstacle Avoidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnBoardObstacleAvoidance()
	 * @generated
	 * @ordered
	 */
	protected boolean onBoardObstacleAvoidance = ON_BOARD_OBSTACLE_AVOIDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVoltage() <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinVoltage() <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVoltage()
	 * @generated
	 * @ordered
	 */
	protected float minVoltage = MIN_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVoltage() <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxVoltage() <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltage()
	 * @generated
	 * @ordered
	 */
	protected float maxVoltage = MAX_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPowerConsumption() <em>Max Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_POWER_CONSUMPTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxPowerConsumption() <em>Max Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected float maxPowerConsumption = MAX_POWER_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGiro() <em>Giro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGiro()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GIRO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGiro() <em>Giro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGiro()
	 * @generated
	 * @ordered
	 */
	protected boolean giro = GIRO_EDEFAULT;

	/**
	 * The default value of the '{@link #isGps() <em>Gps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGps()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGps() <em>Gps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGps()
	 * @generated
	 * @ordered
	 */
	protected boolean gps = GPS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccelerometer() <em>Accelerometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccelerometer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCELEROMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccelerometer() <em>Accelerometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccelerometer()
	 * @generated
	 * @ordered
	 */
	protected boolean accelerometer = ACCELEROMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isMagnetometer() <em>Magnetometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMagnetometer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAGNETOMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMagnetometer() <em>Magnetometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMagnetometer()
	 * @generated
	 * @ordered
	 */
	protected boolean magnetometer = MAGNETOMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isBarometer() <em>Barometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBarometer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAROMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBarometer() <em>Barometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBarometer()
	 * @generated
	 * @ordered
	 */
	protected boolean barometer = BAROMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationRange() <em>Communication Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRange()
	 * @generated
	 * @ordered
	 */
	protected static final float COMMUNICATION_RANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCommunicationRange() <em>Communication Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRange()
	 * @generated
	 * @ordered
	 */
	protected float communicationRange = COMMUNICATION_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataRate() <em>Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataRate() <em>Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRate()
	 * @generated
	 * @ordered
	 */
	protected int dataRate = DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioFrequency() <em>Radio Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int RADIO_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRadioFrequency() <em>Radio Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioFrequency()
	 * @generated
	 * @ordered
	 */
	protected int radioFrequency = RADIO_FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memory;

	/**
	 * The cached value of the '{@link #getDataEquipment() <em>Data Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> dataEquipment;

	/**
	 * The cached value of the '{@link #getRosDriver() <em>Ros Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosDriver()
	 * @generated
	 * @ordered
	 */
	protected ROSDriver rosDriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronePackage.Literals.DRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Size newSize, NotificationChain msgs) {
		Size oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.DRONE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.DRONE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightPerformance getFlightPerf() {
		return flightPerf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPerf(FlightPerformance newFlightPerf, NotificationChain msgs) {
		FlightPerformance oldFlightPerf = flightPerf;
		flightPerf = newFlightPerf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__FLIGHT_PERF, oldFlightPerf, newFlightPerf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlightPerf(FlightPerformance newFlightPerf) {
		if (newFlightPerf != flightPerf) {
			NotificationChain msgs = null;
			if (flightPerf != null)
				msgs = ((InternalEObject)flightPerf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.DRONE__FLIGHT_PERF, null, msgs);
			if (newFlightPerf != null)
				msgs = ((InternalEObject)newFlightPerf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.DRONE__FLIGHT_PERF, null, msgs);
			msgs = basicSetFlightPerf(newFlightPerf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__FLIGHT_PERF, newFlightPerf, newFlightPerf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Battery> getBatteries() {
		if (batteries == null) {
			batteries = new EObjectContainmentEList<Battery>(Battery.class, this, DronePackage.DRONE__BATTERIES);
		}
		return batteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnBoardObstacleAvoidance() {
		return onBoardObstacleAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBoardObstacleAvoidance(boolean newOnBoardObstacleAvoidance) {
		boolean oldOnBoardObstacleAvoidance = onBoardObstacleAvoidance;
		onBoardObstacleAvoidance = newOnBoardObstacleAvoidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__ON_BOARD_OBSTACLE_AVOIDANCE, oldOnBoardObstacleAvoidance, onBoardObstacleAvoidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinVoltage() {
		return minVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVoltage(float newMinVoltage) {
		float oldMinVoltage = minVoltage;
		minVoltage = newMinVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__MIN_VOLTAGE, oldMinVoltage, minVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxVoltage() {
		return maxVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVoltage(float newMaxVoltage) {
		float oldMaxVoltage = maxVoltage;
		maxVoltage = newMaxVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__MAX_VOLTAGE, oldMaxVoltage, maxVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxPowerConsumption() {
		return maxPowerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPowerConsumption(float newMaxPowerConsumption) {
		float oldMaxPowerConsumption = maxPowerConsumption;
		maxPowerConsumption = newMaxPowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__MAX_POWER_CONSUMPTION, oldMaxPowerConsumption, maxPowerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGiro() {
		return giro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGiro(boolean newGiro) {
		boolean oldGiro = giro;
		giro = newGiro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__GIRO, oldGiro, giro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGps() {
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGps(boolean newGps) {
		boolean oldGps = gps;
		gps = newGps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__GPS, oldGps, gps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccelerometer() {
		return accelerometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccelerometer(boolean newAccelerometer) {
		boolean oldAccelerometer = accelerometer;
		accelerometer = newAccelerometer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__ACCELEROMETER, oldAccelerometer, accelerometer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMagnetometer() {
		return magnetometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagnetometer(boolean newMagnetometer) {
		boolean oldMagnetometer = magnetometer;
		magnetometer = newMagnetometer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__MAGNETOMETER, oldMagnetometer, magnetometer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBarometer() {
		return barometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarometer(boolean newBarometer) {
		boolean oldBarometer = barometer;
		barometer = newBarometer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__BAROMETER, oldBarometer, barometer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCommunicationRange() {
		return communicationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationRange(float newCommunicationRange) {
		float oldCommunicationRange = communicationRange;
		communicationRange = newCommunicationRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__COMMUNICATION_RANGE, oldCommunicationRange, communicationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataRate() {
		return dataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRate(int newDataRate) {
		int oldDataRate = dataRate;
		dataRate = newDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__DATA_RATE, oldDataRate, dataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRadioFrequency() {
		return radioFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioFrequency(int newRadioFrequency) {
		int oldRadioFrequency = radioFrequency;
		radioFrequency = newRadioFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__RADIO_FREQUENCY, oldRadioFrequency, radioFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this, DronePackage.DRONE__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemory() {
		if (memory == null) {
			memory = new EObjectContainmentEList<Memory>(Memory.class, this, DronePackage.DRONE__MEMORY);
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDataEquipment() {
		if (dataEquipment == null) {
			dataEquipment = new EObjectContainmentEList<Device>(Device.class, this, DronePackage.DRONE__DATA_EQUIPMENT);
		}
		return dataEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSDriver getRosDriver() {
		return rosDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRosDriver(ROSDriver newRosDriver, NotificationChain msgs) {
		ROSDriver oldRosDriver = rosDriver;
		rosDriver = newRosDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__ROS_DRIVER, oldRosDriver, newRosDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosDriver(ROSDriver newRosDriver) {
		if (newRosDriver != rosDriver) {
			NotificationChain msgs = null;
			if (rosDriver != null)
				msgs = ((InternalEObject)rosDriver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.DRONE__ROS_DRIVER, null, msgs);
			if (newRosDriver != null)
				msgs = ((InternalEObject)newRosDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.DRONE__ROS_DRIVER, null, msgs);
			msgs = basicSetRosDriver(newRosDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__ROS_DRIVER, newRosDriver, newRosDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronePackage.DRONE__SIZE:
				return basicSetSize(null, msgs);
			case DronePackage.DRONE__FLIGHT_PERF:
				return basicSetFlightPerf(null, msgs);
			case DronePackage.DRONE__BATTERIES:
				return ((InternalEList<?>)getBatteries()).basicRemove(otherEnd, msgs);
			case DronePackage.DRONE__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
			case DronePackage.DRONE__MEMORY:
				return ((InternalEList<?>)getMemory()).basicRemove(otherEnd, msgs);
			case DronePackage.DRONE__DATA_EQUIPMENT:
				return ((InternalEList<?>)getDataEquipment()).basicRemove(otherEnd, msgs);
			case DronePackage.DRONE__ROS_DRIVER:
				return basicSetRosDriver(null, msgs);
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
			case DronePackage.DRONE__SIZE:
				return getSize();
			case DronePackage.DRONE__FLIGHT_PERF:
				return getFlightPerf();
			case DronePackage.DRONE__BATTERIES:
				return getBatteries();
			case DronePackage.DRONE__ON_BOARD_OBSTACLE_AVOIDANCE:
				return isOnBoardObstacleAvoidance();
			case DronePackage.DRONE__MIN_VOLTAGE:
				return getMinVoltage();
			case DronePackage.DRONE__MAX_VOLTAGE:
				return getMaxVoltage();
			case DronePackage.DRONE__MAX_POWER_CONSUMPTION:
				return getMaxPowerConsumption();
			case DronePackage.DRONE__GIRO:
				return isGiro();
			case DronePackage.DRONE__GPS:
				return isGps();
			case DronePackage.DRONE__ACCELEROMETER:
				return isAccelerometer();
			case DronePackage.DRONE__MAGNETOMETER:
				return isMagnetometer();
			case DronePackage.DRONE__BAROMETER:
				return isBarometer();
			case DronePackage.DRONE__COMMUNICATION_RANGE:
				return getCommunicationRange();
			case DronePackage.DRONE__DATA_RATE:
				return getDataRate();
			case DronePackage.DRONE__RADIO_FREQUENCY:
				return getRadioFrequency();
			case DronePackage.DRONE__PROCESSORS:
				return getProcessors();
			case DronePackage.DRONE__MEMORY:
				return getMemory();
			case DronePackage.DRONE__DATA_EQUIPMENT:
				return getDataEquipment();
			case DronePackage.DRONE__ROS_DRIVER:
				return getRosDriver();
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
			case DronePackage.DRONE__SIZE:
				setSize((Size)newValue);
				return;
			case DronePackage.DRONE__FLIGHT_PERF:
				setFlightPerf((FlightPerformance)newValue);
				return;
			case DronePackage.DRONE__BATTERIES:
				getBatteries().clear();
				getBatteries().addAll((Collection<? extends Battery>)newValue);
				return;
			case DronePackage.DRONE__ON_BOARD_OBSTACLE_AVOIDANCE:
				setOnBoardObstacleAvoidance((Boolean)newValue);
				return;
			case DronePackage.DRONE__MIN_VOLTAGE:
				setMinVoltage((Float)newValue);
				return;
			case DronePackage.DRONE__MAX_VOLTAGE:
				setMaxVoltage((Float)newValue);
				return;
			case DronePackage.DRONE__MAX_POWER_CONSUMPTION:
				setMaxPowerConsumption((Float)newValue);
				return;
			case DronePackage.DRONE__GIRO:
				setGiro((Boolean)newValue);
				return;
			case DronePackage.DRONE__GPS:
				setGps((Boolean)newValue);
				return;
			case DronePackage.DRONE__ACCELEROMETER:
				setAccelerometer((Boolean)newValue);
				return;
			case DronePackage.DRONE__MAGNETOMETER:
				setMagnetometer((Boolean)newValue);
				return;
			case DronePackage.DRONE__BAROMETER:
				setBarometer((Boolean)newValue);
				return;
			case DronePackage.DRONE__COMMUNICATION_RANGE:
				setCommunicationRange((Float)newValue);
				return;
			case DronePackage.DRONE__DATA_RATE:
				setDataRate((Integer)newValue);
				return;
			case DronePackage.DRONE__RADIO_FREQUENCY:
				setRadioFrequency((Integer)newValue);
				return;
			case DronePackage.DRONE__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
			case DronePackage.DRONE__MEMORY:
				getMemory().clear();
				getMemory().addAll((Collection<? extends Memory>)newValue);
				return;
			case DronePackage.DRONE__DATA_EQUIPMENT:
				getDataEquipment().clear();
				getDataEquipment().addAll((Collection<? extends Device>)newValue);
				return;
			case DronePackage.DRONE__ROS_DRIVER:
				setRosDriver((ROSDriver)newValue);
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
			case DronePackage.DRONE__SIZE:
				setSize((Size)null);
				return;
			case DronePackage.DRONE__FLIGHT_PERF:
				setFlightPerf((FlightPerformance)null);
				return;
			case DronePackage.DRONE__BATTERIES:
				getBatteries().clear();
				return;
			case DronePackage.DRONE__ON_BOARD_OBSTACLE_AVOIDANCE:
				setOnBoardObstacleAvoidance(ON_BOARD_OBSTACLE_AVOIDANCE_EDEFAULT);
				return;
			case DronePackage.DRONE__MIN_VOLTAGE:
				setMinVoltage(MIN_VOLTAGE_EDEFAULT);
				return;
			case DronePackage.DRONE__MAX_VOLTAGE:
				setMaxVoltage(MAX_VOLTAGE_EDEFAULT);
				return;
			case DronePackage.DRONE__MAX_POWER_CONSUMPTION:
				setMaxPowerConsumption(MAX_POWER_CONSUMPTION_EDEFAULT);
				return;
			case DronePackage.DRONE__GIRO:
				setGiro(GIRO_EDEFAULT);
				return;
			case DronePackage.DRONE__GPS:
				setGps(GPS_EDEFAULT);
				return;
			case DronePackage.DRONE__ACCELEROMETER:
				setAccelerometer(ACCELEROMETER_EDEFAULT);
				return;
			case DronePackage.DRONE__MAGNETOMETER:
				setMagnetometer(MAGNETOMETER_EDEFAULT);
				return;
			case DronePackage.DRONE__BAROMETER:
				setBarometer(BAROMETER_EDEFAULT);
				return;
			case DronePackage.DRONE__COMMUNICATION_RANGE:
				setCommunicationRange(COMMUNICATION_RANGE_EDEFAULT);
				return;
			case DronePackage.DRONE__DATA_RATE:
				setDataRate(DATA_RATE_EDEFAULT);
				return;
			case DronePackage.DRONE__RADIO_FREQUENCY:
				setRadioFrequency(RADIO_FREQUENCY_EDEFAULT);
				return;
			case DronePackage.DRONE__PROCESSORS:
				getProcessors().clear();
				return;
			case DronePackage.DRONE__MEMORY:
				getMemory().clear();
				return;
			case DronePackage.DRONE__DATA_EQUIPMENT:
				getDataEquipment().clear();
				return;
			case DronePackage.DRONE__ROS_DRIVER:
				setRosDriver((ROSDriver)null);
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
			case DronePackage.DRONE__SIZE:
				return size != null;
			case DronePackage.DRONE__FLIGHT_PERF:
				return flightPerf != null;
			case DronePackage.DRONE__BATTERIES:
				return batteries != null && !batteries.isEmpty();
			case DronePackage.DRONE__ON_BOARD_OBSTACLE_AVOIDANCE:
				return onBoardObstacleAvoidance != ON_BOARD_OBSTACLE_AVOIDANCE_EDEFAULT;
			case DronePackage.DRONE__MIN_VOLTAGE:
				return minVoltage != MIN_VOLTAGE_EDEFAULT;
			case DronePackage.DRONE__MAX_VOLTAGE:
				return maxVoltage != MAX_VOLTAGE_EDEFAULT;
			case DronePackage.DRONE__MAX_POWER_CONSUMPTION:
				return maxPowerConsumption != MAX_POWER_CONSUMPTION_EDEFAULT;
			case DronePackage.DRONE__GIRO:
				return giro != GIRO_EDEFAULT;
			case DronePackage.DRONE__GPS:
				return gps != GPS_EDEFAULT;
			case DronePackage.DRONE__ACCELEROMETER:
				return accelerometer != ACCELEROMETER_EDEFAULT;
			case DronePackage.DRONE__MAGNETOMETER:
				return magnetometer != MAGNETOMETER_EDEFAULT;
			case DronePackage.DRONE__BAROMETER:
				return barometer != BAROMETER_EDEFAULT;
			case DronePackage.DRONE__COMMUNICATION_RANGE:
				return communicationRange != COMMUNICATION_RANGE_EDEFAULT;
			case DronePackage.DRONE__DATA_RATE:
				return dataRate != DATA_RATE_EDEFAULT;
			case DronePackage.DRONE__RADIO_FREQUENCY:
				return radioFrequency != RADIO_FREQUENCY_EDEFAULT;
			case DronePackage.DRONE__PROCESSORS:
				return processors != null && !processors.isEmpty();
			case DronePackage.DRONE__MEMORY:
				return memory != null && !memory.isEmpty();
			case DronePackage.DRONE__DATA_EQUIPMENT:
				return dataEquipment != null && !dataEquipment.isEmpty();
			case DronePackage.DRONE__ROS_DRIVER:
				return rosDriver != null;
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
		result.append(" (onBoardObstacleAvoidance: ");
		result.append(onBoardObstacleAvoidance);
		result.append(", minVoltage: ");
		result.append(minVoltage);
		result.append(", maxVoltage: ");
		result.append(maxVoltage);
		result.append(", maxPowerConsumption: ");
		result.append(maxPowerConsumption);
		result.append(", giro: ");
		result.append(giro);
		result.append(", gps: ");
		result.append(gps);
		result.append(", accelerometer: ");
		result.append(accelerometer);
		result.append(", magnetometer: ");
		result.append(magnetometer);
		result.append(", barometer: ");
		result.append(barometer);
		result.append(", communicationRange: ");
		result.append(communicationRange);
		result.append(", dataRate: ");
		result.append(dataRate);
		result.append(", radioFrequency: ");
		result.append(radioFrequency);
		result.append(')');
		return result.toString();
	}

} //DroneImpl
