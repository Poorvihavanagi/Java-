package com.xworkz.toString.internal;

public class Toaster {
    private String brand;
    private int slots;
    private String color;

    public Toaster(String brand, int slots, String color) {
        this.brand = brand;
        this.slots = slots;
        this.color = color;
    }

    public String toString() {
        return "Toaster{Brand='" + brand + "', Slots=" + slots + ", Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 970;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Toaster) {
                System.out.println("Ref is Toaster, will compare...");
                Toaster toaster1 = this;
                Toaster toaster2 = (Toaster) obj;
                if (toaster1.brand.equals(toaster2.brand) && toaster1.slots == toaster2.slots && toaster1.color.equals(toaster2.color)) {
                    System.out.println("Both toasters are identical");
                    return true;
                }
            }
        }
        return false;
    }
}