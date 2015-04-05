/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.BehaviourPackage;
import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.MoveTransition;
import it.univaq.flyaq.behaviour.Slot;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.MoveTransitionImpl#getWaitFor <em>Wait For</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.MoveTransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.MoveTransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.MoveTransitionImpl#isFluid <em>Fluid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveTransitionImpl extends MinimalEObjectImpl.Container implements MoveTransition {
	/**
	 * The cached value of the '{@link #getWaitFor() <em>Wait For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> waitFor;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Move from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Move to;

	/**
	 * The default value of the '{@link #isFluid() <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFluid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFluid() <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFluid()
	 * @generated
	 * @ordered
	 */
	protected boolean fluid = FLUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.MOVE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getWaitFor() {
		if (waitFor == null) {
			waitFor = new EObjectResolvingEList<Slot>(Slot.class, this, BehaviourPackage.MOVE_TRANSITION__WAIT_FOR);
		}
		return waitFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Move)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.MOVE_TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Move newFrom) {
		Move oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MOVE_TRANSITION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Move)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.MOVE_TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Move newTo) {
		Move oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MOVE_TRANSITION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFluid() {
		return fluid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(boolean newFluid) {
		boolean oldFluid = fluid;
		fluid = newFluid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MOVE_TRANSITION__FLUID, oldFluid, fluid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourPackage.MOVE_TRANSITION__WAIT_FOR:
				return getWaitFor();
			case BehaviourPackage.MOVE_TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case BehaviourPackage.MOVE_TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case BehaviourPackage.MOVE_TRANSITION__FLUID:
				return isFluid();
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
			case BehaviourPackage.MOVE_TRANSITION__WAIT_FOR:
				getWaitFor().clear();
				getWaitFor().addAll((Collection<? extends Slot>)newValue);
				return;
			case BehaviourPackage.MOVE_TRANSITION__FROM:
				setFrom((Move)newValue);
				return;
			case BehaviourPackage.MOVE_TRANSITION__TO:
				setTo((Move)newValue);
				return;
			case BehaviourPackage.MOVE_TRANSITION__FLUID:
				setFluid((Boolean)newValue);
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
			case BehaviourPackage.MOVE_TRANSITION__WAIT_FOR:
				getWaitFor().clear();
				return;
			case BehaviourPackage.MOVE_TRANSITION__FROM:
				setFrom((Move)null);
				return;
			case BehaviourPackage.MOVE_TRANSITION__TO:
				setTo((Move)null);
				return;
			case BehaviourPackage.MOVE_TRANSITION__FLUID:
				setFluid(FLUID_EDEFAULT);
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
			case BehaviourPackage.MOVE_TRANSITION__WAIT_FOR:
				return waitFor != null && !waitFor.isEmpty();
			case BehaviourPackage.MOVE_TRANSITION__FROM:
				return from != null;
			case BehaviourPackage.MOVE_TRANSITION__TO:
				return to != null;
			case BehaviourPackage.MOVE_TRANSITION__FLUID:
				return fluid != FLUID_EDEFAULT;
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
		result.append(" (fluid: ");
		result.append(fluid);
		result.append(')');
		return result.toString();
	}

} //MoveTransitionImpl
