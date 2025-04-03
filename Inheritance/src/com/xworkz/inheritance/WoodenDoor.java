package com.xworkz.inheritance;

public class WoodenDoor extends Door{
    public void open() {
        super.open();
        System.out.println("Opening the wooden door...");
    }

    public void close() {
        super.close();
        System.out.println("Closing the wooden door...");
    }

    public void lock() {
        super.lock();
        System.out.println("Locking the wooden door...");
    }

    public void unlock() {
        super.unlock();
        System.out.println("Unlocking the wooden door...");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("The door is made of wood...");
    }
}
