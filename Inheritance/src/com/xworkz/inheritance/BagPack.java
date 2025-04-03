package com.xworkz.inheritance;

public class BagPack extends Bag {

    public void open() {
        super.open();
        System.out.println("Opening the backpack with zippers...");
    }

    public void close() {
        super.close();
        System.out.println("Closing the backpack securely...");
    }

    public void carry() {
        super.carry();
        System.out.println("Carrying the backpack on shoulders...");
    }

    public void checkCapacity() {
        super.checkCapacity();
        System.out.println("Checking the backpack's capacity for school books...");
    }

    public void organizeItems() {
        super.organizeItems();
        System.out.println("Organizing books and laptop inside the backpack...");
    }
}
