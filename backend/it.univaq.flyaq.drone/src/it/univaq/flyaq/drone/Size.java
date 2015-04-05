/**
 */
package it.univaq.flyaq.drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.drone.Size#getWidth <em>Width</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Size#getLength <em>Length</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Size#getHeight <em>Height</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Size#getWeight <em>Weight</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Size#getPropellers <em>Propellers</em>}</li>
 *   <li>{@link it.univaq.flyaq.drone.Size#getPropellerSize <em>Propeller Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.drone.DronePackage#getSize()
 * @model
 * @generated
 */
public interface Size extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getSize_Width()
	 * @model required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Size#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getSize_Length()
	 * @model required="true"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Size#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getSize_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Size#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getSize_Weight()
	 * @model required="true"
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Size#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

	/**
	 * Returns the value of the '<em><b>Propellers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propellers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propellers</em>' attribute.
	 * @see #setPropellers(int)
	 * @see it.univaq.flyaq.drone.DronePackage#getSize_Propellers()
	 * @model required="true"
	 * @generated
	 */
	int getPropellers();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Size#getPropellers <em>Propellers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propellers</em>' attribute.
	 * @see #getPropellers()
	 * @generated
	 */
	void setPropellers(int value);

	/**
	 * Returns the value of the '<em><b>Propeller Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propeller Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propeller Size</em>' attribute.
	 * @see #setPropellerSize(float)
	 * @see it.univaq.flyaq.drone.DronePackage#getSize_PropellerSize()
	 * @model required="true"
	 * @generated
	 */
	float getPropellerSize();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.drone.Size#getPropellerSize <em>Propeller Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propeller Size</em>' attribute.
	 * @see #getPropellerSize()
	 * @generated
	 */
	void setPropellerSize(float value);

} // Size
