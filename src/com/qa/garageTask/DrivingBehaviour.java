package com.qa.garageTask;

public interface DrivingBehaviour {
	void accelerating();
	void breaking();
	
	default public void isAmPublic()
		
	{
		doSomething();
	}
	private void  doSomething()
	{
		System.out.println("Doing something");
	}

}
