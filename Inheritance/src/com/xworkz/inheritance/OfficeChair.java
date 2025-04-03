package com.xworkz.inheritance;

public class OfficeChair extends Chair {
    public void sit() {
        super.sit();
        System.out.println("Sitting comfortably on the office chair with back support...");
    }

    public void move() {
        super.move();
        System.out.println("Rolling the office chair on wheels...");
    }


    public void fold() {
        super.fold();
        System.out.println("Folding the office chair for storage...");
    }


    public void adjustHeight() {
        super.adjustHeight();
        System.out.println("Adjusting the height of the office chair with a lever...");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the office chair is made of leather or mesh...");
    }
}
