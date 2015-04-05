/**
 */
package it.univaq.flyaq.mission;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.Drone#getHome <em>Home</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.Drone#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.Drone#isReturnHome <em>Return Home</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.mission.MissionPackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(Coordinate)
	 * @see it.univaq.flyaq.mission.MissionPackage#getDrone_Home()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getHome();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.Drone#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see it.univaq.flyaq.mission.MissionPackage#getDrone_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.Drone#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Return Home</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Home</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Home</em>' attribute.
	 * @see #setReturnHome(boolean)
	 * @see it.univaq.flyaq.mission.MissionPackage#getDrone_ReturnHome()
	 * @model default="true"
	 * @generated
	 */
	boolean isReturnHome();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.mission.Drone#isReturnHome <em>Return Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Home</em>' attribute.
	 * @see #isReturnHome()
	 * @generated
	 */
	void setReturnHome(boolean value);

} // Drone
