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

    public String toString() {
        return "HandSanitizer{Brand='" + brand + "', Alcohol=" + alcoholPercentage + "%, Volume=" + volume + "ml}";
    }
}