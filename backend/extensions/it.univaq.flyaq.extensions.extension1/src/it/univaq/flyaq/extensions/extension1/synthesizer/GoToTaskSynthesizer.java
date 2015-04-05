package it.univaq.flyaq.extensions.extension1.synthesizer;

import it.univaq.flyaq.behaviour.BehaviourFactory;
import it.univaq.flyaq.behaviour.Drone;
import it.univaq.flyaq.behaviour.GoTo;
import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.MoveTransition;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.extension.mission.ITaskSynthesizer;
import it.univaq.flyaq.mission.Task;

import java.util.List;

import org.eclipse.emf.common.util.EList;

public class GoToTaskSynthesizer implements ITaskSynthesizer {

	public GoToTaskSynthesizer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Task task, Context context, List<Move> incomingMoves,
			List<Move> outgoingMoves) {
		// TODO Auto-generated method stub
		
		//devo solo aggiungere la transizione da in ad out
		Move in=incomingMoves.get(0);
		in.setName(task.getName()+"_initialgoto");
		if(in instanceof GoTo) {
			((GoTo) in).getTargetPosition().setAltitude(2);
		}
		Move out=outgoingMoves.get(0);		
		Drone drone=((Drone)in.eContainer());
		EList<MoveTransition> trans=drone.getMoveTransitions();
		MoveTransition t= BehaviourFactory.eINSTANCE.createMoveTransition();
		t.setFrom(in);
		t.setTo(out);
		trans.add(t);
	}

}
