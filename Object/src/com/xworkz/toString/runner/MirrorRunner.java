package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new Mirror("Oval", 24.5, true);
        System.out.println(mirror);
    }
}
