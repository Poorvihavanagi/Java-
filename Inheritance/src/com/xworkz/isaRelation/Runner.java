package com.xworkz.isaRelation;

import com.xworkz.inheritance.Document;
import com.xworkz.inheritance.Report;
import com.xworkz.inheritance.Resume;

public class Runner
{
    public static void main(String... args){

        Report report=new Report();
        report.edit();
        report.draw();
        report.type();
        report.delete();
        report.viewing();

        System.out.println("------------------------------------------------");
        Document document=new Report();
        document.edit();
        document.draw();
        document.type();
        document.delete();
        document.viewing();

        System.out.println("------------------------------------------------");
        Resume resume=new Resume();
        resume.addPersonalDetails(resume);


    }
}
