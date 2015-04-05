package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>GoTo</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GoTo extends Move {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Coordinate targetPosition = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private GoToStrategy strategy = null;
	
	public GoTo(JsonObject jsonObject) {
		super(jsonObject);
		this.targetPosition = new Coordinate(jsonObject.getJsonObject("target_position"));
		this.strategy = GoToStrategy.get(jsonObject.getInt("strategy"));
	}

	/**
	 * Returns the value of '<em><b>targetPosition</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>targetPosition</b></em>' feature
	 * @generated
	 */
	public Coordinate getTargetPosition() {
		return targetPosition;
	}

	/**
	 * Sets the '{@link GoTo#getTargetPosition() <em>targetPosition</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTargetPosition
	 *            the new value of the '{@link GoTo#getTargetPosition()
	 *            targetPosition}' feature.
	 * @generated
	 */
	public void setTargetPosition(Coordinate newTargetPosition) {
		targetPosition = newTargetPosition;
	}

	/**
	 * Returns the value of '<em><b>strategy</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>strategy</b></em>' feature
	 * @generated
	 */
	public GoToStrategy getStrategy() {
		return strategy;
	}

	/**
	 * Sets the '{@link GoTo#getStrategy() <em>strategy</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStrategy
	 *            the new value of the '{@link GoTo#getStrategy() strategy}'
	 *            feature.
	 * @generated
	 */
	public void setStrategy(GoToStrategy newStrategy) {
		strategy = newStrategy;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "GoTo " + " [strategy: " + getStrategy() + "]";
	}
}
