/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.BehaviourPackage;
import it.univaq.flyaq.behaviour.Coordinate;
import it.univaq.flyaq.behaviour.GoTo;
import it.univaq.flyaq.behaviour.GoToStrategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.GoToImpl#getTargetPosition <em>Target Position</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.GoToImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoToImpl extends MoveImpl implements GoTo {
	/**
	 * The cached value of the '{@link #getTargetPosition() <em>Target Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPosition()
	 * @generated
	 * @ordered
	 */
	protected Coordinate targetPosition;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final GoToStrategy STRATEGY_EDEFAULT = GoToStrategy.DIRECT;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected GoToStrategy strategy = STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.GO_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getTargetPosition() {
		return targetPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPosition(Coordinate newTargetPosition, NotificationChain msgs) {
		Coordinate oldTargetPosition = targetPosition;
		targetPosition = newTargetPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.GO_TO__TARGET_POSITION, oldTargetPosition, newTargetPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPosition(Coordinate newTargetPosition) {
		if (newTargetPosition != targetPosition) {
			NotificationChain msgs = null;
			if (targetPosition != null)
				msgs = ((InternalEObject)targetPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.GO_TO__TARGET_POSITION, null, msgs);
			if (newTargetPosition != null)
				msgs = ((InternalEObject)newTargetPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.GO_TO__TARGET_POSITION, null, msgs);
			msgs = basicSetTargetPosition(newTargetPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.GO_TO__TARGET_POSITION, newTargetPosition, newTargetPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToStrategy getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(GoToStrategy newStrategy) {
		GoToStrategy oldStrategy = strategy;
		strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.GO_TO__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.GO_TO__TARGET_POSITION:
				return basicSetTargetPosition(null, msgs);
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
			case BehaviourPackage.GO_TO__TARGET_POSITION:
				return getTargetPosition();
			case BehaviourPackage.GO_TO__STRATEGY:
				return getStrategy();
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
			case BehaviourPackage.GO_TO__TARGET_POSITION:
				setTargetPosition((Coordinate)newValue);
				return;
			case BehaviourPackage.GO_TO__STRATEGY:
				setStrategy((GoToStrategy)newValue);
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
			case BehaviourPackage.GO_TO__TARGET_POSITION:
				setTargetPosition((Coordinate)null);
				return;
			case BehaviourPackage.GO_TO__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
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
			case BehaviourPackage.GO_TO__TARGET_POSITION:
				return targetPosition != null;
			case BehaviourPackage.GO_TO__STRATEGY:
				return strategy != STRATEGY_EDEFAULT;
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
		result.append(" (strategy: ");
		result.append(strategy);
		result.append(')');
		return result.toString();
	}

} //GoToImpl
