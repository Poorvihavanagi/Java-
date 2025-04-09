package com.xworkz.toString.internal;

public class Train {
    private String name;
    private int speed;
    private int coaches;

    public Train(String name, int speed, int coaches) {
        this.name = name;
        this.speed = speed;
        this.coaches = coaches;
    }

    @Override
    public String toString() {
        return "Train{Name: " + name + ", Speed: " + speed + " km/h, Coaches: " + coaches + "}";
    }
}
