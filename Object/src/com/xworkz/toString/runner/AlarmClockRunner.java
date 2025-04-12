package com.xworkz.toString.runner;
import com.xworkz.toString.internal.AlarmClock;

public class AlarmClockRunner {
    public static void main(String[] args) {
        AlarmClock alarm = new AlarmClock("Titan", "Digital", true);
        System.out.println(alarm);

        int value=alarm.hashCode();
        System.out.println(new AlarmClock("FastTrack","Digital",false).hashCode());

        AlarmClock alarm1 = new AlarmClock("Titan", "Analog", false);
        AlarmClock alarm2 = new AlarmClock("Titan", "Digital", true);

        System.out.println("Checking same location: " + (alarm1 == alarm2));
        boolean same = alarm2.equals(alarm1);
        System.out.println("AlarmClock1 is same as AlarmClock2: " + same);


    }
}