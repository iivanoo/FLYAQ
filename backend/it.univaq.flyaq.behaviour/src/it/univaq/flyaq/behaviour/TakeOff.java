/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Take Off</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.TakeOff#getAltitude <em>Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getTakeOff()
 * @model
 * @generated
 */
public interface TakeOff extends Move {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(float)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getTakeOff_Altitude()
	 * @model
	 * @generated
	 */
	float getAltitude();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.TakeOff#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(float value);

} // TakeOff
