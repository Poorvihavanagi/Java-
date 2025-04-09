package com.xworkz.toString.internal;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String toString() {
        return "Watch{Brand='" + brand + "', Type='" + type + "', Price=" + price + "}";
    }
}