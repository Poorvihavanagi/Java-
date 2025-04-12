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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mirror) {
                System.out.println("Ref is Mirror, will compare...");
                Mirror m1 = this;
                Mirror m2 = (Mirror) obj;
                if (m1.shape.equals(m2.shape) && m1.heightInInches == m2.heightInInches) {
                    System.out.println("Both Mirrors are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
