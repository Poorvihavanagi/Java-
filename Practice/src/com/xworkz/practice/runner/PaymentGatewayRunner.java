package com.xworkz.practice.runner;

import com.xworkz.practice.external.DigitalWallet;
import com.xworkz.practice.internal.PaymentGateway;
import com.xworkz.practice.internal.PhonePeGatewayImpl;

public class PaymentGatewayRunner {
    public static void main(String[] args) {
        PaymentGateway paymentGateway=new PhonePeGatewayImpl();
        DigitalWallet digitalWallet=new DigitalWallet(paymentGateway);
        digitalWallet.addMoney();
    }
}
