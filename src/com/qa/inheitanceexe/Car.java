package com.qa.inheitanceexe;

public class Car {
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
	public Car(int numberofwheels, String enginetype) {
		super();
		this.numberofwheels = numberofwheels;
		this.enginetype = enginetype;
	}

	

}
