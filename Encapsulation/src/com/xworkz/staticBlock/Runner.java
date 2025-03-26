package com.xworkz.staticBlock;

import com.xworkz.encapsulation.Bank;
import com.xworkz.encapsulation.BankAccount;

public class Runner
{
    public static void main(String... args){

        BankAccount bankAccount = new BankAccount();

        Bank bank = new Bank();
        bank.createAccount(bankAccount);

        Customer customer = new Customer();
        customer.displayAccount(bankAccount);
    }
}
