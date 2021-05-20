package com.qa.inheritance;
import java.util.*;


public class Trainee extends Person {
	//Attributes
	private double bursary;
	private List<String> subjectsLearned;
	//Constructors
	
	public Trainee(double bursary, List<String> subjectsLearned) {
		super();
		this.bursary = bursary;
		this.subjectsLearned = subjectsLearned;
	}
	
	
	//getter and setters
	 public double getBursary() {
		return bursary;
	}
	public void setBursary(double bursary) {
		this.bursary = bursary;
	}
	public List<String> getSubjectsLearned() {
		return subjectsLearned;
	}
	public void setSubjectsLearned(List<String> subjectsLearned) {
		this.subjectsLearned = subjectsLearned;
	}
	
	public  Trainee(String name)
	{
		super(name);
	}
	public String addSubject(String subjectsLearned)
	{
		//String string=string.addSubject("Eng")
		return subjectsLearned;
		//System.out.println(addSubject("English"));
	}
	

}
