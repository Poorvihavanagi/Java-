package com.xworkz.toString.internal;

public class Stapler {
    private String brand;
    private String size;
    private int capacity;

    public Stapler(String brand, String size, int capacity) {
        this.brand = brand;
        this.size = size;
        this.capacity = capacity;
    }

    public String toString() {
        return "Stapler{Brand='" + brand + "', Size='" + size + "', Capacity=" + capacity + " staples}";
    }
}