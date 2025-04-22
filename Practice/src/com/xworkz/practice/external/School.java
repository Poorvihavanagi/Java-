package com.xworkz.practice.external;

import com.xworkz.practice.internal.EducationBoard;

public class School {
    private EducationBoard educationBoard;

    public School(EducationBoard educationBoard){
        this.educationBoard=educationBoard;
        System.out.println("Parameterized const school");
    }
    public void results(){
        if(this.educationBoard!=null){
            this.educationBoard.conductExams();
            System.out.println("Education board is not null");
        }
        else{
            System.out.println("It is null");
        }
    }
}
