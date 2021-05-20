package com.qa.practice;

public class FizzBunzz {
	public static void main(String[] args) {
		
		for(int n=1;n<=10;n++)
		{
			if(n%3==0)
					{
		 System.out.println(n+ "Divisible by 3:"+"Fizz");
				
			}
			else if (n%5==0)
			{
		 System.out.println(n+ "Divisible by 5:"+"Buzz");
			}
			else if(n%3==0 && n%5==0)
			{
				System.out.println("FizzBuzz");	
			}
			else {
				System.out.println(n+ "Not divisible by 3 and 5");
			}
		}

}
}
