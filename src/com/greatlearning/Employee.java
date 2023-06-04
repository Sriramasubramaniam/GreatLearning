package com.greatlearning;

public class Employee {
    private String firstName;
    private String lastName;

    Employee(){}
    Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
