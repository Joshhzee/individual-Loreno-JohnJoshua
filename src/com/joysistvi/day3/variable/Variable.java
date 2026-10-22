package com.joysistvi.day3.variable;

import java.sql.SQLOutput;

public class Variable {
    public static void main(String[] args) { // main method
        byte age = 23;
        short num = 500;
        int num2 = 129;
        long num3 = 10000000000000L;
        System.out.println(num3);
        //System.out.println(age);

        float average = 99.90f;
        double price = 10.5;
        //System.out.println(price);

        boolean is_active = false;

        char middleInitial = 'M';
        //System.out.println(middleInitial);
        System.out.println(is_active);

        String firstName = "John Joshua";
        String lastName = "Loreno";

        String fullName = firstName + " " + middleInitial + ". " + lastName;
        String fullName2 = "Full Name: " + lastName + ", " + firstName + " " + middleInitial + ". ";

        System.out.print("Full Name: ");
        System.out.println(fullName);
        System.out.println(fullName2);
        System.out.println("Full name: " + lastName + ", " + firstName + " " + middleInitial + ".");
    }
}


