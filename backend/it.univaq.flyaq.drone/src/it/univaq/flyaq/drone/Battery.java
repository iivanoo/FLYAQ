/**
 */
package it.univaq.flyaq.drone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.Battery#getCellType <em>Cell Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Battery#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Battery#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Battery#getRechargeTime <em>Recharge Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.drone.DronePackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cell Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Type</em>' attribute.
	 * @see #setCellType(String)
	 * @see it.univaq.flyaq.drone.DronePackage#getBattery_CellType()
	 * @model required="true"
	 * @generated
	 */
	String getCellType();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Battery#getCellType <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Type</em>' attribute.
	 * @see #getCellType()
	 * @generated
	 */
	void setCellType(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getBattery_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Battery#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getBattery_Voltage()
	 * @model required="true"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Battery#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Recharge Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recharge Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recharge Time</em>' attribute.
	 * @see #setRechargeTime(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getBattery_RechargeTime()
	 * @model
	 * @generated
	 */
	int getRechargeTime();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Battery#getRechargeTime <em>Recharge Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recharge Time</em>' attribute.
	 * @see #getRechargeTime()
	 * @generated
	 */
	void setRechargeTime(int value);

} // Battery
