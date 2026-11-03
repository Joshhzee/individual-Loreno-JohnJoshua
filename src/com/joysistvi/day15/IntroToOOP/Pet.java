package com.joysistvi.day15.IntroToOOP;

public class Pet {
    String name;
    String type;
    double weight;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void play() {
        System.out.println(name + " can play");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}