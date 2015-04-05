/**
 */
package it.univaq.flyaq.drone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.Memory#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Memory#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Memory#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.drone.DronePackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.flyaq.drone.MemoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.univaq.flyaq.drone.MemoryType
	 * @see #setType(MemoryType)
	 * @see it.univaq.flyaq.drone.DronePackage#getMemory_Type()
	 * @model required="true"
	 * @generated
	 */
	MemoryType getType();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Memory#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.univaq.flyaq.drone.MemoryType
	 * @see #getType()
	 * @generated
	 */
	void setType(MemoryType value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' attribute.
	 * @see #setSubType(String)
	 * @see it.univaq.flyaq.drone.DronePackage#getMemory_SubType()
	 * @model
	 * @generated
	 */
	String getSubType();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Memory#getSubType <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' attribute.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getMemory_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Memory#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // Memory
