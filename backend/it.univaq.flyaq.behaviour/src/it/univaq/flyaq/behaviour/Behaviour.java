/**
 */
package it.univaq.flyaq.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Behaviour#getCrs <em>Crs</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Behaviour#getDrones <em>Drones</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs</em>' attribute.
	 * @see #setCrs(String)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getBehaviour_Crs()
	 * @model
	 * @generated
	 */
	String getCrs();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Behaviour#getCrs <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs</em>' attribute.
	 * @see #getCrs()
	 * @generated
	 */
	void setCrs(String value);

	/**
	 * Returns the value of the '<em><b>Drones</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Drone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drones</em>' containment reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getBehaviour_Drones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Drone> getDrones();

} // Behaviour
