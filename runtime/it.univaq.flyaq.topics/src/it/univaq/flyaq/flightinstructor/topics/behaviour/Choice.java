package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Choice</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Choice extends MoveTransition {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String conditionIdentifier = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Move falseBranch = null;
	
	public Choice(JsonObject jsonObject, Behaviour behaviour) {
		super(jsonObject, behaviour);
		this.conditionIdentifier = jsonObject.getString("condition_identifier");
		this.falseBranch = Move.create(jsonObject.getJsonObject("false_branch"), behaviour);
	}

	/**
	 * Returns the value of '<em><b>conditionIdentifier</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>conditionIdentifier</b></em>' feature
	 * @generated
	 */
	public String getConditionIdentifier() {
		return conditionIdentifier;
	}

	/**
	 * Sets the '{@link Choice#getConditionIdentifier()
	 * <em>conditionIdentifier</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newConditionIdentifier
	 *            the new value of the '{@link Choice#getConditionIdentifier()
	 *            conditionIdentifier}' feature.
	 * @generated
	 */
	public void setConditionIdentifier(String newConditionIdentifier) {
		conditionIdentifier = newConditionIdentifier;
	}

	/**
	 * Returns the value of '<em><b>falseBranch</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>falseBranch</b></em>' feature
	 * @generated
	 */
	public Move getFalseBranch() {
		return falseBranch;
	}

	/**
	 * Sets the '{@link Choice#getFalseBranch() <em>falseBranch</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFalseBranch
	 *            the new value of the '{@link Choice#getFalseBranch()
	 *            falseBranch}' feature.
	 * @generated
	 */
	public void setFalseBranch(Move newFalseBranch) {
		falseBranch = newFalseBranch;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Choice " + " [conditionIdentifier: " + getConditionIdentifier()
				+ "]";
	}
}
