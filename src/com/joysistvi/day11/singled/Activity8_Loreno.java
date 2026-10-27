package com.joysistvi.day11.singled;

import java.util.Scanner;

public class Activity8_Loreno {

    static final int SIZE = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[SIZE];

        System.out.println("Enter " + SIZE + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Display all numbers entered
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        int sum = computeSum(numbers);
        double average = (double) sum / numbers.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Stretch goal: highest and lowest
        System.out.println("Highest = " + findHighest(numbers));
        System.out.println("Lowest = " + findLowest(numbers));

        input.close();
    }

    static int computeSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    static int findHighest(int[] arr) {
        int highest = arr[0];
        for (int num : arr) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    static int findLowest(int[] arr) {
        int lowest = arr[0];
        for (int num : arr) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }
}
