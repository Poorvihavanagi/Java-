package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("Leather", "Brown", 8);
        System.out.println(wallet);
    }
}
