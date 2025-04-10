package com.xworkz.toString.internal;

public class Guitar {
    private String type;
    private int numberOfStrings;
    private String brand;

    public Guitar(String type, int numberOfStrings, String brand) {
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Guitar{" + "type='" + type + '\'' + ", numberOfStrings=" + numberOfStrings + ", brand='" + brand + '\'' + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -290;
    }
}