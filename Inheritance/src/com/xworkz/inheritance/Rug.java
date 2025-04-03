package com.xworkz.inheritance;

public class Rug extends Mat {
    public void place() {
        super.place();
        System.out.println("Placing the rug on the wooden floor...");
    }

    public void clean() {
        super.clean();
        System.out.println("Vacuuming the rug to remove dust...");
    }
    public void rollUp() {
        super.rollUp();
        System.out.println("Rolling up the rug for storage...");
    }
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the rug is made of wool or cotton...");
    }
    public void move() {
        super.move();
        System.out.println("Moving the rug to a different room...");
    }
}
