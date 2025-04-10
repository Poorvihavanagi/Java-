package com.xworkz.toString.internal;

public class AlarmClock {
    private String brand;
    private String type;
    private boolean snooze;

    public AlarmClock(String brand, String type, boolean snooze) {
        this.brand = brand;
        this.type = type;
        this.snooze = snooze;
    }
    @Override
    public String toString() {

        return "AlarmClock{Brand='" + brand + "', Type='" + type + "', Snooze=" + snooze + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " +super.hashCode());
        return -20;
    }
}