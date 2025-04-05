package com.xworkz.inheritance;

public class Poet extends Writer {

    @Override
    public void write() {
        super.write();
        System.out.println("Running write in Poet");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Running edit in Poet");
    }

    @Override
    public void publish() {
        super.publish();
        System.out.println("Running publish in Poet");
    }

    @Override
    public void inspire() {
        super.inspire();
        System.out.println("Running inspire in Poet");
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Running create in Poet");
    }
}
