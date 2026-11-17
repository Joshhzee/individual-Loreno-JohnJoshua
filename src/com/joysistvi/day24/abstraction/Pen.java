package com.joysistvi.day24.abstraction;

public abstract class Pen {
    private String type;
    private String brand;
    private String color;
    private double weightInGrams;

    public Pen(String type, String brand, String color, double weightInGrams) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getWeightInGrams() { return weightInGrams; }
    public void setWeightInGrams(double weightInGrams) { this.weightInGrams = weightInGrams; }

    // Abstract method: every child class must provide its own body
    public abstract void write();

    // Overloaded write methods
    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a " + type.toLowerCase() + ".");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    // Regular (non-abstract) method
    public void store() {
        System.out.println("Storing the pen in the pencil case.");
    }

    @Override
    public String toString() {
        return "Type          : " + type + "\n"
                + "Brand         : " + brand + "\n"
                + "Color         : " + color + "\n"
                + "Weight (g)    : " + weightInGrams;
    }
}
