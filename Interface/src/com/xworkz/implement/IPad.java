package com.xworkz.implement;

import com.xworkz.internal.Tablet;

public class IPad implements Tablet {
    public void openApp() {
        System.out.println("Opening app.");
    }

    public void swipe() {
        System.out.println("Swiping screen.");
    }

    public void closeApp() {
        System.out.println("Closing app.");
    }
}
