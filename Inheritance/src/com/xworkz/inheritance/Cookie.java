package com.xworkz.inheritance;

public class Cookie extends Baked {
    public void prepare() {
        super.prepare();
        System.out.println("Mixing flour, sugar, butter, and chocolate chips...");
    }

    public void bake() {
        super.bake();
        System.out.println("Baking cookies at 180°C for 15 minutes...");
    }

    public void coolDown() {
        super.coolDown();
        System.out.println("Letting cookies cool down before eating...");
    }

    public void pack() {
        super.pack();
        System.out.println("Packing cookies in an airtight container...");
    }

    public void serve() {
        super.serve();
        System.out.println("Serving warm cookies with milk...");
    }
}
