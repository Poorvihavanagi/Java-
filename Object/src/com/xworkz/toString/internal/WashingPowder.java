package com.xworkz.toString.internal;

public class WashingPowder {
    private String brand;
    private int weight;
    private String fragrance;

    public WashingPowder(String brand, int weight, String fragrance) {
        this.brand = brand;
        this.weight = weight;
        this.fragrance = fragrance;
    }

    public String toString() {
        return "WashingPowder{Brand='" + brand + "', Weight=" + weight + "g, Fragrance='" + fragrance + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 907;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof WashingPowder) {
                System.out.println("Ref is WashingPowder, will compare...");
                WashingPowder powder1 = this;
                WashingPowder powder2 = (WashingPowder) obj;
                if (powder1.brand.equals(powder2.brand) && powder1.weight == powder2.weight && powder1.fragrance.equals(powder2.fragrance)) {
                    System.out.println("Both WashingPowders are identical");
                    return true;
                }
            }
        }
        return false;
    }
}