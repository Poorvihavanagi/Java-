package com.xworkz.toString.internal;

public class Remote {
    private String deviceType;
    private String brand;
    private int range;

    public Remote(String deviceType, String brand, int range) {
        this.deviceType = deviceType;
        this.brand = brand;
        this.range = range;
    }
    @Override
    public String toString() {
        return "Remote{deviceType='" + deviceType + "', brand='" + brand + "', range=" + range + " meters}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 999;
    }
}
