package com.xworkz.runner;

import com.xworkz.implement.DSLR;
import com.xworkz.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera=new DSLR();
        camera.takePhoto();
        camera.recordVideo();
        camera.zoom();
    }
}
