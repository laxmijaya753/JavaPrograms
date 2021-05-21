package com.qa.inheritance;

public class Person {
    //Attributes
    private String name;
    
    //Constructor
    public Person() {
        this("Unknown");
    }
    
    public Person(String name) {
        this.name = name;
    }
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}