package com.xworkz.toString.internal;

public class Printer {
    private String brand;
    private String printTechnology;
    private int pagesPerMinute;

    public Printer(String brand, String printTechnology, int pagesPerMinute) {
        this.brand = brand;
        this.printTechnology = printTechnology;
        this.pagesPerMinute = pagesPerMinute;
    }

    public String toString() {
        return "Printer{" + "brand='" + brand + '\'' + ", printTechnology='" + printTechnology + '\'' + ", pagesPerMinute=" + pagesPerMinute + '}';
    }
}