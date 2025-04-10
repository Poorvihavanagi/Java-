package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Router;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("TP-Link", "Dual Band", 4);
        System.out.println(router);

        int hash = router.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(router));
    }
}