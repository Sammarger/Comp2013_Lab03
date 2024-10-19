package com.COMP2013;

import java.util.ArrayList;

public class Compound {
    private int numberOfAnimals;
    private ArrayList<Animal> animals;

    public Compound(int numberOfAnimals) {

        animals = new ArrayList<Animal>();
        for(int i=0; i<numberOfAnimals; i++) {
            addAnimal(new Crow("Crow"));
        }

    }
    public Compound() {
        numberOfAnimals = 1;
        animals = new ArrayList<Animal>();
        for(int i=0; i<numberOfAnimals; i++) {
            addAnimal(new Crow("Crow"));
        }

    }

    private void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
}
