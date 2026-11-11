package com.joysistvi.day24.abstraction;

public class Main {
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("Pilot", "Black", 20.0, 1.0);
        Marker marker = new Marker("Pentel", "Red", 35.0, true);

        System.out.println("=== Ballpen ===");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println();

        System.out.println("=== Marker ===");
        System.out.println(marker);
        marker.write();

        Gelpen gelPen = new Gelpen("Zebra", "Blue", 18.5, 0.5, true);

        System.out.println();
        System.out.println("=== GelPen (Stretch Goal) ===");
        System.out.println(gelPen);
        gelPen.write();

        System.out.println("Point Size from Ballpen: " + gelPen.getPointSize());
        System.out.println("Brand from Pen: " + gelPen.getBrand());
    }
}
