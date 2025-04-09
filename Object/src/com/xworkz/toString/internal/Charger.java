package com.xworkz.toString.internal;

public class Charger {
    private String type;
    private int output;
    private String brand;

    public Charger(String type, int output, String brand) {
        this.type = type;
        this.output = output;
        this.brand = brand;
    }

    public String toString() {
        return "Charger{type='" + type + "', output=" + output + "W, brand='" + brand + "'}";
    }
}
