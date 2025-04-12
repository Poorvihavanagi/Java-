package com.xworkz.toString.internal;

public class Bag {
    private String brand;
    private String type;
    private double price;

    public Bag(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag{Brand: " + brand + ", Type: " + type + ", Price: " + price + "}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -30;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bag) {
                System.out.println("Ref is bag, will compare...");
                Bag bag1 = this;
                Bag bag2 = (Bag) obj;
                if (bag1.brand.equals(bag2.brand)) {
                    System.out.println("Both Bag are of the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}
