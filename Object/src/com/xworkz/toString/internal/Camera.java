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
}