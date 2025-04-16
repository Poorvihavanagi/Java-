package com.xworkz.runner;

import com.xworkz.internal.Movie;
import com.xworkz.implement.ActionMovie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new ActionMovie();
        movie.play();
        movie.pause();
        movie.stop();
    }
}
