package com.xworkz.isaRelation;

import com.xworkz.inheritance.SmartWatch;
import com.xworkz.inheritance.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.showTime();
        smartWatch.setAlarm();
        smartWatch.tick();
        smartWatch.checkBattery();
        smartWatch.wear();

        System.out.println("----------------------------------------------------------------");
        Watch watch = new SmartWatch();
        watch.showTime();
        watch.setAlarm();
        watch.tick();
        watch.checkBattery();
        watch.wear();
    }
}
