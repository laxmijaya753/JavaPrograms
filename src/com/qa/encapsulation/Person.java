package com.qa.encapsulation;

public class Person {
	//Attributes
private String name="John"; 
private int age=25; 
private String gender="male"; 
//private boolean isBreathing;
//private int walkSpeed = 30; // in feet

//Getters and Setters
 
public String getName()
{
	return this.name;
}

public void setName(String name1)

{
this.name=name1;
}


public int getAge()
{
	return this.age;
}

public void setAge(int age1)

{
this.age=age1;
}


public String getGender()
{
	return this.gender;
}

public void setGender(String Gender1)

{
this.gender=Gender1;
}
}
