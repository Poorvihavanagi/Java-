
package com.xworkz.inheritance;

public class Chips extends Snack {
    public void prepare() {
        super.prepare();
        System.out.println("Cutting potatoes and frying them to make chips...");
    }
    public void pack() {
        super.pack();
        System.out.println("Packing the chips in airtight packets...");
    }

    public void open() {
        super.open();
        System.out.println("Tearing open the chips packet...");
    }
    public void eat() {
        super.eat();
        System.out.println("Crunching on the crispy chips...");
    }

    public void enjoy() {
        super.enjoy();
        System.out.println("Enjoying the tasty chips with friends...");
    }
}
