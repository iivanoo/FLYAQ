/**
 */
package it.univaq.flyaq.behaviour.util;

import it.univaq.flyaq.behaviour.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.behaviour.BehaviourPackage
 * @generated
 */
public class BehaviourAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviourPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourSwitch<Adapter> modelSwitch =
		new BehaviourSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseBehaviour(Behaviour object) {
				return createBehaviourAdapter();
			}
			@Override
			public Adapter caseDrone(Drone object) {
				return createDroneAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseTakeOff(TakeOff object) {
				return createTakeOffAdapter();
			}
			@Override
			public Adapter caseLand(Land object) {
				return createLandAdapter();
			}
			@Override
			public Adapter caseGoTo(GoTo object) {
				return createGoToAdapter();
			}
			@Override
			public Adapter caseHover(Hover object) {
				return createHoverAdapter();
			}
			@Override
			public Adapter caseHeadTo(HeadTo object) {
				return createHeadToAdapter();
			}
			@Override
			public Adapter caseCircle(Circle object) {
				return createCircleAdapter();
			}
			@Override
			public Adapter caseCommunicationAction(CommunicationAction object) {
				return createCommunicationActionAdapter();
			}
			@Override
			public Adapter caseNotify(Notify object) {
				return createNotifyAdapter();
			}
			@Override
			public Adapter caseBroadcastNotify(BroadcastNotify object) {
				return createBroadcastNotifyAdapter();
			}
			@Override
			public Adapter caseUnicastNotify(UnicastNotify object) {
				return createUnicastNotifyAdapter();
			}
			@Override
			public Adapter caseMulticastNotify(MulticastNotify object) {
				return createMulticastNotifyAdapter();
			}
			@Override
			public Adapter caseCheckNotification(CheckNotification object) {
				return createCheckNotificationAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseDeviceAction(DeviceAction object) {
				return createDeviceActionAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseMoveTransition(MoveTransition object) {
				return createMoveTransitionAdapter();
			}
			@Override
			public Adapter caseCoordinate(Coordinate object) {
				return createCoordinateAdapter();
			}
			@Override
			public Adapter caseFeedback(Feedback object) {
				return createFeedbackAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Behaviour
	 * @generated
	 */
	public Adapter createBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Drone
	 * @generated
	 */
	public Adapter createDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.TakeOff <em>Take Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.TakeOff
	 * @generated
	 */
	public Adapter createTakeOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Land <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Land
	 * @generated
	 */
	public Adapter createLandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.GoTo
	 * @generated
	 */
	public Adapter createGoToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Hover <em>Hover</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Hover
	 * @generated
	 */
	public Adapter createHoverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.HeadTo <em>Head To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.HeadTo
	 * @generated
	 */
	public Adapter createHeadToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.CommunicationAction <em>Communication Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.CommunicationAction
	 * @generated
	 */
	public Adapter createCommunicationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Notify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Notify
	 * @generated
	 */
	public Adapter createNotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.BroadcastNotify <em>Broadcast Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.BroadcastNotify
	 * @generated
	 */
	public Adapter createBroadcastNotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.UnicastNotify <em>Unicast Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.UnicastNotify
	 * @generated
	 */
	public Adapter createUnicastNotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.MulticastNotify <em>Multicast Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.MulticastNotify
	 * @generated
	 */
	public Adapter createMulticastNotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.CheckNotification <em>Check Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.CheckNotification
	 * @generated
	 */
	public Adapter createCheckNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.DeviceAction <em>Device Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.DeviceAction
	 * @generated
	 */
	public Adapter createDeviceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.MoveTransition <em>Move Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.MoveTransition
	 * @generated
	 */
	public Adapter createMoveTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Coordinate
	 * @generated
	 */
	public Adapter createCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.flyaq.behaviour.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.flyaq.behaviour.Feedback
	 * @generated
	 */
	public Adapter createFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviourAdapterFactory
