package com.xworkz.toString.internal;

public class Clip {
    private String type;
    private int count;
    private String color;

    public Clip(String type, int count, String color) {
        this.type = type;
        this.count = count;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clip{type='" + type + "', count=" + count + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -130;
    }
}
