package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new Projector("Epson", 3000, "1080p");
        System.out.println(projector);
    }
}
