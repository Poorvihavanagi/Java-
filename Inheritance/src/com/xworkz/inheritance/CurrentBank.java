package com.xworkz.inheritance;

public class CurrentBank extends Bank{

    public void enableOverdraft() {
        System.out.println("Running enableOverdraft in CurrentBank");
    }
    public void issueChequeBook(Bank bank) {
        bank.checkBalance();
        bank.openAccount();
        bank.closeAccount();
        bank.deposit();
        bank.deposit();


        if (bank instanceof SavingBank) {
            SavingBank sb = (SavingBank) bank;
            sb.issueCheckBook();
        }

        if (bank instanceof CurrentBank) {
            CurrentBank cb = (CurrentBank) bank;
            cb.enableOverdraft();
        }
    }

}
