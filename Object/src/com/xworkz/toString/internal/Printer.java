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
    @Override
    public String toString() {
        return "Printer{" + "brand='" + brand + '\'' + ", printTechnology='" + printTechnology + '\'' + ", pagesPerMinute=" + pagesPerMinute + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 256;
    }
}