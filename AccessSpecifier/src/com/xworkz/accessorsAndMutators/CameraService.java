package com.xworkz.accessorsAndMutators;

public class CameraService
{
    public void cameraProcess(Camera camera){
        System.out.println("Camera Information......");
        System.out.println("Camera Brand: " + camera.getBrand());
        System.out.println("Price: $" + camera.getPrice());
        System.out.println("Type: " + camera.getType());
        System.out.println("Connectivity: " + camera.getConnectivity());
    }

    public void initCameraProcess(){
        Camera camera = new Camera();
        camera.setBrand("Canon");
        camera.setPrice(12000.99);
        camera.setType(CameraType.DSLR);
        camera.setConnectivity("Wi-Fi, Bluetooth");

        cameraProcess(camera);
    }
}
