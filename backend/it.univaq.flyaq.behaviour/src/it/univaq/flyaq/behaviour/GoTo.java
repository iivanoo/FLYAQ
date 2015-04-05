/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.GoTo#getTargetPosition <em>Target Position</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.GoTo#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getGoTo()
 * @model
 * @generated
 */
public interface GoTo extends Move {
	/**
	 * Returns the value of the '<em><b>Target Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Position</em>' containment reference.
	 * @see #setTargetPosition(Coordinate)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getGoTo_TargetPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getTargetPosition();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.GoTo#getTargetPosition <em>Target Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Position</em>' containment reference.
	 * @see #getTargetPosition()
	 * @generated
	 */
	void setTargetPosition(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.flyaq.behaviour.GoToStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see it.univaq.flyaq.behaviour.GoToStrategy
	 * @see #setStrategy(GoToStrategy)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getGoTo_Strategy()
	 * @model required="true"
	 * @generated
	 */
	GoToStrategy getStrategy();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.GoTo#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see it.univaq.flyaq.behaviour.GoToStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(GoToStrategy value);

} // GoTo
