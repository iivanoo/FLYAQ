/**
 */
package it.univaq.flyaq.context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.context.Context#getCrs <em>Crs</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.Context#getNoFlyAreas <em>No Fly Areas</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.Context#getObstacles <em>Obstacles</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.Context#getEmergencyAreas <em>Emergency Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.context.ContextPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends NamedElement {
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
	 * @see it.univaq.flyaq.context.ContextPackage#getContext_Crs()
	 * @model
	 * @generated
	 */
	String getCrs();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.context.Context#getCrs <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs</em>' attribute.
	 * @see #getCrs()
	 * @generated
	 */
	void setCrs(String value);

	/**
	 * Returns the value of the '<em><b>No Fly Areas</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.context.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Fly Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Fly Areas</em>' containment reference list.
	 * @see it.univaq.flyaq.context.ContextPackage#getContext_NoFlyAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getNoFlyAreas();

	/**
	 * Returns the value of the '<em><b>Obstacles</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.context.Obstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstacles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstacles</em>' containment reference list.
	 * @see it.univaq.flyaq.context.ContextPackage#getContext_Obstacles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Obstacle> getObstacles();

	/**
	 * Returns the value of the '<em><b>Emergency Areas</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.context.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency Areas</em>' containment reference list.
	 * @see it.univaq.flyaq.context.ContextPackage#getContext_EmergencyAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getEmergencyAreas();

} // Context
