package com.joysistvi.day7.nestedif;

import java.util.Scanner;

public class GlobeUSSD {

    private static final String VALID_USSD_CODE = "*143#";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            showDialInstruction();
            askForUssdCode(scanner);
            showWelcomeMessage();
        }
    }

    private static void showDialInstruction() {
        System.out.println("Dial " + VALID_USSD_CODE + " to access Globe Services");
    }

    private static void askForUssdCode(Scanner scanner) {
        while (true) {
            System.out.print("Enter USSD Code: ");
            String code = scanner.nextLine().trim();

            if (code.equals(VALID_USSD_CODE)) {
                return;
            }
            System.out.println("Invalid USSD code. Please try again.");
        }
    }

    private static void showWelcomeMessage() {
        System.out.println("\nWelcome to Globe Services!");
    }
}