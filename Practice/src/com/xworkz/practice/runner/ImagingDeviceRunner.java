package com.xworkz.practice.runner;

import com.xworkz.practice.external.Camera;
import com.xworkz.practice.internal.CanonCameraImpl;
import com.xworkz.practice.internal.ImagingDevice;

public class ImagingDeviceRunner {
    public static void main(String[] args) {
        ImagingDevice imagingDevice=new CanonCameraImpl();
        Camera camera=new Camera(imagingDevice);
        camera.recordVideo();
    }
}
