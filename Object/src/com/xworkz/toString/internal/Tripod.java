package com.xworkz.toString.internal;

public class Tripod
{
    private String brand;
    private int maxHeight;
    private String material;

    public Tripod(String brand, int maxHeight, String material) {
        this.brand = brand;
        this.maxHeight = maxHeight;
        this.material = material;
    }

    public String toString() {
        return "Tripod{brand='" + brand + "', maxHeight=" + maxHeight + ", material='" + material + "'}";
    }
}
