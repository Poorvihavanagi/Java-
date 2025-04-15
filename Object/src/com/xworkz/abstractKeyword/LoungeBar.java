package com.xworkz.abstractKeyword;

public class LoungeBar extends Bar{

    @Override
    public void serveDrinks() {

    }
    public LoungeBar(String name, String location, int capacity) {
        super(name, location, capacity);
    }
    public void showLoungeDetails() {
        showDetails();
        System.out.println("Lounge Bar");
    }
}
