package com.xworkz.toString.internal;

public class Bucket {
    private String material;
    private int capacity;
    private String color;

    public Bucket(String material, int capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
    }

    public String toString() {
        return "Bucket{Material='" + material + "', Capacity=" + capacity + "L, Color='" + color + "'}";
    }
}