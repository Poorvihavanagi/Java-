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
}
