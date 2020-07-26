import java.awt.Color;
import java.util.List;

import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.commands.*;

public class SirhcShip extends BasicSpaceship {
	ObjectStatus ship;
	Point position;
	double score = 0;
	boolean isAligned = false;
	boolean hasTargetBauble = false;
	Point midpoint;
	RadarResults r;
	
	
	public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight){
		midpoint = new Point((double)(worldWidth/2), (double)(worldHeight/2));
		return new RegistrationData("Chris Gerbino", new Color(255, 20, 147), 0);
	}

	@Override
	public ShipCommand getNextCommand(BasicEnvironment env){
		return null;
	}//ShipCommand Closer
}//Class closer.
