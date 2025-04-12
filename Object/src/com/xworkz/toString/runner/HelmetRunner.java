package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Helmet;

public class HelmetRunner {

        public static void main(String[] args) {
            Helmet helmet = new Helmet("Vega", "M", "Black");
            System.out.println(helmet);

            int hash = helmet.hashCode();
            System.out.println("Hash Code: " + hash);
            System.out.println("Original Code: " + System.identityHashCode(helmet));

            Helmet helmet1 = new Helmet("Vega", "M", "Black");
            Helmet helmet2 = new Helmet("Royal Enfield", "L", "Red");

            System.out.println("Checking same location: " + (helmet1 == helmet2));
            boolean same = helmet1.equals(helmet2);
            System.out.println("Helmet1 is same as Helmet2: " + same);
        }

}
