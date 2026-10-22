package com.joysistvi.day5.operator;

public class Activity3_Loreno {

    public static void main(String[] args) {

        // Logical AND operator (&&)
        int age = 20;
        boolean hasValidID = true;

        System.out.println("--- Task 2: Event Entry Check ---");
        if (age >= 18 && hasValidID) {
            System.out.println("Allowed to enter the event: Yes");
        } else {
            System.out.println("Allowed to enter the event: No");
        }
        System.out.println();

        // Logical OR operator (||)
        boolean isWeekend = true;
        boolean isHoliday = false;

        System.out.println("--- Task 3: Class Status Check ---");
        if (isWeekend || isHoliday) {
            System.out.println("Are there no classes today? Yes, no classes.");
        } else {
            System.out.println("Are there no classes today? No, there are classes.");
        }
        System.out.println();

        // Ternary operator (? :) for pass or fail
        int score = 85;
        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println("--- Task 4: Pass or Fail Check ---");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);
        System.out.println();

        // Ternary operator (? :) for the larger number
        int num = 10;
        int num2 = 25;
        int larger = (num > num2) ? num : num2;

        System.out.println("--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + larger);
    }
}
