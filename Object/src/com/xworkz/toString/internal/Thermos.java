package com.xworkz.toString.internal;

public class Thermos {
    private String brand;
    private int capacity;
    private String color;

    public Thermos(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public String toString() {
        return "Thermos{Brand='" + brand + "', Capacity=" + capacity + "ml, Color='" + color + "'}";
    }
}