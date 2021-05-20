package com.qa.inheitanceexe;

public class Vehicle {
	   //Attributes
	private String name;
	private int number;
	private String type;
	private String color;
	
	 //Getter and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 //Constructor
	public Vehicle(String name, int number, String type, String color) {
		//super();
		this.name = name;
		this.number = number;
		this.type = type;
		this.color = color;
	}
	
	
	
	

}
