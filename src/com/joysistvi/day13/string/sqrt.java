package com.joysistvi.day13.string;

import java.util.Scanner;

public class sqrt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Square Root Calculator Math.sqrt");
        System.out.print("Enter a number: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return;
        }

        double number = scanner.nextDouble();
        scanner.close();

        showResult(number);
    }

    private static void showResult(double number) {
        if (number < 0) {
            System.out.println("Cannot get the square root of a negative number.");
            System.out.println("Java returns: " + Math.sqrt(number));   // NaN
            return;
        }

        double result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + result);
    }
}