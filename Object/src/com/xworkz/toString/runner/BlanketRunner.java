package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket("Navy Blue", 2.5, true);
        System.out.println(blanket);

        int hash = blanket.hashCode();
        System.out.println(new Blanket("Maroon", 3.0, false).hashCode());

        Blanket blanket1 = new Blanket("Navy Blue", 2.5, true);
        Blanket blanket2 = new Blanket("Maroon", 3.0, false);

        System.out.println("Checking same location: " + (blanket1 == blanket2));
        boolean same = blanket2.equals(blanket1);
        System.out.println("Blanket1 is same as Blanket2: " + same);
    }
}
