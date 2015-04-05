/**
 */
package it.univaq.flyaq.behaviour.util;

import it.univaq.flyaq.behaviour.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.behaviour.BehaviourPackage
 * @generated
 */
public class BehaviourSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviourPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehaviourPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				T result = caseBehaviour(behaviour);
				if (result == null) result = caseNamedElement(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.DRONE: {
				Drone drone = (Drone)theEObject;
				T result = caseDrone(drone);
				if (result == null) result = caseNamedElement(drone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseMove(start);
				if (result == null) result = caseNamedElement(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseMove(stop);
				if (result == null) result = caseNamedElement(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseMoveTransition(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = caseNamedElement(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.TAKE_OFF: {
				TakeOff takeOff = (TakeOff)theEObject;
				T result = caseTakeOff(takeOff);
				if (result == null) result = caseMove(takeOff);
				if (result == null) result = caseNamedElement(takeOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.LAND: {
				Land land = (Land)theEObject;
				T result = caseLand(land);
				if (result == null) result = caseMove(land);
				if (result == null) result = caseNamedElement(land);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.GO_TO: {
				GoTo goTo = (GoTo)theEObject;
				T result = caseGoTo(goTo);
				if (result == null) result = caseMove(goTo);
				if (result == null) result = caseNamedElement(goTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.HOVER: {
				Hover hover = (Hover)theEObject;
				T result = caseHover(hover);
				if (result == null) result = caseMove(hover);
				if (result == null) result = caseNamedElement(hover);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.HEAD_TO: {
				HeadTo headTo = (HeadTo)theEObject;
				T result = caseHeadTo(headTo);
				if (result == null) result = caseMove(headTo);
				if (result == null) result = caseNamedElement(headTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = caseMove(circle);
				if (result == null) result = caseNamedElement(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.COMMUNICATION_ACTION: {
				CommunicationAction communicationAction = (CommunicationAction)theEObject;
				T result = caseCommunicationAction(communicationAction);
				if (result == null) result = caseAction(communicationAction);
				if (result == null) result = caseNamedElement(communicationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.NOTIFY: {
				Notify notify = (Notify)theEObject;
				T result = caseNotify(notify);
				if (result == null) result = caseCommunicationAction(notify);
				if (result == null) result = caseAction(notify);
				if (result == null) result = caseNamedElement(notify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.BROADCAST_NOTIFY: {
				BroadcastNotify broadcastNotify = (BroadcastNotify)theEObject;
				T result = caseBroadcastNotify(broadcastNotify);
				if (result == null) result = caseNotify(broadcastNotify);
				if (result == null) result = caseCommunicationAction(broadcastNotify);
				if (result == null) result = caseAction(broadcastNotify);
				if (result == null) result = caseNamedElement(broadcastNotify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.UNICAST_NOTIFY: {
				UnicastNotify unicastNotify = (UnicastNotify)theEObject;
				T result = caseUnicastNotify(unicastNotify);
				if (result == null) result = caseNotify(unicastNotify);
				if (result == null) result = caseCommunicationAction(unicastNotify);
				if (result == null) result = caseAction(unicastNotify);
				if (result == null) result = caseNamedElement(unicastNotify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.MULTICAST_NOTIFY: {
				MulticastNotify multicastNotify = (MulticastNotify)theEObject;
				T result = caseMulticastNotify(multicastNotify);
				if (result == null) result = caseNotify(multicastNotify);
				if (result == null) result = caseCommunicationAction(multicastNotify);
				if (result == null) result = caseAction(multicastNotify);
				if (result == null) result = caseNamedElement(multicastNotify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.CHECK_NOTIFICATION: {
				CheckNotification checkNotification = (CheckNotification)theEObject;
				T result = caseCheckNotification(checkNotification);
				if (result == null) result = caseCommunicationAction(checkNotification);
				if (result == null) result = caseAction(checkNotification);
				if (result == null) result = caseNamedElement(checkNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseNamedElement(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.DEVICE_ACTION: {
				DeviceAction deviceAction = (DeviceAction)theEObject;
				T result = caseDeviceAction(deviceAction);
				if (result == null) result = caseAction(deviceAction);
				if (result == null) result = caseNamedElement(deviceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.MOVE_TRANSITION: {
				MoveTransition moveTransition = (MoveTransition)theEObject;
				T result = caseMoveTransition(moveTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.COORDINATE: {
				Coordinate coordinate = (Coordinate)theEObject;
				T result = caseCoordinate(coordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourPackage.FEEDBACK: {
				Feedback feedback = (Feedback)theEObject;
				T result = caseFeedback(feedback);
				if (result == null) result = caseCommunicationAction(feedback);
				if (result == null) result = caseAction(feedback);
				if (result == null) result = caseNamedElement(feedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrone(Drone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Take Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Take Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTakeOff(TakeOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Land</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Land</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLand(Land object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoTo(GoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHover(Hover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadTo(HeadTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationAction(CommunicationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotify(Notify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Notify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Notify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastNotify(BroadcastNotify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unicast Notify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unicast Notify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnicastNotify(UnicastNotify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicast Notify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicast Notify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticastNotify(MulticastNotify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckNotification(CheckNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceAction(DeviceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveTransition(MoveTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinate(Coordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedback(Feedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviourSwitch
