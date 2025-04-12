package com.xworkz.toString.internal;

public class Helmet
{
    private String brand;
    private String size;
    private String color;

    public Helmet(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Helmet{Brand='" + brand + "', Size='" + size + "', Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -320;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Helmet) {
                System.out.println("Ref is Helmet, will compare...");
                Helmet helmet1 = this;
                Helmet helmet2 = (Helmet) obj;
                if (helmet1.brand.equals(helmet2.brand) && helmet1.size.equals(helmet2.size)) {
                    System.out.println("Both Helmets have the same brand, size, and color");
                    return true;
                }
            }
        }
        return false;
    }
}
