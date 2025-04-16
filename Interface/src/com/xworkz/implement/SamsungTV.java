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
}
