package com.xworkz.toString.internal;

public class Clothing {
    private String brand;
    private String category;
    private double price;

    public Clothing(String brand, String category, double price) {
        this.brand = brand;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{Brand: " + brand + ", Category: " + category + ", Price: " + price + "}";
    }
}
