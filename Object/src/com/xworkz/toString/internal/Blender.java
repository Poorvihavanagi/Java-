package com.xworkz.toString.internal;

public class Blender {
    private String brand;
    private int powerWatt;
    private String jarMaterial;

    public Blender(String brand, int powerWatt, String jarMaterial) {
        this.brand = brand;
        this.powerWatt = powerWatt;
        this.jarMaterial = jarMaterial;
    }

    @Override
    public String toString() {
        return "Blender{" + "brand='" + brand + ", powerWatt=" + powerWatt + ", jarMaterial='" + jarMaterial + '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -30;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Blender) {
                System.out.println("Ref is Blender, will compare...");
                Blender blender1 = this;
                Blender blender2 = (Blender) obj;
                if (blender1.brand.equals(blender2.brand)) {
                    System.out.println("Both blenders are the same brand");
                    return true;
                }
            }
        }
        return false;
    }

}

