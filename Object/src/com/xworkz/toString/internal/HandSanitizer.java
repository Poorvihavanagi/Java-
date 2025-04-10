package com.xworkz.toString.internal;

public class HandSanitizer {
    private String brand;
    private int alcoholPercentage;
    private int volume;

    public HandSanitizer(String brand, int alcoholPercentage, int volume) {
        this.brand = brand;
        this.alcoholPercentage = alcoholPercentage;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "HandSanitizer{Brand='" + brand + "', Alcohol=" + alcoholPercentage + "%, Volume=" + volume + "ml}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -310;
    }
}