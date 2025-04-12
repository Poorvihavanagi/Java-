package com.xworkz.toString.internal;

public class Toy
{
    private String name;
    private String type;
    private double price;

    public Toy(String name, String type, double price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Toy{Name: " + name + ", Type: " + type + ", Price: " + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 973;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Toy) {
                System.out.println("Ref is Toy, will compare...");
                Toy toy1 = this;
                Toy toy2 = (Toy) obj;
                if (toy1.name.equals(toy2.name) && toy1.type.equals(toy2.type) && toy1.price == toy2.price) {
                    System.out.println("Both toys are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
