/**
 */
package it.univaq.flyaq.behaviour;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.MoveTransition#getWaitFor <em>Wait For</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.MoveTransition#getFrom <em>From</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.MoveTransition#getTo <em>To</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.MoveTransition#isFluid <em>Fluid</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMoveTransition()
 * @model
 * @generated
 */
public interface MoveTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Wait For</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.flyaq.behaviour.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For</em>' reference list.
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMoveTransition_WaitFor()
	 * @model
	 * @generated
	 */
	EList<Slot> getWaitFor();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Move)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMoveTransition_From()
	 * @model required="true"
	 * @generated
	 */
	Move getFrom();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.MoveTransition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Move value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Move)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMoveTransition_To()
	 * @model required="true"
	 * @generated
	 */
	Move getTo();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.MoveTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Move value);

	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fluid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid</em>' attribute.
	 * @see #setFluid(boolean)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getMoveTransition_Fluid()
	 * @model
	 * @generated
	 */
	boolean isFluid();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.MoveTransition#isFluid <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' attribute.
	 * @see #isFluid()
	 * @generated
	 */
	void setFluid(boolean value);

} // MoveTransition
