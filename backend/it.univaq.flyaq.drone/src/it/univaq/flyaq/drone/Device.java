/**
 */
package it.univaq.flyaq.drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.Device#getSupportedActions <em>Supported Actions</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Device#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.drone.DronePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Supported Actions</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.drone.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Actions</em>' containment reference list.
	 * @see it.univaq.flyaq.drone.DronePackage#getDevice_SupportedActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getSupportedActions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.drone.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see it.univaq.flyaq.drone.DronePackage#getDevice_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Device
