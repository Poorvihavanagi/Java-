package com.xworkz.abstractKeyword;

public abstract class Cake {

    String flavor;
    String size;
    int layers;
    double price;

    public Cake(String flavor, String size, int layers, double price) {
        this.flavor = flavor;
        this.size = size;
        this.layers = layers;
        this.price = price;
    }

    public Cake(String flavor, String size, int layers) {
        this.flavor = flavor;
        this.size = size;
        this.layers = layers;
        this.price = 0.0;
    }

    public Cake(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
        this.layers = 1;
        this.price = 0.0;
    }
    public abstract void displayDetails();

    public void showPrice() {
        System.out.println("Price: " + price);
    }

}
