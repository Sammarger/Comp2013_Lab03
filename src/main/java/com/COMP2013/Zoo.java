package com.COMP2013;

import java.util.ArrayList;

public class Zoo {
    private String location;
    private int numberOfCompounds;
    private int zooID;
    public static int numZoos;
    private ArrayList<Compound> compounds;

    public Zoo(String location, int numberOfCompounds) {
        this.setZooID(numZoos+1);
        this.setLocation(location);
        this.numberOfCompounds = numberOfCompounds;
        numZoos++;
        compounds = new ArrayList<Compound>();

        for(int i=0; i<numberOfCompounds; i++) {
            addCompound(new Compound());
        }
    }


    public Zoo() {
        this.zooID = numZoos+1;
        this.setLocation("unknown");
        this.numberOfCompounds = 30;
        numZoos++;
        compounds = new ArrayList<Compound>();
        for(int i=0; i<numberOfCompounds; i++) {
            addCompound(new Compound());
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
    }

    public void setZooID(int thisZooID) {
        this.zooID = thisZooID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void buildNewCompound() {
        this.numberOfCompounds++;
    }

    public int getNumberOfCompounds() {
        return this.numberOfCompounds;
    }
    public String printInfo() {
        return "Zoo ID: " + zooID + ", Location: " + location + ", Number of Compounds: " + numberOfCompounds;}
}
