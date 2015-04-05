/**
 */
package it.univaq.flyaq.extensions.extension1;

import it.univaq.flyaq.mission.PointTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.extensions.extension1.GoToTask#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.extensions.extension1.Extension1Package#getGoToTask()
 * @model
 * @generated
 */
public interface GoToTask extends PointTask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link it.univaq.flyaq.extensions.extension1.GoToType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.univaq.flyaq.extensions.extension1.GoToType
	 * @see #setType(GoToType)
	 * @see it.univaq.flyaq.extensions.extension1.Extension1Package#getGoToTask_Type()
	 * @model default="NORMAL"
	 * @generated
	 */
	GoToType getType();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.extensions.extension1.GoToTask#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.univaq.flyaq.extensions.extension1.GoToType
	 * @see #getType()
	 * @generated
	 */
	void setType(GoToType value);

} // GoToTask
