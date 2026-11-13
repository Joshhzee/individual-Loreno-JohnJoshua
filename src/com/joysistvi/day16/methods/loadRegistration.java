package com.joysistvi.day16.methods.sample;

import java.util.Scanner;

public class loadRegistration {
    static Scanner input = new Scanner(System.in);
    static boolean running = true;
    static int loadBalance = 200;
    static String activePromo = "None";
    static int daysDuration = 0;

    public static void main(String[] args) {

        dialUSSD();

    }

    public static void dialUSSD() {

        String ussd;

        do {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            ussd = input.nextLine();

            if (!ussd.equals("*143#")) {
                System.out.println("Incorrect USSD Code, please try again\n");
            }

        } while (!ussd.equals("*143#"));
        mainMenu();

    }

    public static void checkLoadBalance() {
        System.out.println("\nYour current balance is: P" + loadBalance +
                "\n[1] Return to Main Menu \n" +
                "[2] Cancel\n");
        int choice = getInput("Enter your choice: ");

        switch (choice) {
            case 1 -> {
                return;
            }
            case 2 -> exitMethod();
            default -> System.out.println("Invalid input, please try again");
        }

    }

    public static void checkCurrentPromo() {

        System.out.println("\n*** Current Promo ***");

        if (activePromo.equals("None")) {
            System.out.println("No promo currently registered.");
        } else {
            System.out.println("Registered Promo: " + activePromo);
            System.out.println("Promo duration: " + daysDuration);
        }

        System.out.println("Regular Load Balance: P" + loadBalance);
    }

    public static void mainMenu() {
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
            int promo = getInput("Enter a choice: ");

            switch (promo) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 6 -> checkLoadBalance();
                case 7 -> checkCurrentPromo();
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void goPlusPromo() {
        while (running) {
            System.out.print("\n*** Go+ Promos *** \n" +
                    "[1] Go+99 \n" +
                    "[2] Go+129 \n" +
                    "[3] Go+149 \n" +
                    "[4] Back \n" +
                    "[0] Cancel \n");
            int goPlus = getInput("Enter a choice: ");

            switch (goPlus) {
                case 1 -> promoDetailsMenu("Go+99", 8, " with free 8GB", "", 99, 7);
                case 2 -> promoDetailsMenu("Go+129", 11, " with free 8GB", "", 129, 14);
                case 3 -> promoDetailsMenu("Go+149", 13, " with free 8GB", "", 149, 14);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }

        }
    }

    public static void goPromo() {
        while (running) {
            System.out.print("\n*** Go Promos *** \n" +
                    "[1] Go50 \n" +
                    "[2] Go90 \n" +
                    "[3] Go120 \n" +
                    "[4] Back \n" +
                    "[0] Cancel \n");
            int go = getInput("Enter a choice: ");

            switch (go) {
                case 1 -> promoDetailsMenu("Go50", 3, "", "", 50, 3);
                case 2 -> promoDetailsMenu("Go90", 8, "", "", 90, 5);
                case 3 -> promoDetailsMenu("Go120", 12, "", "", 120, 7);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void goExtraPromo() {
        while (running) {
            System.out.print("\n*** GoEXTRA Promos *** \n" +
                    "[1] GoEXTRA99 \n" +
                    "[2] GoEXTRA129 \n" +
                    "[3] GoEXTRA149 \n" +
                    "[4] Back \n" +
                    "[0] Cancel \n");
            int goExtra = getInput("Enter a choice: ");

            switch (goExtra) {
                case 1 -> promoDetailsMenu("GoEXTRA99", 8, " and unli all-net calls and texts", "", 99, 3);
                case 2 -> promoDetailsMenu("GoEXTRA129", 10, " and unli all-net calls and texts", "", 129, 7);
                case 3 -> promoDetailsMenu("GoEXTRA149", 15, " and unli all-net calls and texts", "", 149, 14);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void unli5GPromo() {
        while (running) {
            System.out.print("\n*** UNLI 5G Promos ***\n" +
                    "[1] UNLI 5G 99 \n" +
                    "[2] UNLI 5G 149 \n" +
                    "[3] UNLI 5G 199 \n" +
                    "[4] Back \n" +
                    "[0] Cancel \n");
            int unli5G = getInput("Enter a choice: ");

            switch (unli5G) {

                case 1 -> promoDetailsMenu("UNLI 5G 99", 100, "", "for 1 day", 99, 1);
                case 2 -> promoDetailsMenu("UNLI 5G 149", 100, "", "for 3 day", 149, 3);
                case 3 -> promoDetailsMenu("UNLI 5G 199", 100, "", "for 7 day", 199, 7);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void allNetPromo() {
        while (running) {
            System.out.print("\n*** ALLNET Promos ***\n" +
                    "[1] ALLNET99 \n" +
                    "[2] ALLNET149 \n" +
                    "[3] ALLNET199 \n" +
                    "[4] Back \n" +
                    "[0] Cancel \n");
            int allNet = getInput("Enter a choice: ");

            switch (allNet) {
                case 1 -> promoDetailsMenu("ALLNET99", 1, "and unli calls and texts to all networks", "for 3 days", 99, 3);
                case 2 ->
                        promoDetailsMenu("ALLNET149", 2, "and unli calls and texts to all networks", "for 7 days", 149, 7);
                case 3 ->
                        promoDetailsMenu("ALLNET199", 3, "and unli calls and texts to all networks", "for 14 days", 199, 14);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void promoDetailsMenu(String promoName, int GB, String free, String daysPromo, int price, int days) {
        while (running) {
            System.out.print("\n*** " + promoName + "Promo ***\n" +
                    "Get " + GB + "GB for all sites" + free + daysPromo +
                    "\nfor P" + price +
                    "\n[1] Subscribe \n" +
                    "[2] Exit \n" +
                    "[3] Back \n" +
                    "[0] Cancel \n");
            int action = getInput("Enter a choice: ");

            switch (action) {

                case 1 -> {
                    if (subscribe(promoName, price, days)) {
                        actions();

                        System.out.println("Registered Promo: " + activePromo);
                        System.out.println("Remaining Balance: P" + loadBalance);

                        afterSubscription();
                        return;

                    } else {
                        System.out.println("Returning to available promos...");
                        return;
                    }
                }

                case 2 -> exitMethod();
                case 3 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid choice. Please try again.");
            }

        }
    }

    public static void actions() {
        System.out.println("\n*** Load Registration Successful ***");
        System.out.println("    Thank you for choosing Globe    ");
    }

    public static boolean subscribe(String promoName, int price, int days) {
        if (loadBalance >= price) {
            loadBalance -= price;
            activePromo = promoName;
            daysDuration = days;
            return true;
        } else {
            System.out.println("\nInsufficient Load Balance!");
            System.out.println("Current Balance: P" + loadBalance);
            System.out.println("Promo duration: " + daysDuration);
            return false;
        }
    }

    public static void afterSubscription(){
        while (true) {

            System.out.println("\nWhat would you like to do next?");
            System.out.println("[1] Return to Promo Menu");
            System.out.println("[2] Exit Program");

            int choice = getInput("Enter your choice: ");

            switch (choice) {

                case 1 -> {
                    System.out.println("Returning to Promo Menu...");
                    return;
                }

                case 2 -> {
                    running = false;
                    System.out.println("Exiting the program...");
                    return;
                }

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void exitMethod() {

        while (true) {
            System.out.println("Are you sure that you want to exit the program?" +
                    "\n[1] Yes - Exit the program" +
                    "\n[2] No - Continue");
            int choice = getInput("Enter your choice: ");

            if (choice == 1) {
                running = false;
                System.out.println("Exiting the program...");
                return;
            } else if (choice == 2) {
                System.out.println("Returning to choices...");
                return;
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
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }
}
