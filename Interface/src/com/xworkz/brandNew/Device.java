package com.xworkz.brandNew;

import com.xworkz.internal.Headphones;
import com.xworkz.internal.Camera;

public class Device implements Camera, Headphones {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with the smart device.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video with the smart device.");
    }

    @Override
    public void zoom(){
        System.out.println("Running zoom in device");
    }

    @Override
    public void playMusic(){
        System.out.println("Running play music in device");
    }
    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }
    @Override
    public void increaseVolume() {
        System.out.println("Volume increased.");
    }
}
