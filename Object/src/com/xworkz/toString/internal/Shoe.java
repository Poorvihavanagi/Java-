package com.xworkz.toString.internal;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoe{@Brand: " + brand + ", @Size: " + size + ", @Color: " + color + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 75;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shoe) {
                System.out.println("Ref is Shoe, will compare...");
                Shoe shoe1 = this;
                Shoe shoe2 = (Shoe) obj;
                if (shoe1.brand.equals(shoe2.brand) && shoe1.size == shoe2.size && shoe1.color.equals(shoe2.color)) {
                    System.out.println("Both shoes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
