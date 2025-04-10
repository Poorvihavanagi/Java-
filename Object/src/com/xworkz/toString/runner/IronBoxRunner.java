package com.xworkz.toString.runner;

import com.xworkz.toString.internal.IronBox;

public class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox = new IronBox("Bajaj", 1000, "White");
        System.out.println(ironBox);

        int hash = ironBox.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(ironBox));
    }
}
