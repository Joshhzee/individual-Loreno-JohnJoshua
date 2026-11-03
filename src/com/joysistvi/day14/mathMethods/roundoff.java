package com.joysistvi.day14.mathMethods;

import java.util.Scanner;

public class roundoff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rounding Calculator Math.round");
        System.out.print("Enter a decimal number: ");

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
        long wholeNumber = Math.round(number);

        double twoDecimals = Math.round(number * 100) / 100.0;

        System.out.println("Original number     : " + number);
        System.out.println("Rounded (whole)     : " + wholeNumber);
        System.out.println("Rounded (2 decimals): " + twoDecimals);
    }
}
