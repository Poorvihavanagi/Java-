package com.xworkz.toString.internal;

public class Calculator {
    private String brand;
    private String displayType;
    private String batteryType;

    public Calculator(String brand, String displayType, String batteryType) {
        this.brand = brand;
        this.displayType = displayType;
        this.batteryType = batteryType;
    }

    public String toString() {
        return "Calculator{" + "brand='" + brand + '\'' + ", displayType='" + displayType + '\'' + ", batteryType='" + batteryType + '\'' + '}';
    }
}