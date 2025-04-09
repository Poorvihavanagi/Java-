package com.xworkz.toString.internal;

public class Scissors {
    private String brand;
    private String type;
    private int length;

    public Scissors(String brand, String type, int length) {
        this.brand = brand;
        this.type = type;
        this.length = length;
    }

    public String toString() {
        return "Scissors{Brand='" + brand + "', Type='" + type + "', Length=" + length + "cm}";
    }
}