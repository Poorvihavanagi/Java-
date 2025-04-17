package com.xworkz.runner;

import com.xworkz.implement.SonyHeadphones;
import com.xworkz.internal.Headphones;

public class HeadphonesRunner {
    public static void main(String[] args) {
        Headphones headphones=new SonyHeadphones();
        headphones.playMusic();
        headphones.pauseMusic();
        headphones.increaseVolume();
        headphones.turnOn();
    }
}
