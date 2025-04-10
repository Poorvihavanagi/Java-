package com.xworkz.toString.internal;

public class Cushion {
    private String color;
    private String shape;
    private String fabric;

    public Cushion(String color, String shape, String fabric) {
        this.color = color;
        this.shape = shape;
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Cushion{color='" + color + "', shape='" + shape + "', fabric='" + fabric + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -190;
    }
}
