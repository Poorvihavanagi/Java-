package com.xworkz.inheritance;

public class Storage extends Box {

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in storage");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in storage");
    }

    @Override
    public void storeItems() {
        super.storeItems();
        System.out.println("Running storeItems in storage");
    }

    @Override
    public void checkContents() {
        super.checkContents();
        System.out.println("Running checkContents in storage");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Running move in storage");
    }
}
