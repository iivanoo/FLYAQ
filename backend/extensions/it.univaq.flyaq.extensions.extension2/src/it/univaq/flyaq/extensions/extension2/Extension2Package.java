/**
 */
package it.univaq.flyaq.extensions.extension2;

import it.univaq.flyaq.mission.MissionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see it.univaq.flyaq.extensions.extension2.Extension2Factory
 * @model kind="package"
 * @generated
 */
public interface Extension2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.flyaq.it/extension2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Extension2Package eINSTANCE = it.univaq.flyaq.extensions.extension2.impl.Extension2PackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.extensions.extension2.impl.RoadTaskImpl <em>Road Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.extensions.extension2.impl.RoadTaskImpl
	 * @see it.univaq.flyaq.extensions.extension2.impl.Extension2PackageImpl#getRoadTask()
	 * @generated
	 */
	int ROAD_TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TASK__NAME = MissionPackage.LINE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TASK__POINTS = MissionPackage.LINE_TASK__POINTS;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TASK__INITIAL_POSITION = MissionPackage.LINE_TASK__INITIAL_POSITION;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TASK__INVERTED = MissionPackage.LINE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Road Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TASK_FEATURE_COUNT = MissionPackage.LINE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Road Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TASK_OPERATION_COUNT = MissionPackage.LINE_TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.extensions.extension2.RoadTask <em>Road Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Task</em>'.
	 * @see it.univaq.flyaq.extensions.extension2.RoadTask
	 * @generated
	 */
	EClass getRoadTask();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.extensions.extension2.RoadTask#isInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see it.univaq.flyaq.extensions.extension2.RoadTask#isInverted()
	 * @see #getRoadTask()
	 * @generated
	 */
	EAttribute getRoadTask_Inverted();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Extension2Factory getExtension2Factory();

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
		 * The meta object literal for the '{@link it.univaq.flyaq.extensions.extension2.impl.RoadTaskImpl <em>Road Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.extensions.extension2.impl.RoadTaskImpl
		 * @see it.univaq.flyaq.extensions.extension2.impl.Extension2PackageImpl#getRoadTask()
		 * @generated
		 */
		EClass ROAD_TASK = eINSTANCE.getRoadTask();

		/**
		 * The meta object literal for the '<em><b>Inverted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_TASK__INVERTED = eINSTANCE.getRoadTask_Inverted();

	}

} //Extension2Package
