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
    @Override
    public String toString() {
        return "RemoteControl{DeviceType='" + deviceType + "', NumberOfButtons=" + numberOfButtons + ", HasBattery=" + hasBattery + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 856;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof RemoteControl) {
                System.out.println("Ref is RemoteControl, will compare...");
                RemoteControl remote1 = this;
                RemoteControl remote2 = (RemoteControl) obj;
                if (remote1.deviceType.equals(remote2.deviceType)
                        && remote1.numberOfButtons == remote2.numberOfButtons
                        && remote1.hasBattery == remote2.hasBattery) {
                    System.out.println("Both RemoteControls are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
