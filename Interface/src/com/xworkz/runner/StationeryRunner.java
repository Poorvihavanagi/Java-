package com.xworkz.runner;

import com.xworkz.implement.Sharpner;
import com.xworkz.internal.Pen;
import com.xworkz.internal.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery = new Sharpner();
        stationery.use();
        stationery.keepInPouch();
        stationery.share();
        stationery.clean();
    }
}
