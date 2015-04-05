/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Choice#getConditionIdentifier <em>Condition Identifier</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Choice#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends MoveTransition {
	/**
	 * Returns the value of the '<em><b>Condition Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Identifier</em>' attribute.
	 * @see #setConditionIdentifier(String)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getChoice_ConditionIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getConditionIdentifier();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Choice#getConditionIdentifier <em>Condition Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Identifier</em>' attribute.
	 * @see #getConditionIdentifier()
	 * @generated
	 */
	void setConditionIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>False Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Branch</em>' reference.
	 * @see #setFalseBranch(Move)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getChoice_FalseBranch()
	 * @model required="true"
	 * @generated
	 */
	Move getFalseBranch();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Choice#getFalseBranch <em>False Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Branch</em>' reference.
	 * @see #getFalseBranch()
	 * @generated
	 */
	void setFalseBranch(Move value);

} // Choice
