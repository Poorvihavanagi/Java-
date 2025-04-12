package com.xworkz.toString.internal;

public class Tshirt {

    private String brand;
    private double price;
    private char size;
    private String color;

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public char getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Ref is not null");
            if(obj instanceof Tshirt){
                System.out.println("Ref is tshirt, will compare....");
                Tshirt tshirt1=this;
                Tshirt tshirt2=(Tshirt) obj;
                if(tshirt1.brand.equals(tshirt2.brand) && tshirt1.price==tshirt2.price && tshirt1.size==tshirt2.size && tshirt1.color==tshirt2.color){
                    System.out.println("Both tshirts are same");
                    return true;
                }
            }
        }
        return false;
    }
}
