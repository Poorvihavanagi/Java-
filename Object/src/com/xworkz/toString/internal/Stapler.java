package com.xworkz.toString.internal;

public class Stapler {
    private String brand;
    private String size;
    private int capacity;

    public Stapler(String brand, String size, int capacity) {
        this.brand = brand;
        this.size = size;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Stapler{Brand='" + brand + "', Size='" + size + "', Capacity=" + capacity + " staples}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 39;
    }
}