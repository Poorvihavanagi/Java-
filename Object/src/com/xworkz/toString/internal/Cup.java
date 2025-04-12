package com.xworkz.toString.internal;

public class Cup {
    private String material;
    private int capacity; // in ml
    private String brand;

    public Cup(String material, int capacity, String brand) {
        this.material = material;
        this.capacity = capacity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cup{Material: " + material + ", Capacity: " + capacity + "ml, Brand: " + brand + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -170;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cup) {
                System.out.println("Ref is Cup, will compare...");
                Cup cup1 = this;
                Cup cup2 = (Cup) obj;
                if (cup1.material.equals(cup2.material)) {
                    System.out.println("Both Cups have the same material");
                    return true;
                }
            }
        }
        return false;
    }
}
