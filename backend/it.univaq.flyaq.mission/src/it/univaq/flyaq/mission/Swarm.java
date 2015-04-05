/**
 */
package it.univaq.flyaq.mission;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.Swarm#getDrones <em>Drones</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getSwarm()
 * @model
 * @generated
 */
public interface Swarm extends EObject {
	/**
	 * Returns the value of the '<em><b>Drones</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.mission.Drone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drones</em>' containment reference list.
	 * @see it.univaq.flyaq.mission.MissionPackage#getSwarm_Drones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Drone> getDrones();

} // Swarm
