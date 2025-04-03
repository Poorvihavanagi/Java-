package com.xworkz.inheritance;

public class Doll extends Toy {
    public void play() {
        super.play();
        System.out.println("Playing with the doll...");
    }

    public void display() {
        super.display();
        System.out.println("Displaying the doll...");
    }

    public void clean() {
        super.clean();
        System.out.println("Cleaning the doll...");
    }

    public void repair() {
        super.repair();
        System.out.println("Repairing the doll...");
    }

    public void pack() {
        super.pack();
        System.out.println("Packing the doll...");
    }
}
