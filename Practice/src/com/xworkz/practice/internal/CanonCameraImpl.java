package com.xworkz.practice.internal;

public class CanonCameraImpl implements ImagingDevice{
    @Override
    public void capturePhoto() {
        System.out.println("Running capture photo in canon camera");
    }
}
