package it.univaq.flyaq.flightinstructor.topics.behaviour;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>MulticastNotify</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MulticastNotify extends Notify {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Drone> receiver = new ArrayList<Drone>();
	
	public MulticastNotify(JsonObject jsonObject, Behaviour behaviour) {
		super(jsonObject, behaviour);
		JsonArray jsonReceivers = jsonObject.getJsonArray("receivers_name");
		for(int i=0; i<jsonReceivers.size(); i++) {
			this.receiver.add(behaviour.getDroneByName(jsonReceivers.get(i).toString()));
		}
	}

	/**
	 * Returns the value of '<em><b>receiver</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>receiver</b></em>' feature
	 * @generated
	 */
	public List<Drone> getReceiver() {
		return receiver;
	}

	/**
	 * Adds to the <em>receiver</em> feature.
	 * 
	 * @param receiverValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToReceiver(Drone receiverValue) {
		if (!receiver.contains(receiverValue)) {
			boolean result = receiver.add(receiverValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>receiver</em> feature.
	 * 
	 * @param receiverValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromReceiver(Drone receiverValue) {
		if (receiver.contains(receiverValue)) {
			boolean result = receiver.remove(receiverValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>receiver</em> feature.
	 * 
	 * @generated
	 */
	public void clearReceiver() {
		while (!receiver.isEmpty()) {
			removeFromReceiver(receiver.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MulticastNotify#getReceiver() <em>receiver</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newReceiver
	 *            the new value of the '{@link MulticastNotify#getReceiver()
	 *            receiver}' feature.
	 * @generated
	 */
	public void setReceiver(List<Drone> newReceiver) {
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
		return "MulticastNotify ";
	}
}
