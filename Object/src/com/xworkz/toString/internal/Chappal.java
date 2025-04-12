package com.xworkz.toString.internal;

public class Chappal {
    private String brand;
    private String size;
    private String material;

    public Chappal(String brand, String size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }
    @Override
    public String toString() {
        return "Chappal{Brand='" + brand + "', Size='" + size + "', Material='" + material + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -110;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chappal) {
                System.out.println("Ref is Chappal, will compare...");
                Chappal ch1 = this;
                Chappal ch2 = (Chappal) obj;
                if (ch1.brand.equals(ch2.brand)) {
                    System.out.println("Both Chappals have the same brand");
                    return true;
                }
            }
        }
        return false;
    }

}
