package com.xworkz.toString.internal;

public class Helmet
{
    private String brand;
    private String size;
    private String color;

    public Helmet(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Helmet{Brand='" + brand + "', Size='" + size + "', Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -320;
    }
}
