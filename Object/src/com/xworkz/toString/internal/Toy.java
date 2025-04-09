package com.xworkz.toString.internal;

public class Toy
{
    private String name;
    private String type;
    private double price;

    public Toy(String name, String type, int price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Toy{Name: " + name + ", Type: " + type + ", Price: " + price + "}";
    }
}
