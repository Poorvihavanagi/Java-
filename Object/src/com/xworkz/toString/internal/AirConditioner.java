package com.xworkz.toString.internal;

public class AirConditioner {
    private String brand;
    private double tonnage;
    private String coolingTechnology;

    public AirConditioner(String brand, double tonnage, String coolingTechnology) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.coolingTechnology = coolingTechnology;
    }

    @Override
    public String toString() {
        return "AirConditioner{Brand='" + brand + "', Tonnage=" + tonnage + "T, Cooling Technology='" + coolingTechnology + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " +super.hashCode());
        return -89;
    }
}
