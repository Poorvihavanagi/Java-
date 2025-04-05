package com.xworkz.inheritance;

public class Movie extends Entertainment {

    @Override
    public void enjoy() {
        super.enjoy();
        System.out.println("Running enjoy in movie...");
    }

    @Override
    public void watch() {
        super.watch();
        System.out.println("Running watch in movie...");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Running relax in movie...");
    }

    @Override
    public void engage() {
        super.engage();
        System.out.println("Running engage in movie...");
    }

    @Override
    public void share() {
        super.share();
        System.out.println("Running share in movie...");
    }
}
