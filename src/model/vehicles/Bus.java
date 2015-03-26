package model.vehicles;

import javax.swing.ImageIcon;

import constValue.ConstValues;

public class Bus extends VehicleWithRec{

	public Bus(int id, int location_x, int location_y,
			int angle,int behavior) {
		super(id, location_x, location_y, angle, behavior);
		
		  
				width = 25;
				length = 30;
				speedLimit = ConstValues.BusSpeedLimit;
				acceleration = ConstValues.BusAcceleration;
				
		carIcon = new ImageIcon(getClass().getResource("/Icon/bus.jpg"));

		// TODO Auto-generated constructor stub
		setRectangle();

	
	}

}
