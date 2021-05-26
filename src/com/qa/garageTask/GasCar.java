package com.qa.garageTask;

public class GasCar extends Car {

	public GasCar(String manufacturer, String model, String dateOfCreation) {
		super(manufacturer, model, dateOfCreation);
		// TODO Auto-generated constructor stub
	}
	
	//virtual method invocation
	public void accelerating()
	{
		System.out.println("Increasing Fuel Flow");
		System.out.println("Accelerating");
	}
	
	public void breaking()
	{
		System.out.println("Applying front end  Break");
	}

}