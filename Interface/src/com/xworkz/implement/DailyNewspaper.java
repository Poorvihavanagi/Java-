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
    @Override
    public void getEdition() {
        System.out.println("Getting today's edition of the newspaper.");
    }

    @Override
    public void checkSubscriptionStatus() {
        System.out.println("Checking subscription status for the daily newspaper.");
    }
}
