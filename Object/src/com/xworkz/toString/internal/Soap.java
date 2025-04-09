package com.xworkz.toString.internal;

public class Soap {
    private String brand;
    private String scent;
    private int weight;

    public Soap(String brand, String scent, int weight) {
        this.brand = brand;
        this.scent = scent;
        this.weight = weight;
    }

    public String toString() {
        return "Soap{Brand='" + brand + "', Scent='" + scent + "', Weight=" + weight + "g}";
    }
}