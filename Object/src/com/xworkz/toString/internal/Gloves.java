package com.xworkz.toString.internal;

public class Gloves {
    private String material;
    private String size;
    private String usageType;

    public Gloves(String material, String size, String usageType) {
        this.material = material;
        this.size = size;
        this.usageType = usageType;
    }
    @Override
    public String toString() {
        return "Gloves{material='" + material + "', size='" + size + "', usageType='" + usageType + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -280;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Gloves) {
                System.out.println("Ref is Gloves, will compare...");
                Gloves gloves1 = this;
                Gloves gloves2 = (Gloves) obj;
                if (gloves1.material.equals(gloves1.material) && gloves2.size.equals(gloves1.size)) {
                    System.out.println("Both Gloves have the same material");
                    return true;
                }
            }
        }
        return false;
    }
}
