package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Movie;

public class MovieRunner
{
    public static void main(String[] args) {
        Movie movie=new Movie("3 Idiots", "Rajkumar Hirani", 2.45);
        System.out.println(movie);

        int hash = movie.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(movie));
    }
}
