package com.xworkz.practice.internal;

public class NestSecurityImpl implements SurveillanceSystem{
    @Override
    public void monitorCameras() {
        System.out.println("Running monitor camera's in nest security impl");
    }
}
