package com.xworkz.toString.internal;

public class Tripod
{
    private String brand;
    private int maxHeight;
    private String material;

    public Tripod(String brand, int maxHeight, String material) {
        this.brand = brand;
        this.maxHeight = maxHeight;
        this.material = material;
    }

    public String toString() {
        return "Tripod{brand='" + brand + "', maxHeight=" + maxHeight + ", material='" + material + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 987;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Tripod) {
                System.out.println("Ref is Tripod, will compare...");
                Tripod tripod1 = this;
                Tripod tripod2 = (Tripod) obj;
                if (tripod1.maxHeight == tripod2.maxHeight && tripod1.brand.equals(tripod2.brand) && tripod1.material.equals(tripod2.material)) {
                    System.out.println("Both Tripods are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
