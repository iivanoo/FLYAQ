/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.BehaviourPackage;
import it.univaq.flyaq.behaviour.Coordinate;
import it.univaq.flyaq.behaviour.Drone;
import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.MoveTransition;
import it.univaq.flyaq.behaviour.Slot;
import it.univaq.flyaq.behaviour.TravelMode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.DroneImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.DroneImpl#getHome <em>Home</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.DroneImpl#getMovements <em>Movements</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.DroneImpl#getMoveTransitions <em>Move Transitions</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.DroneImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.DroneImpl#getTravelMode <em>Travel Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DroneImpl extends NamedElementImpl implements Drone {
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHome() <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected Coordinate home;

	/**
	 * The cached value of the '{@link #getMovements() <em>Movements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovements()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> movements;

	/**
	 * The cached value of the '{@link #getMoveTransitions() <em>Move Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MoveTransition> moveTransitions;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slots;

	/**
	 * The default value of the '{@link #getTravelMode() <em>Travel Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelMode()
	 * @generated
	 * @ordered
	 */
	protected static final TravelMode TRAVEL_MODE_EDEFAULT = TravelMode.SAFE;

	/**
	 * The cached value of the '{@link #getTravelMode() <em>Travel Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelMode()
	 * @generated
	 * @ordered
	 */
	protected TravelMode travelMode = TRAVEL_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.DRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DRONE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getHome() {
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(Coordinate newHome, NotificationChain msgs) {
		Coordinate oldHome = home;
		home = newHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.DRONE__HOME, oldHome, newHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(Coordinate newHome) {
		if (newHome != home) {
			NotificationChain msgs = null;
			if (home != null)
				msgs = ((InternalEObject)home).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DRONE__HOME, null, msgs);
			if (newHome != null)
				msgs = ((InternalEObject)newHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DRONE__HOME, null, msgs);
			msgs = basicSetHome(newHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DRONE__HOME, newHome, newHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMovements() {
		if (movements == null) {
			movements = new EObjectContainmentEList<Move>(Move.class, this, BehaviourPackage.DRONE__MOVEMENTS);
		}
		return movements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MoveTransition> getMoveTransitions() {
		if (moveTransitions == null) {
			moveTransitions = new EObjectContainmentEList<MoveTransition>(MoveTransition.class, this, BehaviourPackage.DRONE__MOVE_TRANSITIONS);
		}
		return moveTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentEList<Slot>(Slot.class, this, BehaviourPackage.DRONE__SLOTS);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelMode getTravelMode() {
		return travelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelMode(TravelMode newTravelMode) {
		TravelMode oldTravelMode = travelMode;
		travelMode = newTravelMode == null ? TRAVEL_MODE_EDEFAULT : newTravelMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DRONE__TRAVEL_MODE, oldTravelMode, travelMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.DRONE__HOME:
				return basicSetHome(null, msgs);
			case BehaviourPackage.DRONE__MOVEMENTS:
				return ((InternalEList<?>)getMovements()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.DRONE__MOVE_TRANSITIONS:
				return ((InternalEList<?>)getMoveTransitions()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.DRONE__SLOTS:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.DRONE__TYPE_NAME:
				return getTypeName();
			case BehaviourPackage.DRONE__HOME:
				return getHome();
			case BehaviourPackage.DRONE__MOVEMENTS:
				return getMovements();
			case BehaviourPackage.DRONE__MOVE_TRANSITIONS:
				return getMoveTransitions();
			case BehaviourPackage.DRONE__SLOTS:
				return getSlots();
			case BehaviourPackage.DRONE__TRAVEL_MODE:
				return getTravelMode();
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
			case BehaviourPackage.DRONE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case BehaviourPackage.DRONE__HOME:
				setHome((Coordinate)newValue);
				return;
			case BehaviourPackage.DRONE__MOVEMENTS:
				getMovements().clear();
				getMovements().addAll((Collection<? extends Move>)newValue);
				return;
			case BehaviourPackage.DRONE__MOVE_TRANSITIONS:
				getMoveTransitions().clear();
				getMoveTransitions().addAll((Collection<? extends MoveTransition>)newValue);
				return;
			case BehaviourPackage.DRONE__SLOTS:
				getSlots().clear();
				getSlots().addAll((Collection<? extends Slot>)newValue);
				return;
			case BehaviourPackage.DRONE__TRAVEL_MODE:
				setTravelMode((TravelMode)newValue);
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
			case BehaviourPackage.DRONE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case BehaviourPackage.DRONE__HOME:
				setHome((Coordinate)null);
				return;
			case BehaviourPackage.DRONE__MOVEMENTS:
				getMovements().clear();
				return;
			case BehaviourPackage.DRONE__MOVE_TRANSITIONS:
				getMoveTransitions().clear();
				return;
			case BehaviourPackage.DRONE__SLOTS:
				getSlots().clear();
				return;
			case BehaviourPackage.DRONE__TRAVEL_MODE:
				setTravelMode(TRAVEL_MODE_EDEFAULT);
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
			case BehaviourPackage.DRONE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case BehaviourPackage.DRONE__HOME:
				return home != null;
			case BehaviourPackage.DRONE__MOVEMENTS:
				return movements != null && !movements.isEmpty();
			case BehaviourPackage.DRONE__MOVE_TRANSITIONS:
				return moveTransitions != null && !moveTransitions.isEmpty();
			case BehaviourPackage.DRONE__SLOTS:
				return slots != null && !slots.isEmpty();
			case BehaviourPackage.DRONE__TRAVEL_MODE:
				return travelMode != TRAVEL_MODE_EDEFAULT;
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", travelMode: ");
		result.append(travelMode);
		result.append(')');
		return result.toString();
	}

} //DroneImpl
