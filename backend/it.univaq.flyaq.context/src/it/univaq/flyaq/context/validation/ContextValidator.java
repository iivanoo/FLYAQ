/**
 *
 * $Id$
 */
package it.univaq.flyaq.context.validation;

import it.univaq.flyaq.context.Area;
import it.univaq.flyaq.context.Obstacle;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.univaq.flyaq.context.Context}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContextValidator {
	boolean validate();

	boolean validateCrs(String value);
	boolean validateNoFlyAreas(EList<Area> value);
	boolean validateObstacles(EList<Obstacle> value);
	boolean validateEmergencyAreas(EList<Area> value);
}
