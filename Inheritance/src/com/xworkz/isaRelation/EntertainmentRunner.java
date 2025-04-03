package com.xworkz.isaRelation;

import com.xworkz.inheritance.Entertainment;
import com.xworkz.inheritance.Movie;

public class EntertainmentRunner
{
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.enjoy();
        movie.watch();
        movie.relax();
        movie.engage();
        movie.share();
        System.out.println("----------------------------------------------------------------------------------");
        Entertainment entertainment = new Movie();
        entertainment.enjoy();
        entertainment.watch();
        entertainment.relax();
        entertainment.engage();
        entertainment.share();
    }
}
