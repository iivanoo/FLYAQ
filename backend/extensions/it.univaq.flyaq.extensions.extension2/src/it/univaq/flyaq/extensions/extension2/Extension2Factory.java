/**
 */
package it.univaq.flyaq.extensions.extension2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.extensions.extension2.Extension2Package
 * @generated
 */
public interface Extension2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Extension2Factory eINSTANCE = it.univaq.flyaq.extensions.extension2.impl.Extension2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Road Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road Task</em>'.
	 * @generated
	 */
	RoadTask createRoadTask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Extension2Package getExtension2Package();

} //Extension2Factory
