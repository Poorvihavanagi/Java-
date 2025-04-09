package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv = new Television("Sony", 55, "LED");
        System.out.println(tv);
    }
}