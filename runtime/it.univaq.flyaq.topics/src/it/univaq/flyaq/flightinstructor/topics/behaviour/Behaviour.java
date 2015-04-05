package it.univaq.flyaq.flightinstructor.topics.behaviour;

import it.univaq.flyaq.flightinstructor.topics.behaviour.Drone;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Behaviour</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Behaviour extends NamedElement {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String crs = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Drone> drones = new ArrayList<Drone>();
	
	public Behaviour(JsonObject jsonObject) {
		super(jsonObject);
		this.crs = jsonObject.getString("crs");
		
		// drones
		JsonArray dronesArray = jsonObject.getJsonArray("drones");
		Drone droneToAdd;
		for(int i=0; i<dronesArray.size(); i++) {
			droneToAdd = new Drone(dronesArray.getJsonObject(i), this);
			this.drones.add(droneToAdd);
			droneToAdd.createMoveTransitions(dronesArray.getJsonObject(i), this);
			droneToAdd.createSlots(dronesArray.getJsonObject(i), this);
		}
	}

	/**
	 * Returns the value of '<em><b>crs</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>crs</b></em>' feature
	 * @generated
	 */
	public String getCrs() {
		return crs;
	}

	/**
	 * Sets the '{@link Behaviour#getCrs() <em>crs</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCrs
	 *            the new value of the '{@link Behaviour#getCrs() crs}' feature.
	 * @generated
	 */
	public void setCrs(String newCrs) {
		crs = newCrs;
	}

	/**
	 * Returns the value of '<em><b>drones</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>drones</b></em>' feature
	 * @generated
	 */
	public List<Drone> getDrones() {
		return drones;
	}

	/**
	 * Adds to the <em>drones</em> feature.
	 * 
	 * @param dronesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToDrones(Drone dronesValue) {
		if (!drones.contains(dronesValue)) {
			boolean result = drones.add(dronesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>drones</em> feature.
	 * 
	 * @param dronesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromDrones(Drone dronesValue) {
		if (drones.contains(dronesValue)) {
			boolean result = drones.remove(dronesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>drones</em> feature.
	 * 
	 * @generated
	 */
	public void clearDrones() {
		while (!drones.isEmpty()) {
			removeFromDrones(drones.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Behaviour#getDrones() <em>drones</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDrones
	 *            the new value of the '{@link Behaviour#getDrones() drones}'
	 *            feature.
	 * @generated
	 */
	public void setDrones(List<Drone> newDrones) {
		drones = newDrones;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Behaviour " + " [name: " + getName() + ", crs: " + getCrs() + ", drones: " + getDrones().toString() + "]";
	}
	
	public Move getMoveByName(String name) {
		for(int i=0; i < this.getDrones().size(); i++) {
			for(int j=0; j < this.getDrones().get(i).getMovements().size(); j++) {
				if(this.getDrones().get(i).getMovements().get(j).getName().equals(name)) {
					return this.getDrones().get(i).getMovements().get(j);
				}
			}
		}
		return null;
	}
	
	public Slot getSlotByName(String name) {
		for(int i=0; i < this.getDrones().size(); i++) {
			for(int j=0; j < this.getDrones().get(i).getSlots().size(); j++) {
				if(this.getDrones().get(i).getSlots().get(j).getName().equals(name)) {
					return this.getDrones().get(i).getSlots().get(j);
				}
			}
		}
		return null;
	}
	
	public Drone getDroneByName(String name) {
		for(int i=0; i < this.getDrones().size(); i++) {
			if(this.getDrones().get(i).getName().equals(name)) {
				return this.getDrones().get(i);
			}
		}
		return null;
	}
}
