package com.xworkz.toString.internal;

public class Sunglasses {
    private String frameMaterial;
    private String lensColor;
    private String uvProtectionLevel;

    public Sunglasses(String frameMaterial, String lensColor, String uvProtectionLevel) {
        this.frameMaterial = frameMaterial;
        this.lensColor = lensColor;
        this.uvProtectionLevel = uvProtectionLevel;
    }

    @Override
    public String toString() {
        return "Sunglasses{Frame Material='" + frameMaterial + "', Lens Color='" + lensColor + "', UV Protection='" + uvProtectionLevel + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 7;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sunglasses) {
                System.out.println("Ref is Sunglasses, will compare...");
                Sunglasses s1 = this;
                Sunglasses s2 = (Sunglasses) obj;
                if (s1.frameMaterial.equals(s2.frameMaterial) &&
                        s1.lensColor.equals(s2.lensColor) &&
                        s1.uvProtectionLevel.equals(s2.uvProtectionLevel)) {
                    System.out.println("Both sunglasses are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
