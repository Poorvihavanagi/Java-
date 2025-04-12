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

        Movie movie1 = new Movie("3 Idiots", "Rajkumar Hirani", 2.45);
        Movie movie2 = new Movie("Inception", "Christopher Nolan", 2.28);

        System.out.println("Checking same location: " + (movie1 == movie2));
        boolean same = movie1.equals(movie2);
        System.out.println("Movie1 is same as Movie2: " + same);
    }
}
