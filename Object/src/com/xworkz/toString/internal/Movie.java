package com.xworkz.toString.internal;

public class Movie
{
    private String title;
    private String director;
    private double duration;

    public Movie(String title,String director,double duration){
        this.title=title;
        this.director=director;
        this.duration=duration;
    }
    @Override
    public String toString(){
        return "Movie{Title: "+title+",Director: "+director+", Duration: "+duration+"}";
    }
}
