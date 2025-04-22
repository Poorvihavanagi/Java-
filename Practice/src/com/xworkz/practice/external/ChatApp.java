package com.xworkz.practice.external;

import com.xworkz.practice.internal.MessagingPlatform;

public class ChatApp {
    private MessagingPlatform messagingPlatform;

    public ChatApp(MessagingPlatform messagingPlatform){
        this.messagingPlatform=messagingPlatform;
        System.out.println("Parameterized const Chatapp");
    }
    public void receiveMessage(){
        if(this.messagingPlatform!=null){
            System.out.println("Not null");
            this.messagingPlatform.sendMessage();
        }
        else{
            System.out.println("It is null");
        }
    }
}
