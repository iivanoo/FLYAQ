/**
 */
package it.univaq.flyaq.mission;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.LineTask#getPoints <em>Points</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.LineTask#getInitialPosition <em>Initial Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getLineTask()
 * @model abstract="true"
 * @generated
 */
public interface LineTask extends Task {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.mission.Coordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see it.univaq.flyaq.mission.MissionPackage#getLineTask_Points()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Coordinate> getPoints();

	/**
	 * Returns the value of the '<em><b>Initial Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Position</em>' containment reference.
	 * @see #setInitialPosition(Coordinate)
	 * @see it.univaq.flyaq.mission.MissionPackage#getLineTask_InitialPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getInitialPosition();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.LineTask#getInitialPosition <em>Initial Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Position</em>' containment reference.
	 * @see #getInitialPosition()
	 * @generated
	 */
	void setInitialPosition(Coordinate value);

} // LineTask
