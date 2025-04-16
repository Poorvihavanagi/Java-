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
}
