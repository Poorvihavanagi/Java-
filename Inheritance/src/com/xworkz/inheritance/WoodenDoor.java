package com.xworkz.inheritance;

public class WoodenDoor extends Door {

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in wooden door...");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in wooden door...");
    }

    @Override
    public void lock() {
        super.lock();
        System.out.println("Running lock in wooden door...");
    }

    @Override
    public void unlock() {
        super.unlock();
        System.out.println("Running unlock in wooden door...");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running check Material in wooden door...");
    }
    public void polish() {
        System.out.println("Running polish in wooden door");
    }
}
