package com.github.nicholasp23.inclass5_2;
public class Company {

    private Employee[] employees;
    private final String name;

    public Company(String name, Employee[] employees ){
        this.name = name;
        this.employees = employees;
    }

    public String getName(){
        return name;
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public int getEmployeeCount(){
        return employees.length;
    }

}
