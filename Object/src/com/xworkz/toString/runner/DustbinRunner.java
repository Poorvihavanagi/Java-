package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin = new Dustbin("Green", 20, "Plastic");
        System.out.println(dustbin);
    }
}
