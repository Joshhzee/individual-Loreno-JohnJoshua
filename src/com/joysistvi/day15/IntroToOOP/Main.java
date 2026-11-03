package com.joysistvi.day15.IntroToOOP;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.name = "wolfie";
        pet.type = "Dog";
        pet.weight = 12.5;

        pet.sleep();
        pet.eat();
        pet.play();

        Pet pet1 = new Pet();
        pet1.name = "meowie";
        pet1.type = "Cat";
        pet1.weight = 4;

        pet1.play();
        pet1.eat();

        Pet pet2 = new Pet();
        pet2.name = "twit twit";
        pet2.type = "Bird";
        pet2.weight = 0.3;

        pet.displayInfo();
        pet1.displayInfo();
        pet2.displayInfo();
    }
}
