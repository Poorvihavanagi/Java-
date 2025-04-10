package com.xworkz.toString.internal;

public class MeasuringTape {
    private String brand;
    private int length;
    private String unit;

    public MeasuringTape(String brand, int length, String unit) {
        this.brand = brand;
        this.length = length;
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "MeasuringTape{Brand='" + brand + "', Length=" + length + unit + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 580;
    }
}