package com.xworkz.toString.internal;

public class House {
    private String location;
    private int floors;
    private double price;

    public House(String location, int floors, double price) {
        this.location = location;
        this.floors = floors;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{Location: " + location + ", Floors: " + floors + ", Price: ₹" + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -330;
    }
}
