package com.xworkz.toString.internal;

public class ShoppingBag {
    private String material;
    private String color;
    private int capacity;

    public ShoppingBag(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "ShoppingBag{Material='" + material + "', Color='" + color + "', Capacity=" + capacity + "kg}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 93;
    }
}