package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>MoveTransition</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MoveTransition {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Slot waitFor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Move from = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Move to = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean fluid = false;
	
	static MoveTransition create(JsonObject jsonObject, Behaviour behaviour) {
		if(jsonObject.getBoolean("is_choice")) {
			return new Choice(jsonObject, behaviour);
		}
		return new MoveTransition(jsonObject, behaviour);
	}
	
	public MoveTransition(JsonObject jsonObject, Behaviour behaviour) {
		this.waitFor = behaviour.getSlotByName(jsonObject.getString("wait_for_slot_name"));
		this.from = behaviour.getMoveByName(jsonObject.getString("from_move_name"));
		this.to = behaviour.getMoveByName(jsonObject.getString("to_move_name"));
		this.fluid = jsonObject.getBoolean("fluid");
	}

	/**
	 * Returns the value of '<em><b>waitFor</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>waitFor</b></em>' feature
	 * @generated
	 */
	public Slot getWaitFor() {
		return waitFor;
	}

	/**
	 * Sets the '{@link MoveTransition#getWaitFor() <em>waitFor</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWaitFor
	 *            the new value of the '{@link MoveTransition#getWaitFor()
	 *            waitFor}' feature.
	 * @generated
	 */
	public void setWaitFor(Slot newWaitFor) {
		waitFor = newWaitFor;
	}

	/**
	 * Returns the value of '<em><b>from</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>from</b></em>' feature
	 * @generated
	 */
	public Move getFrom() {
		return from;
	}

	/**
	 * Sets the '{@link MoveTransition#getFrom() <em>from</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFrom
	 *            the new value of the '{@link MoveTransition#getFrom() from}'
	 *            feature.
	 * @generated
	 */
	public void setFrom(Move newFrom) {
		from = newFrom;
	}

	/**
	 * Returns the value of '<em><b>to</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>to</b></em>' feature
	 * @generated
	 */
	public Move getTo() {
		return to;
	}

	/**
	 * Sets the '{@link MoveTransition#getTo() <em>to</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTo
	 *            the new value of the '{@link MoveTransition#getTo() to}'
	 *            feature.
	 * @generated
	 */
	public void setTo(Move newTo) {
		to = newTo;
	}

	/**
	 * Returns the value of '<em><b>fluid</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fluid</b></em>' feature
	 * @generated
	 */
	public boolean isFluid() {
		return fluid;
	}

	/**
	 * Sets the '{@link MoveTransition#isFluid() <em>fluid</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFluid
	 *            the new value of the '{@link MoveTransition#isFluid() fluid}'
	 *            feature.
	 * @generated
	 */
	public void setFluid(boolean newFluid) {
		fluid = newFluid;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "MoveTransition " + " [fluid: " + isFluid() + "]";
	}
}
