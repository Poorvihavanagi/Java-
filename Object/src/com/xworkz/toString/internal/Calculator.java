package com.xworkz.toString.internal;

public class Calculator {
    private String brand;
    private String displayType;
    private String batteryType;

    public Calculator(String brand, String displayType, String batteryType) {
        this.brand = brand;
        this.displayType = displayType;
        this.batteryType = batteryType;
    }
    @Override
    public String toString() {
        return "Calculator{" + "brand='" + brand + '\'' + ", displayType='" + displayType + '\'' + ", batteryType='" + batteryType + '\'' + '}';
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -70;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Calculator) {
                System.out.println("Ref is Calculator, will compare...");
                Calculator calc1 = this;
                Calculator calc2 = (Calculator) obj;
                if (calc1.brand.equals(calc2.brand)) {
                    System.out.println("Both calculators are of the same brand");
                    return true;
                }
            }
        }
        return false;
    }

}