package com.xworkz.inheritance;

public class Movie extends Entertainment{

    public void enjoy() {
        super.enjoy();
        System.out.println("Enjoying a thrilling movie...");
    }
    public void watch() {
        super.watch();
        System.out.println("Watching a movie in the theater...");
    }
    public void relax() {
        super.relax();
        System.out.println("Relaxing while watching a movie...");
    }
    public void engage() {
        super.engage();
        System.out.println("Engaging with the movie plot and characters...");
    }
    public void share() {
        super.share();
        System.out.println("Sharing the movie experience with friends...");
    }
}
