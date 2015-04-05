/**
 */
package it.univaq.flyaq.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicast Notify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.MulticastNotify#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMulticastNotify()
 * @model
 * @generated
 */
public interface MulticastNotify extends Notify {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Drone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMulticastNotify_Receiver()
	 * @model required="true"
	 * @generated
	 */
	EList<Drone> getReceiver();

} // MulticastNotify
