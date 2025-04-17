package com.xworkz.runner;

import com.xworkz.internal.Bank;
import com.xworkz.implement.SavingsBank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new SavingsBank();
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();

        bank.printAccountStatement();
        bank.transferFunds();
    }
}
