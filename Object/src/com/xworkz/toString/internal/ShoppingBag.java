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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof ShoppingBag) {
                System.out.println("Ref is ShoppingBag, will compare...");
                ShoppingBag bag1 = this;
                ShoppingBag bag2 = (ShoppingBag) obj;
                if (bag1.material.equals(bag2.material) && bag1.color.equals(bag2.color) && bag1.capacity == bag2.capacity) {
                    System.out.println("Both shopping bags are identical");
                    return true;
                }
            }
        }
        return false;
    }
}