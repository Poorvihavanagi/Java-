package com.xworkz.toString.internal;

public class Clothing {
    private String brand;
    private String category;
    private double price;

    public Clothing(String brand, String category, double price) {
        this.brand = brand;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{Brand: " + brand + ", Category: " + category + ", Price: " + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -140;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Clothing) {
                System.out.println("Ref is Clothing, will compare...");
                Clothing c1 = this;
                Clothing c2 = (Clothing) obj;
                if (c1.brand.equals(c2.brand)) {
                    System.out.println("Both Clothing items have the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}
