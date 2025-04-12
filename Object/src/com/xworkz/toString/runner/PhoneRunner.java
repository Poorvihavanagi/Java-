package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S21", 128);
        System.out.println(phone);

        int hash = phone.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(phone));

        Phone phone1 = new Phone("Apple", "iPhone 13", 128);
        Phone phone2 = new Phone("Apple", "iPhone 13", 64);

        System.out.println("Checking same location: " + (phone1 == phone2));
        boolean same = phone1.equals(phone2);
        System.out.println("Phone1 is same as Phone2: " + same);
    }
}