/**
 */
package it.univaq.flyaq.mission;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.Mission#getCrs <em>Crs</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.Mission#getTasks <em>Tasks</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.Mission#getTaskDependencies <em>Task Dependencies</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.Mission#getSwarm <em>Swarm</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs</em>' attribute.
	 * @see #setCrs(String)
	 * @see it.univaq.flyaq.mission.MissionPackage#getMission_Crs()
	 * @model
	 * @generated
	 */
	String getCrs();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.Mission#getCrs <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs</em>' attribute.
	 * @see #getCrs()
	 * @generated
	 */
	void setCrs(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.mission.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see it.univaq.flyaq.mission.MissionPackage#getMission_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Task Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.mission.TaskDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Dependencies</em>' containment reference list.
	 * @see it.univaq.flyaq.mission.MissionPackage#getMission_TaskDependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDependency> getTaskDependencies();

	/**
	 * Returns the value of the '<em><b>Swarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm</em>' containment reference.
	 * @see #setSwarm(Swarm)
	 * @see it.univaq.flyaq.mission.MissionPackage#getMission_Swarm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Swarm getSwarm();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.Mission#getSwarm <em>Swarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm</em>' containment reference.
	 * @see #getSwarm()
	 * @generated
	 */
	void setSwarm(Swarm value);

} // Mission
