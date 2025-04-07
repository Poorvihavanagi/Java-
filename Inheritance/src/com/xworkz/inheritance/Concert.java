package com.xworkz.inheritance;

public class Concert extends Music{
    public void tune(){
        System.out.println("Tuning the instrument to correct pitch.");
    }
    public void setStage(Music music){
        music.adjustVolume();
        music.pause();
        music.changeTrack();
        music.stop();
        music.play();

        if(music instanceof Concert){
            System.out.println("music is an instance of concert");
            Concert concert=(Concert) music;
            concert.tune();
        }
    }
}
