import java.util.List;

import ihs.apcs.spacebattle.ObjectStatus;
import ihs.apcs.spacebattle.commands.BrakeCommand;
import ihs.apcs.spacebattle.commands.RadarCommand;
import ihs.apcs.spacebattle.commands.RotateCommand;
import ihs.apcs.spacebattle.commands.ThrustCommand;

public class OldChallenges {
//	ObjectStatus ship = env.getShipStatus();
//	double length = ship.getPosition().getDistanceTo(midpoint) / 2;
//	if(ship.getOrientation() != ship.getPosition().getAngleTo(midpoint)){
//		return new RotateCommand(ship.getPosition().getAngleTo(midpoint) - ship.getOrientation());
//	}
//
//	if(ship.getPosition().getDistanceTo(midpoint) > 300){
//		if(!(ship.getSpeed() > 35)){
//			return new ThrustCommand('B', 1.0, 1.0);
//		}
//	}
//	if(ship.getPosition().getDistanceTo(midpoint) < 150){
//		return new BrakeCommand(0.0);
//	}
//	return new IdleCommand(0.1);
	
// ----------------------------------------------------------
	
//	ship = env.getShipStatus();
//	r = env.getRadar();
//	List<ObjectStatus> baubles;
//	int dist = 100000000;
//	ObjectStatus closestBauble = null;
//	
//	if(hasTargetBauble && score != env.getGameInfo().getScore()){
//		score = env.getGameInfo().getScore();
//		isAligned = false;
//		hasTargetBauble = false;
//		position = null;
//		dist = 100000000;
//		return new BrakeCommand(0.0);
//	}
//	
//	if(ship.getSpeed() != 0 && hasTargetBauble == false){
//		return new BrakeCommand(0.0);
//	}
//	
//	if(isAligned == true){
//		return new ThrustCommand('B', 0.5, 1);
//	}
//	
//	if(hasTargetBauble && isAligned == false){
//		isAligned = true;
//		baubles = r.getByType("Bauble");
//		
//		for(ObjectStatus obj : baubles){
//			if(ship.getPosition().getDistanceTo(obj.getPosition()) < dist){
//				closestBauble = obj;
//			}
//		}
//		
//		if(ship.getPosition().getAngleTo(closestBauble.getPosition()) != ship.getOrientation()){
//			position = closestBauble.getPosition();
//			return new RotateCommand(ship.getPosition().getAngleTo(closestBauble.getPosition())-ship.getOrientation());
//		}	
//	}
//	 
//	if(hasTargetBauble == false){
//		hasTargetBauble = true;
//		return new RadarCommand(4);
//	}
//	return new BrakeCommand(0.0);
}
