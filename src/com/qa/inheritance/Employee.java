package com.qa.inheritance;

public class Employee extends Person {
	//Attributes
	private  double annualSalary;
	private  double weeklySalary ;
	
	//Constructors
	public Employee(double annualSalary, double weeklySalary) {
		super();
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}

	//getter and setters
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	public  Employee(String name)
	{
		super(name);
	}
	//methods
	public double calculateWeeklySalary(double annualSalary,double weeklySalary )
	{
		return weeklySalary = annualSalary / 52;
	}

}
