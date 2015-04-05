/**
 */
package it.univaq.flyaq.context;

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
 * @see it.univaq.flyaq.context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.flyaq.it/context";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = it.univaq.flyaq.context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.context.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.context.impl.NamedElementImpl
	 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link it.univaq.flyaq.context.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.context.impl.ContextImpl
	 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CRS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Fly Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NO_FLY_AREAS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obstacles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OBSTACLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Emergency Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EMERGENCY_AREAS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.context.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.context.impl.AreaImpl
	 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__SHELL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Safety Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__SAFETY_DISTANCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.context.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.context.impl.ObstacleImpl
	 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__NAME = AREA__NAME;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__SHELL = AREA__SHELL;

	/**
	 * The feature id for the '<em><b>Safety Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__SAFETY_DISTANCE = AREA__SAFETY_DISTANCE;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__MIN_HEIGHT = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__MAX_HEIGHT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.context.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.context.impl.CoordinateImpl
	 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 4;

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
	 * Returns the meta object for class '{@link it.univaq.flyaq.context.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.flyaq.context.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.flyaq.context.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.context.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see it.univaq.flyaq.context.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Context#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see it.univaq.flyaq.context.Context#getCrs()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Crs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.context.Context#getNoFlyAreas <em>No Fly Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>No Fly Areas</em>'.
	 * @see it.univaq.flyaq.context.Context#getNoFlyAreas()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_NoFlyAreas();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.context.Context#getObstacles <em>Obstacles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obstacles</em>'.
	 * @see it.univaq.flyaq.context.Context#getObstacles()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Obstacles();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.context.Context#getEmergencyAreas <em>Emergency Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emergency Areas</em>'.
	 * @see it.univaq.flyaq.context.Context#getEmergencyAreas()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_EmergencyAreas();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.context.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see it.univaq.flyaq.context.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.flyaq.context.Area#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shell</em>'.
	 * @see it.univaq.flyaq.context.Area#getShell()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Shell();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Area#getSafetyDistance <em>Safety Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety Distance</em>'.
	 * @see it.univaq.flyaq.context.Area#getSafetyDistance()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_SafetyDistance();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.context.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see it.univaq.flyaq.context.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Obstacle#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Height</em>'.
	 * @see it.univaq.flyaq.context.Obstacle#getMinHeight()
	 * @see #getObstacle()
	 * @generated
	 */
	EAttribute getObstacle_MinHeight();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Obstacle#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see it.univaq.flyaq.context.Obstacle#getMaxHeight()
	 * @see #getObstacle()
	 * @generated
	 */
	EAttribute getObstacle_MaxHeight();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.context.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see it.univaq.flyaq.context.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Coordinate#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see it.univaq.flyaq.context.Coordinate#getLatitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Coordinate#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see it.univaq.flyaq.context.Coordinate#getLongitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.context.Coordinate#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see it.univaq.flyaq.context.Coordinate#getAltitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Altitude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
		 * The meta object literal for the '{@link it.univaq.flyaq.context.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.context.impl.NamedElementImpl
		 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link it.univaq.flyaq.context.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.context.impl.ContextImpl
		 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__CRS = eINSTANCE.getContext_Crs();

		/**
		 * The meta object literal for the '<em><b>No Fly Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__NO_FLY_AREAS = eINSTANCE.getContext_NoFlyAreas();

		/**
		 * The meta object literal for the '<em><b>Obstacles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__OBSTACLES = eINSTANCE.getContext_Obstacles();

		/**
		 * The meta object literal for the '<em><b>Emergency Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__EMERGENCY_AREAS = eINSTANCE.getContext_EmergencyAreas();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.context.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.context.impl.AreaImpl
		 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__SHELL = eINSTANCE.getArea_Shell();

		/**
		 * The meta object literal for the '<em><b>Safety Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__SAFETY_DISTANCE = eINSTANCE.getArea_SafetyDistance();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.context.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.context.impl.ObstacleImpl
		 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '<em><b>Min Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE__MIN_HEIGHT = eINSTANCE.getObstacle_MinHeight();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE__MAX_HEIGHT = eINSTANCE.getObstacle_MaxHeight();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.context.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.context.impl.CoordinateImpl
		 * @see it.univaq.flyaq.context.impl.ContextPackageImpl#getCoordinate()
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

	}

} //ContextPackage
