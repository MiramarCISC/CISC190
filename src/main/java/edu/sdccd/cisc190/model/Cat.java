package edu.sdccd.cisc190.model;

public class Cat extends Pet {
    private boolean isBald;
    public Cat(String name, int numFeet, boolean hasTail, boolean isBald) {
        super(name, numFeet, hasTail);
        this.isBald = isBald;
    }

    @Override
    String getSound() {
        return "meow";
    }

    public static Cat fromCSV(String csv) {
        String[] values = csv.split(",");
        return new Cat(values[0],Integer.parseInt(values[1]),Boolean.parseBoolean(values[2]),Boolean.parseBoolean(values[3]));
    }

    public boolean isBald() {
        return isBald;
    }

    public void setBald(boolean bald) {
        isBald = bald;
    }
}
