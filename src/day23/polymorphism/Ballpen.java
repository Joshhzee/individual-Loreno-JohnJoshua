package day23.polymorphism;

public class Ballpen extends Pen {
    private double pointSize;

    public Ballpen(String brand, String color, double weightInGrams, double pointSize) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    @Override
    public String toString() {
        return "Type: Ballpen\n" + super.toString() +
                "\nPoint Size: " + pointSize;
    }
}
