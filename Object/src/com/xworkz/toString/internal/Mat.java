package com.xworkz.toString.internal;

public class Mat {
    private String material;
    private String color;
    private String size;

    public Mat(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "FloorMat{Material='" + material + "', Color='" + color + "', Size='" + size + "'}";
    }
}
