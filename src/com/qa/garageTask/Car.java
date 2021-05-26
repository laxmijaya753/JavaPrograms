package com.qa.garageTask;

public abstract class Car implements DrivingBehaviour{
	//Attributes
	private String manufacturer;
	private String model;
	private String dateOfCreation;
	
	//Constructor
	
	
	public Car(String manufacturer, String model, String dateOfCreation) {
			this.manufacturer = manufacturer;
		this.model = model;
		this.dateOfCreation = dateOfCreation;
	}
	//Getters & Setters
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	
	
	
	

}
