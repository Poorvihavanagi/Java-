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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Printer) {
                System.out.println("Ref is Printer, will compare...");
                Printer p1 = this;
                Printer p2 = (Printer) obj;
                if (p1.brand.equals(p2.brand) && p1.printTechnology.equals(p2.printTechnology) && p1.pagesPerMinute == p2.pagesPerMinute) {
                    System.out.println("Both Printers are identical");
                    return true;
                }
            }
        }
        return false;
    }
}