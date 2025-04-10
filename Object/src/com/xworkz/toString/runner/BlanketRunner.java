package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket("Navy Blue", 2.5, true);
        System.out.println(blanket);

        int hash = blanket.hashCode();
        System.out.println(new Blanket("Maroon", 3.0, false).hashCode());
    }
}
