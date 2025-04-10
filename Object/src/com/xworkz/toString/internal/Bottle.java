package com.xworkz.toString.internal;

public class Bottle {
    private String type;
    private int capacity;
    private String brand;

    public Bottle(String type, int capacity, String brand) {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Bottle{Type='" + type + "', Capacity=" + capacity + "ml, Brand='" + brand + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -40;
    }
}