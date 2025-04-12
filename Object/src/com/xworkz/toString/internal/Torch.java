package com.xworkz.toString.internal;

public class Torch {
    private String brand;
    private String batteryType;
    private int lightRange;

    public Torch(String brand, String batteryType, int lightRange) {
        this.brand = brand;
        this.batteryType = batteryType;
        this.lightRange = lightRange;
    }

    public String toString() {
        return "Torch{" + "brand='" + brand + '\'' + ", batteryType='" + batteryType + '\'' + ", lightRange=" + lightRange + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 197;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Torch) {
                System.out.println("Ref is Torch, will compare...");
                Torch torch1 = this;
                Torch torch2 = (Torch) obj;
                if (torch1.brand.equals(torch2.brand) && torch1.batteryType.equals(torch2.batteryType) && torch1.lightRange == torch2.lightRange) {
                    System.out.println("Both torches are identical");
                    return true;
                }
            }
        }
        return false;
    }
}