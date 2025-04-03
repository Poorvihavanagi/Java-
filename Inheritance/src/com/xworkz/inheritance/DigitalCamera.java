package com.xworkz.inheritance;

public class DigitalCamera extends Camera
{
    public void capturePhoto() {
        super.capturePhoto();
        System.out.println("Running capture photo in digital camera");
    }
    public void recordVideo() {
        super.recordVideo();
        System.out.println("Running record video in digital camera");
    }
    public void zoomIn() {
        super.zoomIn();
        System.out.println("Running photo zoomin in digital camera");
    }
    public void zoomOut() {
        super.zoomOut();
        System.out.println("Running photo zoom out in digital camera");
    }
    public void adjustFocus() {
        super.adjustFocus();
        System.out.println("Running adjust photo in digital camera");
    }
}
