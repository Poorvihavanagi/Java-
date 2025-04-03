package com.xworkz.inheritance;

public class Parrot extends Bird {
    public void fly() {
        super.fly();
        System.out.println("Parrot is flying high in the sky...");
    }

    public void sing() {
        super.sing();
        System.out.println("Parrot is mimicking human speech...");
    }

    public void eat() {
        super.eat();
        System.out.println("Parrot is eating fruits and seeds...");
    }

    public void sleep() {
        super.sleep();
        System.out.println("Parrot is sleeping inside its cage...");
    }

    public void buildNest() {
        super.buildNest();
        System.out.println("Parrot is making a nest in the trees...");
    }
}
