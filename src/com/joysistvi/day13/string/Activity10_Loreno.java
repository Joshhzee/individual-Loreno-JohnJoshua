package com.joysistvi.day13.string;

public class Activity10_Loreno {
    public static void main(String[] args) {

        String text = "Hello World";

        System.out.println("--- String Methods ---");

        System.out.println("contains(\"World\"): " + text.contains("World"));

        System.out.println("endsWith(\"World\"): " + text.endsWith("World"));

        System.out.println("startsWith(\"Hello\"): " + text.startsWith("Hello"));

        System.out.println("indexOf(\"W\"): " + text.indexOf("W"));

        String spaced = "   Java   ";
        System.out.println("trim(): " + spaced.trim());

        System.out.println("replace(): " + text.replace("World", "Java"));

        char[] letters = "Hi".toCharArray();
        System.out.println("toCharArray()[0]: " + letters[0]);

        String country = "Philippines";

        System.out.println();
        System.out.println("--- Stretch Goal: " + country + " ---");

        System.out.println("First character: " + country.charAt(0));
        System.out.println("Last character: " + country.charAt(country.length() - 1));

        int pCount = 0;
        int vowelCount = 0;

        for (char c : country.toLowerCase().toCharArray()) {
            if (c == 'p') {
                pCount++;
            }
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
