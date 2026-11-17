package com.joysistvi.day24.abstraction;

public class Main {

    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen("Pilot", "Black", 20.0, 1.0);
        Marker marker = new Marker("Pentel", "Red", 35.0, true);

        testPen(ballpen);
        testPen(marker);

        testRefillable(ballpen);
        testRefillable(marker);

        testClickable(ballpen);

    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
        System.out.println();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
        System.out.println();
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }
}

/*
 * Abstract class vs Interface
 * An abstract class (extends) is a partial parent that shares fields, constructors,
 * and regular methods with its children, and a class can extend only one.
 * An interface (implements) is a contract of abilities (constants and method
 * signatures), and a class can implement many, even unrelated ones.
 * Use extends for an "is-a" relationship, and implements for a "can-do" ability.
 */
