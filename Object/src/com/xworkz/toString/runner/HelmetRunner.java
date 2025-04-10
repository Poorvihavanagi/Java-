package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Helmet;

public class HelmetRunner {

        public static void main(String[] args) {
            Helmet helmet = new Helmet("Vega", "M", "Black");
            System.out.println(helmet);

            int hash = helmet.hashCode();
            System.out.println("Hash Code: " + hash);
            System.out.println("Original Code: " + System.identityHashCode(helmet));
        }

}
