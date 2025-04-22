package com.xworkz.practice.external;

import com.xworkz.practice.internal.AIControlSystem;

public class VoiceAssistant {
    private AIControlSystem aiControlSystem;

    public VoiceAssistant(AIControlSystem aiControlSystem){
        this.aiControlSystem=aiControlSystem;
        System.out.println("parameterized const");
    }
    public void setReminder(){
        if(this.aiControlSystem!=null){
            this.aiControlSystem.executeCommand();
            System.out.println("Ai control system is not null");
        }
        else{
            System.out.println("Ai control system is null");
        }
    }


}
