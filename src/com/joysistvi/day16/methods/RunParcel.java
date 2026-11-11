package com.joysistvi.day16.methods;

import java.util.Scanner;

public class RunParcel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a delivery type. Press S for Standard, E for Express, or F for Freight: ");
        String type = sc.nextLine();

        System.out.print("Enter the package weight in kg: ");
        double weight = sc.nextDouble();

        Parcel parcel;

        if (type.equalsIgnoreCase("S")) {
            parcel = new Standard(weight);
        } else if (type.equalsIgnoreCase("E")) {
            parcel = new Express(weight);
        } else if (type.equalsIgnoreCase("F")) {
            parcel = new Freight(weight);
        } else {
            System.out.println("Invalid delivery type.");
            return;
        }

        parcel.showDetails();
    }
}

abstract class Parcel {

    protected double weight;

    Parcel(double weight) {
        this.weight = weight;
    }

    abstract String getDeliveryTime();

    abstract double computeFee();

    abstract void showDetails();
}

class Standard extends Parcel {

    Standard(double weight) {
        super(weight);
    }

    String getDeliveryTime() {
        return "3-5 days";
    }

    double computeFee() {
        return 50 + (20 * weight);
    }

    void showDetails() {
        System.out.println("Standard Delivery");
        System.out.println("Delivery time: " + getDeliveryTime());
        System.out.printf("Total fee: PHP %.2f%n", computeFee());
    }
}

class Express extends Parcel {

    Express(double weight) {
        super(weight);
    }

    String getDeliveryTime() {
        return "1-2 days";
    }

    double computeFee() {
        return 100 + (70 * weight);
    }

    void showDetails() {
        System.out.println("Express Delivery");
        System.out.println("Delivery time: " + getDeliveryTime());
        System.out.printf("Total fee: PHP %.2f%n", computeFee());
    }
}

class Freight extends Parcel {

    Freight(double weight) {
        super(weight);
    }

    String getDeliveryTime() {
        return "5-7 days";
    }

    double computeFee() {
        return 300 + (15 * weight);
    }

    void showDetails() {
        System.out.println("Freight Delivery");
        System.out.println("Delivery time: " + getDeliveryTime());
        System.out.printf("Total fee: PHP %.2f%n", computeFee());
    }
}
