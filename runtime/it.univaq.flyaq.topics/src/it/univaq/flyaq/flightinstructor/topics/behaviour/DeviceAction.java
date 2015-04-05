package it.univaq.flyaq.flightinstructor.topics.behaviour;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>DeviceAction</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DeviceAction extends Action {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String actionName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Parameter> parameters = new ArrayList<Parameter>();
	
	public DeviceAction(JsonObject jsonObject) {
		super(jsonObject);
		this.actionName = jsonObject.getString("action_name");
		JsonArray jsonParameters = jsonObject.getJsonArray("parameters");
		for(int i=0; i<jsonParameters.size(); i++) {
			this.parameters.add(new Parameter(jsonParameters.getJsonObject(i)));
		}
	}

	/**
	 * Returns the value of '<em><b>actionName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>actionName</b></em>' feature
	 * @generated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * Sets the '{@link DeviceAction#getActionName() <em>actionName</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newActionName
	 *            the new value of the '{@link DeviceAction#getActionName()
	 *            actionName}' feature.
	 * @generated
	 */
	public void setActionName(String newActionName) {
		actionName = newActionName;
	}

	/**
	 * Returns the value of '<em><b>parameters</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>parameters</b></em>' feature
	 * @generated
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}

	/**
	 * Adds to the <em>parameters</em> feature.
	 * 
	 * @param parametersValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToParameters(Parameter parametersValue) {
		if (!parameters.contains(parametersValue)) {
			boolean result = parameters.add(parametersValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>parameters</em> feature.
	 * 
	 * @param parametersValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromParameters(Parameter parametersValue) {
		if (parameters.contains(parametersValue)) {
			boolean result = parameters.remove(parametersValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>parameters</em> feature.
	 * 
	 * @generated
	 */
	public void clearParameters() {
		while (!parameters.isEmpty()) {
			removeFromParameters(parameters.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DeviceAction#getParameters() <em>parameters</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newParameters
	 *            the new value of the '{@link DeviceAction#getParameters()
	 *            parameters}' feature.
	 * @generated
	 */
	public void setParameters(List<Parameter> newParameters) {
		parameters = newParameters;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "DeviceAction " + " [actionName: " + getActionName() + "]";
	}
}
