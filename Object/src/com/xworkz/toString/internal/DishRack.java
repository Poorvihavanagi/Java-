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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof DishRack) {
                System.out.println("Ref is DishRack, will compare...");
                DishRack rack1 = this;
                DishRack rack2 = (DishRack) obj;
                if (rack1.tiers == rack2.tiers && rack1.material.equals(rack2.material)) {
                    System.out.println("Both DishRacks have the same tiers and material");
                    return true;
                }
            }
        }
        return false;
    }
}