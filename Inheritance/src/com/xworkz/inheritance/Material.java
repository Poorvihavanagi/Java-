package com.xworkz.inheritance;

public class Material extends Book {

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in material...");
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Running read in material...");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in material...");
    }

    @Override
    public void bookmark() {
        super.bookmark();
        System.out.println("Running bookmark in material...");
    }

    @Override
    public void checkPages() {
        super.checkPages();
        System.out.println("Running checkPages in material...");
    }
}
