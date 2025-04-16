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
}
