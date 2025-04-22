package com.xworkz.practice.internal;

public class WhatsAppMessageImpl implements MessagingPlatform{
    @Override
    public void sendMessage() {
        System.out.println("Running send message in whatsapp message");
    }
}
