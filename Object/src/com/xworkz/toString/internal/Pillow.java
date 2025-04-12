package com.xworkz.toString.internal;

public class Pillow {
    private String fillMaterial;
    private String sizeInInches;
    private String firmnessLevel;

    public Pillow(String fillMaterial, String sizeInInches, String firmnessLevel) {
        this.fillMaterial = fillMaterial;
        this.sizeInInches = sizeInInches;
        this.firmnessLevel = firmnessLevel;
    }

    @Override
    public String toString() {
        return "Pillow{Fill Material='" + fillMaterial + "', Size='" + sizeInInches + "', Firmness='" + firmnessLevel + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -760;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pillow) {
                System.out.println("Ref is Pillow, will compare...");
                Pillow p1 = this;
                Pillow p2 = (Pillow) obj;
                if (p1.fillMaterial.equals(p2.fillMaterial) && p1.sizeInInches.equals(p2.sizeInInches) && p1.firmnessLevel.equals(p2.firmnessLevel)) {
                    System.out.println("Both Pillows are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
