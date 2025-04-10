package com.xworkz.toString.internal;

public class MusicalInstrument {
    private String name;
    private String type;
    private double price;

    public MusicalInstrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{Name: " + name + ", Type: " + type + ", Price: " + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -660;
    }
}
