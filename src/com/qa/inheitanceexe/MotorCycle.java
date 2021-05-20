package com.qa.inheitanceexe;

public class MotorCycle extends Vehicle{
	  //Attributes
	private int numberofwheels;
	private String enginetype;
	private int sittingcapacity;
	
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
	public int getSittingcapacity() {
		return sittingcapacity;
	}
	public void setSittingcapacity(int sittingcapacity) {
		this.sittingcapacity = sittingcapacity;
	}
	 //Constructor
	public MotorCycle(String name, int number, String type, String color, int numberofwheels, String enginetype,
			int sittingcapacity) {
		super(name, number, type, color);
		this.numberofwheels = numberofwheels;
		this.enginetype = enginetype;
		this.sittingcapacity = sittingcapacity;
	}
	
	

}
