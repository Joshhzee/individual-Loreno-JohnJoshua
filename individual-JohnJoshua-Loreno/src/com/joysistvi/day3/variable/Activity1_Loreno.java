package com.joysistvi.day3.variable;

public class Activity1_Loreno {
    public static void main(String[] args) { // main method

        boolean is_active = false;
        byte age = 23;
        short num = 500;
        int num2 = 129;
        long num3 = 10000000000000L;
        float average = 99.90f;
        double price = 10.5;
        char middleInitial = 'M';

        String firstName = "John Joshua";
        String lastName = "Loreno";

        System.out.println("boolean: " + is_active);
        System.out.println("byte: " + age);
        System.out.println("short: " + num);
        System.out.println("int: " + num2);
        System.out.println("long: " + num3);
        System.out.println("float: " + average);
        System.out.println("double: " + price);
        System.out.println("char: " + middleInitial);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        String fullName = firstName + " " + middleInitial + ". " + lastName;
        String fullName2 = "Full Name: " + lastName + ", " + firstName + " " + middleInitial + ". ";

        System.out.print("Full Name: ");
        System.out.println(fullName);
        System.out.println(fullName2);
        System.out.println("Full name: " + lastName + ", " + firstName + " " + middleInitial + ".");
    }
}