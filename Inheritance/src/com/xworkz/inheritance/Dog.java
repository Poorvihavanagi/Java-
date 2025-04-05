package com.xworkz.inheritance;

public class Dog extends Animal {

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in Dog");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Running sleep in Dog");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Running walk in Dog");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Running make Sound in Dog");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Running breathe in Dog");
    }
}
