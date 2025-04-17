package com.xworkz.implement;

import com.xworkz.internal.Bank;

public class SavingsBank implements Bank {
    public void deposit() {
        System.out.println("Depositing money into the savings account.");
    }

    public void withdraw() {
        System.out.println("Withdrawing money from the savings account.");
    }

    public void checkBalance() {
        System.out.println("Checking balance in the savings account.");
    }
    @Override
    public void printAccountStatement() {
        System.out.println("Printing savings account statement.");
    }

    @Override
    public void transferFunds() {
        System.out.println("Transferring funds from savings account to checking account.");
    }
}
