package com.xworkz.practice.external;

import com.xworkz.practice.internal.TransactionService;

public class OnlineBanking {
    private TransactionService transactionService;

    public OnlineBanking(TransactionService transactionService){
        this.transactionService=transactionService;
        System.out.println("Parameterized const");
    }
    public void transferFunds(){
        if(this.transactionService!=null){
            this.transactionService.approveLoan();
            System.out.println("Not null transactionService ");
        }
        else{
            System.out.println("It is null");
        }
    }
}
