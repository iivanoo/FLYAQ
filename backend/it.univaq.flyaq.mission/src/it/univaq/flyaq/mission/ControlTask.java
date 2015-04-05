/**
 */
package it.univaq.flyaq.mission;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.ControlTask#getReferencePosition <em>Reference Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getControlTask()
 * @model abstract="true"
 * @generated
 */
public interface ControlTask extends Task {
	/**
	 * Returns the value of the '<em><b>Reference Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Position</em>' containment reference.
	 * @see #setReferencePosition(Coordinate)
	 * @see it.univaq.flyaq.mission.MissionPackage#getControlTask_ReferencePosition()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getReferencePosition();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.ControlTask#getReferencePosition <em>Reference Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Position</em>' containment reference.
	 * @see #getReferencePosition()
	 * @generated
	 */
	void setReferencePosition(Coordinate value);

} // ControlTask
