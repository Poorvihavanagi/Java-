package com.xworkz.isaRelation;
import com.xworkz.inheritance.Bank;
import com.xworkz.inheritance.CurrentBank;
import com.xworkz.inheritance.SavingBank;
public class BankRunner {
    public static void main(String[] args) {

        SavingBank savingsBank = new SavingBank();
        savingsBank.openAccount();
        savingsBank.deposit();
        savingsBank.withdraw();
        savingsBank.checkBalance();
        savingsBank.closeAccount();

        System.out.println("------------------------------------------------------");
        Bank bank = new SavingBank();
        bank.openAccount();
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();
        bank.closeAccount();

        System.out.println("--------------------------------------------------------");
        SavingBank saving = new SavingBank();
        CurrentBank current = new CurrentBank();
        current.issueChequeBook(saving);
        current.issueChequeBook(current);
    }
}
