package com.xworkz.practice.runner;

import com.xworkz.practice.external.SmartWatch;
import com.xworkz.practice.external.Smartphone;
import com.xworkz.practice.internal.FitbitWatchImpl;
import com.xworkz.practice.internal.WearableDevice;

public class WearableDeviceRunner {
    public static void main(String[] args) {
        WearableDevice wearableDevice=new FitbitWatchImpl();
        SmartWatch smartWatch=new SmartWatch(wearableDevice);
        smartWatch.trackFitness();
    }
}
