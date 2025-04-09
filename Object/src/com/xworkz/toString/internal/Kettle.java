package com.xworkz.toString.internal;

public class Kettle {
    private double capacityInLiters;
    private String brand;
    private String material;

    public Kettle(double capacityInLiters, String brand, String material) {
        this.capacityInLiters = capacityInLiters;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Kettle{Capacity=" + capacityInLiters + "L, Brand='" + brand + "', Material='" + material + "'}";
    }
}
