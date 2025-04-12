package com.xworkz.toString.internal;

public class Projector {
    private String brand;
    private int lumens;
    private String resolution;

    public Projector(String brand, int lumens, String resolution) {
        this.brand = brand;
        this.lumens = lumens;
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return "Projector{" + "brand='" + brand  + ", Lumens='" + lumens  + ", Resolution=" + resolution + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 583;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Projector) {
                System.out.println("Ref is Projector, will compare...");
                Projector p1 = this;
                Projector p2 = (Projector) obj;
                if (p1.brand.equals(p2.brand) && p1.lumens == p2.lumens && p1.resolution.equals(p2.resolution)) {
                    System.out.println("Both Projectors are identical");
                    return true;
                }
            }
        }
        return false;
    }

}
