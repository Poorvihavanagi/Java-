package com.xworkz.inheritance;

public class Furniture extends Table {

    @Override
    public void placeObject() {
        super.placeObject();
        System.out.println("Running placeObject in furniture...");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in furniture...");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold in furniture...");
    }

    @Override
    public void adjustHeight() {
        super.adjustHeight();
        System.out.println("Running adjustHeight in furniture...");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Running move in furniture...");
    }
}
