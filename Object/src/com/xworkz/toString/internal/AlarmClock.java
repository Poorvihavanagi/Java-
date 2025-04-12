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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof AlarmClock) {
                System.out.println("Ref is AlarmClock, will compare...");
                AlarmClock alarm1 = this;
                AlarmClock alarm2 = (AlarmClock) obj;
                if (alarm1.brand.equals(alarm2.brand)) {
                    System.out.println("Both AlarmClocks are of the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}