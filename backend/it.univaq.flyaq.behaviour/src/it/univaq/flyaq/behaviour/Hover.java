/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Hover#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getHover()
 * @model
 * @generated
 */
public interface Hover extends Move {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getHover_Duration()
	 * @model required="true"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Hover#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

} // Hover
