package com.xworkz.toString.internal;

public class Bottle {
    private String type;
    private int capacity;
    private String brand;

    public Bottle(String type, int capacity, String brand) {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Bottle{Type='" + type + "', Capacity=" + capacity + "ml, Brand='" + brand + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -40;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bottle) {
                System.out.println("Ref is Bottle, will compare...");
                Bottle bottle1 = this;
                Bottle bottle2 = (Bottle) obj;
                if (bottle1.brand.equals(bottle2.brand)) {
                    System.out.println("Both bottles are the same brand");
                    return true;
                }
            }
        }
        return false;
    }

}