/**
 *
 * $Id$
 */
package it.univaq.flyaq.drone.validation;


/**
 * A sample validator interface for {@link it.univaq.flyaq.drone.Battery}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BatteryValidator {
	boolean validate();

	boolean validateCellType(String value);
	boolean validateCapacity(int value);
	boolean validateVoltage(float value);
	boolean validateRechargeTime(int value);
}
