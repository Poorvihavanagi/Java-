package com.xworkz.implement;

import com.xworkz.internal.Pen;

public class BallPen implements Pen {
    public void write() {
        System.out.println("Writing with ballpen.");
    }
    public void refill() {
        System.out.println("Refilling ballpen ink.");
    }
    public void click() {
        System.out.println("Clicking the ballpen.");
    }
    @Override
    public void checkInkLevel() {
        System.out.println("Checking the ink level of the ballpoint pen.");
    }

    @Override
    public void displayBrand() {
        System.out.println("This is a brand-name ballpoint pen.");
    }
}
