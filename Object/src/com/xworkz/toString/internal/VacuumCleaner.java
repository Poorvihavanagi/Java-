package com.xworkz.toString.internal;

public class VacuumCleaner {
    private String brand;
    private int power;
    private String type;

    public VacuumCleaner(String brand, int power, String type) {
        this.brand = brand;
        this.power = power;
        this.type = type;
    }

    public String toString() {
        return "VacuumCleaner{Brand='" + brand + "', Power=" + power + "W, Type='" + type + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 197;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof VacuumCleaner) {
                System.out.println("Ref is VacuumCleaner, will compare...");
                VacuumCleaner vacuum1 = this;
                VacuumCleaner vacuum2 = (VacuumCleaner) obj;
                if (vacuum1.brand.equals(vacuum2.brand) && vacuum1.power == vacuum2.power && vacuum1.type.equals(vacuum2.type)) {
                    System.out.println("Both VacuumCleaners are identical");
                    return true;
                }
            }
        }
        return false;
    }
}