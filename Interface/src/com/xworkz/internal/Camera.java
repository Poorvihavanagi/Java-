package com.xworkz.internal;

public interface Camera {
    void takePhoto();
    void recordVideo();
    void zoom();
    default void displayResolution() {
        System.out.println("Displaying resolution of the camera.");
    }
}
