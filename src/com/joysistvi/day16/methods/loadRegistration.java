package com.joysistvi.day16.methods;

import java.util.Scanner;

public class loadRegistration {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        dialUSSD();
        mainMenu();
    }

    public static void dialUSSD() {
        System.out.println("Dial *143# to access Globe Services");
        while (true) {
            System.out.print("Enter USSD Code: ");
            String ussd = input.nextLine().trim();

            if (ussd.equals("*143#")) {
                return;
            }
            System.out.println("Invalid USSD Code, try again");
        }
    }

    public static void mainMenu() {
        boolean running = true;

        while (running) {
            int promo = getInput("\n* Load Registration * \n" +
                    "[1] Go+ \n" +
                    "[2] Go \n" +
                    "[3] GoEXTRA \n" +
                    "[4] UNLI 5G \n" +
                    "[5] ALLNET \n" +
                    "[0] Cancel \n" +
                    "Enter a choice: ");

            switch (promo) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 0 -> {
                    if (exitMethod()) {
                        running = false;
                    }
                }
                default -> System.out.println("Invalid choice, try again");
            }
        }
    }

    public static void goPlusPromo() {
        int goPlus = getInput("\n*** Go+ Promos *** \n" +
                "[1] Go+99 \n" +
                "[2] Go+129 \n" +
                "[3] Go+149 \n" +
                "[0] Back \n" +
                "Enter a choice: ");

        switch (goPlus) {
            case 1 -> promoDetailsMenu("Go+99", 8, " with free 8GB", "");
            case 2 -> promoDetailsMenu("Go+129", 11, " with free 8GB", "");
            case 3 -> promoDetailsMenu("Go+149", 13, " with free 8GB", "");
            case 0 -> { }
            default -> System.out.println("Invalid choice");
        }
    }

    public static void goPromo() {
        int go = getInput("\n*** Go Promos *** \n" +
                "[1] Go50 \n" +
                "[2] Go90 \n" +
                "[3] Go120 \n" +
                "[0] Back \n" +
                "Enter a choice: ");

        switch (go) {
            case 1 -> promoDetailsMenu("Go50", 3, "", "");
            case 2 -> promoDetailsMenu("Go90", 8, "", "");
            case 3 -> promoDetailsMenu("Go120", 12, "", "");
            case 0 -> { }
            default -> System.out.println("Invalid choice");
        }
    }

    public static void goExtraPromo() {
        int goExtra = getInput("\n*** GoEXTRA Promos *** \n" +
                "[1] GoEXTRA99 \n" +
                "[2] GoEXTRA129 \n" +
                "[3] GoEXTRA149 \n" +
                "[0] Back \n" +
                "Enter a choice: ");

        switch (goExtra) {
            case 1 -> promoDetailsMenu("GoEXTRA99", 8, " and unli all-net calls and texts", "");
            case 2 -> promoDetailsMenu("GoEXTRA129", 10, " and unli all-net calls and texts", "");
            case 3 -> promoDetailsMenu("GoEXTRA149", 15, " and unli all-net calls and texts", "");
            case 0 -> { }
            default -> System.out.println("Invalid choice");
        }
    }

    public static void unli5GPromo() {
        int unli5G = getInput("\n*** UNLI 5G Promos ***\n" +
                "[1] UNLI 5G 99 \n" +
                "[2] UNLI 5G 149 \n" +
                "[3] UNLI 5G 199 \n" +
                "[0] Back \n" +
                "Enter a choice: ");

        switch (unli5G) {
            case 1 -> promoDetailsMenu("UNLI 5G 99", 8, " plus unlimited 5G data", "");
            case 2 -> promoDetailsMenu("UNLI 5G 149", 12, " plus unlimited 5G data", "");
            case 3 -> promoDetailsMenu("UNLI 5G 199", 16, " plus unlimited 5G data", "");
            case 0 -> { }
            default -> System.out.println("Invalid choice");
        }
    }

    public static void allNetPromo() {
        int allNet = getInput("\n*** ALLNET Promos ***\n" +
                "[1] ALLNET99 \n" +
                "[2] ALLNET149 \n" +
                "[3] ALLNET199 \n" +
                "[0] Back \n" +
                "Enter a choice: ");

        switch (allNet) {
            case 1 -> promoDetailsMenu("ALLNET99", 5, " and unli all-net calls and texts", "");
            case 2 -> promoDetailsMenu("ALLNET149", 8, " and unli all-net calls and texts", "");
            case 3 -> promoDetailsMenu("ALLNET199", 12, " and unli all-net calls and texts", "");
            case 0 -> { }
            default -> System.out.println("Invalid choice");
        }
    }

    public static void promoDetailsMenu(String promoName, int GB, String free, String noOfDays) {
        int action = getInput("\n*** " + promoName + " Promo ***\n" +
                "Get " + GB + "GB for all sites" + free + noOfDays + "\n" +
                "[1] Subscribe \n" +
                "[2] Exit \n" +
                "Enter a choice: ");

        switch (action) {
            case 1 -> System.out.println("You have successfully subscribed to " + promoName + "!");
            case 2 -> System.out.println("Returning to Main Menu..");
            default -> System.out.println("Invalid choice");
        }
    }

    public static boolean exitMethod() {
        while (true) {
            System.out.println("\nAre you sure that you want to exit the program?" +
                    "\n[Y] Yes - Exit the program" +
                    "\n[N] No - Return to Main Menu");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine().trim();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Exiting the program...");
                return true;
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Returning to Main Menu..");
                return false;
            } else {
                System.out.println("Invalid code, try again");
            }
        }
    }

    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String inputPrompt = input.nextLine().trim();

            try {
                return Integer.parseInt(inputPrompt);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }
}