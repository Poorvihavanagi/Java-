package com.xworkz.inheritance;

public class Poet extends Writer{

    public void write() {
        super.write();
        System.out.println("Writing beautiful verses in poetry...");
    }

    public void edit() {
        super.edit();
        System.out.println("Editing the lines of poetry to perfect the rhythm...");
    }

    public void publish() {
        super.publish();
        System.out.println("Publishing the poetry collection...");
    }

    public void inspire() {
        super.inspire();
        System.out.println("Inspiring others through poetic expressions...");
    }

    public void create() {
        super.create();
        System.out.println("Creating deep and meaningful poetry...");
    }
}
