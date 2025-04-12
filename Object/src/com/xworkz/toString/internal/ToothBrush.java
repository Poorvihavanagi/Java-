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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof ToothBrush) {
                System.out.println("Ref is ToothBrush, will compare...");
                ToothBrush brush1 = this;
                ToothBrush brush2 = (ToothBrush) obj;
                if (brush1.shape.equals(brush2.shape) && brush1.handleGrip.equals(brush2.handleGrip) && brush1.brushHeadSize.equals(brush2.brushHeadSize)) {
                    System.out.println("Both toothbrushes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
