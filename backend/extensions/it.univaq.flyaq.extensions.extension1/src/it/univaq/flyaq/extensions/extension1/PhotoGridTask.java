/**
 */
package it.univaq.flyaq.extensions.extension1;

import it.univaq.flyaq.mission.PolygonTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo Grid Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask#getGridResolution <em>Grid Resolution</em>}</li>
 *   <li>{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask#getAltitude <em>Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.flyaq.extensions.extension1.Extension1Package#getPhotoGridTask()
 * @model
 * @generated
 */
public interface PhotoGridTask extends PolygonTask {
	/**
	 * Returns the value of the '<em><b>Grid Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Resolution</em>' attribute.
	 * @see #setGridResolution(float)
	 * @see it.univaq.flyaq.extensions.extension1.Extension1Package#getPhotoGridTask_GridResolution()
	 * @model required="true"
	 * @generated
	 */
	float getGridResolution();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask#getGridResolution <em>Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Resolution</em>' attribute.
	 * @see #getGridResolution()
	 * @generated
	 */
	void setGridResolution(float value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(float)
	 * @see it.univaq.flyaq.extensions.extension1.Extension1Package#getPhotoGridTask_Altitude()
	 * @model required="true"
	 * @generated
	 */
	float getAltitude();

	/**
	 * Sets the value of the '{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(float value);

} // PhotoGridTask
