package com.xworkz.toString.internal;

public class IronBox {
    private String brand;
    private int wattage;
    private String color;

    public IronBox(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "IronBox{Brand='" + brand + "', Wattage=" + wattage + "W, Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -340;
    }
}
