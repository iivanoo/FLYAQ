package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Circle</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Circle extends Move {

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
	private float duration = 0.0f;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private float radius = 0.0f;

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
	private boolean clockwise = false;
	
	public Circle(JsonObject jsonObject) {
		super(jsonObject);
		this.targetPosition = new Coordinate(jsonObject.getJsonObject("target_position"));
		this.duration = (float) jsonObject.getJsonNumber("duration").doubleValue();
		this.radius = (float) jsonObject.getJsonNumber("radius").doubleValue();
		this.altitude = (float) jsonObject.getJsonNumber("circle_altitude").doubleValue();
		this.clockwise = jsonObject.getBoolean("clockwise");
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
	 * Sets the '{@link Circle#getTargetPosition() <em>targetPosition</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTargetPosition
	 *            the new value of the '{@link Circle#getTargetPosition()
	 *            targetPosition}' feature.
	 * @generated
	 */
	public void setTargetPosition(Coordinate newTargetPosition) {
		targetPosition = newTargetPosition;
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
	 * Sets the '{@link Circle#getDuration() <em>duration</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDuration
	 *            the new value of the '{@link Circle#getDuration() duration}'
	 *            feature.
	 * @generated
	 */
	public void setDuration(float newDuration) {
		duration = newDuration;
	}

	/**
	 * Returns the value of '<em><b>radius</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>radius</b></em>' feature
	 * @generated
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * Sets the '{@link Circle#getRadius() <em>radius</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRadius
	 *            the new value of the '{@link Circle#getRadius() radius}'
	 *            feature.
	 * @generated
	 */
	public void setRadius(float newRadius) {
		radius = newRadius;
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
	 * Sets the '{@link Circle#getAltitude() <em>altitude</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAltitude
	 *            the new value of the '{@link Circle#getAltitude() altitude}'
	 *            feature.
	 * @generated
	 */
	public void setAltitude(float newAltitude) {
		altitude = newAltitude;
	}

	/**
	 * Returns the value of '<em><b>clockwise</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>clockwise</b></em>' feature
	 * @generated
	 */
	public boolean isClockwise() {
		return clockwise;
	}

	/**
	 * Sets the '{@link Circle#isClockwise() <em>clockwise</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newClockwise
	 *            the new value of the '{@link Circle#isClockwise() clockwise}'
	 *            feature.
	 * @generated
	 */
	public void setClockwise(boolean newClockwise) {
		clockwise = newClockwise;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Circle " + " [duration: " + getDuration() + "]" + " [radius: "
				+ getRadius() + "]" + " [altitude: " + getAltitude() + "]"
				+ " [clockwise: " + isClockwise() + "]";
	}
}
