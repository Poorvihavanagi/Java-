package com.xworkz.toString.internal;

public class Chappal {
    private String brand;
    private String size;
    private String material;

    public Chappal(String brand, String size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }
    @Override
    public String toString() {
        return "Chappal{Brand='" + brand + "', Size='" + size + "', Material='" + material + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -110;
    }
}
