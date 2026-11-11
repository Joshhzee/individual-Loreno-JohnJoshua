package com.joysistvi.day24.abstraction;

public class Pen {
    private String brand;
    private String color;
    private double weightInGrams;

    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void write() {
        System.out.println("Writing with a pen.");
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "\nColor: " + color +
                "\nWeight in Grams: " + weightInGrams;
    }
}
