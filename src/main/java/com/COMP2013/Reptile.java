package com.COMP2013;

public abstract class Reptile extends Animal implements Maintainable {
    public Reptile(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Munch crunch");
    }

    @Override
    public void maintain() {
        System.out.println("Reptile maintenance.");
    }
}
