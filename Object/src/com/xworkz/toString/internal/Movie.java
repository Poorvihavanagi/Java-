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
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -650;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Movie) {
                System.out.println("Ref is Movie, will compare...");
                Movie m1 = this;
                Movie m2 = (Movie) obj;
                if (m1.title.equals(m2.title) && m1.director.equals(m2.director)) {
                    System.out.println("Both Movies are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
