package com.qa.calculator;

public class Result {
	public static double physics=70;
	public static double chemistry=130;
	public static double biology=46;
	public static double total=physics+chemistry+biology;
	public static double percentage;
	public static double passmarks=60;
	
	public static void displayResults()
	{
		percentage=total*100/450;
		if(percentage>=passmarks)
		{
			System.out.println("You have Passed");
			
		}
		else
		{
			System.out.println("You have failed");
	}

}
}
