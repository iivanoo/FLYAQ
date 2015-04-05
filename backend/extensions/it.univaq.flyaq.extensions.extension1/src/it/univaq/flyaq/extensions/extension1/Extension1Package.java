/**
 */
package it.univaq.flyaq.extensions.extension1;

import it.univaq.flyaq.mission.MissionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see it.univaq.flyaq.extensions.extension1.Extension1Factory
 * @model kind="package"
 * @generated
 */
public interface Extension1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.flyaq.it/extension1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Extension1Package eINSTANCE = it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.extensions.extension1.impl.PhotoGridTaskImpl <em>Photo Grid Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.extensions.extension1.impl.PhotoGridTaskImpl
	 * @see it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl#getPhotoGridTask()
	 * @generated
	 */
	int PHOTO_GRID_TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK__NAME = MissionPackage.POLYGON_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK__SHELL = MissionPackage.POLYGON_TASK__SHELL;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK__INITIAL_POSITION = MissionPackage.POLYGON_TASK__INITIAL_POSITION;

	/**
	 * The feature id for the '<em><b>Grid Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK__GRID_RESOLUTION = MissionPackage.POLYGON_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK__ALTITUDE = MissionPackage.POLYGON_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Photo Grid Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK_FEATURE_COUNT = MissionPackage.POLYGON_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Photo Grid Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_GRID_TASK_OPERATION_COUNT = MissionPackage.POLYGON_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.extensions.extension1.impl.GoToTaskImpl <em>Go To Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.extensions.extension1.impl.GoToTaskImpl
	 * @see it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl#getGoToTask()
	 * @generated
	 */
	int GO_TO_TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_TASK__NAME = MissionPackage.POINT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_TASK__POINT = MissionPackage.POINT_TASK__POINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_TASK__TYPE = MissionPackage.POINT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go To Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_TASK_FEATURE_COUNT = MissionPackage.POINT_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go To Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_TASK_OPERATION_COUNT = MissionPackage.POINT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.flyaq.extensions.extension1.GoToType <em>Go To Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.flyaq.extensions.extension1.GoToType
	 * @see it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl#getGoToType()
	 * @generated
	 */
	int GO_TO_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask <em>Photo Grid Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Grid Task</em>'.
	 * @see it.univaq.flyaq.extensions.extension1.PhotoGridTask
	 * @generated
	 */
	EClass getPhotoGridTask();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask#getGridResolution <em>Grid Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Resolution</em>'.
	 * @see it.univaq.flyaq.extensions.extension1.PhotoGridTask#getGridResolution()
	 * @see #getPhotoGridTask()
	 * @generated
	 */
	EAttribute getPhotoGridTask_GridResolution();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.extensions.extension1.PhotoGridTask#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see it.univaq.flyaq.extensions.extension1.PhotoGridTask#getAltitude()
	 * @see #getPhotoGridTask()
	 * @generated
	 */
	EAttribute getPhotoGridTask_Altitude();

	/**
	 * Returns the meta object for class '{@link it.univaq.flyaq.extensions.extension1.GoToTask <em>Go To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To Task</em>'.
	 * @see it.univaq.flyaq.extensions.extension1.GoToTask
	 * @generated
	 */
	EClass getGoToTask();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.flyaq.extensions.extension1.GoToTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.univaq.flyaq.extensions.extension1.GoToTask#getType()
	 * @see #getGoToTask()
	 * @generated
	 */
	EAttribute getGoToTask_Type();

	/**
	 * Returns the meta object for enum '{@link it.univaq.flyaq.extensions.extension1.GoToType <em>Go To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Go To Type</em>'.
	 * @see it.univaq.flyaq.extensions.extension1.GoToType
	 * @generated
	 */
	EEnum getGoToType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Extension1Factory getExtension1Factory();

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
		 * The meta object literal for the '{@link it.univaq.flyaq.extensions.extension1.impl.PhotoGridTaskImpl <em>Photo Grid Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.extensions.extension1.impl.PhotoGridTaskImpl
		 * @see it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl#getPhotoGridTask()
		 * @generated
		 */
		EClass PHOTO_GRID_TASK = eINSTANCE.getPhotoGridTask();

		/**
		 * The meta object literal for the '<em><b>Grid Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_GRID_TASK__GRID_RESOLUTION = eINSTANCE.getPhotoGridTask_GridResolution();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_GRID_TASK__ALTITUDE = eINSTANCE.getPhotoGridTask_Altitude();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.extensions.extension1.impl.GoToTaskImpl <em>Go To Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.extensions.extension1.impl.GoToTaskImpl
		 * @see it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl#getGoToTask()
		 * @generated
		 */
		EClass GO_TO_TASK = eINSTANCE.getGoToTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO_TASK__TYPE = eINSTANCE.getGoToTask_Type();

		/**
		 * The meta object literal for the '{@link it.univaq.flyaq.extensions.extension1.GoToType <em>Go To Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.flyaq.extensions.extension1.GoToType
		 * @see it.univaq.flyaq.extensions.extension1.impl.Extension1PackageImpl#getGoToType()
		 * @generated
		 */
		EEnum GO_TO_TYPE = eINSTANCE.getGoToType();

	}

} //Extension1Package
