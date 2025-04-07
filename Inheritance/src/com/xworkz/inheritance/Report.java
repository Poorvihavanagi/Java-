package com.xworkz.inheritance;

public class Report extends Document {

    public void edit() {
        super.edit();
        System.out.println("Running edit in report");
    }

    public void draw() {
        super.draw();
        System.out.println("Running draw in report");
    }

    public void type() {
        super.type();
        System.out.println("Running type in report");
    }

    public void delete() {
        super.delete();
        System.out.println("Running delete in report");
    }

    public void viewing() {
        super.viewing();
        System.out.println("Running viewing in report");
    }
    public void addCharts() {
        System.out.println("Running add charts in report");
    }
}
