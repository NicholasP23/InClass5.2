package com.github.nicholasp23.inclass5_2;
public enum JobTitles {
    TECHNICIAN("Technician", 60_000),
    MECHANICAL_ENGINEER("Mechanical Engineer", 70_000),
    ELECTRICAL_ENGINEER("Electrical Engineer", 80_000),
    COMPUTER_ENGINEER("Computer Engineer", 90_000);


    private final String name;
    private final int salary;

    JobTitles(String title, int salary){
        this.name = title;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
