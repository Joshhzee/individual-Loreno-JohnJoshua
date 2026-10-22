package com.joysistvi.day4.operator;

public class Activity2_LORENO {

    public static void main(String[] args) {

        // values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Percentage of each expense relative to the total income
        double foodPercent = (foodAllowance / income) * 100;
        double transportPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Remaining balance after deducting all expenses
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Output
        System.out.println("* Expense Tracker Program *");
        System.out.printf("Income: %.0f%n", income);
        System.out.printf("Food Allowance: %.1f %%%n", foodPercent);
        System.out.printf("Transportation: %.1f %%%n", transportPercent);
        System.out.printf("Rent: %.1f %%%n", rentPercent);
        System.out.printf("Utility Bill: %.1f %%%n", utilityPercent);
        System.out.printf("Remaining Balance: %.0f%n", remainingBalance);
    }
}
