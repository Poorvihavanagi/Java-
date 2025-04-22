package com.xworkz.practice.runner;

import com.xworkz.practice.external.School;
import com.xworkz.practice.internal.CbseBoardImpl;
import com.xworkz.practice.internal.EducationBoard;

public class EducationBoardRunner {
    public static void main(String[] args) {
        EducationBoard educationBoard=new CbseBoardImpl();
        School school=new School(educationBoard);
        school.results();
    }
}
