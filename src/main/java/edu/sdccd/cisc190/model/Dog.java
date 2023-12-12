package edu.sdccd.cisc190.model;

public class Dog extends Pet {
    private boolean isShedder;
    public Dog(String name, int numFeet, boolean hasTail, boolean isShedder) {
        super(name, numFeet, hasTail);
        this.isShedder = isShedder;
    }

    @Override
    String getSound() {
        return "bark";
    }

    public static Dog fromCSV(String csv) {
        String[] values = csv.split(",");
        return new Dog(values[0],Integer.parseInt(values[1]),Boolean.parseBoolean(values[2]),Boolean.parseBoolean(values[3]));
    }

    public boolean isShedder() {
        return isShedder;
    }

    public void setShedder(boolean shedder) {
        isShedder = shedder;
    }
}
