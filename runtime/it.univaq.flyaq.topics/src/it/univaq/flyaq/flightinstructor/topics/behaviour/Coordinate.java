package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Coordinate</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Coordinate {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float latitude = 0.0f;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float longitude = 0.0f;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float altitude = 0.0f;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float heading = 0.0f;
	
	public Coordinate(JsonObject jsonObject) {
		this.latitude = (float) jsonObject.getJsonNumber("latitude").doubleValue();
		this.longitude = (float) jsonObject.getJsonNumber("longitude").doubleValue();
		this.altitude = (float) jsonObject.getJsonNumber("altitude").doubleValue();
		this.heading = (float) jsonObject.getJsonNumber("heading").doubleValue();
	}

	/**
	 * Returns the value of '<em><b>latitude</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>latitude</b></em>' feature
	 * @generated
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * Sets the '{@link Coordinate#getLatitude() <em>latitude</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLatitude
	 *            the new value of the '{@link Coordinate#getLatitude()
	 *            latitude}' feature.
	 * @generated
	 */
	public void setLatitude(float newLatitude) {
		latitude = newLatitude;
	}

	/**
	 * Returns the value of '<em><b>longitude</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>longitude</b></em>' feature
	 * @generated
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * Sets the '{@link Coordinate#getLongitude() <em>longitude</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLongitude
	 *            the new value of the '{@link Coordinate#getLongitude()
	 *            longitude}' feature.
	 * @generated
	 */
	public void setLongitude(float newLongitude) {
		longitude = newLongitude;
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
	 * Sets the '{@link Coordinate#getAltitude() <em>altitude</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAltitude
	 *            the new value of the '{@link Coordinate#getAltitude()
	 *            altitude}' feature.
	 * @generated
	 */
	public void setAltitude(float newAltitude) {
		altitude = newAltitude;
	}

	/**
	 * Returns the value of '<em><b>heading</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>heading</b></em>' feature
	 * @generated
	 */
	public float getHeading() {
		return heading;
	}

	/**
	 * Sets the '{@link Coordinate#getHeading() <em>heading</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newHeading
	 *            the new value of the '{@link Coordinate#getHeading() heading}'
	 *            feature.
	 * @generated
	 */
	public void setHeading(float newHeading) {
		heading = newHeading;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Coordinate " + " [latitude: " + getLatitude() + "]"
				+ " [longitude: " + getLongitude() + "]" + " [altitude: "
				+ getAltitude() + "]" + " [heading: " + getHeading() + "]";
	}
}
