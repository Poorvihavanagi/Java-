package com.xworkz.inheritance;

public class Ant extends Insect{

    public void description() {
        super.description();
        System.out.println("Ants are social insects known for living in large colonies.");
    }

    public void move() {
        super.move();
        System.out.println("Ants move in coordinated lines.");
    }

    public void sound() {
        super.sound();
        System.out.println("Ants are generally silent but may communicate through pheromones.");
    }

    public void food() {
        super.food();
        System.out.println("Ants feed on a variety of food, including sugars, proteins, and other organic material.");
    }

    public void habitat() {
        super.habitat();
        System.out.println("Ants are found in nests that they build underground or within structures.");
    }
}

