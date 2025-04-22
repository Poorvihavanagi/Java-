package com.xworkz.practice.runner;

import com.xworkz.practice.external.OnlineBanking;
import com.xworkz.practice.internal.AxisLoanServiceImpl;
import com.xworkz.practice.internal.TransactionService;

public class TransactionServiceRunner {
    public static void main(String[] args) {
        TransactionService transactionService=new AxisLoanServiceImpl();
        OnlineBanking onlineBanking=new OnlineBanking(transactionService);
        onlineBanking.transferFunds();
    }
}
