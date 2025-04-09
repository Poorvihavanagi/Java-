package com.xworkz.toString.internal;

public class RemoteControl {
    private String deviceType;
    private int numberOfButtons;
    private boolean hasBattery;

    public RemoteControl(String deviceType, int numberOfButtons, boolean hasBattery) {
        this.deviceType = deviceType;
        this.numberOfButtons = numberOfButtons;
        this.hasBattery = hasBattery;
    }

    public String toString() {
        return "RemoteControl{DeviceType='" + deviceType + "', NumberOfButtons=" + numberOfButtons + ", HasBattery=" + hasBattery + "}";
    }
}
