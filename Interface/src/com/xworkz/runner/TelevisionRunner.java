package com.xworkz.runner;

import com.xworkz.implement.SamsungTV;
import com.xworkz.internal.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television television=new SamsungTV();
        television.switchOn();
        television.switchOff();
        television.changeChannel();

        television.adjustVolume();
        television.mute();
    }
}
