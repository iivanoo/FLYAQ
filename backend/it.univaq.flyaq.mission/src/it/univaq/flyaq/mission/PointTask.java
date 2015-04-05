/**
 */
package it.univaq.flyaq.mission;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.PointTask#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getPointTask()
 * @model abstract="true"
 * @generated
 */
public interface PointTask extends Task {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Coordinate)
	 * @see it.univaq.flyaq.mission.MissionPackage#getPointTask_Point()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getPoint();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.PointTask#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Coordinate value);

} // PointTask
