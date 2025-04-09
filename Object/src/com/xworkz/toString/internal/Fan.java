package com.xworkz.toString.internal;

public class Fan {
    private String brand;
    private int speedLevel;
    private int numberOfWings;

    public Fan(String brand, int speedLevel, int numberOfWings) {
        this.brand = brand;
        this.speedLevel = speedLevel;
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return "Fan{Brand='" + brand + "', Speed Level=" + speedLevel + ", Number of Wings=" + numberOfWings + "}";
    }

}
