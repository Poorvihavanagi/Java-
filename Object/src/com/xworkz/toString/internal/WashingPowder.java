package com.xworkz.toString.internal;

public class WashingPowder {
    private String brand;
    private int weight;
    private String fragrance;

    public WashingPowder(String brand, int weight, String fragrance) {
        this.brand = brand;
        this.weight = weight;
        this.fragrance = fragrance;
    }

    public String toString() {
        return "WashingPowder{Brand='" + brand + "', Weight=" + weight + "g, Fragrance='" + fragrance + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 907;
    }
}