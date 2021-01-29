package com.github.nicholasp23.inclass5_2;

public class Driver {

    public static void main(String[] args) {

        Company company = new Company("Gamestop",
                new Employee[]{
                new Employee("Nick", JobTitles.TECHNICIAN),
                new Employee("Nate", JobTitles.MECHANICAL_ENGINEER),
                new Employee("Mike", JobTitles.ELECTRICAL_ENGINEER),
                new Employee("Jacob", JobTitles.COMPUTER_ENGINEER)
        });

        System.out.println(company.getName() + " Employees (" + company.getEmployeeCount(company.employees) + ")");
        for(Employee employee: company.getEmployees()){
            System.out.println(employee.getName() + " (" + employee.job() + "   $"+ employee.getSalary() + " per/year)");
        }
    }
}
