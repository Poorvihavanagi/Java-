package com.xworkz.implement;

import com.xworkz.internal.Chair;

public class OfficeChair implements Chair {
    public void sit() {
        System.out.println("Sitting on the chair.");
    }
    public void adjustHeight() {
        System.out.println("Adjusting chair height.");
    }
    public void rotate() {
        System.out.println("Rotating the chair.");
    }
}
