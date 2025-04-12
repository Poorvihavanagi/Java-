package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("Leather", "Brown", 8);
        System.out.println(wallet);

        int hash = wallet.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(wallet));

        Wallet wallet1 = new Wallet("Leather", "Brown", 8);
        Wallet wallet2 = new Wallet("Leather", "Black", 10);

        System.out.println("Checking same location: " + (wallet1 == wallet2));
        boolean same = wallet1.equals(wallet2);
        System.out.println("Wallet1 is same as Wallet2: " + same);
    }
}
