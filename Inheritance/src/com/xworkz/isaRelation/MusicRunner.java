package com.xworkz.isaRelation;

import com.xworkz.inheritance.Instrument;
import com.xworkz.inheritance.Music;

public class MusicRunner
{
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();
        instrument.pause();
        instrument.stop();
        instrument.adjustVolume();
        instrument.changeTrack();

        System.out.println("--------------------------------------------------");

        Music music = new Instrument();
        music.play();
        music.pause();
        music.stop();
        music.adjustVolume();
        music.changeTrack();
    }
}
