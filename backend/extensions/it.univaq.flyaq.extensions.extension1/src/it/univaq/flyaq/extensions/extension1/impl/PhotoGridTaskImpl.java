/**
 */
package it.univaq.flyaq.extensions.extension1.impl;

import it.univaq.flyaq.extensions.extension1.Extension1Package;
import it.univaq.flyaq.extensions.extension1.PhotoGridTask;

import it.univaq.flyaq.mission.impl.PolygonTaskImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Grid Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.extensions.extension1.impl.PhotoGridTaskImpl#getGridResolution <em>Grid Resolution</em>}</li>
 *   <li>{@link it.univaq.flyaq.extensions.extension1.impl.PhotoGridTaskImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhotoGridTaskImpl extends PolygonTaskImpl implements PhotoGridTask {
	/**
	 * The default value of the '{@link #getGridResolution() <em>Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridResolution()
	 * @generated
	 * @ordered
	 */
	protected static final float GRID_RESOLUTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGridResolution() <em>Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridResolution()
	 * @generated
	 * @ordered
	 */
	protected float gridResolution = GRID_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final float ALTITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected float altitude = ALTITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoGridTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Extension1Package.Literals.PHOTO_GRID_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGridResolution() {
		return gridResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridResolution(float newGridResolution) {
		float oldGridResolution = gridResolution;
		gridResolution = newGridResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Extension1Package.PHOTO_GRID_TASK__GRID_RESOLUTION, oldGridResolution, gridResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(float newAltitude) {
		float oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Extension1Package.PHOTO_GRID_TASK__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Extension1Package.PHOTO_GRID_TASK__GRID_RESOLUTION:
				return getGridResolution();
			case Extension1Package.PHOTO_GRID_TASK__ALTITUDE:
				return getAltitude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Extension1Package.PHOTO_GRID_TASK__GRID_RESOLUTION:
				setGridResolution((Float)newValue);
				return;
			case Extension1Package.PHOTO_GRID_TASK__ALTITUDE:
				setAltitude((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Extension1Package.PHOTO_GRID_TASK__GRID_RESOLUTION:
				setGridResolution(GRID_RESOLUTION_EDEFAULT);
				return;
			case Extension1Package.PHOTO_GRID_TASK__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Extension1Package.PHOTO_GRID_TASK__GRID_RESOLUTION:
				return gridResolution != GRID_RESOLUTION_EDEFAULT;
			case Extension1Package.PHOTO_GRID_TASK__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (gridResolution: ");
		result.append(gridResolution);
		result.append(", altitude: ");
		result.append(altitude);
		result.append(')');
		return result.toString();
	}

} //PhotoGridTaskImpl
