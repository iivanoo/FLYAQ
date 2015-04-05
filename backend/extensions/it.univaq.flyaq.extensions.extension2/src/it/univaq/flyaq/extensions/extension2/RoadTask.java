/**
 */
package it.univaq.flyaq.extensions.extension2;

import it.univaq.flyaq.mission.LineTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.extensions.extension2.RoadTask#isInverted <em>Inverted</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.extensions.extension2.Extension2Package#getRoadTask()
 * @model
 * @generated
 */
public interface RoadTask extends LineTask {
	/**
	 * Returns the value of the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverted</em>' attribute.
	 * @see #setInverted(boolean)
	 * @see it.univaq.flyaq.extensions.extension2.Extension2Package#getRoadTask_Inverted()
	 * @model
	 * @generated
	 */
	boolean isInverted();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.extensions.extension2.RoadTask#isInverted <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverted</em>' attribute.
	 * @see #isInverted()
	 * @generated
	 */
	void setInverted(boolean value);

} // RoadTask
