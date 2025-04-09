package com.xworkz.toString.internal;

public class DeskOrganizer {
    private String type;
    private int compartments;
    private String material;

    public DeskOrganizer(String type, int compartments, String material) {
        this.type = type;
        this.compartments = compartments;
        this.material = material;
    }

    public String toString() {
        return "DeskOrganizer{Type='" + type + "', Compartments=" + compartments + ", Material='" + material + "'}";
    }
}