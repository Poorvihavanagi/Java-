package com.xworkz.toString.internal;

public class DishRack {
    private int tiers;
    private String material;
    private String color;

    public DishRack(int tiers, String material, String color) {
        this.tiers = tiers;
        this.material = material;
        this.color = color;
    }
    @Override
    public String toString() {
        return "DishRack{Tiers=" + tiers + ", Material='" + material + "', Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -210;
    }
}