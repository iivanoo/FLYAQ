package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Parameter</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Parameter {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String key = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String value = null;
	
	public Parameter(JsonObject jsonObject) {
		this.key = jsonObject.getString("key");
		this.value = jsonObject.getString("value");
	}

	/**
	 * Returns the value of '<em><b>key</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>key</b></em>' feature
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the '{@link Parameter#getKey() <em>key</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newKey
	 *            the new value of the '{@link Parameter#getKey() key}' feature.
	 * @generated
	 */
	public void setKey(String newKey) {
		key = newKey;
	}

	/**
	 * Returns the value of '<em><b>value</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>value</b></em>' feature
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the '{@link Parameter#getValue() <em>value</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newValue
	 *            the new value of the '{@link Parameter#getValue() value}'
	 *            feature.
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Parameter " + " [key: " + getKey() + "]" + " [value: "
				+ getValue() + "]";
	}
}
