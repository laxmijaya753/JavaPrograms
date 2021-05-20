package com.qa.inheitanceexe;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle> list = new ArrayList<Vehicle>();
		Garage g=new Garage();
		Vehicle v=new Vehicle("Mazda",1,"2wheeler","Black");
		g.addVehicle(v);
		
		
		
		
		
	// Car Mazda = new Car(4, "VEE" );
    /*List<Vehical> peronalGarage = new ArrayList<Vehical>();
    Garage parkingLot = new Garage(peronalGarage);
    parkingLot.addLocomotive(Mazda);
	System.out.println("printing list:");
	parkingLot.printList();
	parkingLot.removeLocomotive(Mazda);
	parkingLot.printList();
	parkingLot.removeLocomotive(Mazda);
	parkingLot.printList();*/
			

	}

}
