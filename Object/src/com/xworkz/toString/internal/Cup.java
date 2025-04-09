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
}
