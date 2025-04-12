package com.xworkz.toString.internal;

public class Thermos {
    private String brand;
    private int capacity;
    private String color;

    public Thermos(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public String toString() {
        return "Thermos{Brand='" + brand + "', Capacity=" + capacity + "ml, Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 27;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Thermos) {
                System.out.println("Ref is Thermos, will compare...");
                Thermos thermos1 = this;
                Thermos thermos2 = (Thermos) obj;
                if (thermos1.brand.equals(thermos2.brand) && thermos1.capacity == thermos2.capacity && thermos1.color.equals(thermos2.color)) {
                    System.out.println("Both thermoses are identical");
                    return true;
                }
            }
        }
        return false;
    }
}