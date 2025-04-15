package com.xworkz.Hybrid;

class MotionSensor extends Sensor implements Calibratable {
    public void calibrate() {
        System.out.println("Motion sensor calibrated");
    }
}
