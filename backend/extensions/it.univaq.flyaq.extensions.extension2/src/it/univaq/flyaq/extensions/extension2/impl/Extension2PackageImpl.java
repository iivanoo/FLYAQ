/**
 */
package it.univaq.flyaq.extensions.extension2.impl;

import it.univaq.flyaq.extensions.extension2.Extension2Factory;
import it.univaq.flyaq.extensions.extension2.Extension2Package;
import it.univaq.flyaq.extensions.extension2.RoadTask;

import it.univaq.flyaq.mission.MissionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Extension2PackageImpl extends EPackageImpl implements Extension2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadTaskEClass = null;

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
	 * @see it.univaq.flyaq.extensions.extension2.Extension2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Extension2PackageImpl() {
		super(eNS_URI, Extension2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Extension2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Extension2Package init() {
		if (isInited) return (Extension2Package)EPackage.Registry.INSTANCE.getEPackage(Extension2Package.eNS_URI);

		// Obtain or create and register package
		Extension2PackageImpl theExtension2Package = (Extension2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Extension2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Extension2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MissionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtension2Package.createPackageContents();

		// Initialize created meta-data
		theExtension2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtension2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Extension2Package.eNS_URI, theExtension2Package);
		return theExtension2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoadTask() {
		return roadTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoadTask_Inverted() {
		return (EAttribute)roadTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension2Factory getExtension2Factory() {
		return (Extension2Factory)getEFactoryInstance();
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
		roadTaskEClass = createEClass(ROAD_TASK);
		createEAttribute(roadTaskEClass, ROAD_TASK__INVERTED);
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
		roadTaskEClass.getESuperTypes().add(theMissionPackage.getLineTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(roadTaskEClass, RoadTask.class, "RoadTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoadTask_Inverted(), ecorePackage.getEBoolean(), "inverted", null, 0, 1, RoadTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Extension2PackageImpl
