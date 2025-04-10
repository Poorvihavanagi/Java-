package com.xworkz.toString.runner;
import com.xworkz.toString.internal.AlarmClock;

public class AlarmClockRunner {
    public static void main(String[] args) {
        AlarmClock alarm = new AlarmClock("Titan", "Digital", true);
        System.out.println(alarm);

        int value=alarm.hashCode();
        System.out.println(new AlarmClock("FastTrack","Digital",false).hashCode());
    }
}