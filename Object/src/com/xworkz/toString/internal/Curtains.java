package com.xworkz.toString.internal;

public class Curtains {
    private String fabricType;
    private int lengthInInches;
    private String colorPattern;

    public Curtains(String fabricType, int lengthInInches, String colorPattern) {
        this.fabricType = fabricType;
        this.lengthInInches = lengthInInches;
        this.colorPattern = colorPattern;
    }

    @Override
    public String toString() {
        return "Curtains{Fabric='" + fabricType + "', Length=" + lengthInInches + "in, Pattern='" + colorPattern + "'}";
    }
}
