package com.COMP2013;

public class ZooApp {
    public static void main(String[] args) {
        Zoo.numZoos = 0;
        System.out.print("Zoo.");
        Zoo zoo1 = new Zoo("London", 3);
        Zoo zoo2 = new Zoo("Tokyo", 6554);
        Zoo zoo3 = new Zoo("New York", 4564554);
        Zoo zoo4 = new Zoo("Paris", 99999);
        Zoo zoo5 = new Zoo("Baltimore", 53457);

        ZooCorp megaZoo = new ZooCorp(zoo1);
        megaZoo.addZoo(zoo2);

        System.out.println("Number of zoos created: " + Zoo.numZoos);
        System.out.println(zoo1.printInfo());
        System.out.println(zoo2.printInfo());
        System.out.println(zoo3.printInfo());
        System.out.println(zoo4.printInfo());
        System.out.println(zoo5.printInfo());

        zoo5.buildNewCompound();
        System.out.println(zoo5.printInfo());
        System.out.println("Number of Zoos:" + Zoo.numZoos);
        Employee sue = new Zookeeper("Helen");
        Employee bob = new Admin("Keler");
        megaZoo.addEmployee(sue);
        megaZoo.addEmployee(bob);
        System.out.println(sue.getClass().getSimpleName() + ":" + sue.getEmployeeName() + ":" + sue.calculateChristmasBonus());
        System.out.println(bob.getClass().getSimpleName() + ":" + bob.getEmployeeName() + ":" + bob.calculateChristmasBonus());
    }
}
