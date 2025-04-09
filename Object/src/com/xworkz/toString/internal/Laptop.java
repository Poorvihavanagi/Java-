package com.xworkz.toString.internal;

public class Laptop {
    private String brand;
    private String processor;
    private int ram;

    public Laptop(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public String toString() {
        return "Laptop{Brand='" + brand + "', Processor='" + processor + "', RAM=" + ram + "GB}";
    }
}