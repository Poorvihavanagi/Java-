package com.xworkz.toString.internal;

public class PowerBank {
    private String brand;
    private int capacity;
    private int ports;

    public PowerBank(String brand, int capacity, int ports) {
        this.brand = brand;
        this.capacity = capacity;
        this.ports = ports;
    }
    @Override
    public String toString() {
        return "PowerBank{brand='" + brand + "', capacity=" + capacity + "mAh, ports=" + ports + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -123;
    }
}
