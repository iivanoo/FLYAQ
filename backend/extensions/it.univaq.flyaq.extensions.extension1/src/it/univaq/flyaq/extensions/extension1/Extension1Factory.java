/**
 */
package it.univaq.flyaq.extensions.extension1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.extensions.extension1.Extension1Package
 * @generated
 */
public interface Extension1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Extension1Factory eINSTANCE = it.univaq.flyaq.extensions.extension1.impl.Extension1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Photo Grid Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Grid Task</em>'.
	 * @generated
	 */
	PhotoGridTask createPhotoGridTask();

	/**
	 * Returns a new object of class '<em>Go To Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To Task</em>'.
	 * @generated
	 */
	GoToTask createGoToTask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Extension1Package getExtension1Package();

} //Extension1Factory
