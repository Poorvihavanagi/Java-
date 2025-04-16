package com.xworkz.implement;

import com.xworkz.internal.Building;

public class Skyscraper implements Building {
    @Override
    public void construct() {
        System.out.println("Constructing the skyscraper.");
    }

    @Override
    public void demolish() {
        System.out.println("Demolishing the skyscraper.");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining the skyscraper.");
    }
}
