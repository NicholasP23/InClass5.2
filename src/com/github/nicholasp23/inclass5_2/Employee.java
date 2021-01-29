package com.github.nicholasp23.inclass5_2;
public class Employee {
    private final String name;
    private JobTitles job;

    public Employee(String name, JobTitles job){
        this.name = name;
        this.job = job;

    }

    public String getName() {
        return name;
    }

    public JobTitles job(){
        return job;
    }

    public JobTitles setJobTitles(JobTitles job){
        return this.job=job;
    }

    public int getSalary(){
        return job().getSalary();
    }
}
