/**
 */
package it.univaq.flyaq.mission;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.TaskDependency#getFrom <em>From</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.TaskDependency#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getTaskDependency()
 * @model
 * @generated
 */
public interface TaskDependency extends NamedElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Task)
	 * @see it.univaq.flyaq.mission.MissionPackage#getTaskDependency_From()
	 * @model required="true"
	 * @generated
	 */
	Task getFrom();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.TaskDependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Task value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Task)
	 * @see it.univaq.flyaq.mission.MissionPackage#getTaskDependency_To()
	 * @model required="true"
	 * @generated
	 */
	Task getTo();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.TaskDependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Task value);

} // TaskDependency
