/**
 */
package it.univaq.flyaq.mission.impl;

import it.univaq.flyaq.mission.Drone;
import it.univaq.flyaq.mission.MissionPackage;
import it.univaq.flyaq.mission.Swarm;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.impl.SwarmImpl#getDrones <em>Drones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwarmImpl extends MinimalEObjectImpl.Container implements Swarm {
	/**
	 * The cached value of the '{@link #getDrones() <em>Drones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrones()
	 * @generated
	 * @ordered
	 */
	protected EList<Drone> drones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MissionPackage.Literals.SWARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drone> getDrones() {
		if (drones == null) {
			drones = new EObjectContainmentEList<Drone>(Drone.class, this, MissionPackage.SWARM__DRONES);
		}
		return drones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MissionPackage.SWARM__DRONES:
				return ((InternalEList<?>)getDrones()).basicRemove(otherEnd, msgs);
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
			case MissionPackage.SWARM__DRONES:
				return getDrones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MissionPackage.SWARM__DRONES:
				getDrones().clear();
				getDrones().addAll((Collection<? extends Drone>)newValue);
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
			case MissionPackage.SWARM__DRONES:
				getDrones().clear();
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
			case MissionPackage.SWARM__DRONES:
				return drones != null && !drones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwarmImpl
