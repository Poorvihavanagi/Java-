package com.xworkz.inheritance;

public class Toothpaste extends Product {
    public void use() {
        super.use();
        System.out.println("Using the toothpaste for brushing...");
    }

    public void checkExpiry() {
        super.checkExpiry();
        System.out.println("Checking the expiry date of the toothpaste...");
    }

    public void apply() {
        super.apply();
        System.out.println("Applying the toothpaste on the toothbrush...");
    }

    public void store() {
        super.store();
        System.out.println("Storing the toothpaste in a cool, dry place...");
    }

    public void dispose() {
        super.dispose();
        System.out.println("Disposing of the empty toothpaste tube properly...");
    }
}
