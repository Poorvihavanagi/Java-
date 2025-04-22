package com.xworkz.practice.runner;

import com.xworkz.practice.external.Speaker;
import com.xworkz.practice.internal.AudioDevice;
import com.xworkz.practice.internal.JBLSpeakerImpl;

public class AudioDeviceRunner {
    public static void main(String[] args) {
        AudioDevice audioDevice=new JBLSpeakerImpl();
        Speaker speaker=new Speaker(audioDevice);
        speaker.adjustVolume();
    }
}
