package com.xworkz.abstractKeyword;

public abstract class Bar {
    String name;
    String location;
    int capacity;

    public Bar(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }


    public abstract void serveDrinks();


    public void showDetails() {
        System.out.println("Bar Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " people");
    }
}
