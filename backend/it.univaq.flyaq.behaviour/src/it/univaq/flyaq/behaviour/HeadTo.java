/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.HeadTo#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getHeadTo()
 * @model
 * @generated
 */
public interface HeadTo extends Move {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(float)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getHeadTo_Direction()
	 * @model
	 * @generated
	 */
	float getDirection();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.HeadTo#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(float value);

} // HeadTo
