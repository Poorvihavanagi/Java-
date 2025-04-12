package com.xworkz.toString.internal;

public class HandSanitizer {
    private String brand;
    private int alcoholPercentage;
    private int volume;

    public HandSanitizer(String brand, int alcoholPercentage, int volume) {
        this.brand = brand;
        this.alcoholPercentage = alcoholPercentage;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "HandSanitizer{Brand='" + brand + "', Alcohol=" + alcoholPercentage + "%, Volume=" + volume + "ml}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -310;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof HandSanitizer) {
                System.out.println("Ref is HandSanitizer, will compare...");
                HandSanitizer sanitizer1 = this;
                HandSanitizer sanitizer2 = (HandSanitizer) obj;
                if (sanitizer1.brand.equals(sanitizer2.brand) && sanitizer1.alcoholPercentage == sanitizer2.alcoholPercentage) {
                    System.out.println("Both HandSanitizers have the same brand, alcohol percentage, and volume");
                    return true;
                }
            }
        }
        return false;
    }
}