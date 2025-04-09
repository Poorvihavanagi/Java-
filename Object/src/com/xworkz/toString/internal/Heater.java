package com.xworkz.toString.internal;

public class Heater
{
    private String brand;
    private int heatingPower;
    private String controlType;

    public Heater(String brand, int heatingPower, String controlType) {
        this.brand = brand;
        this.heatingPower = heatingPower;
        this.controlType = controlType;
    }

    public String toString() {
        return "RoomHeater{brand='" + brand + "', heatingPower=" + heatingPower + "W, controlType='" + controlType + "'}";
    }
}
