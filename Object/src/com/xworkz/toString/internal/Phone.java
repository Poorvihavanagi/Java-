package com.xworkz.toString.internal;

public class Phone {
    private String brand;
    private String model;
    private int storage;

    public Phone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    public String toString() {
        return "Phone{Brand='" + brand + "', Model='" + model + "', Storage=" + storage + "GB}";
    }
}