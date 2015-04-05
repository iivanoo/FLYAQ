package it.univaq.flyaq.flightinstructor.topics.behaviour;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Move</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Move extends NamedElement {
	
	public static final int START = 0;
	public static final int STOP = 1;
	public static final int TAKE_OFF = 2;
	public static final int LAND = 3;
	public static final int GO_TO = 4;
	public static final int HOVER = 5;
	public static final int CIRCLE = 6;
	public static final int HEAD_TO = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Action> preActions = new ArrayList<Action>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Action> postActions = new ArrayList<Action>();
	
	public Move(JsonObject jsonObject) {
		super(jsonObject);
	}
	
	public static Move create(JsonObject jsonObject, Behaviour behaviour) {
		Move instance = null;
		switch(jsonObject.getInt("type")) {
		case Move.START:
			instance = new Start(jsonObject);
			break;
		case Move.STOP:
			instance = new Stop(jsonObject);
			break;
		case TAKE_OFF:
			instance = new TakeOff(jsonObject);
			break;
		case Move.LAND:
			instance = new Land(jsonObject);
			break;
		case Move.GO_TO:
			instance = new GoTo(jsonObject);
			break;
		case Move.HOVER:
			instance = new Start(jsonObject);
			break;
		case Move.CIRCLE:
			instance = new Circle(jsonObject);
			break;
		case Move.HEAD_TO:
			instance = new HeadTo(jsonObject);
		}
		JsonArray jsonPreActions = jsonObject.getJsonArray("pre_actions");
		for(int i=0; i<jsonPreActions.size(); i++) {
			instance.preActions.add(Action.create(jsonPreActions.getJsonObject(i), behaviour));
		}
		JsonArray jsonPostActions = jsonObject.getJsonArray("post_actions");
		for(int i=0; i<jsonPostActions.size(); i++) {
			instance.postActions.add(Action.create(jsonPostActions.getJsonObject(i), behaviour));
		}
		return instance;
	}

	/**
	 * Returns the value of '<em><b>preActions</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>preActions</b></em>' feature
	 * @generated
	 */
	public List<Action> getPreActions() {
		return preActions;
	}

	/**
	 * Adds to the <em>preActions</em> feature.
	 * 
	 * @param preActionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToPreActions(Action preActionsValue) {
		if (!preActions.contains(preActionsValue)) {
			boolean result = preActions.add(preActionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>preActions</em> feature.
	 * 
	 * @param preActionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromPreActions(Action preActionsValue) {
		if (preActions.contains(preActionsValue)) {
			boolean result = preActions.remove(preActionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>preActions</em> feature.
	 * 
	 * @generated
	 */
	public void clearPreActions() {
		while (!preActions.isEmpty()) {
			removeFromPreActions(preActions.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Move#getPreActions() <em>preActions</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPreActions
	 *            the new value of the '{@link Move#getPreActions() preActions}'
	 *            feature.
	 * @generated
	 */
	public void setPreActions(List<Action> newPreActions) {
		preActions = newPreActions;
	}

	/**
	 * Returns the value of '<em><b>postActions</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>postActions</b></em>' feature
	 * @generated
	 */
	public List<Action> getPostActions() {
		return postActions;
	}

	/**
	 * Adds to the <em>postActions</em> feature.
	 * 
	 * @param postActionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToPostActions(Action postActionsValue) {
		if (!postActions.contains(postActionsValue)) {
			boolean result = postActions.add(postActionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>postActions</em> feature.
	 * 
	 * @param postActionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromPostActions(Action postActionsValue) {
		if (postActions.contains(postActionsValue)) {
			boolean result = postActions.remove(postActionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>postActions</em> feature.
	 * 
	 * @generated
	 */
	public void clearPostActions() {
		while (!postActions.isEmpty()) {
			removeFromPostActions(postActions.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Move#getPostActions() <em>postActions</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPostActions
	 *            the new value of the '{@link Move#getPostActions()
	 *            postActions}' feature.
	 * @generated
	 */
	public void setPostActions(List<Action> newPostActions) {
		postActions = newPostActions;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Move ";
	}

}
