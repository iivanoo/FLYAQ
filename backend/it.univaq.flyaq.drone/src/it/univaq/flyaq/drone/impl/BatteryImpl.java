/**
 */
package it.univaq.flyaq.drone.impl;

import it.univaq.flyaq.drone.Battery;
import it.univaq.flyaq.drone.DronePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.impl.BatteryImpl#getCellType <em>Cell Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.BatteryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.BatteryImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.impl.BatteryImpl#getRechargeTime <em>Recharge Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatteryImpl extends NamedElementImpl implements Battery {
	/**
	 * The default value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellType()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellType()
	 * @generated
	 * @ordered
	 */
	protected String cellType = CELL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected float voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRechargeTime() <em>Recharge Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechargeTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RECHARGE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRechargeTime() <em>Recharge Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechargeTime()
	 * @generated
	 * @ordered
	 */
	protected int rechargeTime = RECHARGE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronePackage.Literals.BATTERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellType() {
		return cellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellType(String newCellType) {
		String oldCellType = cellType;
		cellType = newCellType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__CELL_TYPE, oldCellType, cellType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(float newVoltage) {
		float oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRechargeTime() {
		return rechargeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRechargeTime(int newRechargeTime) {
		int oldRechargeTime = rechargeTime;
		rechargeTime = newRechargeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__RECHARGE_TIME, oldRechargeTime, rechargeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronePackage.BATTERY__CELL_TYPE:
				return getCellType();
			case DronePackage.BATTERY__CAPACITY:
				return getCapacity();
			case DronePackage.BATTERY__VOLTAGE:
				return getVoltage();
			case DronePackage.BATTERY__RECHARGE_TIME:
				return getRechargeTime();
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
			case DronePackage.BATTERY__CELL_TYPE:
				setCellType((String)newValue);
				return;
			case DronePackage.BATTERY__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case DronePackage.BATTERY__VOLTAGE:
				setVoltage((Float)newValue);
				return;
			case DronePackage.BATTERY__RECHARGE_TIME:
				setRechargeTime((Integer)newValue);
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
			case DronePackage.BATTERY__CELL_TYPE:
				setCellType(CELL_TYPE_EDEFAULT);
				return;
			case DronePackage.BATTERY__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case DronePackage.BATTERY__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case DronePackage.BATTERY__RECHARGE_TIME:
				setRechargeTime(RECHARGE_TIME_EDEFAULT);
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
			case DronePackage.BATTERY__CELL_TYPE:
				return CELL_TYPE_EDEFAULT == null ? cellType != null : !CELL_TYPE_EDEFAULT.equals(cellType);
			case DronePackage.BATTERY__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case DronePackage.BATTERY__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case DronePackage.BATTERY__RECHARGE_TIME:
				return rechargeTime != RECHARGE_TIME_EDEFAULT;
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
		result.append(" (cellType: ");
		result.append(cellType);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", rechargeTime: ");
		result.append(rechargeTime);
		result.append(')');
		return result.toString();
	}

} //BatteryImpl
