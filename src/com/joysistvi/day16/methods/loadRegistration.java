package com.joysistvi.day16.methods;

import java.util.Scanner;

public class loadRegistration {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String USSD_CODE = "*143#";

    private static boolean running = true;
    private static int balance = 200;
    private static String currentPromo = "None";
    private static int promoDays = 0;

    // Holds the details of a single promo
    record Promo(String name, int gb, String extra, String durationText, int price, int days) {}

    // Promo catalogs
    private static final Promo[] GO_PLUS = {
            new Promo("Go+99", 8, " with free 8GB", "", 99, 7),
            new Promo("Go+129", 11, " with free 8GB", "", 129, 14),
            new Promo("Go+149", 13, " with free 8GB", "", 149, 14)
    };

    private static final Promo[] GO = {
            new Promo("Go50", 3, "", "", 50, 3),
            new Promo("Go90", 8, "", "", 90, 5),
            new Promo("Go120", 12, "", "", 120, 7)
    };

    private static final Promo[] GO_EXTRA = {
            new Promo("GoEXTRA99", 8, " and unli all-net calls and texts", "", 99, 3),
            new Promo("GoEXTRA129", 10, " and unli all-net calls and texts", "", 129, 7),
            new Promo("GoEXTRA149", 15, " and unli all-net calls and texts", "", 149, 14)
    };

    private static final Promo[] UNLI_5G = {
            new Promo("UNLI 5G 99", 100, "", "for 1 day", 99, 1),
            new Promo("UNLI 5G 149", 100, "", "for 3 day", 149, 3),
            new Promo("UNLI 5G 199", 100, "", "for 7 day", 199, 7)
    };

    private static final Promo[] ALLNET = {
            new Promo("ALLNET99", 1, "and unli calls and texts to all networks", "for 3 days", 99, 3),
            new Promo("ALLNET149", 2, "and unli calls and texts to all networks", "for 7 days", 149, 7),
            new Promo("ALLNET199", 3, "and unli calls and texts to all networks", "for 14 days", 199, 14)
    };

    public static void main(String[] args) {
        promptUssd();
    }


    public static void promptUssd() {
        String code;
        do {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            code = scanner.nextLine();

            if (!code.equals(USSD_CODE)) {
                System.out.println("Incorrect USSD Code, please try again\n");
            }
        } while (!code.equals(USSD_CODE));

        showMainMenu();
    }


    public static void showMainMenu() {
        while (running) {
            System.out.print("\n* Load Registration * \n" +
                    "[1] Go+ \n" +
                    "[2] Go \n" +
                    "[3] GoEXTRA \n" +
                    "[4] UNLI 5G \n" +
                    "[5] ALLNET \n" +
                    "[6] Check Load Balance \n" +
                    "[7] Check Current Promo \n" +
                    "[0] Cancel \n");
            int selected = readNumber("Enter a choice: ");

            switch (selected) {
                case 1 -> showPromoCategory("\n*** Go+ Promos *** \n", GO_PLUS);
                case 2 -> showPromoCategory("\n*** Go Promos *** \n", GO);
                case 3 -> showPromoCategory("\n*** GoEXTRA Promos *** \n", GO_EXTRA);
                case 4 -> showPromoCategory("\n*** UNLI 5G Promos ***\n", UNLI_5G);
                case 5 -> showPromoCategory("\n*** ALLNET Promos ***\n", ALLNET);
                case 6 -> showBalance();
                case 7 -> showCurrentPromo();
                case 0 -> confirmExit();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // One reusable menu for every promo category
    public static void showPromoCategory(String header, Promo[] promos) {
        int backOption = promos.length + 1;

        while (running) {
            StringBuilder menu = new StringBuilder(header);
            for (int i = 0; i < promos.length; i++) {
                menu.append("[").append(i + 1).append("] ").append(promos[i].name()).append(" \n");
            }
            menu.append("[").append(backOption).append("] Back \n");
            menu.append("[0] Cancel \n");
            System.out.print(menu);

            int selected = readNumber("Enter a choice: ");

            if (selected >= 1 && selected <= promos.length) {
                showPromoDetails(promos[selected - 1]);
            } else if (selected == backOption) {
                return;
            } else if (selected == 0) {
                confirmExit();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showPromoDetails(Promo promo) {
        while (running) {
            System.out.print("\n*** " + promo.name() + "Promo ***\n" +
                    "Get " + promo.gb() + "GB for all sites" + promo.extra() + promo.durationText() +
                    "\nfor P" + promo.price() +
                    "\n[1] Subscribe \n" +
                    "[2] Exit \n" +
                    "[3] Back \n" +
                    "[0] Cancel \n");
            int selected = readNumber("Enter a choice: ");

            switch (selected) {
                case 1 -> {
                    if (tryPurchase(promo)) {
                        printSuccess();
                        System.out.println("Registered Promo: " + currentPromo);
                        System.out.println("Remaining Balance: P" + balance);
                        showNextSteps();
                    } else {
                        System.out.println("Returning to available promos...");
                    }
                    return;
                }
                case 2, 0 -> confirmExit();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    public static void showBalance() {
        System.out.println("\nYour current balance is: P" + balance +
                "\n[1] Return to Main Menu \n" +
                "[2] Cancel\n");
        int selected = readNumber("Enter your choice: ");

        switch (selected) {
            case 1 -> { }
            case 2 -> confirmExit();
            default -> System.out.println("Invalid input, please try again");
        }
    }

    public static void showCurrentPromo() {
        System.out.println("\n*** Current Promo ***");

        if (currentPromo.equals("None")) {
            System.out.println("No promo currently registered.");
        } else {
            System.out.println("Registered Promo: " + currentPromo);
            System.out.println("Promo duration: " + promoDays);
        }

        System.out.println("Regular Load Balance: P" + balance);
    }


    public static boolean tryPurchase(Promo promo) {
        if (balance < promo.price()) {
            System.out.println("\nInsufficient Load Balance!");
            System.out.println("Current Balance: P" + balance);
            System.out.println("Promo duration: " + promoDays);
            return false;
        }

        balance -= promo.price();
        currentPromo = promo.name();
        promoDays = promo.days();
        return true;
    }

    public static void printSuccess() {
        System.out.println("\n*** Load Registration Successful ***");
        System.out.println("    Thank you for choosing Globe    ");
    }

    public static void showNextSteps() {
        while (true) {
            System.out.println("\nWhat would you like to do next?");
            System.out.println("[1] Return to Promo Menu");
            System.out.println("[2] Exit Program");

            int selected = readNumber("Enter your choice: ");

            if (selected == 1) {
                System.out.println("Returning to Promo Menu...");
                return;
            } else if (selected == 2) {
                running = false;
                System.out.println("Exiting the program...");
                return;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    public static void confirmExit() {
        while (true) {
            System.out.println("Are you sure that you want to exit the program?" +
                    "\n[1] Yes - Exit the program" +
                    "\n[2] No - Continue");
            int selected = readNumber("Enter your choice: ");

            if (selected == 1) {
                running = false;
                System.out.println("Exiting the program...");
                return;
            } else if (selected == 2) {
                System.out.println("Returning to choices...");
                return;
            } else {
                System.out.println("Invalid code, try again");
            }
        }
    }

    public static int readNumber(String message) {
        while (true) {
            System.out.print(message);
            String text = scanner.nextLine().trim();

            try {
                return Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }
}