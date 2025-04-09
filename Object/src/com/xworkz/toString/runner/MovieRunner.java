package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Movie;

public class MovieRunner
{
    public static void main(String[] args) {
        Movie movie=new Movie("3 Idiots", "Rajkumar Hirani", 2.45);
        System.out.println(movie);
    }
}
