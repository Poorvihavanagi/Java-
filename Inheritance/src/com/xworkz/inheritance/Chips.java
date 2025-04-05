package com.xworkz.inheritance;

public class Chips extends Snack {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Running prepare in Chips");
    }

    @Override
    public void pack() {
        super.pack();
        System.out.println("Running pack in Chips");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in Chips");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in Chips");
    }

    @Override
    public void enjoy() {
        super.enjoy();
        System.out.println("Running enjoy in Chips");
    }
}
