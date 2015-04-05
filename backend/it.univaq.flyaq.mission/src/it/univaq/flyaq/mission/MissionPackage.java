/**
 */
package it.univaq.flyaq.mission;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see it.univaq.flyaq.mission.MissionFactory
 * @model kind="package"
 * @generated
 */
public interface MissionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mission";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.flyaq.it/mission";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mission";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MissionPackage eINSTANCE = it.univaq.flyaq.mission.impl.MissionPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.NamedElementImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.MissionImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CRS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TASK_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__SWARM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.SwarmImpl <em>Swarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.SwarmImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getSwarm()
	 * @generated
	 */
	int SWARM = 2;

	/**
	 * The feature id for the '<em><b>Drones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__DRONES = 0;

	/**
	 * The number of structural features of the '<em>Swarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Swarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.DroneImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__HOME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__RETURN_HOME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.TaskImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.ControlTaskImpl <em>Control Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.ControlTaskImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getControlTask()
	 * @generated
	 */
	int CONTROL_TASK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Reference Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TASK__REFERENCE_POSITION = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.ForkImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = CONTROL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Reference Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__REFERENCE_POSITION = CONTROL_TASK__REFERENCE_POSITION;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = CONTROL_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = CONTROL_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.JoinImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = CONTROL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Reference Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REFERENCE_POSITION = CONTROL_TASK__REFERENCE_POSITION;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = CONTROL_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = CONTROL_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.TaskDependencyImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getTaskDependency()
	 * @generated
	 */
	int TASK_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__FROM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__TO = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.CoordinateImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 9;

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
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.PolygonTaskImpl <em>Polygon Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.PolygonTaskImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getPolygonTask()
	 * @generated
	 */
	int POLYGON_TASK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TASK__SHELL = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TASK__INITIAL_POSITION = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polygon Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Polygon Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.PointTaskImpl <em>Point Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.PointTaskImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getPointTask()
	 * @generated
	 */
	int POINT_TASK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TASK__POINT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.mission.impl.LineTaskImpl <em>Line Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.mission.impl.LineTaskImpl
	 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getLineTask()
	 * @generated
	 */
	int LINE_TASK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK__POINTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK__INITIAL_POSITION = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Line Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.flyaq.mission.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.flyaq.mission.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see it.univaq.flyaq.mission.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.Mission#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see it.univaq.flyaq.mission.Mission#getCrs()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Crs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.mission.Mission#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see it.univaq.flyaq.mission.Mission#getTasks()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.mission.Mission#getTaskDependencies <em>Task Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Dependencies</em>'.
	 * @see it.univaq.flyaq.mission.Mission#getTaskDependencies()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_TaskDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.mission.Mission#getSwarm <em>Swarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swarm</em>'.
	 * @see it.univaq.flyaq.mission.Mission#getSwarm()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Swarm();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Swarm <em>Swarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm</em>'.
	 * @see it.univaq.flyaq.mission.Swarm
	 * @generated
	 */
	EClass getSwarm();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.mission.Swarm#getDrones <em>Drones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drones</em>'.
	 * @see it.univaq.flyaq.mission.Swarm#getDrones()
	 * @see #getSwarm()
	 * @generated
	 */
	EReference getSwarm_Drones();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see it.univaq.flyaq.mission.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.mission.Drone#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see it.univaq.flyaq.mission.Drone#getHome()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Home();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.Drone#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.univaq.flyaq.mission.Drone#getType()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.Drone#isReturnHome <em>Return Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Home</em>'.
	 * @see it.univaq.flyaq.mission.Drone#isReturnHome()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_ReturnHome();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see it.univaq.flyaq.mission.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.ControlTask <em>Control Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Task</em>'.
	 * @see it.univaq.flyaq.mission.ControlTask
	 * @generated
	 */
	EClass getControlTask();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.mission.ControlTask#getReferencePosition <em>Reference Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Position</em>'.
	 * @see it.univaq.flyaq.mission.ControlTask#getReferencePosition()
	 * @see #getControlTask()
	 * @generated
	 */
	EReference getControlTask_ReferencePosition();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see it.univaq.flyaq.mission.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see it.univaq.flyaq.mission.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.TaskDependency <em>Task Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Dependency</em>'.
	 * @see it.univaq.flyaq.mission.TaskDependency
	 * @generated
	 */
	EClass getTaskDependency();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.mission.TaskDependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see it.univaq.flyaq.mission.TaskDependency#getFrom()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EReference getTaskDependency_From();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.flyaq.mission.TaskDependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see it.univaq.flyaq.mission.TaskDependency#getTo()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EReference getTaskDependency_To();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see it.univaq.flyaq.mission.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.Coordinate#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see it.univaq.flyaq.mission.Coordinate#getLatitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.Coordinate#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see it.univaq.flyaq.mission.Coordinate#getLongitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.mission.Coordinate#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see it.univaq.flyaq.mission.Coordinate#getAltitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Altitude();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.PolygonTask <em>Polygon Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Task</em>'.
	 * @see it.univaq.flyaq.mission.PolygonTask
	 * @generated
	 */
	EClass getPolygonTask();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.mission.PolygonTask#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shell</em>'.
	 * @see it.univaq.flyaq.mission.PolygonTask#getShell()
	 * @see #getPolygonTask()
	 * @generated
	 */
	EReference getPolygonTask_Shell();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.mission.PolygonTask#getInitialPosition <em>Initial Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Position</em>'.
	 * @see it.univaq.flyaq.mission.PolygonTask#getInitialPosition()
	 * @see #getPolygonTask()
	 * @generated
	 */
	EReference getPolygonTask_InitialPosition();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.PointTask <em>Point Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Task</em>'.
	 * @see it.univaq.flyaq.mission.PointTask
	 * @generated
	 */
	EClass getPointTask();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.mission.PointTask#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see it.univaq.flyaq.mission.PointTask#getPoint()
	 * @see #getPointTask()
	 * @generated
	 */
	EReference getPointTask_Point();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.mission.LineTask <em>Line Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Task</em>'.
	 * @see it.univaq.flyaq.mission.LineTask
	 * @generated
	 */
	EClass getLineTask();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.mission.LineTask#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see it.univaq.flyaq.mission.LineTask#getPoints()
	 * @see #getLineTask()
	 * @generated
	 */
	EReference getLineTask_Points();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.flyaq.mission.LineTask#getInitialPosition <em>Initial Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Position</em>'.
	 * @see it.univaq.flyaq.mission.LineTask#getInitialPosition()
	 * @see #getLineTask()
	 * @generated
	 */
	EReference getLineTask_InitialPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MissionFactory getMissionFactory();

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
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.NamedElementImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.MissionImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__CRS = eINSTANCE.getMission_Crs();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__TASKS = eINSTANCE.getMission_Tasks();

		/**
		 * The meta object literal for the '<em><b>Task Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__TASK_DEPENDENCIES = eINSTANCE.getMission_TaskDependencies();

		/**
		 * The meta object literal for the '<em><b>Swarm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__SWARM = eINSTANCE.getMission_Swarm();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.SwarmImpl <em>Swarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.SwarmImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getSwarm()
		 * @generated
		 */
		EClass SWARM = eINSTANCE.getSwarm();

		/**
		 * The meta object literal for the '<em><b>Drones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWARM__DRONES = eINSTANCE.getSwarm_Drones();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.DroneImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__HOME = eINSTANCE.getDrone_Home();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__TYPE = eINSTANCE.getDrone_Type();

		/**
		 * The meta object literal for the '<em><b>Return Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__RETURN_HOME = eINSTANCE.getDrone_ReturnHome();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.TaskImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.ControlTaskImpl <em>Control Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.ControlTaskImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getControlTask()
		 * @generated
		 */
		EClass CONTROL_TASK = eINSTANCE.getControlTask();

		/**
		 * The meta object literal for the '<em><b>Reference Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TASK__REFERENCE_POSITION = eINSTANCE.getControlTask_ReferencePosition();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.ForkImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.JoinImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.TaskDependencyImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getTaskDependency()
		 * @generated
		 */
		EClass TASK_DEPENDENCY = eINSTANCE.getTaskDependency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEPENDENCY__FROM = eINSTANCE.getTaskDependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEPENDENCY__TO = eINSTANCE.getTaskDependency_To();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.CoordinateImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getCoordinate()
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
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.PolygonTaskImpl <em>Polygon Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.PolygonTaskImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getPolygonTask()
		 * @generated
		 */
		EClass POLYGON_TASK = eINSTANCE.getPolygonTask();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON_TASK__SHELL = eINSTANCE.getPolygonTask_Shell();

		/**
		 * The meta object literal for the '<em><b>Initial Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON_TASK__INITIAL_POSITION = eINSTANCE.getPolygonTask_InitialPosition();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.PointTaskImpl <em>Point Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.PointTaskImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getPointTask()
		 * @generated
		 */
		EClass POINT_TASK = eINSTANCE.getPointTask();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TASK__POINT = eINSTANCE.getPointTask_Point();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.mission.impl.LineTaskImpl <em>Line Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.mission.impl.LineTaskImpl
		 * @see it.univaq.flyaq.mission.impl.MissionPackageImpl#getLineTask()
		 * @generated
		 */
		EClass LINE_TASK = eINSTANCE.getLineTask();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TASK__POINTS = eINSTANCE.getLineTask_Points();

		/**
		 * The meta object literal for the '<em><b>Initial Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TASK__INITIAL_POSITION = eINSTANCE.getLineTask_InitialPosition();

	}

} //MissionPackage
