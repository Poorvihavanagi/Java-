package com.xworkz.toString.internal;

public class VacuumCleaner {
    private String brand;
    private int power;
    private String type;

    public VacuumCleaner(String brand, int power, String type) {
        this.brand = brand;
        this.power = power;
        this.type = type;
    }

    public String toString() {
        return "VacuumCleaner{Brand='" + brand + "', Power=" + power + "W, Type='" + type + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 197;
    }
}