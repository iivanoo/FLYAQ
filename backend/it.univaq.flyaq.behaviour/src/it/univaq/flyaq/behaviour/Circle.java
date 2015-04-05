/**
 */
package it.univaq.flyaq.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.Circle#getTargetPosition <em>Target Position</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Circle#getDuration <em>Duration</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Circle#getRadius <em>Radius</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Circle#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.Circle#isClockwise <em>Clockwise</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Move {
	/**
	 * Returns the value of the '<em><b>Target Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Position</em>' containment reference.
	 * @see #setTargetPosition(Coordinate)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getCircle_TargetPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getTargetPosition();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Circle#getTargetPosition <em>Target Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Position</em>' containment reference.
	 * @see #getTargetPosition()
	 * @generated
	 */
	void setTargetPosition(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getCircle_Duration()
	 * @model required="true"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Circle#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(float)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getCircle_Radius()
	 * @model required="true"
	 * @generated
	 */
	float getRadius();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(float value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(float)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getCircle_Altitude()
	 * @model required="true"
	 * @generated
	 */
	float getAltitude();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Circle#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(float value);

	/**
	 * Returns the value of the '<em><b>Clockwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clockwise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clockwise</em>' attribute.
	 * @see #setClockwise(boolean)
	 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getCircle_Clockwise()
	 * @model required="true"
	 * @generated
	 */
	boolean isClockwise();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.behaviour.Circle#isClockwise <em>Clockwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clockwise</em>' attribute.
	 * @see #isClockwise()
	 * @generated
	 */
	void setClockwise(boolean value);

} // Circle
