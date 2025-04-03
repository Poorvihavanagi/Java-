package com.xworkz.inheritance;

public class Cushion extends Bed {
    public void sleep() {
        super.sleep();
        System.out.println("Resting on a soft cushion...");
    }

    public void makeBed() {
        super.makeBed();
        System.out.println("Arranging cushions neatly on the bed...");
    }

    public void checkComfort() {
        super.checkComfort();
        System.out.println("Checking the softness of the cushion...");
    }

    public void fold() {
        super.fold();
        System.out.println("Folding and stacking the cushion...");
    }

    public void move() {
        super.move();
        System.out.println("Moving the cushion to another room...");
    }
}
