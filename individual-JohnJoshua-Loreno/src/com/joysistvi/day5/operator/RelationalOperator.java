package com.joysistvi.day5.operator;

public class RelationalOperator {

    public static void main(String[] arg) {
        int num = 10;
        int num2= 20;

        int bigger = (num > num2) ? num : num2;
        System.out.println("Bigger number: " + bigger);
    }
}
