package day20.encapsulation;

import java.util.Scanner;

public class Activity13_Loreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAccount user = new UserAccount();

        System.out.println("-------------------------------------");
        System.out.println("*      User Account Registration      *");
        System.out.println("-------------------------------------\n");

        System.out.print("Enter First Name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        user.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        user.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        user.setAddress(scanner.nextLine());

        while (true) {
            System.out.print("Enter Email: ");
            try {
                user.setEmail(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // tanong lang ng tanong hanggang tama na yung sagot
        while (true) {
            System.out.print("Enter Password: ");
            try {
                user.setPassword(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- User Account Created ---");
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        scanner.close();
    }
}