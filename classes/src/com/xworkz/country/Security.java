package com.xworkz.country;

public class Security
{
    String level;

    Security(String level) {
        this.level = level;
    }

    void display() {
        System.out.println("Security Level: " + level);
    }
}
