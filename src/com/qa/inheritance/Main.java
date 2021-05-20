package com.qa.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person employee=new Employee("John");
Person trainee=new Trainee("Tom");
//Trainee t1=new Trainee("Harry")
Employee e1=new Employee("Tim");
System.out.println(employee.getName());
System.out.println(trainee.getName());

System.out.println (e1.calculateWeeklySalary(25.0,2500.00));
//System.out.println(t1.addSubject());
	}

}
