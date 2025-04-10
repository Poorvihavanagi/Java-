package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Earbuds;

public class EarbudsRunner {
    public static void main(String[] args) {
        Earbuds earbuds = new Earbuds("boAt", 24, "Active");
        System.out.println(earbuds);

        int hash = earbuds.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(earbuds));
    }
}
