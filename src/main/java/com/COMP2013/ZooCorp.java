package com.COMP2013;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos = new ArrayList<Zoo>();
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private int numOfZoos = 1;
    private int numOfEmployees = 1;

    public ZooCorp(Zoo zoo, int numOfZoos, int numOfEmployees) {
        addZoo(zoo);
        for(int i=0; i<numOfZoos; i++) {
            addZoo(new Zoo());
        }
        for(int i=0; i<numOfEmployees; i++) {
            addEmployee(new Zookeeper("Thomas"));
        }
    }

    public ZooCorp(Zoo zoo) {
        addZoo(zoo);
        for(int i=0; i<numOfZoos; i++) {
            addZoo(new Zoo());
        }
        for(int i=0; i<numOfEmployees; i++) {
            addEmployee(new Zookeeper("Thomas"));
        }


    }
    public void addZoo(Zoo zoo) {
        this.zoos.add(zoo);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
