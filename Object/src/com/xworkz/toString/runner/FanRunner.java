package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Usha", 4, 3);
        System.out.println(fan);

        int hash = fan.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(fan));
    }
}
