package com.xworkz.accessorsAndMutators;

public class Main
{
    public static void main(String... args){

        Jailer jailer = new Jailer();
        jailer.initJailService();
        System.out.println("..................................................");

        SatelliteDesign satelliteDesign = new SatelliteDesign();
        satelliteDesign.initSatelliteDesign();
        System.out.println("..................................................");

        IdCardService idCardService = new IdCardService();
        idCardService.initIdCardService();
        System.out.println("..................................................");

        AlienType alienType = new AlienType();
        alienType.initAlienProcess();
        System.out.println("..................................................");

        CameraService cameraService = new CameraService();
        cameraService.initCameraProcess();
        System.out.println("..................................................");
    }
}
