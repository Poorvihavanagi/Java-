package com.xworkz.practice.runner;

import com.xworkz.practice.external.ChatApp;
import com.xworkz.practice.internal.MessagingPlatform;
import com.xworkz.practice.internal.WhatsAppMessageImpl;

public class MessagingPlatformRunner {
    public static void main(String[] args) {
        MessagingPlatform messagingPlatform=new WhatsAppMessageImpl();
        ChatApp chatApp=new ChatApp(messagingPlatform);
        chatApp.receiveMessage();
    }
}
