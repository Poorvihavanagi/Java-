package com.xworkz.toString.internal;

public class Cushion {
    private String color;
    private String shape;
    private String fabric;

    public Cushion(String color, String shape, String fabric) {
        this.color = color;
        this.shape = shape;
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Cushion{color='" + color + "', shape='" + shape + "', fabric='" + fabric + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -190;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cushion) {
                System.out.println("Ref is Cushion, will compare...");
                Cushion cushion1 = this;
                Cushion cushion2 = (Cushion) obj;
                if (cushion1.color.equals(cushion2.color)) {
                    System.out.println("Both Cushions have the same color");
                    return true;
                }
            }
        }
        return false;
    }

}
