package com.xworkz.toString.internal;

public class Kettle {
    private double capacityInLiters;
    private String brand;
    private String material;

    public Kettle(double capacityInLiters, String brand, String material) {
        this.capacityInLiters = capacityInLiters;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Kettle{Capacity=" + capacityInLiters + "L, Brand='" + brand + "', Material='" + material + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -370;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Kettle) {
                System.out.println("Ref is Kettle, will compare...");
                Kettle kettle1 = this;
                Kettle kettle2 = (Kettle) obj;
                if (kettle1.capacityInLiters == kettle2.capacityInLiters && kettle1.brand.equals(kettle2.brand) ) {
                    System.out.println("Both Kettles are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
