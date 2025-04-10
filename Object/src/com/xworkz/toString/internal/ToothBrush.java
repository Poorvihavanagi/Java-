package com.xworkz.toString.internal;

public class ToothBrush {
    private String shape;
    private String handleGrip;
    private String brushHeadSize;

    public ToothBrush(String shape, String handleGrip, String brushHeadSize) {
        this.shape = shape;
        this.handleGrip = handleGrip;
        this.brushHeadSize = brushHeadSize;
    }

    @Override
    public String toString() {
        return "Toothbrush{" + "Bristle Shape='" + shape + '\'' + ", Handle Grip='" + handleGrip + '\'' + ", Brush Head Size='" + brushHeadSize + '\'' + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 979;
    }
}
