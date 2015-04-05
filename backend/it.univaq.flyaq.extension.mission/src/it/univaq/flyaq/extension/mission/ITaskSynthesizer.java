package it.univaq.flyaq.extension.mission;

import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.mission.Task;

import java.util.List;

/**
 * @author Ivano Malavolta 
 *
 */
public interface ITaskSynthesizer {
	
	/**
	 * @param task the current task being synthesized
	 * @param incomingMoves a list of Move that will be used as starting point of the sub-behaviour implementing the task
	 * @param outgoingMoves a list of Move
	 */
	public void generate(Task task, Context context, List<Move> incomingMoves, List<Move> outgoingMoves);

}
