package com.joysistvi.day9.looping.dowhileloop;


import java.util.Scanner;

public class DoWhileLoopStatements {

    public static void main(String[] args) {
//        String color = "Black";
//        while (color == "White") {
//            System.out.println(color);
//        }

//        String color = "Black";
//        do {
//            System.out.println(color);
//        } while(color == "White");



        Scanner scanner = new Scanner(System.in);
        // Flag variable / boolean flag
        boolean isRunning = true;

        do {
            System.out.println("    * Load Reg *");
            System.out.println("    [1] Text Only!");
            System.out.println("    [2] Call Only!");
            System.out.println("    [3] Call N Text!");
            System.out.println("    [0] Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("You are now subscribed to Text Only!\n");
                    isRunning = false;
                }
                case 2 -> System.out.println("You are now subscribed to Call Only!\n");
                case 3 -> System.out.println("You are now subscribed to Call N Text Only!\n");
                case 0 -> {
                    System.out.println("Exiting...");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Input! Please choose from 1 - 3\n");
            }
        } while (isRunning);


    }
}
