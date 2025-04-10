package com.xworkz.toString.internal;

public class Blanket {
    private String color;
    private double thickness;
    private boolean washable;

    public Blanket(String color, double thickness, boolean washable) {
        this.color = color;
        this.thickness = thickness;
        this.washable = washable;
    }

    @Override
    public String toString() {
        return "Blanket{Color='" + color + "', Thickness=" + thickness + "cm, Washable=" + washable + "}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -100;
    }
}
