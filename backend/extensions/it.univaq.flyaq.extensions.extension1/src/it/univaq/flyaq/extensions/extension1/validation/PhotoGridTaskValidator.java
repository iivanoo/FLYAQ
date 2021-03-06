/**
 *
 * $Id$
 */
package it.univaq.flyaq.extensions.extension1.validation;


/**
 * A sample validator interface for {@link it.univaq.flyaq.extensions.extension1.PhotoGridTask}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PhotoGridTaskValidator {
	boolean validate();

	boolean validateGridResolution(float value);
	boolean validateAltitude(float value);
}
