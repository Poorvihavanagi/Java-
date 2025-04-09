package com.xworkz.toString.internal;

public class Towel {
    private String material;
    private String size;
    private String color;

    public Towel(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Towel{Material='" + material + "', Size='" + size + "', Color='" + color + "'}";
    }
}