package com.xworkz.practice.runner;

import com.xworkz.practice.external.VoiceAssistant;
import com.xworkz.practice.internal.AIControlSystem;
import com.xworkz.practice.internal.GoogleAssistantImpl;

public class AIControlSystemRunner {
    public static void main(String[] args) {
        AIControlSystem aiControlSystem=new GoogleAssistantImpl();
        VoiceAssistant voiceAssistant=new VoiceAssistant(aiControlSystem);
        voiceAssistant.setReminder();
    }
}
