package com.xworkz.toString.internal;

public class HairDryer {
    private String brand;
    private int power;
    private String color;

    public HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }
    @Override
    public String toString() {
        return "HairDryer{brand='" + brand + "', power=" + power + "W, color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -300;
    }
}
