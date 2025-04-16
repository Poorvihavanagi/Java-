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
}
