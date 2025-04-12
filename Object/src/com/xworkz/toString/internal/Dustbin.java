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
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -220;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Dustbin) {
                System.out.println("Ref is Dustbin, will compare...");
                Dustbin db1 = this;
                Dustbin db2 = (Dustbin) obj;
                if (db1.color.equals(db2.color)) {
                    System.out.println("Both Dustbins have the same color.");
                    return true;
                }
            }
        }
        return false;
    }
}
