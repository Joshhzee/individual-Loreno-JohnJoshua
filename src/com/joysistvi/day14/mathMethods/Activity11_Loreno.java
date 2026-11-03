package com.joysistvi.day14.mathMethods;

import java.io.*;

public class Activity11_Loreno {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        int absResult = Math.abs(-15);
        System.out.println("abs(-15): " + absResult);

        int maxResult = Math.max(10, 25);
        System.out.println("max(10, 25): " + maxResult);

        int minResult = Math.min(10, 25);
        System.out.println("min(10, 25): " + minResult);

        double powResult = Math.pow(2, 3);
        System.out.println("pow(2, 3): " + powResult);

        double sqrtResult = Math.sqrt(16);
        System.out.println("sqrt(16): " + sqrtResult);

        long roundResult = Math.round(5.6);
        System.out.println("round(5.6): " + roundResult);

        double ceilResult = Math.ceil(4.1);
        System.out.println("ceil(4.1): " + ceilResult);

        double floorResult = Math.floor(4.9);
        System.out.println("floor(4.9): " + floorResult);

        double randomResult = Math.random();
        System.out.println("random(): " + randomResult);

        double logResult = Math.log(Math.E);
        System.out.println("log(e): " + logResult);

        double log10Result = Math.log10(100);
        System.out.println("log10(100): " + log10Result);

        double expResult = Math.exp(1);
        System.out.println("exp(1): " + expResult);

        double sinResult = Math.sin(Math.toRadians(90));
        System.out.println("sin(90 deg): " + sinResult);

        double cosResult = Math.cos(Math.toRadians(0));
        System.out.println("cos(0 deg): " + cosResult);

        double tanResult = Math.tan(Math.toRadians(45));
        System.out.println("tan(45 deg): " + tanResult);
    }
}
