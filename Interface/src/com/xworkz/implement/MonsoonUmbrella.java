package com.xworkz.implement;

import com.xworkz.internal.Umbrella;

public class MonsoonUmbrella implements Umbrella {
    public void open() {
        System.out.println("Opening the monsoon umbrella.");
    }

    public void close() {
        System.out.println("Closing the monsoon umbrella.");
    }

    public void protectFromRain() {
        System.out.println("Umbrella is protecting from rain.");
    }
    @Override
    public void store() {
        System.out.println("Storing the monsoon umbrella carefully.");
    }

    @Override
    public void dry() {
        System.out.println("Drying the monsoon umbrella.");
    }
}
