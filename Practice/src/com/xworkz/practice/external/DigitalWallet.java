package com.xworkz.practice.external;

import com.xworkz.practice.internal.PaymentGateway;

public class DigitalWallet {
    private PaymentGateway paymentGateway;

    public DigitalWallet(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
        System.out.println("Parameterized const payment gateway");
    }

    public void addMoney(){
        if(this.paymentGateway!=null){
            System.out.println("Payment gateway is not null");
            this.paymentGateway.processPayment();
        }
        else{
            System.out.println("It is null");
        }
    }
}
