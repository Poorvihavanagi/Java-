package com.xworkz.toString.internal;

public class Dustbin {
    private String color;
    private int capacityInLiters;
    private String material;

    public Dustbin(String color, int capacityInLiters, String material) {
        this.color = color;
        this.capacityInLiters = capacityInLiters;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Dustbin{Color='" + color + "', Capacity=" + capacityInLiters + "L, Material='" + material + "'}";
    }
}
