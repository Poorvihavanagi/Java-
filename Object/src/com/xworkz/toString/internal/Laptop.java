package com.xworkz.toString.internal;

public class Laptop {
    private String brand;
    private String processor;
    private int ram;

    public Laptop(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "Laptop{Brand='" + brand + "', Processor='" + processor + "', RAM=" + ram + "GB}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 510;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Laptop) {
                System.out.println("Ref is Laptop, will compare...");
                Laptop laptop1 = this;
                Laptop laptop2 = (Laptop) obj;
                if (laptop1.brand.equals(laptop2.brand) && laptop1.processor.equals(laptop2.processor)) {
                    System.out.println("Both Laptops are identical");
                    return true;
                }
            }
        }
        return false;
    }
}