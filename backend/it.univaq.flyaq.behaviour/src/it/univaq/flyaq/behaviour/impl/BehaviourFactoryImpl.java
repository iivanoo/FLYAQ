/**
 */
package it.univaq.flyaq.behaviour.impl;

import it.univaq.flyaq.behaviour.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourFactoryImpl extends EFactoryImpl implements BehaviourFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourFactory init() {
		try {
			BehaviourFactory theBehaviourFactory = (BehaviourFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourPackage.eNS_URI);
			if (theBehaviourFactory != null) {
				return theBehaviourFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviourPackage.BEHAVIOUR: return createBehaviour();
			case BehaviourPackage.DRONE: return createDrone();
			case BehaviourPackage.START: return createStart();
			case BehaviourPackage.STOP: return createStop();
			case BehaviourPackage.CHOICE: return createChoice();
			case BehaviourPackage.TAKE_OFF: return createTakeOff();
			case BehaviourPackage.LAND: return createLand();
			case BehaviourPackage.GO_TO: return createGoTo();
			case BehaviourPackage.HOVER: return createHover();
			case BehaviourPackage.HEAD_TO: return createHeadTo();
			case BehaviourPackage.CIRCLE: return createCircle();
			case BehaviourPackage.BROADCAST_NOTIFY: return createBroadcastNotify();
			case BehaviourPackage.UNICAST_NOTIFY: return createUnicastNotify();
			case BehaviourPackage.MULTICAST_NOTIFY: return createMulticastNotify();
			case BehaviourPackage.CHECK_NOTIFICATION: return createCheckNotification();
			case BehaviourPackage.SLOT: return createSlot();
			case BehaviourPackage.DEVICE_ACTION: return createDeviceAction();
			case BehaviourPackage.PARAMETER: return createParameter();
			case BehaviourPackage.MOVE_TRANSITION: return createMoveTransition();
			case BehaviourPackage.COORDINATE: return createCoordinate();
			case BehaviourPackage.FEEDBACK: return createFeedback();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviourPackage.GO_TO_STRATEGY:
				return createGoToStrategyFromString(eDataType, initialValue);
			case BehaviourPackage.TRAVEL_MODE:
				return createTravelModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviourPackage.GO_TO_STRATEGY:
				return convertGoToStrategyToString(eDataType, instanceValue);
			case BehaviourPackage.TRAVEL_MODE:
				return convertTravelModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviour() {
		BehaviourImpl behaviour = new BehaviourImpl();
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone createDrone() {
		DroneImpl drone = new DroneImpl();
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TakeOff createTakeOff() {
		TakeOffImpl takeOff = new TakeOffImpl();
		return takeOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Land createLand() {
		LandImpl land = new LandImpl();
		return land;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTo createGoTo() {
		GoToImpl goTo = new GoToImpl();
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hover createHover() {
		HoverImpl hover = new HoverImpl();
		return hover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadTo createHeadTo() {
		HeadToImpl headTo = new HeadToImpl();
		return headTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastNotify createBroadcastNotify() {
		BroadcastNotifyImpl broadcastNotify = new BroadcastNotifyImpl();
		return broadcastNotify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnicastNotify createUnicastNotify() {
		UnicastNotifyImpl unicastNotify = new UnicastNotifyImpl();
		return unicastNotify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticastNotify createMulticastNotify() {
		MulticastNotifyImpl multicastNotify = new MulticastNotifyImpl();
		return multicastNotify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckNotification createCheckNotification() {
		CheckNotificationImpl checkNotification = new CheckNotificationImpl();
		return checkNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAction createDeviceAction() {
		DeviceActionImpl deviceAction = new DeviceActionImpl();
		return deviceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveTransition createMoveTransition() {
		MoveTransitionImpl moveTransition = new MoveTransitionImpl();
		return moveTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate createCoordinate() {
		CoordinateImpl coordinate = new CoordinateImpl();
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToStrategy createGoToStrategyFromString(EDataType eDataType, String initialValue) {
		GoToStrategy result = GoToStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoToStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelMode createTravelModeFromString(EDataType eDataType, String initialValue) {
		TravelMode result = TravelMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourPackage getBehaviourPackage() {
		return (BehaviourPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourPackage getPackage() {
		return BehaviourPackage.eINSTANCE;
	}

} //BehaviourFactoryImpl
