package com.xworkz.inheritance;

public class SavingBank extends Bank {
    public void openAccount() {
        super.openAccount();
        System.out.println("Opening a savings bank account with interest benefits...");
    }
    public void deposit() {
        super.deposit();
        System.out.println("Depositing money into the savings account...");
    }

    public void withdraw() {
        super.withdraw();
        System.out.println("Withdrawing money with limited transactions in savings account...");
    }

    public void checkBalance() {
        super.checkBalance();
        System.out.println("Checking balance with interest calculations...");
    }

    public void closeAccount() {
        super.closeAccount();
        System.out.println("Closing the savings bank account...");
    }
}
