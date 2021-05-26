package com.qa.garageTask;

public class ElectricalCar extends Car {

	public ElectricalCar(String manufacturer, String model, String dateOfCreation) {
		super(manufacturer, model, dateOfCreation);
		// TODO Auto-generated constructor stub
	}
	
	//virtual method invocation
	public void accelerating()
	{
		System.out.println("Voltage checking:Ok");
		System.out.println("Connecting circuit");
	}
	
	public void breaking()
	{
		System.out.println("Applying Electrical Break");
	}

}
