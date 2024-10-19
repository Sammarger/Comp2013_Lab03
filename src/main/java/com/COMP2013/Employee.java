package com.COMP2013;

public abstract class Employee implements Employable {
    private int employeeID = 0;
    private String employeeName = "";
    private int employeeSalary = 0;
    public static int numOfWorkers = 0;

    public Employee(String name) {
            this.setEmployeeName(name);
    }


    @Override
    public void setEmployeeID(int number) {
        employeeID = numOfWorkers+1;
        numOfWorkers++;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public void setEmployeeName(String name) {
        employeeName = name;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public int getSalary() {
        return employeeSalary;
    }

    @Override
    public void setSalary(int salary) {
        employeeSalary = salary;
    }

    @Override
    public int calculateChristmasBonus() {
        return 0;
    }
}
