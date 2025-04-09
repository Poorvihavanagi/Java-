package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24, "Zoom");
        System.out.println(camera);
    }
}
