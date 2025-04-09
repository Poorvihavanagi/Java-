package com.xworkz.toString.internal;

public class SewingMachine {
    private String brand;
    private String stitchType;
    private int motorPower;

    public SewingMachine(String brand, String stitchType, int motorPower) {
        this.brand = brand;
        this.stitchType = stitchType;
        this.motorPower = motorPower;
    }

    public String toString() {
        return "SewingMachine{" + "brand='" + brand + '\'' + ", stitchType='" + stitchType + '\'' + ", motorPower=" + motorPower + '}';
    }
}