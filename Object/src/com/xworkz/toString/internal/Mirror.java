package com.xworkz.toString.internal;

public class Mirror {
    private String shape;
    private double heightInInches;
    private boolean isWallMounted;

    public Mirror(String shape, double heightInInches, boolean isWallMounted) {
        this.shape = shape;
        this.heightInInches = heightInInches;
        this.isWallMounted = isWallMounted;
    }

    @Override
    public String toString() {
        return "Mirror{Shape='" + shape + "', Height=" + heightInInches + " inches, Wall Mounted=" + isWallMounted + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -600;
    }
}
