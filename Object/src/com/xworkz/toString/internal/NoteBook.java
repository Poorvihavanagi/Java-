
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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof NoteBook) {
                System.out.println("Ref is NoteBook, will compare...");
                NoteBook noteBook1 = this;
                NoteBook noteBook2 = (NoteBook) obj;
                if (noteBook1.brand.equals(noteBook2.brand) && noteBook1.type.equals(noteBook2.type)) {
                    System.out.println("Both Notebooks are identical");
                    return true;
                }
            }
        }
        return false;
    }
}