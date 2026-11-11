package day23.polymorphism;

public class Pen {
    protected String brand;
    protected String color;
    protected double weightInGrams;

    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public void write() {
        System.out.println("Writing with a pen.");
    }

    public void refill() {
        System.out.println("Refilling the pen.");
    }

    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "\nColor: " + color +
                "\nWeight in Grams: " + weightInGrams;
    }
}
