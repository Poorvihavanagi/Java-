package com.xworkz.toString.internal;

public class LaundryBasket {
    private String material;
    private String color;
    private int capacity;

    public LaundryBasket(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }

    public String toString() {
        return "LaundryBasket{Material='" + material + "', Color='" + color + "', Capacity=" + capacity + "L}";
    }
}
