package com.xworkz.implement;

import com.xworkz.internal.Newspaper;

public class DailyNewspaper implements Newspaper {
    public void read() {
        System.out.println("Reading the daily newspaper.");
    }

    public void subscribe() {
        System.out.println("Subscribing to the daily newspaper.");
    }

    public void discard() {
        System.out.println("Discarding the old newspaper.");
    }
}
