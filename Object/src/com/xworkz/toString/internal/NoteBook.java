
package com.xworkz.toString.internal;

public class NoteBook {
    private String brand;
    private int pages;
    private String type;

    public NoteBook(String brand, int pages, String type) {
        this.brand = brand;
        this.pages = pages;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Notebook{Brand='" + brand + "', Pages=" + pages + ", Type='" + type + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -700;
    }
}