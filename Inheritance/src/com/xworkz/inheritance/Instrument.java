package com.xworkz.inheritance;

public class Instrument extends Music{
    public void play() {
        super.play();
        System.out.println("Running play music in instrument");
    }
    public void pause() {
        super.pause();
        System.out.println("Running pause music in instrument");
    }
    public void stop() {
        super.stop();
        System.out.println("Running stop music in instrument");
    }
    public void adjustVolume() {
        super.adjustVolume();
        System.out.println("Running adjust music volume in instrument");
    }
    public void changeTrack() {
        super.changeTrack();
        System.out.println("Running change music in instrument");
    }
    public void tune() {
        System.out.println("Running tune in instrument");
    }
}
