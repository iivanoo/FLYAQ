/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.BehaviourPackage;
import it.univaq.flyaq.behaviour.Choice;
import it.univaq.flyaq.behaviour.Move;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.ChoiceImpl#getConditionIdentifier <em>Condition Identifier</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.ChoiceImpl#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceImpl extends MoveTransitionImpl implements Choice {
	/**
	 * The default value of the '{@link #getConditionIdentifier() <em>Condition Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionIdentifier() <em>Condition Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String conditionIdentifier = CONDITION_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFalseBranch() <em>False Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseBranch()
	 * @generated
	 * @ordered
	 */
	protected Move falseBranch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionIdentifier() {
		return conditionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionIdentifier(String newConditionIdentifier) {
		String oldConditionIdentifier = conditionIdentifier;
		conditionIdentifier = newConditionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CHOICE__CONDITION_IDENTIFIER, oldConditionIdentifier, conditionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getFalseBranch() {
		if (falseBranch != null && falseBranch.eIsProxy()) {
			InternalEObject oldFalseBranch = (InternalEObject)falseBranch;
			falseBranch = (Move)eResolveProxy(oldFalseBranch);
			if (falseBranch != oldFalseBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.CHOICE__FALSE_BRANCH, oldFalseBranch, falseBranch));
			}
		}
		return falseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetFalseBranch() {
		return falseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseBranch(Move newFalseBranch) {
		Move oldFalseBranch = falseBranch;
		falseBranch = newFalseBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CHOICE__FALSE_BRANCH, oldFalseBranch, falseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourPackage.CHOICE__CONDITION_IDENTIFIER:
				return getConditionIdentifier();
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				if (resolve) return getFalseBranch();
				return basicGetFalseBranch();
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
			case BehaviourPackage.CHOICE__CONDITION_IDENTIFIER:
				setConditionIdentifier((String)newValue);
				return;
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				setFalseBranch((Move)newValue);
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
			case BehaviourPackage.CHOICE__CONDITION_IDENTIFIER:
				setConditionIdentifier(CONDITION_IDENTIFIER_EDEFAULT);
				return;
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				setFalseBranch((Move)null);
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
			case BehaviourPackage.CHOICE__CONDITION_IDENTIFIER:
				return CONDITION_IDENTIFIER_EDEFAULT == null ? conditionIdentifier != null : !CONDITION_IDENTIFIER_EDEFAULT.equals(conditionIdentifier);
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				return falseBranch != null;
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
		result.append(" (conditionIdentifier: ");
		result.append(conditionIdentifier);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
