/**
 */
package it.univaq.flyaq.mission.impl;

import it.univaq.flyaq.mission.ControlTask;
import it.univaq.flyaq.mission.Coordinate;
import it.univaq.flyaq.mission.MissionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.impl.ControlTaskImpl#getReferencePosition <em>Reference Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlTaskImpl extends TaskImpl implements ControlTask {
	/**
	 * The cached value of the '{@link #getReferencePosition() <em>Reference Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePosition()
	 * @generated
	 * @ordered
	 */
	protected Coordinate referencePosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MissionPackage.Literals.CONTROL_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getReferencePosition() {
		return referencePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePosition(Coordinate newReferencePosition, NotificationChain msgs) {
		Coordinate oldReferencePosition = referencePosition;
		referencePosition = newReferencePosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MissionPackage.CONTROL_TASK__REFERENCE_POSITION, oldReferencePosition, newReferencePosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePosition(Coordinate newReferencePosition) {
		if (newReferencePosition != referencePosition) {
			NotificationChain msgs = null;
			if (referencePosition != null)
				msgs = ((InternalEObject)referencePosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MissionPackage.CONTROL_TASK__REFERENCE_POSITION, null, msgs);
			if (newReferencePosition != null)
				msgs = ((InternalEObject)newReferencePosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MissionPackage.CONTROL_TASK__REFERENCE_POSITION, null, msgs);
			msgs = basicSetReferencePosition(newReferencePosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MissionPackage.CONTROL_TASK__REFERENCE_POSITION, newReferencePosition, newReferencePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MissionPackage.CONTROL_TASK__REFERENCE_POSITION:
				return basicSetReferencePosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MissionPackage.CONTROL_TASK__REFERENCE_POSITION:
				return getReferencePosition();
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
			case MissionPackage.CONTROL_TASK__REFERENCE_POSITION:
				setReferencePosition((Coordinate)newValue);
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
			case MissionPackage.CONTROL_TASK__REFERENCE_POSITION:
				setReferencePosition((Coordinate)null);
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
			case MissionPackage.CONTROL_TASK__REFERENCE_POSITION:
				return referencePosition != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlTaskImpl
