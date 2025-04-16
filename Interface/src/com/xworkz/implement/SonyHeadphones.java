package com.xworkz.implement;

import com.xworkz.internal.Headphones;

public class SonyHeadphones implements Headphones {
    public void playMusic() {
        System.out.println("Music playing.");
    }

    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    public void increaseVolume() {
        System.out.println("Volume increased.");
    }
}
