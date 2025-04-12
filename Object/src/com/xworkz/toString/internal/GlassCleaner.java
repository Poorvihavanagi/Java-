package com.xworkz.toString.internal;

public class GlassCleaner {
    private String brand;
    private int volume;
    private String scent;

    public GlassCleaner(String brand, int volume, String scent) {
        this.brand = brand;
        this.volume = volume;
        this.scent = scent;
    }
    @Override
    public String toString() {
        return "GlassCleaner{Brand='" + brand + "', Volume=" + volume + "ml, Scent='" + scent + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -270;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof GlassCleaner) {
                System.out.println("Ref is GlassCleaner, will compare...");
                GlassCleaner gc1 = this;
                GlassCleaner gc2 = (GlassCleaner) obj;
                if (gc1.brand.equals(gc2.brand) && gc1.volume== gc2.volume) {
                    System.out.println("Both GlassCleaners have the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}