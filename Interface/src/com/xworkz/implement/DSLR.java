package com.xworkz.implement;

import com.xworkz.internal.Camera;

public class DSLR implements Camera {
    public void takePhoto() {
        System.out.println("Taking a photo.");
    }
    public void recordVideo() {
        System.out.println("Recording a video.");
    }
    public void zoom() {
        System.out.println("Zooming in.");
    }
    @Override
    public void displayResolution() {
        System.out.println("Overridden: Displaying high resolution for DSLR camera.");
    }
}
