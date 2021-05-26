package com.qa.garageTask;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ElectricalCar eCar=new  ElectricalCar("Mazda","Mx-500","2021");
		 Car gasCar=new GasCar("Mazda","787A","1998");
		 Car c=eCar ;
		 GasCar cg=(GasCar)gasCar;
		 if(cg instanceof Car)
		 {
			 System.out.println("Gascars are a car"); 
		 }
		 System.out.println("Electrical Accelerating");
		 eCar.accelerating();
		 System.out.println(); 
		 gasCar.accelerating();
		 System.out.println("Gascars are accelerating"); 
		 
	}

}
