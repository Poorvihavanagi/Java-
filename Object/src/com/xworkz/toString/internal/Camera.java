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

    public String toString() {
        return "Camera{Brand='" + brand + "', Resolution=" + resolution + "MP, Lens Type='" + lensType + "'}";
    }
}