package com.xworkz.toString.internal;

public class Pen {
    private String brand;
    private String inkColor;
    private double price;

    public Pen(String brand, String inkColor, double price) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{Brand='" + brand + "', Ink Color='" + inkColor + "', Price=" + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -720;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pen) {
                System.out.println("Ref is Pen, will compare...");
                Pen pen1 = this;
                Pen pen2 = (Pen) obj;
                if (pen1.brand.equals(pen2.brand) && pen1.inkColor.equals(pen2.inkColor)) {
                    System.out.println("Both Pens are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
