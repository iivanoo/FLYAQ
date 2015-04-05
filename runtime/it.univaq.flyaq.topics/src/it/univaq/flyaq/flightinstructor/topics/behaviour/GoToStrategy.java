package it.univaq.flyaq.flightinstructor.topics.behaviour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>GoToStrategy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum GoToStrategy {

	/**
	 * The enum: DIRECT <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DIRECT(0, "DIRECT", "DIRECT") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDIRECT() {
			return true;
		}
	},
	/**
	 * The enum: HORIZONTAL_FIRST <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	HORIZONTAL_FIRST(1, "HORIZONTAL_FIRST", "HORIZONTAL_FIRST") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isHORIZONTAL_FIRST() {
			return true;
		}
	},
	/**
	 * The enum: VERTICAL_FIRST <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	VERTICAL_FIRST(2, "VERTICAL_FIRST", "VERTICAL_FIRST") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isVERTICAL_FIRST() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>GoToStrategy</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final GoToStrategy[] VALUES_ARRAY = new GoToStrategy[] {
			DIRECT, HORIZONTAL_FIRST, VERTICAL_FIRST };

	/**
	 * A public read-only list of all the '<em><b>GoToStrategy</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<GoToStrategy> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GoToStrategy</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the GoToStrategy, the literal enum class
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
	 * Returns the '<em><b>GoToStrategy</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the GoToStrategy, the literal enum class
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
	 * Returns the '<em><b>GoToStrategy</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the GoToStrategy, the literal enum
	 * @generated
	 */
	public static GoToStrategy get(int value) {
		for (GoToStrategy enumInstance : VALUES_ARRAY) {
			if (enumInstance.getValue() == value) {
				return enumInstance;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private GoToStrategy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDIRECT() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isHORIZONTAL_FIRST() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isVERTICAL_FIRST() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal of this enum instance
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal value of the enumerator, which is its string
	 *         representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
