package com.xworkz.practice.internal;

public class PhonePeGatewayImpl implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Running process payment in phonePe gateway");
    }
}
