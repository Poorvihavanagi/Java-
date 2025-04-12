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

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -180;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Curtains) {
                System.out.println("Ref is Curtains, will compare...");
                Curtains curtain1 = this;
                Curtains curtain2 = (Curtains) obj;
                if (curtain1.fabricType.equals(curtain2.fabricType)) {
                    System.out.println("Both Curtains have the same fabric type");
                    return true;
                }
            }
        }
        return false;
    }
}
