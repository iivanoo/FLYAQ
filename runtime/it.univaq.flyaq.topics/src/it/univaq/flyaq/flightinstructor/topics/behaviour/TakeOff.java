package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>TakeOff</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TakeOff extends Move {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float altitude = 0.0f;
	
	public TakeOff(JsonObject jsonObject) {
		super(jsonObject);
		this.altitude = (float) jsonObject.getJsonNumber("altitude").doubleValue();
	}

	/**
	 * Returns the value of '<em><b>altitude</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>altitude</b></em>' feature
	 * @generated
	 */
	public float getAltitude() {
		return altitude;
	}

	/**
	 * Sets the '{@link TakeOff#getAltitude() <em>altitude</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAltitude
	 *            the new value of the '{@link TakeOff#getAltitude() altitude}'
	 *            feature.
	 * @generated
	 */
	public void setAltitude(float newAltitude) {
		altitude = newAltitude;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TakeOff " + " [altitude: " + getAltitude() + "]";
	}
}
