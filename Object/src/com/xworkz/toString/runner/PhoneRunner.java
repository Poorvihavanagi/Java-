package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S21", 128);
        System.out.println(phone);

        int hash = phone.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(phone));
    }
}