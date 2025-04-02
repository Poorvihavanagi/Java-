package com.xworkz.inheritance;

public class Material extends Book {

    public void open() {
        super.open();
        System.out.println("Opening the study material...");
    }

    public void read() {
        super.read();
        System.out.println("Reading the study material for exam preparation...");
    }

    public void close() {
        super.close();
        System.out.println("Closing the study material after reading...");
    }

    public void bookmark() {
        super.bookmark();
        System.out.println("Bookmarking an important section in the study material...");
    }

    public void checkPages() {
        super.checkPages();
        System.out.println("Checking the total number of pages in the study material...");
    }
}
