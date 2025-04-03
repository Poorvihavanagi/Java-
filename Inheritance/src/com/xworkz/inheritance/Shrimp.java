package com.xworkz.inheritance;

public class Shrimp extends SeaFood {
    public void cook() {
        super.cook();
        System.out.println("Cooking shrimp with butter and garlic...");
    }

    public void eat() {
        super.eat();
        System.out.println("Eating shrimp with sauce...");
    }

    public void store() {
        super.store();
        System.out.println("Keeping shrimp in ice to maintain freshness...");
    }

    public void checkFreshness() {
        super.checkFreshness();
        System.out.println("Checking if shrimp smells fresh...");
    }

    public void season() {
        super.season();
        System.out.println("Seasoning shrimp with lemon and herbs...");
    }
}
