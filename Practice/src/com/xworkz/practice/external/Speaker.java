package com.xworkz.practice.external;

import com.xworkz.practice.internal.AudioDevice;

public class Speaker {
    private AudioDevice audioDevice;

    public Speaker(AudioDevice audioDevice){
        this.audioDevice=audioDevice;
        System.out.println("Parameterized const speaker");
    }
    public void adjustVolume(){
        if(this.audioDevice!=null){
            System.out.println("Audio device is not null");
            this.audioDevice.playSound();
        }
        else{
            System.out.println("It is null");
        }
    }
}
