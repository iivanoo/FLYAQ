package it.univaq.flyaq.flightinstructor.topics.behaviour;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * A representation of the model object '<em><b>Action</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Action extends NamedElement {
	
	public static final int START = 0;
	public static final int STOP = 1;
	public static final int TAKE_OFF = 2;
	public static final int LAND = 3;
	public static final int GO_TO = 4;
	public static final int HOVER = 5;
	public static final int CIRCLE = 6;
	public static final int HEAD_TO = 7;
	
	public Action(JsonObject jsonObject) {
		super(jsonObject);
	}
	
	public static Action create(JsonObject jsonObject, Behaviour behaviour) {
		Action instance = null;
		switch(jsonObject.getInt("type")) {
		case Move.START:
			instance = new DeviceAction(jsonObject);
			break;
		case Move.STOP:
			instance = new Feedback(jsonObject);
			break;
		case TAKE_OFF:
			instance = new CheckNotification(jsonObject, behaviour);
			break;
		case Move.LAND:
			instance = new UnicastNotify(jsonObject, behaviour);
			break;
		case Move.GO_TO:
			instance = new MulticastNotify(jsonObject, behaviour);
			break;
		case Move.HOVER:
			instance = new BroadcastNotify(jsonObject, behaviour);
		}
		return instance;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Action ";
	}
}
