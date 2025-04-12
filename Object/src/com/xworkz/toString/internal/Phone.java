package com.xworkz.toString.internal;

public class Phone {
    private String brand;
    private String model;
    private int storage;

    public Phone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "Phone{Brand='" + brand + "', Model='" + model + "', Storage=" + storage + "GB}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -740;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Phone) {
                System.out.println("Ref is Phone, will compare...");
                Phone phone1 = this;
                Phone phone2 = (Phone) obj;
                if (phone1.brand.equals(phone2.brand) && phone1.model.equals(phone2.model) && phone1.storage == phone2.storage) {
                    System.out.println("Both Phones are identical");
                    return true;
                }
            }
        }
        return false;
    }
}