package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24, "Zoom");
        System.out.println(camera);
        System.out.println("Identity hash code (System): " + System.identityHashCode(camera));
        int hash = camera.hashCode();

        Camera camera2 = new Camera("Nikon", 32, "Prime");
        System.out.println("Identity hash code (Second object): " + System.identityHashCode(camera2));
        System.out.println(camera2.hashCode());

        Camera camera3 = new Camera("Canon", 24, "Wide Angle");
        System.out.println("Checking same location: " + (camera == camera3));
        boolean same = camera3.equals(camera);
        System.out.println("Camera1 is same as Camera3: " + same);

    }

}
