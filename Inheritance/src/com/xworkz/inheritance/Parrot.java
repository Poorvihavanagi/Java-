package com.xworkz.inheritance;

public class Parrot extends Bird {

    @Override
    public void fly() {
        super.fly();
        System.out.println("Running fly in parrot...");
    }

    @Override
    public void sing() {
        super.sing();
        System.out.println("Running sing in parrot...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in parrot...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Running sleep in parrot...");
    }

    @Override
    public void buildNest() {
        super.buildNest();
        System.out.println("Running build nest in parrot...");
    }

    public void layEggs(){
        System.out.println("Running birds laying eggs in parrot");
    }
}
