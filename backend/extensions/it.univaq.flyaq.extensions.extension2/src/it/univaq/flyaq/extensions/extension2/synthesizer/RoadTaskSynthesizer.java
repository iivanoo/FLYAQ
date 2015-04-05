package it.univaq.flyaq.extensions.extension2.synthesizer;


import it.univaq.flyaq.behaviour.BehaviourFactory;
import it.univaq.flyaq.behaviour.Coordinate;
import it.univaq.flyaq.behaviour.Drone;
import it.univaq.flyaq.behaviour.GoTo;
import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.MoveTransition;
import it.univaq.flyaq.extension.mission.ITaskSynthesizer;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.extensions.extension2.RoadTask;
import it.univaq.flyaq.mission.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;

public class RoadTaskSynthesizer implements ITaskSynthesizer {

	public RoadTaskSynthesizer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Task task, Context context, List<Move> incomingMoves,
			List<Move> outgoingMoves) {
		// una catena di goto che va unita da una parte a in, dall'altra a out
		Move in=incomingMoves.get(0);
		in.setName(task.getName()+"_initialgoto");
		if(in instanceof GoTo) {
			((GoTo) in).getTargetPosition().setAltitude(2);
		}
		List<it.univaq.flyaq.mission.Coordinate> coordList;
		//gestisco inverted
		if (((RoadTask)task).isInverted()){
			coordList=new ArrayList<it.univaq.flyaq.mission.Coordinate>();
			int s=((RoadTask)task).getPoints().size();
			int s1=0;
			for(int iterator=s-1;iterator>=0;iterator--){
				coordList.add(s1,((RoadTask)task).getPoints().get(iterator));
				s1++;
			}
		}
		else{
			coordList=((RoadTask)task).getPoints();
		}
		
		Move out=outgoingMoves.get(0);
		Drone drone=((Drone)in.eContainer());
		EList<Move> moves=drone.getMovements();
		EList<MoveTransition> trans=drone.getMoveTransitions();
		GoTo old=(GoTo)in;
		for (ListIterator<it.univaq.flyaq.mission.Coordinate> it = coordList.listIterator(); it.hasNext(); ) {
			it.univaq.flyaq.mission.Coordinate t = it.next();
			GoTo nuova=BehaviourFactory.eINSTANCE.createGoTo();
			Coordinate coord= BehaviourFactory.eINSTANCE.createCoordinate();
			coord.setAltitude(t.getAltitude());
			coord.setLatitude(t.getLatitude());
			coord.setLongitude(t.getLongitude());
			nuova.setTargetPosition(coord);
			moves.add(nuova);
			nuova.setName(task.getName()+"_intermediate goto_" + it.previousIndex());
			MoveTransition transition= BehaviourFactory.eINSTANCE.createMoveTransition();
			transition.setFrom(old);
			transition.setTo(nuova);
			trans.add(transition);
			old=nuova;
		}
		MoveTransition t= BehaviourFactory.eINSTANCE.createMoveTransition();
		t.setFrom(old);
		t.setTo(out);
		drone.getMoveTransitions().add(t);
	}

}
