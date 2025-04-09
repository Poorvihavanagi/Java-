package com.xworkz.toString.internal;

public class ShoppingBag {
    private String material;
    private String color;
    private int capacity;

    public ShoppingBag(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }

    public String toString() {
        return "ShoppingBag{Material='" + material + "', Color='" + color + "', Capacity=" + capacity + "kg}";
    }
}