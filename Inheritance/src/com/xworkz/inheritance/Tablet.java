package com.xworkz.inheritance;

public class Tablet extends Medicine {
    public void consume() {
        super.consume();
        System.out.println("Swallowing the tablet with water...");
    }

    public void store() {
        super.store();
        System.out.println("Keeping tablets in a blister pack...");
    }

    public void checkExpiry() {
        super.checkExpiry();
        System.out.println("Verifying if the tablet is expired...");
    }

    public void prescribe() {
        super.prescribe();
        System.out.println("Doctor prescribes tablets for quick recovery...");
    }

    public void manufacture() {
        super.manufacture();
        System.out.println("Manufacturing tablets using precise formulation...");
    }
}
