package com.qa.inheitanceexe;

public class Vehicle {
	   //Attributes
	private String name;
	private int condition;
	
	
	public int getCondition() {
		return condition;
	}


	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	 //Constructor
    
    public Vehicle(String name) {
        this.name = name;
    }
    
    public Vehicle(){
    	 this("Unknown"); 
    }
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	
public int  calculateBill()
{
	return this.getCondition()*6;
}
	
	

}
