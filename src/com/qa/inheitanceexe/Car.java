package com.qa.inheitanceexe;

public class Car  extends Vehicle{
	   //Attributes
	private int numberofwheels;
	private String enginetype;
	 //Getter and Setters
	public int getNumberofwheels() {
		return numberofwheels;
	}
	public void setNumberofwheels(int numberofwheels) {
		this.numberofwheels = numberofwheels;
	}
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	 //Constructor
	
	public Car(int numberofwheels,String enginetype)
	{
		super();
		this.numberofwheels=numberofwheels;
		this.enginetype=enginetype;
		
		
	}
	
	public Car(String name) {
		super(name);
		
		
	}
}

	


