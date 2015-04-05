/**
 */
package it.univaq.flyaq.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Move#getPreActions <em>Pre Actions</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Move#getPostActions <em>Post Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMove()
 * @model abstract="true"
 * @generated
 */
public interface Move extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pre Actions</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Actions</em>' containment reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMove_PreActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getPreActions();

	/**
	 * Returns the value of the '<em><b>Post Actions</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Actions</em>' containment reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMove_PostActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getPostActions();

} // Move
