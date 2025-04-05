package com.xworkz.inheritance;

public class Container extends Bottle {

    @Override
    public void fill() {
        super.fill();
        System.out.println("Running fill in container");
    }

    @Override
    public void pour() {
        super.pour();
        System.out.println("Running pour in container");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in container");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in container");
    }

    @Override
    public void shake() {
        super.shake();
        System.out.println("Running shake in container");
    }
}
