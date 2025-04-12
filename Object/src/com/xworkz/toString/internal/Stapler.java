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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Stapler) {
                System.out.println("Ref is Stapler, will compare...");
                Stapler stapler1 = this;
                Stapler stapler2 = (Stapler) obj;
                if (stapler1.brand.equals(stapler2.brand) && stapler1.size.equals(stapler2.size) && stapler1.capacity == stapler2.capacity) {
                    System.out.println("Both staplers are identical");
                    return true;
                }
            }
        }
        return false;
    }
}