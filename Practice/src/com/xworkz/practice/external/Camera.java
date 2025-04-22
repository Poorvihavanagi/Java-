package com.xworkz.practice.external;

import com.xworkz.practice.internal.ImagingDevice;

public class Camera {
    private ImagingDevice imagingDevice;

    public Camera(ImagingDevice imagingDevice){
        this.imagingDevice=imagingDevice;
        System.out.println("Parameterized const in camera");
    }
    public void recordVideo(){
        if(this.imagingDevice!=null){
            System.out.println("Image device is not null");
            this.imagingDevice.capturePhoto();
        }
        else{
            System.out.println("It is null");
        }
    }
}
