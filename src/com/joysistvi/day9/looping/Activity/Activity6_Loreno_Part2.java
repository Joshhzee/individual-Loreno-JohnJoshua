package com.joysistvi.day9.looping.Activity;

public class Activity6_Loreno_Part2 {

    private static final int first_table = 1;
    private static final int last_table = 10;
    private static final int max_multiplier = 10;

    public static void main(String[] args) {
        for (int number = first_table; number <= last_table; number++) {
            System.out.println("Multiplication Table of " + number);

            for (int multiplier = 1; multiplier <= max_multiplier; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            }

            System.out.println();
        }
    }
}
