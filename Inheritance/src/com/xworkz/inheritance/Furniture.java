package com.xworkz.inheritance;

public class Furniture extends Table
{
    public void placeObject() {
        super.placeObject();
        System.out.println("Placing an object on the wooden table...");
    }
    public void clean() {
        super.clean();
        System.out.println("Cleaning the wooden table with polish...");
    }
    public void fold() {
        super.fold();
        System.out.println("Folding the wooden table carefully...");
    }
    public void adjustHeight() {
        super.adjustHeight();
        System.out.println("Adjusting the height of the wooden table...");
    }
    public void move() {
        super.move();
        System.out.println("Moving the wooden table with care...");
    }
}
