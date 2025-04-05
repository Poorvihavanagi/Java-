package com.xworkz.inheritance;

public class DigitalCamera extends Camera {

    @Override
    public void capturePhoto() {
        super.capturePhoto();
        System.out.println("Running capture Photo in DigitalCamera");
    }

    @Override
    public void recordVideo() {
        super.recordVideo();
        System.out.println("Running record Video in DigitalCamera");
    }

    @Override
    public void zoomIn() {
        super.zoomIn();
        System.out.println("Running zoom In in DigitalCamera");
    }

    @Override
    public void zoomOut() {
        super.zoomOut();
        System.out.println("Running zoom Out in DigitalCamera");
    }

    @Override
    public void adjustFocus() {
        super.adjustFocus();
        System.out.println("Running adjust Focus in DigitalCamera");
    }
}
