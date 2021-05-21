package com.qa.inheitanceexe;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g=new Garage("Mygarage");
		
		Vehicle car=new Car(4,"Hyundai");
		Vehicle motorCycle=new MotorCycle(4,"Twostroke",2);
		
		g.addVehicle(car);
		g.addVehicle(motorCycle);
		//myGarage1.deleteVehicle(motorcycle1);
		// g.emptyGarage();
		 g.fixVehicle();
		
		 
		 
		 
				
		
		
		
		
		
	
			

	}

}
