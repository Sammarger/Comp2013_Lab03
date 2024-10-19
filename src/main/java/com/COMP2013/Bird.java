package com.COMP2013;

public abstract class Bird extends Animal implements Maintainable{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Munch *tweet tweet* crunch");
    }

    @Override
    public void maintain() {
        System.out.println("Bird maintenance.");
    }
}
