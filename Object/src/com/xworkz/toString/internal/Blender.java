package com.xworkz.toString.internal;

public class Blender {
    private String brand;
    private int powerWatt;
    private String jarMaterial;

    public Blender(String brand, int powerWatt, String jarMaterial) {
        this.brand = brand;
        this.powerWatt = powerWatt;
        this.jarMaterial = jarMaterial;
    }

    public String toString() {
        return "Blender{" + "brand='" + brand + '\'' + ", powerWatt=" + powerWatt + ", jarMaterial='" + jarMaterial + '\'' + '}';
    }
}
