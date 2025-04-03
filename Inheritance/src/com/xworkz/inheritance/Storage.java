package com.xworkz.inheritance;

public class Storage extends Box{

    public void open() {
        super.open();
        System.out.println("Opening the storage box...");
    }

    public void close() {
        super.close();
        System.out.println("Closing the storage box...");
    }

    public void storeItems() {
        super.storeItems();
        System.out.println("Storing items securely in the storage box...");
    }

    public void checkContents() {
        super.checkContents();
        System.out.println("Checking the contents of the storage box for safety...");
    }

    public void move() {
        super.move();
        System.out.println("Carefully moving the storage box to another location...");
    }
}