package com.joysistvi.day13.string;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "admin123";

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and Password cannot be empty.");
            }

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successfully!");
                System.out.println("Welcome, " + username + "!");
                break;
            } else {
                System.out.println("Invalid Username or Password.");
                System.out.println("\nAccess Denied.");

                if (i < 5) {
                    System.out.println("\nAttempts remaining: " + (5 - i));
                } else {
                    System.out.println("Maximum attempts reached.");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
