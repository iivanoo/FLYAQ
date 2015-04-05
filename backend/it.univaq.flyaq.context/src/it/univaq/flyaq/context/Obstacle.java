/**
 */
package it.univaq.flyaq.context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.context.Obstacle#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link it.univaq.flyaq.context.Obstacle#getMaxHeight <em>Max Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.context.ContextPackage#getObstacle()
 * @model
 * @generated
 */
public interface Obstacle extends Area {
	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Height</em>' attribute.
	 * @see #setMinHeight(float)
	 * @see it.univaq.flyaq.context.ContextPackage#getObstacle_MinHeight()
	 * @model
	 * @generated
	 */
	float getMinHeight();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.context.Obstacle#getMinHeight <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' attribute.
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(float value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(float)
	 * @see it.univaq.flyaq.context.ContextPackage#getObstacle_MaxHeight()
	 * @model required="true"
	 * @generated
	 */
	float getMaxHeight();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.context.Obstacle#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(float value);

} // Obstacle
