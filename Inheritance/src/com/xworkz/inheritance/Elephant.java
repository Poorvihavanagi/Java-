package com.xworkz.inheritance;

public class Elephant extends Mammal
{
    public void eat() {
        super.eat();
        System.out.println("Elephants eat plants and fruits...");
    }

    public void sleep() {
        super.sleep();
        System.out.println("Elephants sleep standing up...");
    }

    public void walk() {
        super.walk();
        System.out.println("Elephants walk slowly due to their large size...");
    }

    public void breathe() {
        super.breathe();
        System.out.println("Elephants breathe through their trunks...");
    }

    public void giveBirth() {
        super.giveBirth();
        System.out.println("Elephants give birth to calves after a long gestation period...");
    }
}
