package com.xworkz.toString.internal;

public class Table {
    private String shape;
    private String material;
    private int height;

    public Table(String shape, String material, int height) {
        this.shape = shape;
        this.material = material;
        this.height = height;
    }

    public String toString() {
        return "Table{Shape='" + shape + "', Material='" + material + "', Height=" + height + "cm}";
    }
}