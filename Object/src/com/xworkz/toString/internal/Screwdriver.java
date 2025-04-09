package com.xworkz.toString.internal;

public class Screwdriver {
    private String type;
    private String handleMaterial;
    private double length;

    public Screwdriver(String type, String handleMaterial, double length) {
        this.type = type;
        this.handleMaterial = handleMaterial;
        this.length = length;
    }

    public String toString() {
        return "Screwdriver{Type='" + type + "', HandleMaterial='" + handleMaterial + "', Length=" + length + "cm}";
    }
}