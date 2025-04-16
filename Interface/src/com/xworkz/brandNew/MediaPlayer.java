package com.xworkz.brandNew;

import com.xworkz.internal.Music;
import com.xworkz.internal.Movie;

public class MediaPlayer implements Music, Movie {

    @Override
    public void play() {
        System.out.println("Playing media.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing media.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping media.");
    }
}
