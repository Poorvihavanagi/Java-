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
    @Override
    public String toString() {
        return "Soap{Brand='" + brand + "', Scent='" + scent + "', Weight=" + weight + "g}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 55;
    }
}