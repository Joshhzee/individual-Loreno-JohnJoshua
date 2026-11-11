package com.joysistvi.day24.abstraction;

public class Gelpen extends Ballpen {
    private boolean waterproof;

    public Gelpen(String brand, String color, double weightInGrams,
                  double pointSize, boolean waterproof) {
        super(brand, color, weightInGrams, pointSize);
        this.waterproof = waterproof;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    @Override
    public void write() {
        System.out.println("Writing with a waterproof gel pen.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWaterproof: " + (waterproof ? "Yes" : "No");
    }
}
