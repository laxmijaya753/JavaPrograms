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
	
	//List<String> peronalGarage = new ArrayList<String>();
  //  Garage parkingLot = new Garage();
    
    
	
	//List<Vehicle> list=new ArrayList<Vehicle>();

	
	public Garage()
	{
		
	}
		
	
	
	public void addVehicle(Vehicle v) {
		
		System.out.println("Vehicle Name:"+v.getName());
	System.out.println("Vehicle Type:"+v.getType());
		System.out.println("Vehicle Color:"+v.getColor());
		System.out.println("Vehicle Number:"+v.getNumber());
		
		
		
		
		
	
		
	}
	
	
	public void  removeVehicle(int number,String type)
	{
		
	}
	public void fixVehicle ( double Calculatebill)
	{
		
	}
	
	
	
	
	

}
