package com.xworkz.internal;

public interface Bank {
    void deposit();
    void withdraw();
    void checkBalance();

    default void printAccountStatement() {
        System.out.println("Printing account statement.");
    }

    default void transferFunds() {
        System.out.println("Transferring funds between accounts.");
    }
}
