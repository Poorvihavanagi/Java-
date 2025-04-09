package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S21", 128);
        System.out.println(phone);
    }
}