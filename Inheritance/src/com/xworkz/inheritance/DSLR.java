package com.xworkz.inheritance;

public class DSLR extends Camera{

    public void changeLens(){
        System.out.println("Change lens in DSLR");
    }

    public void takePhoto(Camera camera){
        camera.capturePhoto();
        camera.recordVideo();
        camera.adjustFocus();
        camera.zoomIn();
        camera.zoomOut();

        if(camera instanceof DSLR){
            System.out.println("Camera is instance of DSLR");
            DSLR dslr=(DSLR) camera;
            dslr.changeLens();
        }

    }
}
