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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof PowerBank) {
                System.out.println("Ref is PowerBank, will compare...");
                PowerBank pb1 = this;
                PowerBank pb2 = (PowerBank) obj;
                if (pb1.brand.equals(pb2.brand) &&
                        pb1.capacity == pb2.capacity &&
                        pb1.ports == pb2.ports) {
                    System.out.println("Both PowerBanks are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
