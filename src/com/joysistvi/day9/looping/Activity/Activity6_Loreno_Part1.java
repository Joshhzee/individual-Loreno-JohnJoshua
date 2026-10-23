package com.joysistvi.day9.looping.Activity;

import java.util.Scanner;

public class Activity6_Loreno_Part1 {

    private static final int max_multiplier = 10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                int number = readNumber(scanner);
                printTable(number);
            } while (askToContinue(scanner));
        }
    }

    private static int readNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter the multiplication table you want to display: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Invalid input. Please enter a whole number.");
            scanner.next();
        }
    }

    private static void printTable(int number) {
        System.out.println();
        System.out.println("Multiplication Table of " + number);
        for (int multiplier = 1; multiplier <= max_multiplier; multiplier++) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
        }
        System.out.println();
    }

    private static boolean askToContinue(Scanner scanner) {
        while (true) {
            System.out.print("Display another multiplication table? (y/n): ");
            String answer = scanner.next().trim().toLowerCase();
            if (answer.equals("y") || answer.equals("yes")) {
                System.out.println();
                return true;
            }
            if (answer.equals("n") || answer.equals("no")) {
                return false;
            }
            System.out.println("Please answer with 'y' or 'n'.");
        }
    }
}
