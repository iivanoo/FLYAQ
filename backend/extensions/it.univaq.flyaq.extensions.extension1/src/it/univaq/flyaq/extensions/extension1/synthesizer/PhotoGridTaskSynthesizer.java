package it.univaq.flyaq.extensions.extension1.synthesizer;

import it.univaq.flyaq.behaviour.BehaviourFactory;
import it.univaq.flyaq.behaviour.DeviceAction;
import it.univaq.flyaq.behaviour.Drone;
import it.univaq.flyaq.behaviour.Move;
import it.univaq.flyaq.behaviour.GoTo;
import it.univaq.flyaq.behaviour.MoveTransition;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.extension.mission.ITaskSynthesizer;
import it.univaq.flyaq.mission.Task;
import it.univaq.flyaq.extensions.extension1.PhotoGridTask;

import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;

import java.util.List;
import java.util.ListIterator;
import java.lang.Math;

import org.eclipse.emf.common.util.EList;

public class PhotoGridTaskSynthesizer implements ITaskSynthesizer {

	public PhotoGridTaskSynthesizer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Task task, Context context, List<Move> incomingMoves,
			List<Move> outgoingMoves) {
		Move in=incomingMoves.get(0);
		in.setName(task.getName()+"_initialgoto");
		if(in instanceof GoTo) {
			((GoTo) in).getTargetPosition().setAltitude(2);
		}
		Move out=outgoingMoves.get(0);
		Drone drone=((Drone)in.eContainer());
		EList<Move> moves=drone.getMovements();
		EList<MoveTransition> trans=drone.getMoveTransitions();
		
		EList<it.univaq.flyaq.mission.Coordinate> coordList=((PhotoGridTask)task).getShell();
		int pointsnum=coordList.size();
		
		PrecisionModel precision=new PrecisionModel(PrecisionModel.FLOATING_SINGLE);
		
		GeometryFactory GF= new GeometryFactory(precision);
		
		Coordinate [] cArray= new Coordinate [pointsnum+1];
		Coordinate [] bbArray= new Coordinate [5];
		
		
		float maxX=0;
		float maxY=0;
		float minX=0;
		float minY=0;
		
		
		//calcolo la bounding box e nel frattempo traduco il perimetro (in coordinate "mission") in un array di coordinate jts 
		for (ListIterator<it.univaq.flyaq.mission.Coordinate> iterC = coordList.listIterator(); iterC.hasNext(); ) {
			it.univaq.flyaq.mission.Coordinate t = iterC.next();
			Coordinate point= new Coordinate(t.getLongitude(), t.getLatitude(), t.getAltitude());
			cArray[iterC.previousIndex()]=point;
			if(iterC.previousIndex()==0){
				maxX=t.getLongitude();
				minX=t.getLongitude();
				maxY=t.getLatitude();
				minY=t.getLatitude();
				
				//il primo punto va messo in testa ed in coda
				cArray[pointsnum]=point; 
			}
			else{
				if(t.getLongitude()>maxX){maxX=t.getLongitude();}
				if(t.getLongitude()<minX){minX=t.getLongitude();}
				if(t.getLatitude()>maxY){maxY=t.getLatitude();}
				if(t.getLatitude()<minY){minY=t.getLatitude();}
			}
		}
		
		bbArray[0]= new Coordinate(minX, maxY, 0);
		bbArray[1]= new Coordinate(maxX, maxY, 0);
		bbArray[2]= new Coordinate(maxX, minY, 0);
		bbArray[3]= new Coordinate(minX, minY, 0);
		bbArray[4]= new Coordinate(minX, maxY, 0);
		
		LinearRing LRbb= new LinearRing(new CoordinateArraySequence(bbArray), GF);
		Polygon bbpoly=new Polygon(LRbb, null, GF);
		
		//dall'array creo un anello e dall'anello un poligono
		LinearRing LR= new LinearRing(new CoordinateArraySequence(cArray), GF);
		Polygon poly=new Polygon(LR, null, GF);
		
		Move old;
		
		//quache conto: approssimandoil raggio terrestre a 6356752.3142 metri (in realt� � l'asse minore), alla latitudine del centro della bounding box
		//quanto in metri vale un movimento di 0.001 gradi in senso latitudinale? e in senso longitudinale?
		float axis=6356752.3142f;
		float centerLon=(minX+maxX)/2;
		float centerLat=(minY+maxY)/2;
		float delta1Lon=centerLon;
		float delta1Lat=centerLat+0.001f;
		float delta2Lon=centerLon+0.001f;
		float delta2Lat=centerLat;
		centerLon=(centerLon/180)* (float)(Math.PI);
		centerLat=(centerLat/180)* (float)(Math.PI);
		delta1Lon=(delta1Lon/180)* (float)(Math.PI);
		delta1Lat=(delta1Lat/180)* (float)(Math.PI);
		delta2Lon=(delta2Lon/180)* (float)(Math.PI);
		delta2Lat=(delta2Lat/180)* (float)(Math.PI);
		
		//noti questi valori, a quanti gradi (nei due sensi) corrisponde uno spostamento in metri definito da GridResolution? ovvero di quanto devo aumentare 
		//il contatore nei cicli for annidati?
		float dist=axis*(float)(Math.acos(Math.cos(centerLon-delta1Lon)*Math.cos(centerLat)*Math.cos(delta1Lat)+Math.sin(centerLat)*Math.sin(delta1Lat)));
		float yincr=(((PhotoGridTask)task).getGridResolution()/(dist*1000));
		dist=axis*(float)(Math.acos(Math.cos(centerLon-delta2Lon)*Math.cos(centerLat)*Math.cos(delta2Lat)+Math.sin(centerLat)*Math.sin(delta2Lat)));
		float xincr=(((PhotoGridTask)task).getGridResolution()/(dist*1000));
		old=in;
		
		//a questo punto considero tutti i punti della griglia contenuta nella bounding box con risoluzione latitudinale yincr e longitudinale xincr:
		//se ilpunto appartiene al poligono definito prima aggiungo la mossa GoTo con postaction  "Fai Foto"
		
		boolean ext=false;
		float iterLat=(minY+maxY)/2;
		float iterLon=(minX+maxX)/2;
		
		int dir=1;
		int step=1;
		int change=2;
		int numOfEmptySide=0;
		
		int nameCounter = 0;
		
		while(!ext){
			
			
			
			if (change==0){
				step++;
				change=2;
			}
			
			
				
			int stepcount=step;
			
			boolean oneIn=false;
			while(stepcount!=0){
				
				/*CONTROLLO SUL PUNTO*/
				Coordinate tempc= new Coordinate(iterLon,iterLat,((PhotoGridTask)task).getAltitude());
				Coordinate []temparray=new Coordinate [1];
				temparray[0]=tempc;
				CoordinateArraySequence CASeqTemp= new CoordinateArraySequence(temparray);
				Point temp= new Point(CASeqTemp,GF);
				if (bbpoly.contains(temp)){
					oneIn=true;
				}
				if (poly.contains(temp)){
					GoTo tempGoto=BehaviourFactory.eINSTANCE.createGoTo();
					it.univaq.flyaq.behaviour.Coordinate tempBcoord=BehaviourFactory.eINSTANCE.createCoordinate();
					tempBcoord.setAltitude(((PhotoGridTask)task).getAltitude());
					tempBcoord.setLatitude((float)temp.getY());
					tempBcoord.setLongitude((float)temp.getX());
					tempGoto.setTargetPosition(tempBcoord);
					tempGoto.setName(task.getName()+"_photogoto_" + nameCounter + "_" + stepcount);
					moves.add(tempGoto);
					MoveTransition tempTrans= BehaviourFactory.eINSTANCE.createMoveTransition();
					tempTrans.setFrom(old);
					tempTrans.setTo(tempGoto);
					trans.add(tempTrans);
					DeviceAction actTemp= BehaviourFactory.eINSTANCE.createDeviceAction();
					actTemp.setActionName("TakeSnapshot");
					tempGoto.getPostActions().add(actTemp);
					old=tempGoto;
				}
				/*FINE CONTROLLO SUL PUNTO*/
				
				/*CI SPOSTIAMO LUNGO UNA SPIRALE*/
				switch(dir){
				case 1:iterLat=iterLat+yincr;break;
				case 2:iterLon=iterLon-xincr;break;
				case 3:iterLat=iterLat-yincr;break;
				case 4:iterLon=iterLon+xincr;break;
				default:break;
				}
				
				
				/*AGGIORNIAMO CONTATORE MOSSE*/
				stepcount--;
				
			}	
			if(oneIn==true){
				numOfEmptySide=0;
			}
			else{
				numOfEmptySide++;				
			}
			switch(dir){
			case 1:dir++;break;
			case 2:dir++;break;
			case 3:dir++;break;
			case 4:dir=1;break;
			default:break;
			}
			change--;
			
			if(numOfEmptySide>=4){
				ext=true;
			}
			
			nameCounter++;
		}
//		for(float xiter=minX; xiter<=maxX; xiter=xiter+xincr){
//			for(float yiter=minY; yiter<=maxY; yiter=yiter+yincr){
//				Coordinate tempc= new Coordinate(xiter,yiter,((PhotoGridTask)task).getAltitude());
//				
//				Coordinate []temparray=new Coordinate [1];
//				temparray[0]=tempc;
//				CoordinateArraySequence CASeqTemp= new CoordinateArraySequence(temparray);
//				Point temp= new Point(CASeqTemp,GF);
//				if (poly.contains(temp)){
//					GoTo tempGoto=BehaviourFactory.eINSTANCE.createGoTo();
//					it.univaq.flyaq.behaviour.Coordinate tempBcoord=BehaviourFactory.eINSTANCE.createCoordinate();
//					tempBcoord.setAltitude(((PhotoGridTask)task).getAltitude());
//					tempBcoord.setLatitude((float)temp.getY());
//					tempBcoord.setLongitude((float)temp.getX());
//					tempGoto.setTargetPosition(tempBcoord);
//					tempGoto.setName(task.getName()+": photogoto("+yiter+","+xiter+","+((PhotoGridTask)task).getAltitude()+")");
//					moves.add(tempGoto);
//					MoveTransition tempTrans= BehaviourFactory.eINSTANCE.createMoveTransition();
//					tempTrans.setFrom(old);
//					tempTrans.setTo(tempGoto);
//					trans.add(tempTrans);
//					DeviceAction actTemp= BehaviourFactory.eINSTANCE.createDeviceAction();
//					actTemp.setActionName("Fai Foto");
//					tempGoto.getPostActions().add(actTemp);
//					old=tempGoto;
//				}
//			}
//		}
//		
		
		MoveTransition t= BehaviourFactory.eINSTANCE.createMoveTransition();
		t.setFrom(old);
		t.setTo(out);
		trans.add(t);
		
	}


}
