package com.xworkz.toString.internal;

public class Wallet {
    private String material;
    private String color;
    private int slots;

    public Wallet(String material, String color, int slots) {
        this.material = material;
        this.color = color;
        this.slots = slots;
    }
    @Override
    public String toString() {
        return "Wallet{material='" + material + "', color='" + color + "', slots=" + slots + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 957;
    }
}
