package com.xworkz.practice.internal;

public class FitbitWatchImpl implements WearableDevice{
    @Override
    public void trackActivity() {
        System.out.println("Running track activity in fitbit watch");
    }
}
