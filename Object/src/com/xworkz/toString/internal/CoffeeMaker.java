package com.xworkz.toString.internal;

public class CoffeeMaker {
    private String brand;
    private int capacityInCups;
    private String brewType;

    public CoffeeMaker(String brand, int capacityInCups, String brewType) {
        this.brand = brand;
        this.capacityInCups = capacityInCups;
        this.brewType = brewType;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{Brand='" + brand + "', Capacity=" + capacityInCups + " cups, Brew Type='" + brewType + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -150;
    }
}
