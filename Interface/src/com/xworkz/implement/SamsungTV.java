package com.xworkz.implement;

import com.xworkz.internal.Television;

public class SamsungTV implements Television {
    public void switchOn() {
        System.out.println("Turning on the TV.");
    }
    public void switchOff() {
        System.out.println("Turning off the TV.");
    }
    public void changeChannel() {
        System.out.println("Changing TV channel.");
    }
    @Override
    public void adjustVolume() {
        System.out.println("Adjusting volume on Samsung TV.");
    }

    @Override
    public void mute() {
        System.out.println("Muting the Samsung TV.");
    }
}
