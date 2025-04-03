package com.xworkz.inheritance;

public class Dog extends Animal
{
    public void eat() {
        super.eat();
        System.out.println("Dog is eating bones...");
    }

    public void sleep() {
        super.sleep();
        System.out.println("Dog is sleeping in its kennel...");
    }

    public void walk() {
        super.walk();
        System.out.println("Dog is walking in the park...");
    }
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog is barking...");
    }
    public void breathe() {
        super.breathe();
        System.out.println("Dog is panting...");
    }
}
