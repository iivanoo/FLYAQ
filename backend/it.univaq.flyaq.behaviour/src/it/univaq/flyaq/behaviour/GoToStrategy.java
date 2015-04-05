/**
 */
package it.univaq.flyaq.behaviour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Go To Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.univaq.flyaq.behaviour.BehaviourPackage#getGoToStrategy()
 * @model
 * @generated
 */
public enum GoToStrategy implements Enumerator {
	/**
	 * The '<em><b>DIRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT(0, "DIRECT", "DIRECT"),

	/**
	 * The '<em><b>HORIZONTAL FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_FIRST(1, "HORIZONTAL_FIRST", "HORIZONTAL_FIRST"),

	/**
	 * The '<em><b>VERTICAL FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_FIRST(2, "VERTICAL_FIRST", "VERTICAL_FIRST");

	/**
	 * The '<em><b>DIRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIRECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_VALUE = 0;

	/**
	 * The '<em><b>HORIZONTAL FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HORIZONTAL FIRST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_FIRST_VALUE = 1;

	/**
	 * The '<em><b>VERTICAL FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTICAL FIRST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_FIRST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Go To Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoToStrategy[] VALUES_ARRAY =
		new GoToStrategy[] {
			DIRECT,
			HORIZONTAL_FIRST,
			VERTICAL_FIRST,
		};

	/**
	 * A public read-only list of all the '<em><b>Go To Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoToStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Go To Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoToStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoToStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Go To Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoToStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoToStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Go To Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoToStrategy get(int value) {
		switch (value) {
			case DIRECT_VALUE: return DIRECT;
			case HORIZONTAL_FIRST_VALUE: return HORIZONTAL_FIRST;
			case VERTICAL_FIRST_VALUE: return VERTICAL_FIRST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GoToStrategy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GoToStrategy
