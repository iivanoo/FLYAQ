package it.univaq.flyaq.flightinstructor.topics.behaviour;

import it.univaq.flyaq.flightinstructor.topics.behaviour.Coordinate;
import it.univaq.flyaq.flightinstructor.topics.behaviour.Move;
import it.univaq.flyaq.flightinstructor.topics.behaviour.MoveTransition;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Drone</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Drone extends NamedElement {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String typeName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Coordinate home = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Move> movements = new ArrayList<Move>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<MoveTransition> moveTransitions = new ArrayList<MoveTransition>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Slot> slots = new ArrayList<Slot>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private TravelMode travelMode = null;
	
	public Drone(JsonObject jsonObject, Behaviour behaviour) {
		super(jsonObject);
		this.typeName = jsonObject.getString("type_name");
		// home
		this.home = new Coordinate(jsonObject.getJsonObject("home"));

		// movements
		JsonArray jsonMovements = jsonObject.getJsonArray("movements");
		for(int i=0; i<jsonMovements.size(); i++) {
			this.movements.add(Move.create(jsonMovements.getJsonObject(i), behaviour));
		}
		
		// travel_mode
		this.travelMode = TravelMode.get(jsonObject.getInt("travel_mode"));
	}
	
	public void createMoveTransitions(JsonObject jsonObject, Behaviour behaviour) {
		// move_transitions
		JsonArray jsonMoveTransitions = jsonObject.getJsonArray("move_transitions");
		for(int i=0; i<jsonMoveTransitions.size(); i++) {
			this.moveTransitions.add(MoveTransition.create(jsonMoveTransitions.getJsonObject(i), behaviour));
		}
	}
	
	public void createSlots(JsonObject jsonObject, Behaviour behaviour) {
		// slot_names
		JsonArray jsonSlots = jsonObject.getJsonArray("slot_names");
		for(int i=0; i<jsonSlots.size(); i++) {
			this.slots.add(new Slot(jsonSlots.getJsonObject(i)));
		}
	}

	/**
	 * Returns the value of '<em><b>typeName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>typeName</b></em>' feature
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * Sets the '{@link Drone#getTypeName() <em>typeName</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTypeName
	 *            the new value of the '{@link Drone#getTypeName() typeName}'
	 *            feature.
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		typeName = newTypeName;
	}

	/**
	 * Returns the value of '<em><b>home</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>home</b></em>' feature
	 * @generated
	 */
	public Coordinate getHome() {
		return home;
	}

	/**
	 * Sets the '{@link Drone#getHome() <em>home</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newHome
	 *            the new value of the '{@link Drone#getHome() home}' feature.
	 * @generated
	 */
	public void setHome(Coordinate newHome) {
		home = newHome;
	}

	/**
	 * Returns the value of '<em><b>movements</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>movements</b></em>' feature
	 * @generated
	 */
	public List<Move> getMovements() {
		return movements;
	}

	/**
	 * Adds to the <em>movements</em> feature.
	 * 
	 * @param movementsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToMovements(Move movementsValue) {
		if (!movements.contains(movementsValue)) {
			boolean result = movements.add(movementsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>movements</em> feature.
	 * 
	 * @param movementsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromMovements(Move movementsValue) {
		if (movements.contains(movementsValue)) {
			boolean result = movements.remove(movementsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>movements</em> feature.
	 * 
	 * @generated
	 */
	public void clearMovements() {
		while (!movements.isEmpty()) {
			removeFromMovements(movements.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Drone#getMovements() <em>movements</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMovements
	 *            the new value of the '{@link Drone#getMovements() movements}'
	 *            feature.
	 * @generated
	 */
	public void setMovements(List<Move> newMovements) {
		movements = newMovements;
	}

	/**
	 * Returns the value of '<em><b>moveTransitions</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>moveTransitions</b></em>' feature
	 * @generated
	 */
	public List<MoveTransition> getMoveTransitions() {
		return moveTransitions;
	}

	/**
	 * Adds to the <em>moveTransitions</em> feature.
	 * 
	 * @param moveTransitionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToMoveTransitions(MoveTransition moveTransitionsValue) {
		if (!moveTransitions.contains(moveTransitionsValue)) {
			boolean result = moveTransitions.add(moveTransitionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>moveTransitions</em> feature.
	 * 
	 * @param moveTransitionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromMoveTransitions(MoveTransition moveTransitionsValue) {
		if (moveTransitions.contains(moveTransitionsValue)) {
			boolean result = moveTransitions.remove(moveTransitionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>moveTransitions</em> feature.
	 * 
	 * @generated
	 */
	public void clearMoveTransitions() {
		while (!moveTransitions.isEmpty()) {
			removeFromMoveTransitions(moveTransitions.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Drone#getMoveTransitions() <em>moveTransitions</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMoveTransitions
	 *            the new value of the '{@link Drone#getMoveTransitions()
	 *            moveTransitions}' feature.
	 * @generated
	 */
	public void setMoveTransitions(List<MoveTransition> newMoveTransitions) {
		moveTransitions = newMoveTransitions;
	}

	/**
	 * Returns the value of '<em><b>slots</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>slots</b></em>' feature
	 * @generated
	 */
	public List<Slot> getSlots() {
		return slots;
	}

	/**
	 * Adds to the <em>slots</em> feature.
	 * 
	 * @param slotsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToSlots(Slot slotsValue) {
		if (!slots.contains(slotsValue)) {
			boolean result = slots.add(slotsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>slots</em> feature.
	 * 
	 * @param slotsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromSlots(Slot slotsValue) {
		if (slots.contains(slotsValue)) {
			boolean result = slots.remove(slotsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>slots</em> feature.
	 * 
	 * @generated
	 */
	public void clearSlots() {
		while (!slots.isEmpty()) {
			removeFromSlots(slots.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Drone#getSlots() <em>slots</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSlots
	 *            the new value of the '{@link Drone#getSlots() slots}' feature.
	 * @generated
	 */
	public void setSlots(List<Slot> newSlots) {
		slots = newSlots;
	}

	/**
	 * Returns the value of '<em><b>travelMode</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>travelMode</b></em>' feature
	 * @generated
	 */
	public TravelMode getTravelMode() {
		return travelMode;
	}

	/**
	 * Sets the '{@link Drone#getTravelMode() <em>travelMode</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTravelMode
	 *            the new value of the '{@link Drone#getTravelMode() travelMode}
	 *            ' feature.
	 * @generated
	 */
	public void setTravelMode(TravelMode newTravelMode) {
		travelMode = newTravelMode;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Drone " + " [typeName: " + getTypeName() + "]"
				+ " [travelMode: " + getTravelMode() + "]";
	}
}
