package com.xworkz.inheritance;

public class Elephant extends Mammal {

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in elephant...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Running sleep in elephant...");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Running walk in elephant...");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Running breathe in elephant...");
    }

    @Override
    public void giveBirth() {
        super.giveBirth();
        System.out.println("Running giveBirth in elephant...");
    }
}
