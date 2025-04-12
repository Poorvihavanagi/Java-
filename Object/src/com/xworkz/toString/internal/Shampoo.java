package com.xworkz.toString.internal;

public class Shampoo {
    private String brand;
    private String type;
    private int volume;

    public Shampoo(String brand, String type, int volume) {
        this.brand = brand;
        this.type = type;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Shampoo{Brand='" + brand + "', Type='" + type + "', Volume=" + volume + "ml}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shampoo) {
                System.out.println("Ref is Shampoo, will compare...");
                Shampoo shampoo1 = this;
                Shampoo shampoo2 = (Shampoo) obj;
                if (shampoo1.brand.equals(shampoo2.brand) && shampoo1.type.equals(shampoo2.type) && shampoo1.volume == shampoo2.volume) {
                    System.out.println("Both shampoos are identical");
                    return true;
                }
            }
        }
        return false;
    }
}