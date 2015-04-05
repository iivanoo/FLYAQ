package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>UnicastNotify</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UnicastNotify extends Notify {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Drone receiver = null;
	
	public UnicastNotify(JsonObject jsonObject, Behaviour behaviour) {
		super(jsonObject, behaviour);
		this.receiver = behaviour.getDroneByName(jsonObject.getJsonArray("receivers_name").get(0).toString());
	}

	/**
	 * Returns the value of '<em><b>receiver</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>receiver</b></em>' feature
	 * @generated
	 */
	public Drone getReceiver() {
		return receiver;
	}

	/**
	 * Sets the '{@link UnicastNotify#getReceiver() <em>receiver</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newReceiver
	 *            the new value of the '{@link UnicastNotify#getReceiver()
	 *            receiver}' feature.
	 * @generated
	 */
	public void setReceiver(Drone newReceiver) {
		receiver = newReceiver;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "UnicastNotify ";
	}
}
