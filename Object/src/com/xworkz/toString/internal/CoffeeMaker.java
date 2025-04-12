package com.xworkz.toString.internal;

public class CoffeeMaker {
    private String brand;
    private int capacityInCups;
    private String brewType;

    public CoffeeMaker(String brand, int capacityInCups, String brewType) {
        this.brand = brand;
        this.capacityInCups = capacityInCups;
        this.brewType = brewType;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{Brand='" + brand + "', Capacity=" + capacityInCups + " cups, Brew Type='" + brewType + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -150;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof CoffeeMaker) {
                System.out.println("Ref is CoffeeMaker, will compare...");
                CoffeeMaker cm1 = this;
                CoffeeMaker cm2 = (CoffeeMaker) obj;
                if (cm1.brand.equals(cm2.brand)) {
                    System.out.println("Both CoffeeMakers have the same brand");
                    return true;
                }
            }
        }
        return false;
    }

}
