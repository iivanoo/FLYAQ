/**
 */
package it.univaq.flyaq.extensions.extension1.impl;

import it.univaq.flyaq.extensions.extension1.Extension1Factory;
import it.univaq.flyaq.extensions.extension1.Extension1Package;
import it.univaq.flyaq.extensions.extension1.GoToTask;
import it.univaq.flyaq.extensions.extension1.GoToType;
import it.univaq.flyaq.extensions.extension1.PhotoGridTask;

import it.univaq.flyaq.mission.MissionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Extension1PackageImpl extends EPackageImpl implements Extension1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoGridTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goToTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goToTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.univaq.flyaq.extensions.extension1.Extension1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Extension1PackageImpl() {
		super(eNS_URI, Extension1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Extension1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Extension1Package init() {
		if (isInited) return (Extension1Package)EPackage.Registry.INSTANCE.getEPackage(Extension1Package.eNS_URI);

		// Obtain or create and register package
		Extension1PackageImpl theExtension1Package = (Extension1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Extension1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Extension1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MissionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtension1Package.createPackageContents();

		// Initialize created meta-data
		theExtension1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtension1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Extension1Package.eNS_URI, theExtension1Package);
		return theExtension1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotoGridTask() {
		return photoGridTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoGridTask_GridResolution() {
		return (EAttribute)photoGridTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoGridTask_Altitude() {
		return (EAttribute)photoGridTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoToTask() {
		return goToTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoToTask_Type() {
		return (EAttribute)goToTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoToType() {
		return goToTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension1Factory getExtension1Factory() {
		return (Extension1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		photoGridTaskEClass = createEClass(PHOTO_GRID_TASK);
		createEAttribute(photoGridTaskEClass, PHOTO_GRID_TASK__GRID_RESOLUTION);
		createEAttribute(photoGridTaskEClass, PHOTO_GRID_TASK__ALTITUDE);

		goToTaskEClass = createEClass(GO_TO_TASK);
		createEAttribute(goToTaskEClass, GO_TO_TASK__TYPE);

		// Create enums
		goToTypeEEnum = createEEnum(GO_TO_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MissionPackage theMissionPackage = (MissionPackage)EPackage.Registry.INSTANCE.getEPackage(MissionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		photoGridTaskEClass.getESuperTypes().add(theMissionPackage.getPolygonTask());
		goToTaskEClass.getESuperTypes().add(theMissionPackage.getPointTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(photoGridTaskEClass, PhotoGridTask.class, "PhotoGridTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhotoGridTask_GridResolution(), ecorePackage.getEFloat(), "gridResolution", null, 1, 1, PhotoGridTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoGridTask_Altitude(), ecorePackage.getEFloat(), "altitude", null, 1, 1, PhotoGridTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goToTaskEClass, GoToTask.class, "GoToTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoToTask_Type(), this.getGoToType(), "type", "NORMAL", 0, 1, GoToTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(goToTypeEEnum, GoToType.class, "GoToType");
		addEEnumLiteral(goToTypeEEnum, GoToType.NORMAL);
		addEEnumLiteral(goToTypeEEnum, GoToType.SLOW);
		addEEnumLiteral(goToTypeEEnum, GoToType.QUICK);

		// Create resource
		createResource(eNS_URI);
	}

} //Extension1PackageImpl
