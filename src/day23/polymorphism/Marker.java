package day23.polymorphism;

public class Marker extends Pen {
    private boolean permanent;

    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        return "Type: Marker\n" + super.toString() +
                "\nPermanent: " + (permanent ? "Yes" : "No");
    }
}
