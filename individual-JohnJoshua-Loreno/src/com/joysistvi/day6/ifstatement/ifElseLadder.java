package com.joysistvi.day6.ifstatement;

public class ifElseLadder {

    public static void main(String[] args) {
        int day = 1;
        String dayName;

        if (day == 1) {
            dayName = "sunday";
        } else if (day == 2){
            dayName = "monday";
        } else if (day == 3){
            dayName = "tuesday";
        } else if (day == 4){
            dayName = "wednesday";
        } else if (day == 5){
            dayName = "thursday";
        } else if (day == 6){
            dayName = "friday";
        } else if (day == 7){
            dayName = "Saturday";
        } else {
            dayName = "Invalid day";
        }
        System.out.println(dayName);
    }
}
