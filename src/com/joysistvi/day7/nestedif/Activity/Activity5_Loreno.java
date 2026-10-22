package com.joysistvi.day7.nestedif.Activity;

import java.util.Scanner;

public class Activity5_Loreno {

    static final String USSD_CODE = "*143#";

    static final String[] Categories = {"Go+", "Go", "GoEXTRA", "UNLI 5G", "ALLNET"};

    static final String[][] Promos = {
            {"Go+59", "Go+119", "Go+149"},
            {"Go50", "Go90", "Go120"},
            {"GoEXTRA99", "GoEXTRA129", "GoEXTRA149"},
            {"UNLI 5G 150", "UNLI 5G 250", "UNLI 5G 500"},
            {"ALLNET99", "ALLNET149", "ALLNET199"}
    };

    static final String[][] Details = {
            {"Get 5 GB for all sites + 1GB 5G + Unli allnet text. Valid for 3 days", "Get 8 GB for all sites + + 8GB 5G + Unli allnet text. Valid for 7 days", "Get 16 GB for all sites + + 16GB 5G + Unli allnet text. Valid for 10 days"},
            {"Get 3 GB for all sites", "Get 5 GB for all sites", "Get 8 GB for all sites"},
            {"Get 8 GB for all sites + 2 GB for Spotify", "Get 10 GB for all sites + 3 GB for Spotify", "Get 15 GB for all sites + 5 GB for Spotify"},
            {"Get unlimited 5G data for 7 days", "Get unlimited 5G data for 15 days", "Get unlimited 5G data for 30 days"},
            {"Get 5 GB data + unlimited texts to all networks", "Get 10 GB data + unlimited texts to all networks", "Get 15 GB data + unlimited texts to all networks"}
    };

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssd();

        int category = showMainMenu();
        int promo = showPromoMenu(category);
        showPromoDetails(category, promo);

        input.close();
    }

    static void dialUssd() {
        System.out.println("Dial " + USSD_CODE + " to access Globe Services!!");

        while (true) {
            System.out.print("Enter USSD Code: ");
            String code = input.nextLine().trim();

            if (code.equals(USSD_CODE)) {
                return;
            }
            System.out.println("Invalid USSD code. try again!!.");
        }
    }

    static int showMainMenu() {
        System.out.println();
        System.out.println("      * Load Registration *");
        for (int i = 0; i < Categories.length; i++) {
            System.out.println("    [" + (i + 1) + "] " + Categories[i]);
        }
        return readChoice(Categories.length) - 1;
    }

    static int showPromoMenu(int category) {
        System.out.println();
        System.out.println("     ** " + Categories[category] + " Promos **");
        for (int i = 0; i < Promos[category].length; i++) {
            System.out.println("    [" + (i + 1) + "] " + Promos[category][i]);
        }
        return readChoice(Promos[category].length) - 1;
    }

    static void showPromoDetails(int category, int promo) {
        String name = Promos[category][promo];

        System.out.println();
        System.out.println("     ** " + name + " Promo **");
        System.out.println("-> " + Details[category][promo]);
        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Exit");

        int choice = readChoice(2);

        if (choice == 1) {
            System.out.println();
            System.out.println("You are now subscribed to " + name);
        }
    }

    static int readChoice(int max) {
        while (true) {
            System.out.print("Enter a choice: ");
            String line = input.nextLine().trim();

            try {
                int choice = Integer.parseInt(line);
                if (choice >= 1 && choice <= max) {
                    return choice;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid choice. Please enter a number from 1 to " + max + ".");
        }
    }
}
