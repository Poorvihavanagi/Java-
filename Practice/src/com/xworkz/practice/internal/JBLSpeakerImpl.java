package com.xworkz.practice.internal;

public class JBLSpeakerImpl implements AudioDevice{
    @Override
    public void playSound() {
        System.out.println("Running play sound in JBL speaker");
    }
}
