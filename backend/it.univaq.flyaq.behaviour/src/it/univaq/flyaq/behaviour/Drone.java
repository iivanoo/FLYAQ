/**
 */
package it.univaq.flyaq.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Drone#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Drone#getHome <em>Home</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Drone#getMovements <em>Movements</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Drone#getMoveTransitions <em>Move Transitions</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Drone#getSlots <em>Slots</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Drone#getTravelMode <em>Travel Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone_TypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Drone#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(Coordinate)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone_Home()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getHome();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Drone#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Movements</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movements</em>' containment reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone_Movements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMovements();

	/**
	 * Returns the value of the '<em><b>Move Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.MoveTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Transitions</em>' containment reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone_MoveTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MoveTransition> getMoveTransitions();

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone_Slots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slot> getSlots();

	/**
	 * Returns the value of the '<em><b>Travel Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.flyaq.behaviour.TravelMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Mode</em>' attribute.
	 * @see it.univaq.flyaq.behaviour.TravelMode
	 * @see #setTravelMode(TravelMode)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getDrone_TravelMode()
	 * @model required="true"
	 * @generated
	 */
	TravelMode getTravelMode();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Drone#getTravelMode <em>Travel Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Mode</em>' attribute.
	 * @see it.univaq.flyaq.behaviour.TravelMode
	 * @see #getTravelMode()
	 * @generated
	 */
	void setTravelMode(TravelMode value);

} // Drone
