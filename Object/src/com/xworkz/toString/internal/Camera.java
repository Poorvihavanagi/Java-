package com.xworkz.toString.internal;

public class Camera {
    private String brand;
    private int resolution;
    private String lensType;

    public Camera(String brand, int resolution, String lensType) {
        this.brand = brand;
        this.resolution = resolution;
        this.lensType = lensType;
    }
    @Override
    public String toString() {
        return "Camera{Brand='" + brand + "', Resolution=" + resolution + "MP, Lens Type='" + lensType + "'}";
    }
    @Override
    public int hashCode() {
        int original = super.hashCode();
        System.out.println("Default hash code: " + original);
        return -90;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Camera) {
                System.out.println("Ref is Camera, will compare...");
                Camera c1 = this;
                Camera c2 = (Camera) obj;
                if (c1.brand.equals(c2.brand)) {
                    System.out.println("Both Cameras are same brand and resolution");
                    return true;
                }
            }
        }
        return false;
    }
}