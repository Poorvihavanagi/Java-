package com.xworkz.implement;

import com.xworkz.internal.Door;

public class WoodenDoor implements Door {
    public void open() {
        System.out.println("Opening the wooden door.");
    }

    public void close() {
        System.out.println("Closing the wooden door.");
    }

    public void lock() {
        System.out.println("Locking the wooden door.");
    }
}
