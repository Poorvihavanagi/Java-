package com.xworkz.practice.runner;

import com.xworkz.practice.external.Startup;
import com.xworkz.practice.internal.MentorshipProgram;
import com.xworkz.practice.internal.NasscomMentorImpl;

public class MentorshipProgramRunner {
    public static void main(String[] args) {
        MentorshipProgram mentorshipProgram=new NasscomMentorImpl();
        Startup startup=new Startup(mentorshipProgram);
        startup.evaluatePitch();
    }
}
