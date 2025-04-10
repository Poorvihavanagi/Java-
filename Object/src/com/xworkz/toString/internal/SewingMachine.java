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
    @Override
    public String toString() {
        return "SewingMachine{" + "brand='" + brand + '\'' + ", stitchType='" + stitchType + '\'' + ", motorPower=" + motorPower + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 45;
    }
}