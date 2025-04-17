package com.xworkz.copies;

import com.xworkz.internal.Music;
import com.xworkz.internal.Movie;
import com.xworkz.brandNew.MediaPlayer;

public class MediaRunner {
    public static void main(String[] args) {
        Music music = new MediaPlayer();
        music.play();
        music.pause();
        music.stop();

        System.out.println("------------------------------");

        Movie movie = new MediaPlayer();
        movie.play();
        movie.pause();
        movie.stop();
    }
}
