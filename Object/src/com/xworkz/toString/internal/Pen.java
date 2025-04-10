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

}
