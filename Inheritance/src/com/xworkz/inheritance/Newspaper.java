package com.xworkz.inheritance;

public class Newspaper extends Media
{
    public void print() {
        super.print();
        System.out.println("Printing the newspaper articles and ads...");
    }

    public void broadcast() {
        super.broadcast();
        System.out.println("Broadcasting news on the newspaper's website...");
    }

    public void edit() {
        super.edit();
        System.out.println("Editing the newspaper articles and editorials...");
    }

    public void publish() {
        super.publish();
        System.out.println("Publishing the newspaper on a daily basis...");
    }

    public void distribute() {
        super.distribute();
        System.out.println("Distributing the newspapers to subscribers...");
    }
}
