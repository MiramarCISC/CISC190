package edu.sdccd.cisc190.model;

public abstract class Pet {
    private String name;
    private int numFeet;
    private boolean hasTail;

    abstract String getSound();

    public Pet(String name, int numFeet, boolean hasTail) {
        this.name = name;
        this.numFeet = numFeet;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return "name:" + this.name + " numFeet:" + this.numFeet + " hasTail:" + this.hasTail + " sound:" + this.getSound();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumFeet() {
        return numFeet;
    }

    public void setNumFeet(int numFeet) {
        this.numFeet = numFeet;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
