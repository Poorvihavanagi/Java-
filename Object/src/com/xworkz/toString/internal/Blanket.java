package com.xworkz.toString.internal;

public class Blanket {
    private String color;
    private double thickness;
    private boolean washable;

    public Blanket(String color, double thickness, boolean washable) {
        this.color = color;
        this.thickness = thickness;
        this.washable = washable;
    }

    @Override
    public String toString() {
        return "Blanket{Color='" + color + "', Thickness=" + thickness + "cm, Washable=" + washable + "}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Blanket) {
                System.out.println("Ref is Blanket, will compare...");
                Blanket blanket1 = this;
                Blanket blanket2 = (Blanket) obj;
                if (blanket1.color.equals(blanket2.color)) {
                    System.out.println("Both blankets are the same color");
                    return true;
                }
            }
        }
        return false;
    }
}
