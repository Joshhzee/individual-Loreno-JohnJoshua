package day23.polymorphism;

public class Main {

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
        System.out.println();
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen("Generic", "Blue", 15.0);
        Pen pen2 = new Ballpen("Pilot", "Black", 20.0, 1.0);
        Pen pen3 = new Marker("Pentel", "Red", 35.0, true);

        System.out.println("=== Calling methods on Pen references ===");

        System.out.println("--- Pen ---");
        pen1.write();
        pen1.refill();
        System.out.println();

        System.out.println("--- Ballpen ---");
        pen2.write();
        pen2.refill();
        System.out.println();

        System.out.println("--- Marker ---");
        pen3.write();
        pen3.refill();
        System.out.println();

        System.out.println("=== testPen() ===");
        testPen(pen1);
        testPen(pen2);
        testPen(pen3);

        System.out.println();
        System.out.println("=== Overloading ===");
        pen3.write("Hello");
        pen3.write("Hello", 3);
    }
}

/*
 * ang method overloading ay mostly nangyayari
 * kapag same yung pangalan ng mga function pero magkaiba yung parametes sa iisang class.
 * method overriding naman ay kapag yung child class ay nag
 * ooverride ng  function mula sa parent class gamit ang same signature para sa ibang behavior lang
 * Overloading = same name, different arguments;
 * Overriding = same function, different implementation sa subclass.
 */
