package com.xworkz.toString.internal;

public class Chair {
    private String material;
    private String color;
    private int height;

    public Chair(String material, String color, int height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    public String toString() {
        return "Chair{Material='" + material + "', Color='" + color + "', Height=" + height + "}";
    }
}
