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
}
