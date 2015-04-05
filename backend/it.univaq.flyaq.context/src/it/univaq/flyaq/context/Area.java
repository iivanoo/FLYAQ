/**
 */
package it.univaq.flyaq.context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.context.Area#getShell <em>Shell</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.Area#getSafetyDistance <em>Safety Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.context.ContextPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.flyaq.context.Coordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference list.
	 * @see it.univaq.flyaq.context.ContextPackage#getArea_Shell()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Coordinate> getShell();

	/**
	 * Returns the value of the '<em><b>Safety Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Distance</em>' attribute.
	 * @see #setSafetyDistance(float)
	 * @see it.univaq.flyaq.context.ContextPackage#getArea_SafetyDistance()
	 * @model
	 * @generated
	 */
	float getSafetyDistance();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.context.Area#getSafetyDistance <em>Safety Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Distance</em>' attribute.
	 * @see #getSafetyDistance()
	 * @generated
	 */
	void setSafetyDistance(float value);

} // Area
