package com.xworkz.inheritance;

public class Newspaper extends Media {

    @Override
    public void print() {
        super.print();
        System.out.println("Running print in newspaper...");
    }

    @Override
    public void broadcast() {
        super.broadcast();
        System.out.println("Running broadcast in newspaper...");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Running edit in newspaper...");
    }

    @Override
    public void publish() {
        super.publish();
        System.out.println("Running publish in newspaper...");
    }

    @Override
    public void distribute() {
        super.distribute();
        System.out.println("Running distribute in newspaper...");
    }
}
