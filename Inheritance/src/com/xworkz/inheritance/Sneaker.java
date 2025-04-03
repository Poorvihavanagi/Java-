package com.xworkz.inheritance;

public class Sneaker extends Shoe {
    public void wear() {
        super.wear();
        System.out.println("Wearing sneakers for casual use...");
    }

    public void walk() {
        super.walk();
        System.out.println("Walking comfortably in sneakers...");
    }

    public void remove() {
        super.remove();
        System.out.println("Removing sneakers easily...");
    }

    public void polish() {
        super.polish();
        System.out.println("Cleaning sneakers instead of polishing...");
    }

    public void checkSize() {
        super.checkSize();
        System.out.println("Checking sneaker size for comfort...");
    }
}
