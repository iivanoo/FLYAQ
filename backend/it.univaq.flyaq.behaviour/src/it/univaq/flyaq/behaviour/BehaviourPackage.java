/**
 */
package it.univaq.flyaq.behaviour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.flyaq.it/behaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.NamedElementImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__CRS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__DRONES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.DroneImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__TYPE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__HOME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Movements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MOVEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Move Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MOVE_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SLOTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Travel Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__TRAVEL_MODE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.ActionImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.MoveImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__PRE_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__POST_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.StartImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getStart()
	 * @generated
	 */
	int START = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.StopImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.MoveTransitionImpl <em>Move Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.MoveTransitionImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getMoveTransition()
	 * @generated
	 */
	int MOVE_TRANSITION = 23;

	/**
	 * The feature id for the '<em><b>Wait For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TRANSITION__WAIT_FOR = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TRANSITION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TRANSITION__TO = 2;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TRANSITION__FLUID = 3;

	/**
	 * The number of structural features of the '<em>Move Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Move Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.ChoiceImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Wait For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__WAIT_FOR = MOVE_TRANSITION__WAIT_FOR;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FROM = MOVE_TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TO = MOVE_TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FLUID = MOVE_TRANSITION__FLUID;

	/**
	 * The feature id for the '<em><b>Condition Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONDITION_IDENTIFIER = MOVE_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FALSE_BRANCH = MOVE_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = MOVE_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = MOVE_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.TakeOffImpl <em>Take Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.TakeOffImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getTakeOff()
	 * @generated
	 */
	int TAKE_OFF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_OFF__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_OFF__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_OFF__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_OFF__ALTITUDE = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Take Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_OFF_FEATURE_COUNT = MOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Take Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_OFF_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.LandImpl <em>Land</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.LandImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getLand()
	 * @generated
	 */
	int LAND = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The number of structural features of the '<em>Land</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Land</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.GoToImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The feature id for the '<em><b>Target Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__TARGET_POSITION = MOVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__STRATEGY = MOVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = MOVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.HoverImpl <em>Hover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.HoverImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getHover()
	 * @generated
	 */
	int HOVER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER__DURATION = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER_FEATURE_COUNT = MOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.HeadToImpl <em>Head To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.HeadToImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getHeadTo()
	 * @generated
	 */
	int HEAD_TO = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TO__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TO__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TO__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TO__DIRECTION = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Head To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TO_FEATURE_COUNT = MOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Head To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TO_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.CircleImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NAME = MOVE__NAME;

	/**
	 * The feature id for the '<em><b>Pre Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__PRE_ACTIONS = MOVE__PRE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Post Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__POST_ACTIONS = MOVE__POST_ACTIONS;

	/**
	 * The feature id for the '<em><b>Target Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TARGET_POSITION = MOVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DURATION = MOVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = MOVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ALTITUDE = MOVE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clockwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CLOCKWISE = MOVE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = MOVE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.CommunicationActionImpl <em>Communication Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.CommunicationActionImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCommunicationAction()
	 * @generated
	 */
	int COMMUNICATION_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Communication Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.NotifyImpl <em>Notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.NotifyImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getNotify()
	 * @generated
	 */
	int NOTIFY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__NAME = COMMUNICATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__SLOT = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.BroadcastNotifyImpl <em>Broadcast Notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.BroadcastNotifyImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getBroadcastNotify()
	 * @generated
	 */
	int BROADCAST_NOTIFY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_NOTIFY__NAME = NOTIFY__NAME;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_NOTIFY__SLOT = NOTIFY__SLOT;

	/**
	 * The number of structural features of the '<em>Broadcast Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_NOTIFY_FEATURE_COUNT = NOTIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Broadcast Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_NOTIFY_OPERATION_COUNT = NOTIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.UnicastNotifyImpl <em>Unicast Notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.UnicastNotifyImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getUnicastNotify()
	 * @generated
	 */
	int UNICAST_NOTIFY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_NOTIFY__NAME = NOTIFY__NAME;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_NOTIFY__SLOT = NOTIFY__SLOT;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_NOTIFY__RECEIVER = NOTIFY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unicast Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_NOTIFY_FEATURE_COUNT = NOTIFY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unicast Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_NOTIFY_OPERATION_COUNT = NOTIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.MulticastNotifyImpl <em>Multicast Notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.MulticastNotifyImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getMulticastNotify()
	 * @generated
	 */
	int MULTICAST_NOTIFY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_NOTIFY__NAME = NOTIFY__NAME;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_NOTIFY__SLOT = NOTIFY__SLOT;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_NOTIFY__RECEIVER = NOTIFY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multicast Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_NOTIFY_FEATURE_COUNT = NOTIFY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multicast Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_NOTIFY_OPERATION_COUNT = NOTIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.CheckNotificationImpl <em>Check Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.CheckNotificationImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCheckNotification()
	 * @generated
	 */
	int CHECK_NOTIFICATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NOTIFICATION__NAME = COMMUNICATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NOTIFICATION__SLOT = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NOTIFICATION_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NOTIFICATION_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.SlotImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.DeviceActionImpl <em>Device Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.DeviceActionImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getDeviceAction()
	 * @generated
	 */
	int DEVICE_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTION__ACTION_NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTION__PARAMETERS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.ParameterImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.CoordinateImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 24;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__ALTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__HEADING = 3;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.impl.FeedbackImpl
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__NAME = COMMUNICATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__ACTION_NAME = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__PARAMETERS = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.GoToStrategy <em>Go To Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.GoToStrategy
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getGoToStrategy()
	 * @generated
	 */
	int GO_TO_STRATEGY = 26;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.behaviour.TravelMode <em>Travel Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.behaviour.TravelMode
	 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getTravelMode()
	 * @generated
	 */
	int TRAVEL_MODE = 27;


	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.flyaq.behaviour.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.flyaq.behaviour.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see it.univaq.flyaq.behaviour.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Behaviour#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see it.univaq.flyaq.behaviour.Behaviour#getCrs()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Crs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Behaviour#getDrones <em>Drones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drones</em>'.
	 * @see it.univaq.flyaq.behaviour.Behaviour#getDrones()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Drones();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Drone#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone#getTypeName()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_TypeName();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.behaviour.Drone#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone#getHome()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Home();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Drone#getMovements <em>Movements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Movements</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone#getMovements()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Movements();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Drone#getMoveTransitions <em>Move Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move Transitions</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone#getMoveTransitions()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_MoveTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Drone#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone#getSlots()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Slots();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Drone#getTravelMode <em>Travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Mode</em>'.
	 * @see it.univaq.flyaq.behaviour.Drone#getTravelMode()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_TravelMode();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see it.univaq.flyaq.behaviour.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see it.univaq.flyaq.behaviour.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see it.univaq.flyaq.behaviour.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see it.univaq.flyaq.behaviour.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Choice#getConditionIdentifier <em>Condition Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Identifier</em>'.
	 * @see it.univaq.flyaq.behaviour.Choice#getConditionIdentifier()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_ConditionIdentifier();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.behaviour.Choice#getFalseBranch <em>False Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>False Branch</em>'.
	 * @see it.univaq.flyaq.behaviour.Choice#getFalseBranch()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_FalseBranch();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see it.univaq.flyaq.behaviour.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Move#getPreActions <em>Pre Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Actions</em>'.
	 * @see it.univaq.flyaq.behaviour.Move#getPreActions()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_PreActions();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Move#getPostActions <em>Post Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Actions</em>'.
	 * @see it.univaq.flyaq.behaviour.Move#getPostActions()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_PostActions();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.TakeOff <em>Take Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Take Off</em>'.
	 * @see it.univaq.flyaq.behaviour.TakeOff
	 * @generated
	 */
	EClass getTakeOff();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.TakeOff#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see it.univaq.flyaq.behaviour.TakeOff#getAltitude()
	 * @see #getTakeOff()
	 * @generated
	 */
	EAttribute getTakeOff_Altitude();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Land <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Land</em>'.
	 * @see it.univaq.flyaq.behaviour.Land
	 * @generated
	 */
	EClass getLand();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see it.univaq.flyaq.behaviour.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.behaviour.GoTo#getTargetPosition <em>Target Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Position</em>'.
	 * @see it.univaq.flyaq.behaviour.GoTo#getTargetPosition()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_TargetPosition();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.GoTo#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see it.univaq.flyaq.behaviour.GoTo#getStrategy()
	 * @see #getGoTo()
	 * @generated
	 */
	EAttribute getGoTo_Strategy();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Hover <em>Hover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hover</em>'.
	 * @see it.univaq.flyaq.behaviour.Hover
	 * @generated
	 */
	EClass getHover();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Hover#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see it.univaq.flyaq.behaviour.Hover#getDuration()
	 * @see #getHover()
	 * @generated
	 */
	EAttribute getHover_Duration();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.HeadTo <em>Head To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head To</em>'.
	 * @see it.univaq.flyaq.behaviour.HeadTo
	 * @generated
	 */
	EClass getHeadTo();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.HeadTo#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see it.univaq.flyaq.behaviour.HeadTo#getDirection()
	 * @see #getHeadTo()
	 * @generated
	 */
	EAttribute getHeadTo_Direction();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see it.univaq.flyaq.behaviour.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.behaviour.Circle#getTargetPosition <em>Target Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Position</em>'.
	 * @see it.univaq.flyaq.behaviour.Circle#getTargetPosition()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_TargetPosition();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Circle#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see it.univaq.flyaq.behaviour.Circle#getDuration()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Duration();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see it.univaq.flyaq.behaviour.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Circle#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see it.univaq.flyaq.behaviour.Circle#getAltitude()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Circle#isClockwise <em>Clockwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clockwise</em>'.
	 * @see it.univaq.flyaq.behaviour.Circle#isClockwise()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Clockwise();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.CommunicationAction <em>Communication Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Action</em>'.
	 * @see it.univaq.flyaq.behaviour.CommunicationAction
	 * @generated
	 */
	EClass getCommunicationAction();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Notify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notify</em>'.
	 * @see it.univaq.flyaq.behaviour.Notify
	 * @generated
	 */
	EClass getNotify();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.behaviour.Notify#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slot</em>'.
	 * @see it.univaq.flyaq.behaviour.Notify#getSlot()
	 * @see #getNotify()
	 * @generated
	 */
	EReference getNotify_Slot();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.BroadcastNotify <em>Broadcast Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Notify</em>'.
	 * @see it.univaq.flyaq.behaviour.BroadcastNotify
	 * @generated
	 */
	EClass getBroadcastNotify();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.UnicastNotify <em>Unicast Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unicast Notify</em>'.
	 * @see it.univaq.flyaq.behaviour.UnicastNotify
	 * @generated
	 */
	EClass getUnicastNotify();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.behaviour.UnicastNotify#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see it.univaq.flyaq.behaviour.UnicastNotify#getReceiver()
	 * @see #getUnicastNotify()
	 * @generated
	 */
	EReference getUnicastNotify_Receiver();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.MulticastNotify <em>Multicast Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicast Notify</em>'.
	 * @see it.univaq.flyaq.behaviour.MulticastNotify
	 * @generated
	 */
	EClass getMulticastNotify();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.flyaq.behaviour.MulticastNotify#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver</em>'.
	 * @see it.univaq.flyaq.behaviour.MulticastNotify#getReceiver()
	 * @see #getMulticastNotify()
	 * @generated
	 */
	EReference getMulticastNotify_Receiver();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.CheckNotification <em>Check Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Notification</em>'.
	 * @see it.univaq.flyaq.behaviour.CheckNotification
	 * @generated
	 */
	EClass getCheckNotification();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.behaviour.CheckNotification#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slot</em>'.
	 * @see it.univaq.flyaq.behaviour.CheckNotification#getSlot()
	 * @see #getCheckNotification()
	 * @generated
	 */
	EReference getCheckNotification_Slot();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see it.univaq.flyaq.behaviour.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.DeviceAction <em>Device Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Action</em>'.
	 * @see it.univaq.flyaq.behaviour.DeviceAction
	 * @generated
	 */
	EClass getDeviceAction();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.DeviceAction#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see it.univaq.flyaq.behaviour.DeviceAction#getActionName()
	 * @see #getDeviceAction()
	 * @generated
	 */
	EAttribute getDeviceAction_ActionName();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.DeviceAction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.univaq.flyaq.behaviour.DeviceAction#getParameters()
	 * @see #getDeviceAction()
	 * @generated
	 */
	EReference getDeviceAction_Parameters();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.univaq.flyaq.behaviour.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.univaq.flyaq.behaviour.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.flyaq.behaviour.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.MoveTransition <em>Move Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Transition</em>'.
	 * @see it.univaq.flyaq.behaviour.MoveTransition
	 * @generated
	 */
	EClass getMoveTransition();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.flyaq.behaviour.MoveTransition#getWaitFor <em>Wait For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wait For</em>'.
	 * @see it.univaq.flyaq.behaviour.MoveTransition#getWaitFor()
	 * @see #getMoveTransition()
	 * @generated
	 */
	EReference getMoveTransition_WaitFor();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.behaviour.MoveTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see it.univaq.flyaq.behaviour.MoveTransition#getFrom()
	 * @see #getMoveTransition()
	 * @generated
	 */
	EReference getMoveTransition_From();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.behaviour.MoveTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see it.univaq.flyaq.behaviour.MoveTransition#getTo()
	 * @see #getMoveTransition()
	 * @generated
	 */
	EReference getMoveTransition_To();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.MoveTransition#isFluid <em>Fluid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid</em>'.
	 * @see it.univaq.flyaq.behaviour.MoveTransition#isFluid()
	 * @see #getMoveTransition()
	 * @generated
	 */
	EAttribute getMoveTransition_Fluid();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see it.univaq.flyaq.behaviour.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Coordinate#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see it.univaq.flyaq.behaviour.Coordinate#getLatitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Coordinate#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see it.univaq.flyaq.behaviour.Coordinate#getLongitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Coordinate#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see it.univaq.flyaq.behaviour.Coordinate#getAltitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Coordinate#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see it.univaq.flyaq.behaviour.Coordinate#getHeading()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Heading();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.behaviour.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see it.univaq.flyaq.behaviour.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.behaviour.Feedback#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see it.univaq.flyaq.behaviour.Feedback#getActionName()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_ActionName();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.behaviour.Feedback#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.univaq.flyaq.behaviour.Feedback#getParameters()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_Parameters();

	/**
	 * Returns the meta object for enum '{@link it.univaq.flyaq.behaviour.GoToStrategy <em>Go To Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Go To Strategy</em>'.
	 * @see it.univaq.flyaq.behaviour.GoToStrategy
	 * @generated
	 */
	EEnum getGoToStrategy();

	/**
	 * Returns the meta object for enum '{@link it.univaq.flyaq.behaviour.TravelMode <em>Travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel Mode</em>'.
	 * @see it.univaq.flyaq.behaviour.TravelMode
	 * @generated
	 */
	EEnum getTravelMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourFactory getBehaviourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.NamedElementImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__CRS = eINSTANCE.getBehaviour_Crs();

		/**
		 * The meta object literal for the '<em><b>Drones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__DRONES = eINSTANCE.getBehaviour_Drones();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.DroneImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__TYPE_NAME = eINSTANCE.getDrone_TypeName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__HOME = eINSTANCE.getDrone_Home();

		/**
		 * The meta object literal for the '<em><b>Movements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__MOVEMENTS = eINSTANCE.getDrone_Movements();

		/**
		 * The meta object literal for the '<em><b>Move Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__MOVE_TRANSITIONS = eINSTANCE.getDrone_MoveTransitions();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__SLOTS = eINSTANCE.getDrone_Slots();

		/**
		 * The meta object literal for the '<em><b>Travel Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__TRAVEL_MODE = eINSTANCE.getDrone_TravelMode();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.ActionImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.StartImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.StopImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.ChoiceImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Condition Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__CONDITION_IDENTIFIER = eINSTANCE.getChoice_ConditionIdentifier();

		/**
		 * The meta object literal for the '<em><b>False Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__FALSE_BRANCH = eINSTANCE.getChoice_FalseBranch();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.MoveImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Pre Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__PRE_ACTIONS = eINSTANCE.getMove_PreActions();

		/**
		 * The meta object literal for the '<em><b>Post Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__POST_ACTIONS = eINSTANCE.getMove_PostActions();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.TakeOffImpl <em>Take Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.TakeOffImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getTakeOff()
		 * @generated
		 */
		EClass TAKE_OFF = eINSTANCE.getTakeOff();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAKE_OFF__ALTITUDE = eINSTANCE.getTakeOff_Altitude();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.LandImpl <em>Land</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.LandImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getLand()
		 * @generated
		 */
		EClass LAND = eINSTANCE.getLand();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.GoToImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>Target Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__TARGET_POSITION = eINSTANCE.getGoTo_TargetPosition();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO__STRATEGY = eINSTANCE.getGoTo_Strategy();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.HoverImpl <em>Hover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.HoverImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getHover()
		 * @generated
		 */
		EClass HOVER = eINSTANCE.getHover();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOVER__DURATION = eINSTANCE.getHover_Duration();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.HeadToImpl <em>Head To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.HeadToImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getHeadTo()
		 * @generated
		 */
		EClass HEAD_TO = eINSTANCE.getHeadTo();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_TO__DIRECTION = eINSTANCE.getHeadTo_Direction();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.CircleImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Target Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__TARGET_POSITION = eINSTANCE.getCircle_TargetPosition();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__DURATION = eINSTANCE.getCircle_Duration();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__ALTITUDE = eINSTANCE.getCircle_Altitude();

		/**
		 * The meta object literal for the '<em><b>Clockwise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__CLOCKWISE = eINSTANCE.getCircle_Clockwise();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.CommunicationActionImpl <em>Communication Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.CommunicationActionImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCommunicationAction()
		 * @generated
		 */
		EClass COMMUNICATION_ACTION = eINSTANCE.getCommunicationAction();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.NotifyImpl <em>Notify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.NotifyImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getNotify()
		 * @generated
		 */
		EClass NOTIFY = eINSTANCE.getNotify();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY__SLOT = eINSTANCE.getNotify_Slot();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.BroadcastNotifyImpl <em>Broadcast Notify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.BroadcastNotifyImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getBroadcastNotify()
		 * @generated
		 */
		EClass BROADCAST_NOTIFY = eINSTANCE.getBroadcastNotify();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.UnicastNotifyImpl <em>Unicast Notify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.UnicastNotifyImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getUnicastNotify()
		 * @generated
		 */
		EClass UNICAST_NOTIFY = eINSTANCE.getUnicastNotify();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNICAST_NOTIFY__RECEIVER = eINSTANCE.getUnicastNotify_Receiver();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.MulticastNotifyImpl <em>Multicast Notify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.MulticastNotifyImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getMulticastNotify()
		 * @generated
		 */
		EClass MULTICAST_NOTIFY = eINSTANCE.getMulticastNotify();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_NOTIFY__RECEIVER = eINSTANCE.getMulticastNotify_Receiver();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.CheckNotificationImpl <em>Check Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.CheckNotificationImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCheckNotification()
		 * @generated
		 */
		EClass CHECK_NOTIFICATION = eINSTANCE.getCheckNotification();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_NOTIFICATION__SLOT = eINSTANCE.getCheckNotification_Slot();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.SlotImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.DeviceActionImpl <em>Device Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.DeviceActionImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getDeviceAction()
		 * @generated
		 */
		EClass DEVICE_ACTION = eINSTANCE.getDeviceAction();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_ACTION__ACTION_NAME = eINSTANCE.getDeviceAction_ActionName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ACTION__PARAMETERS = eINSTANCE.getDeviceAction_Parameters();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.ParameterImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.MoveTransitionImpl <em>Move Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.MoveTransitionImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getMoveTransition()
		 * @generated
		 */
		EClass MOVE_TRANSITION = eINSTANCE.getMoveTransition();

		/**
		 * The meta object literal for the '<em><b>Wait For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_TRANSITION__WAIT_FOR = eINSTANCE.getMoveTransition_WaitFor();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_TRANSITION__FROM = eINSTANCE.getMoveTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_TRANSITION__TO = eINSTANCE.getMoveTransition_To();

		/**
		 * The meta object literal for the '<em><b>Fluid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_TRANSITION__FLUID = eINSTANCE.getMoveTransition_Fluid();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.CoordinateImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__LATITUDE = eINSTANCE.getCoordinate_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__LONGITUDE = eINSTANCE.getCoordinate_Longitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__ALTITUDE = eINSTANCE.getCoordinate_Altitude();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__HEADING = eINSTANCE.getCoordinate_Heading();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.impl.FeedbackImpl
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__ACTION_NAME = eINSTANCE.getFeedback_ActionName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__PARAMETERS = eINSTANCE.getFeedback_Parameters();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.GoToStrategy <em>Go To Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.GoToStrategy
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getGoToStrategy()
		 * @generated
		 */
		EEnum GO_TO_STRATEGY = eINSTANCE.getGoToStrategy();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.behaviour.TravelMode <em>Travel Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.behaviour.TravelMode
		 * @see it.univaq.flyaq.behaviour.impl.BehaviourPackageImpl#getTravelMode()
		 * @generated
		 */
		EEnum TRAVEL_MODE = eINSTANCE.getTravelMode();

	}

} //BehaviourPackage
