package com.xworkz.runner;

import com.xworkz.implement.IPad;
import com.xworkz.internal.Tablet;

public class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet=new IPad();
        tablet.openApp();
        tablet.swipe();
        tablet.closeApp();
    }
}
