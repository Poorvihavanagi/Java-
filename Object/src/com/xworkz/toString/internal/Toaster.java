package com.xworkz.toString.internal;

public class Toaster {
    private String brand;
    private int slots;
    private String color;

    public Toaster(String brand, int slots, String color) {
        this.brand = brand;
        this.slots = slots;
        this.color = color;
    }

    public String toString() {
        return "Toaster{Brand='" + brand + "', Slots=" + slots + ", Color='" + color + "'}";
    }
}