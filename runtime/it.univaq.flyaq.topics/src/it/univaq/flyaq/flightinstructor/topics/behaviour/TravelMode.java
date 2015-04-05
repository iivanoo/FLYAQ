package it.univaq.flyaq.flightinstructor.topics.behaviour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>TravelMode</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum TravelMode {

	/**
	 * The enum: SAFE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SAFE(0, "SAFE", "SAFE") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isSAFE() {
			return true;
		}
	},
	/**
	 * The enum: NORMAL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	NORMAL(1, "NORMAL", "NORMAL") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isNORMAL() {
			return true;
		}
	},
	/**
	 * The enum: AGGRESSIVE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AGGRESSIVE(2, "AGGRESSIVE", "AGGRESSIVE") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isAGGRESSIVE() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>TravelMode</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final TravelMode[] VALUES_ARRAY = new TravelMode[] { SAFE,
			NORMAL, AGGRESSIVE };

	/**
	 * A public read-only list of all the '<em><b>TravelMode</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<TravelMode> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TravelMode</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the TravelMode, the literal enum class
	 * @generated
	 */
	public static TravelMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TravelMode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the TravelMode, the literal enum class
	 * @generated
	 */
	public static TravelMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TravelMode</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the TravelMode, the literal enum
	 * @generated
	 */
	public static TravelMode get(int value) {
		for (TravelMode enumInstance : VALUES_ARRAY) {
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
	private TravelMode(int value, String name, String literal) {
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
	public boolean isSAFE() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isNORMAL() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isAGGRESSIVE() {
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
