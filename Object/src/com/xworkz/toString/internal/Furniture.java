package com.xworkz.toString.internal;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{Type: " + type + ", Material: " + material + ", Price: " + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -250;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Furniture) {
                System.out.println("Ref is Furniture, will compare...");
                Furniture f1 = this;
                Furniture f2 = (Furniture) obj;
                if (f1.type.equals(f2.type)) {
                    System.out.println("Both Furniture have the same type");
                    return true;
                }
            }
        }
        return false;
    }
}
