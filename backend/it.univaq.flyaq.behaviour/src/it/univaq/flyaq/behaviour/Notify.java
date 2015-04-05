/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Notify#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getNotify()
 * @model abstract="true"
 * @generated
 */
public interface Notify extends CommunicationAction {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference.
	 * @see #setSlot(Slot)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getNotify_Slot()
	 * @model required="true"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Notify#getSlot <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(Slot value);

} // Notify
