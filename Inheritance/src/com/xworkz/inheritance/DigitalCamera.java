package com.xworkz.inheritance;

public class DigitalCamera extends Camera {

    @Override
    public void capturePhoto() {
        super.capturePhoto();
        System.out.println("Running capture Photo in Digital Camera");
    }

    @Override
    public void recordVideo() {
        super.recordVideo();
        System.out.println("Running record Video in Digital Camera");
    }

    @Override
    public void zoomIn() {
        super.zoomIn();
        System.out.println("Running zoom In in Digital Camera");
    }

    @Override
    public void zoomOut() {
        super.zoomOut();
        System.out.println("Running zoom Out in Digital Camera");
    }

    @Override
    public void adjustFocus() {
        super.adjustFocus();
        System.out.println("Running adjust Focus in Digital Camera");
    }

    public void changeLens(){
        System.out.println("Running change lens in digital camera");
    }
}
