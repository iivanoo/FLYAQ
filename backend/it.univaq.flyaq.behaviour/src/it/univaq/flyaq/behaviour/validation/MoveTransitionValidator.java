/**
 *
 * $Id$
 */
package it.univaq.flyaq.behaviour.validation;

import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.Slot;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.univaq.flyaq.behaviour.MoveTransition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MoveTransitionValidator {
	boolean validate();

	boolean validateWaitFor(EList<Slot> value);

	boolean validateWaitFor(Slot value);
	boolean validateFrom(Move value);
	boolean validateTo(Move value);
	boolean validateFluid(boolean value);
}