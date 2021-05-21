package com.qa.inheitanceexe;

import java.util.*;


/* 3). Create a method in Garage that iterates through each Vehicle,
 *  calculating a bill for each type of Vehicle in a different
 *   way, depending on the type of vehicle it is. 
 *    You can decide how this bill is calculated based on any attributes
 *     you see fit. (You do not get extra marks for making the calculation 
 *     overly complex) 
4). Garage should have methods that add Vehicle,
 remove Vehicle(s) (By ID, By Vehicle Type)
  fix Vehicle (Calculate bill) and empty the garage*/
public class Garage   {
	//Attributes
	
	private String garagename;
	
	public String getGaragename() {
		return garagename;
	}


	public void setGaragename(String garagename) {
		this.garagename = garagename;
	}

	List<Object> garageList = new ArrayList<Object>();
	

	
	
	//Constructor
	public Garage(String garagename)
	{
		this.garagename=garagename;
		
	}
		
	
	//Add Vehicle

	public void addVehicle(Object vehicle) {
		garageList.add(vehicle);
	}
	// Remove Vehicle
	
	public void  removeVehicle(Object vehicle)
	{
		
	for(int i = 0; i < garageList.size(); i++) {
		if (garageList.get(i).equals(vehicle)) {
			garageList.remove(i);
			}
		}	
		
	}
	public void fixVehicle ( )
	{
		
	int totalBill = 0;
 for(int i = 0; i < garageList.size(); i++) {
	Vehicle e = (Vehicle)  garageList.get(i);
	int bill = e.calculateBill();
	String result = "Vehicle Name: " + e. getName() + " "  + " Repair bill is: " + e.calculateBill();
		totalBill += bill;
		System.out.println(result );
	}
System.out.println("Total Bill for all vehicles: $" + totalBill);
}
	
	public void  emptyGarage() {
		garageList.clear();
	}
	
	}
	
	
	
	
	


