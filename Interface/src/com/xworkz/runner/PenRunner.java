package com.xworkz.runner;

import com.xworkz.implement.BallPen;
import com.xworkz.internal.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen=new BallPen();
        pen.write();
        pen.refill();
        pen.click();
    }
}
