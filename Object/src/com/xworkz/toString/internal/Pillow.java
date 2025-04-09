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
}
