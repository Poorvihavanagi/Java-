package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Router;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("TP-Link", "Dual Band", 4);
        System.out.println(router);

        int hash = router.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(router));

        Router router1 = new Router("Netgear", "Single Band", 2);
        Router router2 = new Router("TP-Link", "Dual Band", 4);

        System.out.println("Checking same location: " + (router1 == router2));
        boolean same = router1.equals(router2);
        System.out.println("Router1 is same as Router2: " + same);
    }
}