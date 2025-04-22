package com.xworkz.practice.external;

import com.xworkz.practice.internal.MentorshipProgram;

public class Startup {
    private MentorshipProgram mentorshipProgram;

    public Startup(MentorshipProgram mentorshipProgram){
        this.mentorshipProgram=mentorshipProgram;
        System.out.println("Parameterized constructor");
    }
    public void evaluatePitch(){
        if(this.mentorshipProgram!=null){
            System.out.println("Mentorship program is not null");
            this.mentorshipProgram.guide();
        }
        else{
            System.out.println("It is null");
        }
    }
}
