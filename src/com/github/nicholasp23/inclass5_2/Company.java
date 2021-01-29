package com.github.nicholasp23.inclass5_2;
public class Company {

    Employee[] employees = new Employee[5];
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

    public int getEmployeeCount(Employee[] employees){
        int count = 0;
        for(Employee e : employees){
            count++;
        }
        return count;
    }

}
