package com.xworkz.inheritance;

public class Ant extends Insect {

    @Override
    public void description() {
        super.description();
        System.out.println("Running description in Ant");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Running move in Ant");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Running sound in Ant");
    }

    @Override
    public void food() {
        super.food();
        System.out.println("Running food in Ant");
    }

    @Override
    public void habitat() {
        super.habitat();
        System.out.println("Running habitat in Ant");
    }
}
