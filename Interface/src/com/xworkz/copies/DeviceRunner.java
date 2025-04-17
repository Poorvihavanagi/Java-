package com.xworkz.copies;

import com.xworkz.brandNew.Device;
import com.xworkz.internal.Camera;
import com.xworkz.internal.Headphones;

public class DeviceRunner {
    public static void main(String[] args) {
        Camera cameraDevice = new Device();
        cameraDevice.takePhoto();
        cameraDevice.recordVideo();
        cameraDevice.zoom();

        System.out.println("------------------------------");

        Headphones headphonesDevice = new Device();
        headphonesDevice.playMusic();
        headphonesDevice.pauseMusic();
        headphonesDevice.increaseVolume();
    }
}
