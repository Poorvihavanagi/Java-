package com.xworkz.toString.internal;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{Type: " + type + ", Material: " + material + ", Price: " + price + "}";
    }
}
