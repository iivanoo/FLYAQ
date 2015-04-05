package it.univaq.flyaq.synthesizer;

import it.univaq.flyaq.behaviour.Behaviour;
import it.univaq.flyaq.behaviour.BehaviourFactory;
import it.univaq.flyaq.behaviour.Coordinate;
import it.univaq.flyaq.behaviour.Drone;
import it.univaq.flyaq.behaviour.GoTo;
import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.MoveTransition;
import it.univaq.flyaq.behaviour.TakeOff;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.extension.mission.ITaskSynthesizer;
import it.univaq.flyaq.mission.ControlTask;
import it.univaq.flyaq.mission.LineTask;
import it.univaq.flyaq.mission.Mission;
import it.univaq.flyaq.mission.PointTask;
import it.univaq.flyaq.mission.PolygonTask;
import it.univaq.flyaq.mission.Task;
import it.univaq.flyaq.mission.TaskDependency;
import it.univaq.flyaq.synthesizer.taskSynthesizerMap.TaskSynthesizerMap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.Diagnostician;

public class Mission2Behaviour {
	
	private static Mission2Behaviour instance;
	
	protected Mission2Behaviour() {
	}
	
	public static Mission2Behaviour getInstance() {
		if (instance == null) 
			instance = new Mission2Behaviour();
		return instance;
	}
	
	public EList<Move> setDrone(Drone drone, Mission mission, Context context){
		Coordinate coord= BehaviourFactory.eINSTANCE.createCoordinate();
		coord.setLatitude(mission.getSwarm().getDrones().get(0).getHome().getLatitude());
		coord.setLongitude(mission.getSwarm().getDrones().get(0).getHome().getLongitude());
		coord.setAltitude(mission.getSwarm().getDrones().get(0).getHome().getAltitude());
		drone.setHome(coord);	
		drone.setTypeName(mission.getSwarm().getDrones().get(0).getType()); 
		drone.setName(mission.getSwarm().getDrones().get(0).getName());
			
		//Drone's behaviour must be a sequence with the form
		//"start"->"take off"->...(task synthesis)...->"go to home"->"land"->"stop" if returnHome is true
		//or "start"->"take off"->...(task synthesis)...->"land"->"stop" ifreturnHomeis false
		//create the beginning and the end of this chain
			
		//moves
		Move start=BehaviourFactory.eINSTANCE.createStart(); //start
		start.setName("start");
		Move takeOff=BehaviourFactory.eINSTANCE.createTakeOff();//takeOff
		((TakeOff)takeOff).setAltitude(2);
		takeOff.setName("takeoff");			
		Move land=BehaviourFactory.eINSTANCE.createLand();//land
		land.setName("land");
		Move stop=BehaviourFactory.eINSTANCE.createStop();//stop
		stop.setName("stop");
			
		//transitions
		MoveTransition start_takeOff=BehaviourFactory.eINSTANCE.createMoveTransition();
		start_takeOff.setFrom(start);
		start_takeOff.setTo(takeOff);	
		MoveTransition land_stop=BehaviourFactory.eINSTANCE.createMoveTransition();
		land_stop.setFrom(land);
		land_stop.setTo(stop);
		
		EList<MoveTransition> trans = drone.getMoveTransitions();
		EList<Move> moves = drone.getMovements();
				
		moves.add(start);
		moves.add(takeOff);
		moves.add(land);
		moves.add(stop);
				
		trans.add(start_takeOff);
		trans.add(land_stop);
		
		EList<Move> result= new BasicEList<Move>();
		result.add(takeOff);
		
		if(mission.getSwarm().getDrones().get(0).isReturnHome()){
			Coordinate gthCoord= BehaviourFactory.eINSTANCE.createCoordinate();
			gthCoord.setLatitude(mission.getSwarm().getDrones().get(0).getHome().getLatitude());
			gthCoord.setLongitude(mission.getSwarm().getDrones().get(0).getHome().getLongitude());
			gthCoord.setAltitude(2);
			EList<Move> gth=goToChain(drone, gthCoord, context);
			Move goToHomeFirst=gth.get(0);
			Move goToHomeLast=gth.get(1);
			MoveTransition goToHome_land=BehaviourFactory.eINSTANCE.createMoveTransition();
			goToHome_land.setFrom(goToHomeLast);
			goToHome_land.setTo(land);
			trans.add(goToHome_land);
			result.add(goToHomeFirst);
		}
		else{
			result.add(land);
		}

		return result;

		
	}
	
	public EList<Task> lineUpTasks(Mission mission){//create a tasks list that preserves dependencies
		EList<TaskDependency> dependencies = new BasicEList<TaskDependency>();
		dependencies.addAll(mission.getTaskDependencies()); //local copy of TaskDependencies
		EList<Task> tasks= new BasicEList<Task>();
		tasks.addAll(mission.getTasks()); //local copy of Tasks
		EList<Task> orderedTasks= new BasicEList<Task>();//empty list
		while (!tasks.isEmpty()){
			//look for tasks without dependencies "To"
			for (ListIterator<Task> iterTask = tasks.listIterator(); iterTask.hasNext(); ) {
			    Task t = iterTask.next();
			    boolean found = false;
			    for (ListIterator<TaskDependency> iterDep = dependencies.listIterator(); iterDep.hasNext(); ) {
			    	TaskDependency d = iterDep.next();
				    if (d.getTo()==t) found = true;
				}
			    if (!found){//if found
			    	orderedTasks.add(t); //add it at the end of orderedTasks
			    	iterTask.remove();// remove from tasks
			    	//remove dependencies "From"
			    	for (ListIterator<TaskDependency> iterDep = dependencies.listIterator(); iterDep.hasNext(); ) {
				    	TaskDependency d = iterDep.next();
					    if (d.getFrom()==t) iterDep.remove();
					}
			    }
			}
		}
		
		//remove control tasks without reference position from orderedTasks
		for (ListIterator<Task> iterTask = orderedTasks.listIterator(); iterTask.hasNext(); ) {
			Task t = iterTask.next();
			if(t instanceof ControlTask){
				if(((ControlTask)t).getReferencePosition()==null){
					iterTask.remove();
				}
			}
		}
		
		return orderedTasks;
	}
	
	public EList<Move> goToChain (Drone drone, Coordinate coordinate, Context context){
		
	//take a coordinate and full the drone behaviour with the "translation" that respect context constraint
	//at the end, return a couple of moves, the first and the last of the chain
		Move first=BehaviourFactory.eINSTANCE.createGoTo();
		((GoTo)first).setTargetPosition(coordinate);
		Move last=first;
		drone.getMovements().add(first);
		EList<Move> result= new BasicEList<Move>();
		result.add(first);
		result.add(last);
		return result;
		
	}
	
	public Coordinate getTaskCoordinate(Task t){
		Coordinate coord= BehaviourFactory.eINSTANCE.createCoordinate();
		if (t instanceof ControlTask){
			coord.setAltitude(((ControlTask)t).getReferencePosition().getAltitude());
			coord.setLatitude(((ControlTask)t).getReferencePosition().getLatitude());
			coord.setLongitude(((ControlTask)t).getReferencePosition().getLongitude());
		}
		if (t instanceof PolygonTask){
			coord.setAltitude(((PolygonTask)t).getInitialPosition().getAltitude());
			coord.setLatitude(((PolygonTask)t).getInitialPosition().getLatitude());
			coord.setLongitude(((PolygonTask)t).getInitialPosition().getLongitude());
		}
		if (t instanceof PointTask){
			coord.setAltitude(((PointTask)t).getPoint().getAltitude());
			coord.setLatitude(((PointTask)t).getPoint().getLatitude());
			coord.setLongitude(((PointTask)t).getPoint().getLongitude());
		}
		if (t instanceof LineTask){
			coord.setAltitude(((LineTask)t).getInitialPosition().getAltitude());
			coord.setLatitude(((LineTask)t).getInitialPosition().getLatitude());
			coord.setLongitude(((LineTask)t).getInitialPosition().getLongitude());
		}
		return coord;
	}
	
	
	public Behaviour execute(Mission mission, Context context) throws Exception {
		Behaviour behaviour = BehaviourFactory.eINSTANCE.createBehaviour(); //new Behaviour instance
		
		
		Drone drone = BehaviourFactory.eINSTANCE.createDrone(); //new Drone instance
		//line above has to be substituted with this two:
		//Class<Drone> c = DroneMap.getDroneByName(mission.getSwarm().getDrones().get(0).getType());
		//Drone drone = c.newInstance();
		
		
		
		behaviour.getDrones().add(drone); //add drone to behaviour
		EList<Move> droneHooks =setDrone(drone, mission, context);//set drone's parameters
		EList<Task> orderedTasks= lineUpTasks(mission);//create a tasks list that preserve dependencies
		EList<MoveTransition> trans = drone.getMoveTransitions();
		
		
		
		MoveTransition tempTransition=BehaviourFactory.eINSTANCE.createMoveTransition();
		tempTransition.setFrom(droneHooks.get(0));
		
		
		//3 possibilities:
		//empty list. connect the drone's hooks each other
		//singleton list. connect first hook to task transaltion and this to the other hook
		//at least 2 elements list. explore the list with 2 pointers t1 and t2 in order to use the generate methods
		
		ListIterator<Task> iterTask = orderedTasks.listIterator();
		Task t1;
		Task t2;
		
		Move temp1First;
		Move temp1Last;
		if(iterTask.hasNext()){
			t1 = iterTask.next();
			Coordinate coordT1= getTaskCoordinate(t1);
			EList<Move> temp1=goToChain(drone, coordT1, context);
			temp1First=temp1.get(0);
			temp1Last=temp1.get(1);
			tempTransition.setTo(temp1First);
			trans.add(tempTransition);
			
			Move temp2First;
			Move temp2Last;
			while(iterTask.hasNext()) {
				t2 = iterTask.next();
				Coordinate coordT2= getTaskCoordinate(t2);
				EList<Move> temp2=goToChain(drone, coordT2, context);
				temp2First=temp2.get(0);
				temp2Last=temp2.get(1);
				//if t1 is a control task, don't need to use generate ('cause there isn't the proper synthesizer). translate here
				if (t1 instanceof ControlTask){
					MoveTransition controlGlue=BehaviourFactory.eINSTANCE.createMoveTransition();
					controlGlue.setFrom(temp1Last);
					controlGlue.setTo(temp2First);
					trans.add(controlGlue);
					temp1First.setName(t1.getName()+"_initialgoto");
				}
				
				//otherwise, instantiate the proper sinthesizer and use the generate
				else{
					Class<ITaskSynthesizer> c = TaskSynthesizerMap.getTaskSynthesizerByName(t1.getClass().getInterfaces()[0].getSimpleName());
					ITaskSynthesizer synthesizer = c.newInstance();
					List<Move> inList=new ArrayList<Move>();
					List<Move> outList=new ArrayList<Move>();
					inList.add(temp1Last);
					outList.add(temp2First);
					
					
					synthesizer.generate(t1, context,inList, outList);
				}
				t1=t2;
				temp1Last=temp2Last;
				
				
			}
			//if t1 is a control task, don't need to use generate ('cause there isn't the proper synthesizer). translate here
			if (t1 instanceof ControlTask){
				MoveTransition controlGlue=BehaviourFactory.eINSTANCE.createMoveTransition();
				controlGlue.setFrom(temp1Last);
				controlGlue.setTo(droneHooks.get(1));
				trans.add(controlGlue);
				temp1First.setName(t1.getName()+"_initialgoto");
			}
			
			//otherwise, instantiate the proper sinthesizer and use the generate
			else{
				Class<ITaskSynthesizer> c = TaskSynthesizerMap.getTaskSynthesizerByName(t1.getClass().getInterfaces()[0].getSimpleName());
				ITaskSynthesizer synthesizer = c.newInstance();
				List<Move> inList=new ArrayList<Move>();
				List<Move> outList=new ArrayList<Move>();
				inList.add(temp1Last);
				outList.add(droneHooks.get(1));
				synthesizer.generate(t1, context,inList, outList);
			}
			
			

		}
		else{
			tempTransition.setTo(droneHooks.get(1));
			trans.add(tempTransition);
		}
		
		// copy name and crs values
		behaviour.setName(mission.getName());
		behaviour.setCrs(mission.getCrs());
		
		ListIterator<Drone> dronesIterator = behaviour.getDrones().listIterator();
		ListIterator<Move> movesIterator;
		Drone currentDrone;
		Move currentMove;
		while(dronesIterator.hasNext()) {
			currentDrone = dronesIterator.next();
			movesIterator = currentDrone.getMovements().listIterator();
			while(movesIterator.hasNext()) {
				currentMove = movesIterator.next();
				if(currentMove.getName() == null) {
					currentMove.setName(currentDrone.getName() + "_moves_" + movesIterator.previousIndex());
				}
			}
		}		
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(behaviour);
		
		//BEHAVIOUR validation
		  if (diagnostic.getSeverity() == Diagnostic.ERROR ) {
		   System.err.println(diagnostic);
		   //if the validation fails, return empty behaviour
		   behaviour=BehaviourFactory.eINSTANCE.createBehaviour();
		  }
		 
		
		
		return behaviour;
	}

}
