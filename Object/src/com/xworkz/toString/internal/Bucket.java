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
    @Override
    public String toString() {
        return "Bucket{Material='" + material + "', Capacity=" + capacity + "L, Color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -60;
    }
}