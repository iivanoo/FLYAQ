/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicast Notify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.UnicastNotify#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getUnicastNotify()
 * @model
 * @generated
 */
public interface UnicastNotify extends Notify {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Drone)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getUnicastNotify_Receiver()
	 * @model required="true"
	 * @generated
	 */
	Drone getReceiver();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.UnicastNotify#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Drone value);

} // UnicastNotify
