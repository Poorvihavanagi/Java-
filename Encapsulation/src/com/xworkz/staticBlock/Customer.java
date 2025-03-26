package com.xworkz.staticBlock;

import com.xworkz.encapsulation.BankAccount;

public class Customer
{
    void displayAccount(BankAccount bankAccount){
        System.out.println("Account number: " +bankAccount.getAccNumber());
        System.out.println("Balance: " +bankAccount.getBalance());
    }
}
