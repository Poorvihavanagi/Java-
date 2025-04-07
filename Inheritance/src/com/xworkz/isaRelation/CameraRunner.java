package com.xworkz.isaRelation;

import com.xworkz.inheritance.Camera;
import com.xworkz.inheritance.DSLR;
import com.xworkz.inheritance.DigitalCamera;

public class CameraRunner {
    public static void main(String[] args) {

        DigitalCamera digitalCamera = new DigitalCamera();
        digitalCamera.capturePhoto();
        digitalCamera.recordVideo();
        digitalCamera.zoomIn();
        digitalCamera.zoomOut();
        digitalCamera.adjustFocus();

        System.out.println("-----------------------------------------");
        Camera camera = new DigitalCamera();
        camera.capturePhoto();
        camera.recordVideo();
        camera.zoomIn();
        camera.zoomOut();
        camera.adjustFocus();

        System.out.println("-----------------------------------------");
        DSLR dslr=new DSLR();
        dslr.takePhoto(dslr);
    }
}
