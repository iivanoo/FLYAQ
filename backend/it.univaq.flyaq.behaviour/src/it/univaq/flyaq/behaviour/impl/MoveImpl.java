/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.Action;
import it.univaq.flyaq.behaviour.BehaviourPackage;
import it.univaq.flyaq.behaviour.Move;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.MoveImpl#getPreActions <em>Pre Actions</em>}</li>
 *   <li>{@link it.univaq.flyaq.behaviour.impl.MoveImpl#getPostActions <em>Post Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MoveImpl extends NamedElementImpl implements Move {
	/**
	 * The cached value of the '{@link #getPreActions() <em>Pre Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> preActions;

	/**
	 * The cached value of the '{@link #getPostActions() <em>Post Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> postActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getPreActions() {
		if (preActions == null) {
			preActions = new EObjectContainmentEList<Action>(Action.class, this, BehaviourPackage.MOVE__PRE_ACTIONS);
		}
		return preActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getPostActions() {
		if (postActions == null) {
			postActions = new EObjectContainmentEList<Action>(Action.class, this, BehaviourPackage.MOVE__POST_ACTIONS);
		}
		return postActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.MOVE__PRE_ACTIONS:
				return ((InternalEList<?>)getPreActions()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.MOVE__POST_ACTIONS:
				return ((InternalEList<?>)getPostActions()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.MOVE__PRE_ACTIONS:
				return getPreActions();
			case BehaviourPackage.MOVE__POST_ACTIONS:
				return getPostActions();
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
			case BehaviourPackage.MOVE__PRE_ACTIONS:
				getPreActions().clear();
				getPreActions().addAll((Collection<? extends Action>)newValue);
				return;
			case BehaviourPackage.MOVE__POST_ACTIONS:
				getPostActions().clear();
				getPostActions().addAll((Collection<? extends Action>)newValue);
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
			case BehaviourPackage.MOVE__PRE_ACTIONS:
				getPreActions().clear();
				return;
			case BehaviourPackage.MOVE__POST_ACTIONS:
				getPostActions().clear();
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
			case BehaviourPackage.MOVE__PRE_ACTIONS:
				return preActions != null && !preActions.isEmpty();
			case BehaviourPackage.MOVE__POST_ACTIONS:
				return postActions != null && !postActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MoveImpl
