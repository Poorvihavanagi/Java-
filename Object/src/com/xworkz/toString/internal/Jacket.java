package com.xworkz.toString.internal;

public class Jacket {
    private String material;
    private String size;
    private String closureType;

    public Jacket(String material, String size, String closureType) {
        this.material = material;
        this.size = size;
        this.closureType = closureType;
    }

    @Override
    public String toString() {
        return "Jacket{Material='" + material + "', Size='" + size + "', Closure='" + closureType + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -350;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Jacket) {
                System.out.println("Ref is Jacket, will compare...");
                Jacket jacket1 = this;
                Jacket jacket2 = (Jacket) obj;
                if (jacket1.material.equals(jacket2.material) && jacket1.size.equals(jacket2.size) ) {
                    System.out.println("Both Jackets are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
