package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>HeadTo</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class HeadTo extends Move {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float direction = 0.0f;
	
	public HeadTo(JsonObject jsonObject) {
		super(jsonObject);
		this.direction = (float) jsonObject.getJsonNumber("direction").doubleValue();
	}
	

	/**
	 * Returns the value of '<em><b>direction</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>direction</b></em>' feature
	 * @generated
	 */
	public float getDirection() {
		return direction;
	}

	/**
	 * Sets the '{@link HeadTo#getDirection() <em>direction</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDirection
	 *            the new value of the '{@link HeadTo#getDirection() direction}'
	 *            feature.
	 * @generated
	 */
	public void setDirection(float newDirection) {
		direction = newDirection;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "HeadTo " + " [direction: " + getDirection() + "]";
	}
}
