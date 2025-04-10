package com.xworkz.toString.internal;

public class Television {
    private String brand;
    private int size;
    private String type;

    public Television(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public String toString() {
        return "Television{Brand='" + brand + "', Size=" + size + " inch, Type='" + type + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 80;
    }
}