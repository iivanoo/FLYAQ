package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Hover</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Hover extends Move {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float duration = 0.0f;
	
	public Hover(JsonObject jsonObject) {
		super(jsonObject);
		this.duration = (float) jsonObject.getJsonNumber("duration").doubleValue();
	}

	/**
	 * Returns the value of '<em><b>duration</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>duration</b></em>' feature
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * Sets the '{@link Hover#getDuration() <em>duration</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDuration
	 *            the new value of the '{@link Hover#getDuration() duration}'
	 *            feature.
	 * @generated
	 */
	public void setDuration(float newDuration) {
		duration = newDuration;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Hover " + " [duration: " + getDuration() + "]";
	}
}
