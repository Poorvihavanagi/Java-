package com.xworkz.toString.internal;

public class Torch {
    private String brand;
    private String batteryType;
    private int lightRange;

    public Torch(String brand, String batteryType, int lightRange) {
        this.brand = brand;
        this.batteryType = batteryType;
        this.lightRange = lightRange;
    }

    public String toString() {
        return "Torch{" + "brand='" + brand + '\'' + ", batteryType='" + batteryType + '\'' + ", lightRange=" + lightRange + '}';
    }
}